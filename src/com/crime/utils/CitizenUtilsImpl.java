package com.crime.utils;

import com.crime.beans.*;
import com.crime.db.DBUtils;

import java.sql.*;

public class CitizenUtilsImpl implements CitizenUtils {
	Connection con = null;
	PreparedStatement pst = null;
	PreparedStatement pst1 = null;
	Statement st = null;
	ResultSet rs = null;

	@Override
	public void registerComplaint(Complain complain,String ct_id) {
		String sql = "insert into complain(c_id,c_type,c_date,c_time,c_location,c_desc,c_status,ct_id) values(?,?,?,?,?,?,?,?)";
		String sql1 = "insert into idgen(id) values(?)";

		int id, i = 0, i1 = 0;
		con = DBUtils.getConnection();
		pst = DBUtils.getPreparedStatement(sql);
		pst1 = DBUtils.getPreparedStatement(sql1);

		GenerateID gen = new GenerateID();
		// System.out.println(c_id);
		try {
			pst.setString(1, complain.getC_id());
			pst.setString(2, complain.getC_type());
			pst.setString(3, complain.getC_date());
			pst.setString(4, complain.getC_time());
			pst.setString(5, complain.getC_location());
			pst.setString(6, complain.getC_desc());
			pst.setString(7, complain.getC_status());
			pst.setString(8, complain.getCt_id());
			
			pst1.setInt(1, (gen.generateComplainID() + 1));
			i = pst.executeUpdate();
			i1 = pst1.executeUpdate();

			DBUtils.releaseResources();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (i > 0) {
			System.out.println("added");
		} else
			System.out.println("not added");

	}

	@Override
	public Complain reviewComplaint(String cid) {
		String sql = "select * from complain where c_id=?";
		con = DBUtils.getConnection();
		pst = DBUtils.getPreparedStatement(sql);
		Complain complain = null;
		try {
			pst.setString(1, cid);
			rs = pst.executeQuery();

			if (rs != null) {
				while (rs.next()) {
					complain = new Complain();
					complain.setC_id(rs.getString(1));
					complain.setC_type(rs.getString(2));
					complain.setC_date(rs.getString(3));
					complain.setC_time(rs.getString(4));
					complain.setC_location(rs.getString(5));
					complain.setC_desc(rs.getString(6));
					complain.setC_status(rs.getString(7));
					complain.setCt_id(rs.getString(8));
				}

			}
			DBUtils.releaseResources();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return complain;
	}

	@Override
	public void registerUser(Citizen citizen) {
		int i = 0, i1 = 0;
		con = DBUtils.getConnection();
		String sql = "insert into citizen values(?,?,?,?,?,?)";
		String sql1 = "insert into cidgen(id) values(?)";
		pst = DBUtils.getPreparedStatement(sql);
		pst1 = DBUtils.getPreparedStatement(sql1);

		GenerateID gen = new GenerateID();
		try {
			pst.setString(1, citizen.getCt_id());
			pst.setString(2, citizen.getCt_name());
			pst.setString(3, citizen.getCt_sex());
			pst.setInt(4, citizen.getConatact());
			pst.setString(5, citizen.getCt_address());
			pst.setString(6, citizen.getCt_email());

			pst1.setInt(1, (gen.generateCitizenID() + 1));
			i = pst.executeUpdate();
			i1 = pst1.executeUpdate();

			DBUtils.releaseResources();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (i > 0)
			System.out.println("registered");
		else
			System.out.println("not added");

	}

	@Override
	public boolean checkValidity(String ct_id) {
		boolean valid=false;
		Citizen citizen=null;
		String sql = "select * from citizen where ct_id=?";
		con = DBUtils.getConnection();
		pst = DBUtils.getPreparedStatement(sql);
			try {
				pst.setString(1, ct_id);
				rs=pst.executeQuery();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(rs!=null)
				try {
					while(rs.next()){ 
						citizen=new Citizen();
						
						//citizen.setCt_id(rs.getString(1));
						citizen.setCt_name(rs.getString(2));
						//citizen.setCt_sex(rs.getString(3));
						//citizen.setConatact(rs.getInt(4));
						//citizen.setCt_address(rs.getString(5));
						//citizen.setCt_email(rs.getString(6));
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
				
			 if(citizen!=null)
				 return true;
	
			 else
				 return false;
	
	
	}

	

	
	//  public static void main(String[] args) { 
	/*	  Citizen ct=new Citizen();
		  int id; 
		  GenerateID g = new GenerateID(); 
		  id = g.generateComplainID(); 
		  System.out.println(id); 
		  String c_id = "C" + (id + 1); 
		  ct.setCt_id("CTID1");
	  String st=ct.getCt_id();
	  //	System.out.println(st);
	  	Complain complain = new Complain(c_id, "lost","7/1/2015", "3:28", "dunlop", "stolen", "solved",st);
	  	 System.out.println(complain); 
		  CitizenUtils utils = new CitizenUtilsImpl();
		  utils.registerComplaint(complain,"CTID1");
}*/
	 
	
		/*  public static void main(String[] args) { 
	   int ctid; GenerateID gen=new GenerateID(); 
	   ctid=gen.generateCitizenID(); 
	   String ct_id="CTID"+(ctid+1);
	  System.out.println(ct_id); 
	  Citizen citizen=new
	  Citizen(ct_id,"Rupam","M",94768,"jadavpur","rupambhadra@gmail.com");
	  System.out.println(citizen); 
	  CitizenUtils utils=new CitizenUtilsImpl();
	  utils.registerUser(citizen);
	  
	  }*/
	 
	
	 /*public static void main(String[] args) { CitizenUtils utils=new
	  CitizenUtilsImpl(); Complain com=utils.reviewComplaint("C1");
	  System.out.println(com); 
	  }*/
	 
	/*public static void main(String[] args) {
		
		CitizenUtils utils=new CitizenUtilsImpl();
		if(utils.checkValidity("CTID4"))
			System.out.println("valid");
		else
			System.out.println("not valid");
		
}*/
}