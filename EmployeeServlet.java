package com.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeServlet
 */

public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		PrintWriter out =response.getWriter();
		String name=request.getParameter("eName");
		String email=request.getParameter("email");
		String pass=request.getParameter("pass");
		String dob=request.getParameter("dob");
		String gender=request.getParameter("gender");
		String dept=request.getParameter("dept");
		String[] shift=request.getParameterValues("shift");
		out.print("<html><font color='blue'><h1>Employee Information</h><h2>");
		out.print("<br>Employee Name:"+name);
		out.print("<br>Employee DOB:"+dob);
		out.print("<br>Employee Email:"+email);
		out.print("<br>Employee Password:"+pass);
		out.print("<br>Employee Gender:"+gender);
		out.print("<br>Employee Dept:"+dept);
		for(int i=0;i<shift.length;i++) {
			out.print(shift[i]);
		}
		out.print("</h2></font></body></html>");
	}

}