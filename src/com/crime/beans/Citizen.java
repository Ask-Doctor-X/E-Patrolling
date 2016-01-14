package com.crime.beans;

public class Citizen {
	private String ct_id,ct_name,ct_sex,ct_address,ct_email;
	private int conatact;
	public Citizen(String ct_id, String ct_name, String ct_sex,
			int ct_conatact, String ct_address, String ct_email) {
		super();
		this.ct_id = ct_id;
		this.ct_name = ct_name;
		this.ct_sex = ct_sex;
		this.conatact = ct_conatact;
		this.ct_address = ct_address;
		this.ct_email = ct_email;
		
	}
	public Citizen() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Citizen [ct_id=" + ct_id + ", ct_name=" + ct_name + ", ct_sex="
				+ ct_sex + ", ct_address=" + ct_address + ", ct_email="
				+ ct_email + ", conatact=" + conatact + "]";
	}
	public String getCt_id() {
		return ct_id;
	}
	public void setCt_id(String ct_id) {
		this.ct_id = ct_id;
	}
	public String getCt_name() {
		return ct_name;
	}
	public void setCt_name(String ct_name) {
		this.ct_name = ct_name;
	}
	public String getCt_sex() {
		return ct_sex;
	}
	public void setCt_sex(String ct_sex) {
		this.ct_sex = ct_sex;
	}
	public String getCt_address() {
		return ct_address;
	}
	public void setCt_address(String ct_address) {
		this.ct_address = ct_address;
	}
	public String getCt_email() {
		return ct_email;
	}
	public void setCt_email(String ct_email) {
		this.ct_email = ct_email;
	}
	public int getConatact() {
		return conatact;
	}
	public void setConatact(int conatact) {
		this.conatact = conatact;
	}



}
