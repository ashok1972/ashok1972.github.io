package com.cts.policymanagementsystem.controller;



import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.policymanagementsystem.businessclass.*;
import com.cts.policymanagementsystem.model.*;



/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String email=request.getParameter("Email_Id");
		System.out.println(email);
		String password=request.getParameter("psw");
		System.out.println(password);
		User k=new User();
		try {
			 k=UserBo.getLogin(email, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		 if(email.equals("admin@admin.com")){
			request.setAttribute("name", "Admin");
			RequestDispatcher rd=getServletContext().getRequestDispatcher("/AdminHome.jsp");
			rd.forward(request, response);
		}
		 else if(k.getEmailId().equals(email)) {
				request.setAttribute("name", k.getFirstName());
				RequestDispatcher rd=getServletContext().getRequestDispatcher("/MainHome.jsp");
				rd.forward(request, response);
				
			}
		else {
			request.setAttribute("name", email);
			RequestDispatcher rd=getServletContext().getRequestDispatcher("/invalidpage.jsp");
			rd.forward(request, response);
		}
					
					
					
				
	}

}
