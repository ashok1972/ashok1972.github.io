package com.cognizant.UserBean;
import java.sql.*;

public class UserDao {
	public static Connection getConnection()
	{
		Connection con=null;
		try
		{
		    Class.forName("com.mysql.jdbc.Driver");
            con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ashok","root","root");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return con;
	}
public static int saveUser(User u) throws SQLException
{
	Connection con=getConnection();
	PreparedStatement ps=con.prepareStatement("insert into new_table values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
	ps.setString(1, u.getFirstName());
	ps.setString(2, u.getLastName());
	ps.setString(3, u.getDob());
	ps.setString(4, u.getGender());
	ps.setString(5, u.getContact_Number());
	ps.setString(6, u.getAddress());
	ps.setString(7, u.getEmail_Id());
	ps.setString(8, u.getQualification());
	ps.setInt(9, u.getSalary_per_Month());
	ps.setString(10, u.getPan_No());
	ps.setString(11, u.getEmployee_Type());
	ps.setString(12, u.getEmployer());
	ps.setString(13, u.getHint_Question());
	ps.setString(14, u.getHint_Answer());
	ps.setString(15, u.getPassword());
	int i=ps.executeUpdate();
	return i;
}



public static int getLogin(String email, String password) throws SQLException
{
	int k=0;
	
	Connection con=getConnection();
	PreparedStatement ps=con.prepareStatement("select email, password from new_table");
	ResultSet rs=ps.executeQuery();
	while(rs.next())
	{
		if(rs.getString("email").equals(email) && rs.getString("password").equals(password))
		{
			k=1;
			break;
		}
		else
		{
			k=0;
		}

	}	
	return k;
	
	
}

}
