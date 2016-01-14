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
 * Servlet implementation class complaintpercitizenn
 */
@WebServlet("/complaintpercitizenn")
public class complaintpercitizenn extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String ct_id = request.getParameter("ct_id");

		PoliceUtils utils = new PoliceUtilsImpl();
        ArrayList<Complain> complains = utils.viewComplainsPerCitizen(ct_id);
		request.setAttribute("c", complains);
		RequestDispatcher rd = request
				.getRequestDispatcher("complaintpercitizen.jsp");
		rd.forward(request, response);

	}

}
