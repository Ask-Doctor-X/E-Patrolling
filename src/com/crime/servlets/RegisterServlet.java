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

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String ct_sex = null;
		CitizenUtils utils = new CitizenUtilsImpl();
		String ct_name = request.getParameter("uname");
		String sex = request.getParameter("f");
		if("F".equals(sex))
			ct_sex="F";
		else
			ct_sex="M";
			
		String ucon = request.getParameter("ucon");
		int ct_con = Integer.parseInt(ucon);
		String ct_address = request.getParameter("uadd");
		String ct_email = request.getParameter("uemail");
		PrintWriter out = response.getWriter();

		int ctid;

		GenerateID gen = new GenerateID();
		ctid = gen.generateCitizenID();
		String ct_id = "CTID" + (ctid + 1);
		System.out.println(ct_id);
		Citizen citizen = new Citizen(ct_id, ct_name, ct_sex, ct_con,
				ct_address, ct_email);
		utils.registerUser(citizen);
		request.setAttribute("ct", ct_id);
		RequestDispatcher rd=request.getRequestDispatcher("registrationsuccess.jsp");
		rd.forward(request, response);
		
		//out.print("You are succesfully registered under the system");
		//out.print("your id is" + ct_id);

	}

}
