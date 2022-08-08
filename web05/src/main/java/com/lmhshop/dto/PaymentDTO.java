package com.lmhshop.dto;

public class PaymentDTO {
	private int cno;
	private String paytype;
	private String payno;
	private int money;
	private String cdate;
	private int ccode;
	private int amount;
	private String userid;
	private String rname;
	private String tel;
	private String addr1;
	private String addr2;
	private String postcode;
	private String transno;
	private String transco;
	private String rstatus;
	private String rdate;

	
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getPaytype() {
		return paytype;
	}
	public void setPaytype(String paytype) {
		this.paytype = paytype;
	}
	public String getPayno() {
		return payno;
	}
	public void setPayno(String payno) {
		this.payno = payno;
	}

	public int getCprice() {
		return money;
	}
	public void setCprice(int money) {
		this.money = money;
	}
	public String getCdate() {
		return cdate;
	}
	public void setCdate(String cdate) {
		this.cdate = cdate;
	}

	public int getCcode() {
		return ccode;
	}
	public void setCcode(int ccode) {
		this.ccode = ccode;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getName() {
		return rname;
	}
	public void setName(String rname) {
		this.rname = rname;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddr1() {
		return addr1;
	}
	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}
	public String getAddr2() {
		return addr2;
	}
	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String getTransno() {
		return transno;
	}
	public void setTransno(String transno) {
		this.transno = transno;
	}
	public String getTransco() {
		return transco;
	}
	public void setTransco(String transco) {
		this.transco = transco;
	}
	public String getRstatus() {
		return rstatus;
	}
	public void setRstatus(String rstatus) {
		this.rstatus = rstatus;
	}
	public String getRdate() {
		return rdate;
	}
	public void setRdate(String rdate) {
		this.rdate = rdate;
	}

}
