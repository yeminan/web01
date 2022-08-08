package com.lmhshop.dto;

public class Code {
	/*
	 * <select name="job"> 
	 * <option value ="001"></option>
	 * <option value ="002"></option>
	 *  <option value ="003"></option>
	 * </select>
	 */
	private String code;
	private String label;
	
	public Code() { }
	public Code(String code, String label) {
		this.code= code;
		this.label= label;
		
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}


}
