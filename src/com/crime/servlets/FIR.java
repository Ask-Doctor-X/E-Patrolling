package com.crime.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.crime.beans.Citizen;
import com.crime.beans.Complain;
import com.crime.utils.CitizenUtils;
import com.crime.utils.CitizenUtilsImpl;
import com.crime.utils.GenerateID;

@WebServlet("/FIR")
public class FIR extends HttpServlet {

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String ct_id = request.getParameter("ct_id");
		String c_date = request.getParameter("c_date");
		String c_time = request.getParameter("c_time");
		String c_loc = request.getParameter("c_loc");
		String c_desc = request.getParameter("c_desc");
		String c_type = request.getParameter("c_type");
		//String c_stat = request.getParameter("c_stat");
		Citizen ct = new Citizen();
		CitizenUtils utils=new CitizenUtilsImpl();
		if(utils.checkValidity(ct_id)){
		int id;
		GenerateID g = new GenerateID();
		id = g.generateComplainID();
		System.out.println(id);
		String c_id = "C" + (id + 1);
		ct.setCt_id(ct_id);
		String st = ct.getCt_id();
		// System.out.println(st);
		Complain complain = new Complain(c_id, c_type, c_date, c_time, c_loc,
				c_desc, "pending", st);
		// System.out.println(complain);
		utils.registerComplaint(complain, ct_id);
		request.setAttribute("com", c_id);
		RequestDispatcher rd=request.getRequestDispatcher("FirSuccess.jsp");
		rd.forward(request, response);
		}
		else{
			RequestDispatcher rd=request.getRequestDispatcher("Firfailure.jsp");
			rd.forward(request, response);
		}
	
	
	
	}

}
