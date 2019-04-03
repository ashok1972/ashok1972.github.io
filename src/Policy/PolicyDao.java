package Policy;
import java.sql.*;

public class PolicyDao {
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
		public static int savePolicy(Policyentry p) throws SQLException
		{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("insert into policy_entry values(?,?,?,?,?,?,?,?,?)");
		ps.setString(1, p.getPolicy_Id());	
		ps.setString(2, p.getPolicy());
		ps.setString(3, p.getPolicy_type());
		ps.setString(4, p.getDuration_of_Years());
		ps.setString(5, p.getCompany());
		ps.setString(6, p.getIntial_Deposit());
		ps.setString(7, p.getUser_Type());
		ps.setString(8, p.getTerm_amount());
		ps.setString(9, p.getInterest());
		int j=ps.executeUpdate();
		return j;
		}
}
