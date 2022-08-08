package com.lmhshop.controller;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.lmhshop.dto.DatabankDTO;
import com.lmhshop.service.DatabankService;

@Controller
public class FileController {
	@Autowired
	ResourceLoader rsLoader;

	
	@RequestMapping(value="/uploadForm.do",method = RequestMethod.GET)
	public String uploadForm() {
		return "uploadFile";
	}
	
	@RequestMapping(value="/fileUpload.do",method = RequestMethod.POST)
	public String fileUpload(MultipartFile myfile) throws UnsupportedEncodingException,Exception{
		String filename=  myfile.getOriginalFilename();
		System.out.println("업로드 파일이름 : "+filename);
		
		filename= new String(filename.getBytes("8859_1"),"utf-8");
		
		Resource resource =rsLoader.getResource("/WEB-INF/views/upload");
		
		myfile.transferTo(new File(resource.getFile().getCanonicalPath() + "/" + filename));//상대경로
		
		System.out.println("파일 업로드 위치 : "+resource.getFile().getCanonicalPath());
		
		System.out.println("파일 저장 성공");
		return "redirect:/";
	}
	
	@RequestMapping(value="/uploadMulti.do",method = RequestMethod.GET)
	public String uploadMulti() {
		return "uploadMutil";
	
	}
	@RequestMapping(value="/multifileUpload.do",method = RequestMethod.POST)
	public String multifileUpload(MultipartFile[] files) {
			String uploadFolder = "D:\\LMH\\jsp4\\web05\\src\\main\\webapp\\WEB-INF\\views\\upload";
			for(MultipartFile file : files) {
				String fileName = file.getOriginalFilename();
				System.out.println("업로드 파일이름 : "+ fileName);
				System.out.println("업로드 파일이름 : "+ file.getSize());
				File saveFile = new File(uploadFolder,fileName);
				try {
					file.transferTo(saveFile);
				}catch (Exception e) {
					System.out.println("파일처리 오류");
					e.printStackTrace();
				}
					
			}
		return "redirect:/";
}
	@RequestMapping(value="/databankForm.do",method = RequestMethod.GET)
	public String databankForm() {
		return "databankForm";
	
	}
	@Autowired
	DatabankService DatabankService;
	
	@RequestMapping(value="/databankinsert.do", method = RequestMethod.POST)
	public String databankinsert(MultipartFile fileurl, HttpServletRequest request, Model model)
			throws UnsupportedEncodingException, Exception {
		String uploadFolder = "D:\\LMH\\jsp4\\web05\\src\\main\\webapp\\WEB-INF\\views\\upload";
		String fileName = fileurl.getOriginalFilename();
		System.out.println("업로드 파일 이름 : "+fileName);
		System.out.println("업로드 파일 크기 : "+fileurl.getSize());
		File saveFile = new File(uploadFolder,fileName);
		fileurl.transferTo(saveFile);
		DatabankDTO databank = new DatabankDTO();
		databank.setTitle(request.getParameter("title"));
		databank.setAuthor(request.getParameter("author"));
		databank.setFileurl(fileName);
		DatabankService.Databankinsert(databank);
		System.out.println("자료 제목 : " + databank.getTitle());
		return "redirect:/";
	}
	@RequestMapping(value="/databankList.do", method = RequestMethod.GET)
	public String databankList(DatabankDTO databank, Model model) throws Exception {
	List<DatabankDTO> databankList = DatabankService.Databanklist();
	model.addAttribute("databankList", databankList);
	return "databankList";
	
	}
	@RequestMapping(value="/uploadAJaxForm.do",method = RequestMethod.GET)
	public String uploadAjaxForm() {
		return "uploadAjax";
	}
	@ResponseBody
	@RequestMapping(value="/uploadAJax.do",method = RequestMethod.GET)
	public String uploadAjax (MultipartFile[] uploadFile, Model model)throws UnsupportedEncodingException,Exception {
		String uploadFolder = "D:\\LMH\\jsp4\\web05\\src\\main\\webapp\\WEB-INF\\views\\upload";
		for(MultipartFile multipartFile : uploadFile) {
			String uploadFileName = multipartFile.getOriginalFilename();
			uploadFileName = uploadFileName.substring(uploadFileName.lastIndexOf("\\")+1);
			
			String result ="";
			File saveFile =new File(uploadFolder,uploadFileName);
			try {
				multipartFile.transferTo(saveFile);
				result ="파일업로드성공";
			}catch(Exception e) {
				result = "파일 업로드 실패";
				e.printStackTrace();
				
			}
			System.out.println(result);
		}
	return "redirect:/";
	}
}