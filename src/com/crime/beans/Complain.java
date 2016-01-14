package com.crime.beans;

public class Complain {
	private String c_id, c_type, c_date, c_time, c_location, c_desc, c_status,ct_id;
	
@Override
	public String toString() {
		return "Complain [c_id=" + c_id + ", c_type=" + c_type + ", c_date="
				+ c_date + ", c_time=" + c_time + ", c_location=" + c_location
				+ ", c_desc=" + c_desc + ", c_status=" + c_status + ", ct_id="
				+ ct_id + "]";
	}

public String getC_id() {
		return c_id;
	}

	public void setC_id(String c_id) {
		this.c_id = c_id;
	}

	public String getC_type() {
		return c_type;
	}

	public void setC_type(String c_type) {
		this.c_type = c_type;
	}

	public String getC_date() {
		return c_date;
	}

	public void setC_date(String c_date) {
		this.c_date = c_date;
	}

	public String getC_time() {
		return c_time;
	}

	public void setC_time(String c_time) {
		this.c_time = c_time;
	}

	public String getC_location() {
		return c_location;
	}

	public void setC_location(String c_location) {
		this.c_location = c_location;
	}

	public String getC_desc() {
		return c_desc;
	}

	public void setC_desc(String c_desc) {
		this.c_desc = c_desc;
	}

	public String getC_status() {
		return c_status;
	}

	public void setC_status(String c_status) {
		this.c_status = c_status;
	}

	public String getCt_id() {
		return ct_id;
	}

	public void setCt_id(String ct_id) {
		this.ct_id = ct_id;
	}

public Complain(String c_id, String c_type, String c_date, String c_time,
			String c_location, String c_desc, String c_status, String ct_id) {
		super();
		this.c_id = c_id;
		this.c_type = c_type;
		this.c_date = c_date;
		this.c_time = c_time;
		this.c_location = c_location;
		this.c_desc = c_desc;
		this.c_status = c_status;
		this.ct_id = ct_id;
	}

public Complain(){}
	

}	