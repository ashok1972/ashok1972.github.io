package Admin;	

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class AdminDao {
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

public static int getAdmin(String email, String password) throws SQLException
{
	int k=0;
	
	Connection con=getConnection();
	PreparedStatement ps=con.prepareStatement("select email, password from admin_table");
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
