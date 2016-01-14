package com.crime.utils;

import com.crime.beans.Citizen;
import com.crime.beans.Complain;

public interface CitizenUtils {
	public void registerComplaint(Complain complain,String ct_id);
	public Complain reviewComplaint(String cid);
	public void registerUser(Citizen citizen);
	public boolean checkValidity(String ct_id);
}
