package com.cts.policymanagementsystem.businessclass;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import com.cts.policymanagementsystem.configuration.MyConnection;
import com.cts.policymanagementsystem.model.*;
public class PolicyBo {
		public static int savePolicy(PolicyEntry p) throws SQLException
		{
		Connection con=(Connection) MyConnection.getConnection();
		PreparedStatement ps=con.prepareStatement("insert into policy_entry values(?,?,?,?,?,?,?,?,?)");
		ps.setString(1, p.getPolicyId());	
		ps.setString(2, p.getPolicyName());
		ps.setString(3, p.getPolicyType());
		ps.setString(4, p.getDurationOfYears());
		ps.setString(5, p.getCompany());
		ps.setString(6, p.getIntialDeposit());
		ps.setString(7, p.getUserType());
		ps.setString(8, p.getTermAmount());
		ps.setString(9, p.getInterest());
		int j=ps.executeUpdate();
		return j;
		}
		  public ArrayList<PolicyEntry> viewAllPolicies() throws Exception{
	          ArrayList<PolicyEntry> al=new ArrayList<PolicyEntry>();
	    Connection con=(Connection) MyConnection.getConnection();
	    try {
	    Statement s=(Statement) con.createStatement();
	    ResultSet rs=s.executeQuery("select * from policy_entry");
	    while(rs.next()) {
	    	PolicyEntry p=new PolicyEntry(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
	        al.add(p);
	    }
	    }
	    catch(Exception e) {System.out.println(e);}
	    finally {
	        con.close();
	    }
	   return (ArrayList<PolicyEntry>) al;
	      }
		  
		  public List<PolicyEntry> getAllPolicies() throws Exception{
			List<PolicyEntry> li=new ArrayList<PolicyEntry>();
			Connection con=(Connection) MyConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from policy_entry");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				li.add(new PolicyEntry(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9)));
				
				
			}
			
			return li;
			  
		  }
	
}
