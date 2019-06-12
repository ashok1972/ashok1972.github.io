package com.cts.policymanagementsystem.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.policymanagementsystem.businessclass.PolicyBo;
import com.cts.policymanagementsystem.model.PolicyEntry;

/**
 * Servlet implementation class EditPolicyServlet
 */
@WebServlet("/EditPolicyServlet")
public class EditPolicyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditPolicyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter out=response.getWriter();
		String policyName=request.getParameter("uname");
		String policyType=request.getParameter("ptype");
		String policyDuration=request.getParameter("pduration");
		String amount=request.getParameter("pamount");
		String pid=request.getParameter("id");
		PolicyEntry p=new PolicyEntry();
		p.setPolicyName(policyName);
		p.setPolicyType(policyType);
		p.setDurationOfYears(policyDuration);
		p.setTermAmount(amount);
		p.setPolicyId(pid);
		PolicyBo pb=new PolicyBo();
		int j=0;
		try {
			 j=pb.updatePolicy(p);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			j=5;
		}
		if(j>0) {
			out.println("<script>alert('Policy Updated sucessfully')</script>");
			request.setAttribute("value", "Policy Updated Sucessfully");
			request.setAttribute("name", "Admin");
			RequestDispatcher rd=getServletContext().getRequestDispatcher("/sucess.jsp");
			rd.forward(request, response);
		}
	}

}
