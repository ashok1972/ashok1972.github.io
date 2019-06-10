package com.cts.policymanagementsystem.controller;

import java.io.IOException;
import java.io.PrintWriter;
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

/**
 * Servlet implementation class SearchPolicyServlet
 */
@WebServlet("/SearchPolicyServlet")
public class SearchPolicyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
         
    /**
     * @see HttpServlet#HttpServlet()
     */
    private static final long serialVersionUID1 = 1L;
    public SearchPolicyServlet() {
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
		ArrayList<PolicyEntry> p=new ArrayList<>();
	    PolicyBo pb=new PolicyBo();
	    try {
			p=pb.viewAllPolicies();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    for(PolicyEntry pe:p)     
	    {
	    	if(pe.getPolicyId().equals(policy_id)||pe.getPolicyName().equals(policy)||pe.getPolicyType().equals(policy_type)||pe.getDurationOfYears().equals(duration_of_years)||pe.getCompany().equals(company)||pe.getIntialDeposit().equals(initial_deposit)||pe.getUserType().equals(user_type)||pe.getTermAmount().equals(term_amount)||pe.getInterest().equals(interest));
	    	{
	    		  request.setAttribute("value", "Policy is present");
					request.setAttribute("name",pe);
					RequestDispatcher rd=getServletContext().getRequestDispatcher("/searchpolicies.jsp");
					rd.forward(request, response);
	    	} 
	    }
	    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
	}

}
   