package com.lmhshop.bean;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class LoginMemberBean {
		@Size(min=2, max=12, message="아이디 길이는 2~12 사이어야 합니다.")
		@Pattern(regexp="^([A-Za-z])+([0-9])+$", message="아이디는 대소문자와 숫자의 조합이어야 합니다.")
		private String id;
		
		@Size(min=4, max=12, message="비밀번호 길이는 2~12 사이어야 합니다.")
		@Pattern(regexp="^([A-Za-z])+([0-9])+$", message="비밀번호는 대소문자와 숫자의 조합이어야 합니다.")
		private String pwd;
		
	
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getPwd() {
			return pwd;
		}
		public void setPwd(String pwd) {
			this.pwd = pwd;
		}
		
	}