package com.crime.beans;

public class PoliceDepartment {
	private String pd_id, pd_name, pd_location, pd_username, pd_password;

	public String getPd_id() {
		return pd_id;
	}

	public void setPd_id(String pd_id) {
		this.pd_id = pd_id;
	}

	public String getPd_name() {
		return pd_name;
	}

	public void setPd_name(String pd_name) {
		this.pd_name = pd_name;
	}

	public String getPd_location() {
		return pd_location;
	}

	public void setPd_location(String pd_location) {
		this.pd_location = pd_location;
	}

	public String getPd_username() {
		return pd_username;
	}

	public void setPd_username(String pd_username) {
		this.pd_username = pd_username;
	}

	public String getPd_password() {
		return pd_password;
	}

	public void setPd_password(String pd_password) {
		this.pd_password = pd_password;
	}

	public PoliceDepartment(String pd_id, String pd_name, String pd_location,
			String pd_username, String pd_password) {
		super();
		this.pd_id = pd_id;
		this.pd_name = pd_name;
		this.pd_location = pd_location;
		this.pd_username = pd_username;
		this.pd_password = pd_password;
	}

	@Override
	public String toString() {
		return "PoliceDepartment [pd_id=" + pd_id + ", pd_name=" + pd_name
				+ ", pd_location=" + pd_location + ", pd_username="
				+ pd_username + ", pd_password=" + pd_password + "]";
	}

}
									