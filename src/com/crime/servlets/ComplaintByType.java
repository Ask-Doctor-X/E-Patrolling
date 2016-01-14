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
 * Servlet implementation class ComplaintByType
 */
@WebServlet("/complaintbytype")
public class ComplaintByType extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String c_type=request.getParameter("c_type");
		
	    PoliceUtils utils=new PoliceUtilsImpl();
		ArrayList<Complain> complains=utils.viewComplaintsByType(c_type);
	    for(Complain com:complains)
	    	System.out.println(complains);
	    
	    request.setAttribute("c",complains);
	    RequestDispatcher rd=request.getRequestDispatcher("complaintsbytype.jsp");
		rd.forward(request, response);
	}

}
