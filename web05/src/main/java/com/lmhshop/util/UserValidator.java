package com.lmhshop.util;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.lmhshop.dto.UserDTO;

public class UserValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return UserDTO.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object object, Errors errors) {
		UserDTO user = (UserDTO) object;
		String defaultMsg = "필수 입력 사항입니다."; 
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "id", "required", "아이디가 값이 비어있거나 형식과 일치 않습니다.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "required", "이메일의 값이 비어있거나 형식과 일치 않습니다.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "address.address1", "required", "주소1이 값이 비어있거나 형식과 일치 않습니다.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "address.address2", "required", "주소2가 값이 비어있거나 형식과 일치 않습니다.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "job", "required", defaultMsg);
		
		if(user.getGender()==null || user.getGender().length == 0) {
			errors.rejectValue("gender", "select");
		}
		
		if(user.getName().length() < 2 || user.getName().length() > 12) {
			errors.rejectValue("name", "lengthsize", "이름은 2자 이상 12자 이하여야만 가능합니다.");
		}
	}
}