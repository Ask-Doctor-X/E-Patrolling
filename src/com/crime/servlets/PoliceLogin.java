package com.crime.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class PoliceLogin extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String un=request.getParameter("p_uname");
		String up=request.getParameter("p_pass");
		
		//PoliceUtilsImpl utils=new PoliceUtilsImpl();
		//PoliceDepartment pd=utils.Login(un, up);
		
			if(un.equals("admin")&& up.equals("password")){
			response.sendRedirect("PoliceProfile.jsp");
			
			//RequestDispatcher rd=request.getRequestDispatcher("PoliceProfile.html");
			//rd.forward(request, response);
				
		}else{
			response.sendRedirect("Home1.jsp");
		}
		
		
	}

}