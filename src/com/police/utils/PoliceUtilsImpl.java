package com.police.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.crime.beans.Citizen;
import com.crime.beans.Complain;
import com.crime.db.DBUtils;

public class PoliceUtilsImpl implements PoliceUtils {
	Connection con = null;
	Statement st = null;
	PreparedStatement pst = null;
	ResultSet rs = null;

	@Override
	public ArrayList<Complain> viewAllComplaints() {
		Complain complaints = null;
		ArrayList<Complain> allcomplaints = new ArrayList<Complain>();

		con = DBUtils.getConnection();
		st = DBUtils.getSimpleStatement();
		String sql = "select * from complain";

		try {
			rs = st.executeQuery(sql);
			if (rs != null) {
				while (rs.next()) {
					complaints = new Complain();
					String n = rs.getString(1);
					complaints.setC_id(n);
					complaints.setC_type(rs.getString(2));
					complaints.setC_date(rs.getString(3));
					complaints.setC_time(rs.getString(4));
					complaints.setC_location(rs.getString(5));
					complaints.setC_desc(rs.getString(6));
					complaints.setC_status(rs.getString(7));
					complaints.setCt_id(rs.getString(8));
					allcomplaints.add(complaints);
				}

			}
			DBUtils.releaseResources();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return allcomplaints;
	}

	public boolean changeStatus(String c_status, String c_id) {
		int cs = 0;

		boolean status = false;
		con = DBUtils.getConnection();
		String sql = "update complain set c_status = ? where c_id = ?";

		pst = DBUtils.getPreparedStatement(sql);

		try {

			pst.setString(1, c_status);
			pst.setString(2, c_id);
			cs = pst.executeUpdate();
			if (cs > 0)
				status = true;
			DBUtils.releaseResources();
		}

		catch (SQLException e) {
			e.printStackTrace();
		}

		return status;
	}

	public Complain viewAComplain(String c_id) {
		Complain acomplaint = null;
		con = DBUtils.getConnection();
		String sql = "select * from complain";
		try {
			rs = st.executeQuery(sql);
			if (rs != null) {
				while (rs.next()) {
					acomplaint = new Complain();
					String n = rs.getString(1);
					acomplaint.setC_id(n);
					acomplaint.setC_type(rs.getString(2));
					acomplaint.setC_date(rs.getString(3));
					acomplaint.setC_time(rs.getString(4));
					acomplaint.setC_location(rs.getString(5));
					acomplaint.setC_desc(rs.getString(6));
					acomplaint.setC_status(rs.getString(7));
					acomplaint.setCt_id(rs.getString(8));
				}

			}
			DBUtils.releaseResources();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return acomplaint;

	}

	public ArrayList<Complain> viewAllPending() {
		Complain complaints = null;
		ArrayList<Complain> allcomplaints = new ArrayList<Complain>();

		con = DBUtils.getConnection();
		st = DBUtils.getSimpleStatement();
		String sql = "select * from complain where c_status='pending'";

		try {
			rs = st.executeQuery(sql);
			if (rs != null) {
				while (rs.next()) {
					complaints = new Complain();
					String n = rs.getString(1);
					complaints.setC_id(n);
					complaints.setC_type(rs.getString(2));
					complaints.setC_date(rs.getString(3));
					complaints.setC_time(rs.getString(4));
					complaints.setC_location(rs.getString(5));
					complaints.setC_desc(rs.getString(6));
					complaints.setC_status(rs.getString(7));
					complaints.setCt_id(rs.getString(8));
					allcomplaints.add(complaints);
				}

			}
			DBUtils.releaseResources();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return allcomplaints;
	}

	@Override
	public ArrayList<Complain> viewComplainsPerCitizen(String ct_id) {
		String sql = "select c.c_id,c.c_type,c.c_date,c.c_time,c.c_location,c.c_desc,c.c_status,c.ct_id from complain c inner join citizen ct on ct.ct_id=c.ct_id where ct.ct_id like ?";
		ArrayList<Complain> complains = new ArrayList<Complain>();
		Complain complain = null;
		con = DBUtils.getConnection();
		pst = DBUtils.getPreparedStatement(sql);
		try {
			pst.setString(1, ct_id);
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
					complains.add(complain);
				}
			}

			DBUtils.releaseResources();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return complains;
	}

	@Override
	public ArrayList<Citizen> viewCitizenDetails(String ct_id) {
		// TODO Auto-generated method stub
		String sql = "select * from citizen where ct_id=?";
		ArrayList<Citizen> citizens = new ArrayList<Citizen>();
		Citizen citizen = null;
		con = DBUtils.getConnection();
		pst = DBUtils.getPreparedStatement(sql);
		try {
			pst.setString(1, ct_id);
			rs = pst.executeQuery();

			if (rs != null) {
				while (rs.next()) {
					citizen = new Citizen();
					citizen.setCt_id(rs.getString(1));
					citizen.setCt_name(rs.getString(2));
					citizen.setCt_sex(rs.getString(3));
					citizen.setConatact(rs.getInt(4));
					citizen.setCt_address(rs.getString(5));
					citizen.setCt_email(rs.getString(6));
					citizens.add(citizen);

				}

			}

			DBUtils.releaseResources();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return citizens;
	}

	/*
	 * public static void main(String[] args) { PoliceUtils utils=new
	 * PoliceUtilsImpl();
	 * 
	 * ArrayList<Citizen> citizens=utils.viewCitizenDetails("CTID2");
	 * for(Citizen ct:citizens) System.out.println(ct); }
	 */

	
	 /* public static void main(String[] args) { PoliceUtils utils = new
	  PoliceUtilsImpl(); 
	  boolean status; 
	  utils.changeStatus("solved", "C1");
	  //ArrayList<Complain> complains = utils.viewAllComplaints();
	 // ArrayList<Complain> pending = utils.viewAllIncomplete("pending");
	  //for(Complain com : pending) System.out.println(com);
	  
	  // for (Complain com1 : complains) System.out.println(com1); }
	  }

	
	 /* public static void main(String[] args) { PoliceUtils utils = new
	  PoliceUtilsImpl(); ArrayList<Complain> complains =
	  utils.viewComplainsPerCitizen("CTID1"); for (Complain c : complains)
	  System.out.println(c); }*/
	 

	/*public static void main(String[] args) {
		PoliceUtils utils = new PoliceUtilsImpl();
		ArrayList<Complain> complains = utils.viewComplaintsByType("lost");
		for (Complain com : complains)
			System.out.println(complains);
	}*/

	@Override
	public ArrayList<Complain> viewComplaintsByType(String c_type) {
		String sql = "select * from complain where c_type=?";
		ArrayList<Complain> complaints = new ArrayList<Complain>();
		con = DBUtils.getConnection();
		pst = DBUtils.getPreparedStatement(sql);
		Complain complains = null;

		try {
			pst.setString(1, c_type);
			rs = pst.executeQuery();

			if (rs != null) {
				while (rs.next()) {
					complains = new Complain();
					complains.setC_id(rs.getString(1));
					complains.setC_type(rs.getString(2));
					complains.setC_date(rs.getString(3));
					complains.setC_time(rs.getString(4));
					complains.setC_location(rs.getString(5));
					complains.setC_desc(rs.getString(6));
					complains.setC_status(rs.getString(7));
					// complains.setC_ct_id(rs.getString(2);
					complaints.add(complains);

				}
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return complaints;
	}
public static void main(String[] args) {
	PoliceUtils utils=new PoliceUtilsImpl();
	ArrayList<Complain> complains=utils.viewComplaintsByType("theft");
	for(Complain com:complains)
		System.out.println(com);
	
}
	
}