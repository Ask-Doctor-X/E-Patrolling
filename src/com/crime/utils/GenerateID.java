package com.crime.utils;

import java.sql.*;

import com.crime.db.DBUtils;

public class GenerateID {

	public int generateComplainID() {
		Connection con = null;
		PreparedStatement pst = null;
		Statement st = null;
		ResultSet rs = null;
		con = DBUtils.getConnection();
		String sql = "select id from idgen order by id desc limit 1;";
		st = DBUtils.getSimpleStatement();
		int ctid = 0;
		try {
			rs = st.executeQuery(sql);

			if (rs != null) {
				while(rs.next()){
				ctid = rs.getInt(1);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ctid;

	}
	
	public int generateCitizenID(){
		Connection con = null;
		PreparedStatement pst = null;
		Statement st = null;
		ResultSet rs = null;
		con = DBUtils.getConnection();
		String sql = "select id from cidgen order by id desc limit 1;";
		st = DBUtils.getSimpleStatement();
		int cid = 0;
		try {
			rs = st.executeQuery(sql);

			if (rs != null) {
				while(rs.next()){
				cid = rs.getInt(1);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cid;
	}
	
	
	
	public static void main(String[] args) {
		GenerateID g = new GenerateID();
		g.generateCitizenID();
	
	}
		
}
