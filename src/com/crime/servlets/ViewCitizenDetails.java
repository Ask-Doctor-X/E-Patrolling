package com.crime.servlets;

import java.io.IOException;
import java.util.ArrayList;

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
import com.police.utils.PoliceUtils;
import com.police.utils.PoliceUtilsImpl;

/**
 * Servlet implementation class ViewCitizenDetails
 */
@WebServlet("/viewcitizendetails")
public class ViewCitizenDetails extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String ct_id=request.getParameter("ct_id");
		//PoliceUtils utils=new  PoliceUtilsImpl();
	   PoliceUtils utils=new PoliceUtilsImpl();
		ArrayList<Citizen>citizen=utils.viewCitizenDetails(ct_id);
	    //System.out.println(complain);
	    request.setAttribute("c",citizen);
	    RequestDispatcher rd=request.getRequestDispatcher("viewcitizendetails.jsp");
		rd.forward(request, response);
	
	
	
	
	
	
	
	
	
	}

}
