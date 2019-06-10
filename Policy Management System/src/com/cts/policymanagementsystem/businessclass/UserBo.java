package com.cts.policymanagementsystem.businessclass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cts.policymanagementsystem.configuration.MyConnection;
import com.cts.policymanagementsystem.model.User;



public class UserBo {

	public static int saveUser(User u) throws SQLException
	{
		Connection con=MyConnection.getConnection();
		PreparedStatement ps=con.prepareStatement("insert into new_table values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
		ps.setString(1, u.getFirstName());
		ps.setString(2, u.getLastName());
		ps.setString(3, u.getDateOfBirth());
		ps.setString(4, u.getGender());
		ps.setString(5, u.getContactNumber());
		ps.setString(6, u.getAddress());
		ps.setString(7, u.getEmailId());
		ps.setString(8, u.getQualification());
		ps.setInt(9, u.getSalaryPerMonth());
		ps.setString(10, u.getPanNumber());
		ps.setString(11, u.getEmployeeType());
		ps.setString(12, u.getEmployer());
		ps.setString(13, u.getHintQuestion());
		ps.setString(14, u.getHintAnswer());
		ps.setString(15, u.getPassword());
		int i=ps.executeUpdate();
		return i;
	}
	public static User getLogin(String email, String password) throws SQLException
	{
		//int k=0;
		
		Connection con=MyConnection.getConnection();
		PreparedStatement ps=con.prepareStatement("select * from new_table where email=? and password1=?");
		ps.setString(1,email);
		ps.setString(2, password);
		ResultSet rs=ps.executeQuery();
		User u=null;
		while(rs.next())
		{
			u=new User(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15),rs.getInt(9));
		

		}	
		return u;
		
		
	}
	public List<User> getAllUsers()throws Exception{
		List<User> al=new ArrayList<User>();
		Connection con=MyConnection.getConnection();
		PreparedStatement ps=con.prepareStatement("select * from new_table");

		ResultSet rs=ps.executeQuery();
		User u=null;
		while(rs.next())
		{
			u=new User(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15),rs.getInt(9));
		
			al.add(u);
		}
		return al;
	}
}
