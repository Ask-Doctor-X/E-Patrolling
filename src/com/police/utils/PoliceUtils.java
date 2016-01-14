package com.police.utils;
import java.util.ArrayList;

import com.crime.beans.Citizen;
import com.crime.beans.Complain;
public interface PoliceUtils {
	
	public ArrayList<Complain> viewAllComplaints();
	public boolean changeStatus(String c_status,String c_id);
	public Complain viewAComplain(String c_id);
	public ArrayList<Complain> viewAllPending();
	public ArrayList<Citizen> viewCitizenDetails(String ct_id);
	public ArrayList<Complain> viewComplainsPerCitizen(String ct_id);
	public ArrayList<Complain> viewComplaintsByType(String c_type);
}

