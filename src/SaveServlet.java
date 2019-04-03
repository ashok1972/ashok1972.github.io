
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.UserBean.User;
import com.cognizant.UserBean.UserDao;

/**
 * Servlet implementation class SaveServlet
 */
@WebServlet("/SaveServlet")
public class SaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public SaveServlet() {
    	
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();

		response.setContentType("text/html");
		String  first_name=request.getParameter("First_Name");
		String last_name=request.getParameter("Last_Name");
		String DOB=request.getParameter("DOB");
		String gender=request.getParameter("Gender");
		String contact_number=request.getParameter("Contact_Number");
		String address=request.getParameter("Address");
		String email_id=request.getParameter("Email_id");
		String qualification=request.getParameter("Last_Name");
		int salary_per_month=Integer.parseInt(request.getParameter("Salary_Per_Month"));
		String PAN_no=request.getParameter("PAN_No");
		String employer_type=request.getParameter("Employer_Type");
		String employer=request.getParameter("Employer");
		String hint_question=request.getParameter("Hint-Question");
		String hint_answer=request.getParameter("Hint-Answer");
		String password=request.getParameter("psw");
		System.out.println(password);
        User u=new User();
	    u.setFirstName(first_name);
	    u.setLastName(last_name);
		u.setDob(DOB);
		u.setGender(gender);
		u.setContact_Number(contact_number);
		u.setAddress(address);
		u.setEmail_Id(email_id);
		u.setQualification(qualification);
		u.setSalary_per_Month(salary_per_month);
		u.setPan_No(PAN_no);
		u.setEmployee_Type(employer_type);
		u.setEmployer(employer);
		u.setHint_Question(hint_question);
		u.setHint_Answer(hint_answer);
		u.setPassword(password);
	
		int j;
		try {
			j = UserDao.saveUser(u);
			
			
			if(j >0)
			{
				out.println("<script>alert('Registered sucessfully')</script>");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
