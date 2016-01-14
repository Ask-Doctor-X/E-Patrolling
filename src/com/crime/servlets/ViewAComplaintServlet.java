package com.crime.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.crime.beans.Complain;
import com.crime.utils.CitizenUtils;
import com.crime.utils.CitizenUtilsImpl;
import com.police.utils.PoliceUtils;
import com.police.utils.PoliceUtilsImpl;

/**
 * Servlet implementation class ViewAComplaintServlet
 */
@WebServlet("/viewacomplaintservlet")
public class ViewAComplaintServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String c_id=request.getParameter("c_id");
		//PoliceUtils utils=new  PoliceUtilsImpl();
	    CitizenUtils utils=new CitizenUtilsImpl();
		Complain complain=utils.reviewComplaint(c_id);
	    System.out.println(complain);
	    request.setAttribute("c",complain);
	    RequestDispatcher rd=request.getRequestDispatcher("ViewAFir.jsp");
		rd.forward(request, response);
	
	
	
	}

}
