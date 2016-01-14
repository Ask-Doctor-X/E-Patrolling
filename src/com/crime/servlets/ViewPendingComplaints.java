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
import com.police.utils.PoliceUtils;
import com.police.utils.PoliceUtilsImpl;

/**
 * Servlet implementation class ViewPendingComplaints
 */
@WebServlet("/viewpendingcomplaints")
public class ViewPendingComplaints extends HttpServlet {
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PoliceUtils utils=new  PoliceUtilsImpl();
	    ArrayList<Complain> pcomplains=utils.viewAllPending();
	    
	    request.setAttribute("pc",pcomplains);
	    RequestDispatcher rd=request.getRequestDispatcher("viewpending.jsp");
		rd.forward(request, response);
	
	}

}
