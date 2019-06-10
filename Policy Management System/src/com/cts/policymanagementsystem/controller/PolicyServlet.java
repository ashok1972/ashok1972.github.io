package com.cts.policymanagementsystem.controller;



import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.policymanagementsystem.businessclass.PolicyBo;
import com.cts.policymanagementsystem.model.PolicyEntry;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

/**
 * Servlet implementation class PolicyServlet
 */
@WebServlet("/PolicyServlet")
public class PolicyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PolicyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String policy_id=request.getParameter("Policy_Id");
		String policy=request.getParameter("Policy");
		String policy_type=request.getParameter("Policy_type");
		String duration_of_years=request.getParameter("Duration_of_Years");
		String company=request.getParameter("Company");
		String initial_deposit=request.getParameter("Initial_Deposit");
		String user_type=request.getParameter("User_Type");
		String term_amount=request.getParameter("Term_Amount");
		String interest=request.getParameter("Interest");
		PolicyEntry p=new PolicyEntry();
		p.setPolicyId(policy_id);
		p.setPolicyName(policy_type);
		p.setPolicyType(policy_type);
		p.setDurationOfYears(duration_of_years);
		p.setCompany(company);
		p.setIntialDeposit(initial_deposit);
		p.setUserType(user_type);
		p.setTermAmount(term_amount);
		p.setInterest(interest);
        try {
			int j=PolicyBo.savePolicy(p);
			if(j==1)
			{
				out.println("<script>alert('Policy Registered sucessfully')</script>");
				request.setAttribute("value", "Policy Added Sucessfully");
				request.setAttribute("name", "Admin");
				RequestDispatcher rd=getServletContext().getRequestDispatcher("/sucess.jsp");
				rd.forward(request, response);
			}
			else
			{
				out.println("<script>alert('Policy Registered failed')</script>");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
