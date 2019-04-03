

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Policy.PolicyDao;
import Policy.Policyentry;

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
		Policyentry p=new Policyentry();
		p.setPolicy_Id(policy_id);
		p.setPolicy(policy_type);
		p.setPolicy_type(policy_type);
		p.setDuration_of_Years(duration_of_years);
		p.setCompany(company);
		p.setIntial_Deposit(initial_deposit);
		p.setUser_Type(user_type);
		p.setTerm_amount(term_amount);
		p.setInterest(interest);
        try {
			int j=PolicyDao.savePolicy(p);
			if(j==1)
			{
				out.println("<script>alert('Policy Registered sucessfully')</script>");
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
