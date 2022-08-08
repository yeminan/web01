<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일업로드 아작스 실습</title>
<script src="https://code.jquery.com/jquery-latest.js"></script>
</head>
<body>
	<div>
		<h2>Ajax 파일업로드 실습</h2>
		<!-- mutiple쓰면 파일을 여러개 쓸쑤 있음   -->
			<input type ="file" name="uploadFile" id="uploadFile" multiple/><br><br>
			<br>
			<br>
			<br>
			<input type="button" name="uploadBtn" id="uploadBtn" value="파일업로드">
	</div>
	<script>
	${document}.ready(function(){
		$("#uploadBtn").on("click",function()){
			var formData = new FormData();
			var inputFile =$("#uploadFile");
			var files = inputFile[0].files;
			for(var 1=0;1<files.length;i++){
				fomDate.append("uploadFile",files[i]);
			}
			$.ajax({
				url:'uploadAjax.do',
				processDate : false,
				contentType : false,
				data : forData,
				type : "post",
				sucess : function(result){
					alert("업로드성공")
				}
			});
		});
	});
	</script>
</body>
</html>