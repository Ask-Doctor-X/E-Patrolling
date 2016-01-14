package com.crime.servlets;

import java.io.IOException;

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
 * Servlet implementation class ChangeStatus
 */
@WebServlet("/changestatus")
public class ChangeStatus extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String c_id=request.getParameter("c_id");
		String st=request.getParameter("stat");
		System.out.println(c_id);
		System.out.println(st);
		PoliceUtils utils=new PoliceUtilsImpl();
		boolean changed=utils.changeStatus(st, c_id);
		System.out.println(changed);
		if(changed){
			    CitizenUtils utils1=new CitizenUtilsImpl();
				Complain complain=utils1.reviewComplaint(c_id);
			    System.out.println(complain);
			    request.setAttribute("c",complain);
			RequestDispatcher rd=request.getRequestDispatcher("ViewAFir.jsp");
			rd.forward(request, response);
		}
		
	
	}

}
