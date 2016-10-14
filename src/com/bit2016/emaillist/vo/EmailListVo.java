package com.bit2016.emaillist.vo;

public class EmailListVo {

	private Long no;
	private String lastName;
	private String firstName;
	private String email;
	
	public Long getNo() {
		return no;
	}
	public String getLastName() {
		return lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getEmail() {
		return email;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "EmailListVo [no=" + no + ", lastName=" + lastName + ", firstName=" + firstName + ", email=" + email
				+ "]";
	}
	
	
}
