<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    <%@page import="java.util.*,com.cts.policymanagementsystem.businessclass.*,com.cts.policymanagementsystem.controller.*,com.cts.policymanagementsystem.model.*,java.io.*"%> 
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
h3{
  font-family: Calibri; 
  font-size: 25pt;         
  font-style: normal; 
  font-weight: bold; 
  color:Green;
  text-align: center; 
  text-decoration: underline
}

table{
  font-family: Calibri; 
  color:black; 
  font-size: 11pt; 
  font-style: normal;
  font-weight: bold;
  text-align: ; 
  background-color:white; 
  border-collapse: collapse; 
  border: 4px solid navy
}
table.inner{
  border: 0px
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  
<center><h1>Policy Details</h1></center>
<table>
<tr>
    
    <th>Policy Name </th>
    <th>Policy type </th> 
    <th>Duration of years </th>
      <th>Company </th>
        <th>Initial Deposit </th>
          <th>User type </th>
            <th>Term amount </th>
              <th>Interest </th>
</tr>
<%
String value=request.getParameter("pid");
PolicyBo pb=new PolicyBo();
ArrayList<PolicyEntry> al=pb.viewAllPolicies();
 for(PolicyEntry u1:al) 
 {
	  if(value.equals(u1.getPolicyId())){
	 %><tr>
   
    <td><%=u1.getPolicyName()  %></td>
    <td><%=u1.getPolicyType()%></td>
<td><%=u1.getDurationOfYears() %></td>
    <td><%=u1.getCompany() %></td>
    <td><%=u1.getIntialDeposit() %></td>
    <td><%=u1.getUserType() %></td>
    <td><%=u1.getTermAmount() %></td>
    <td><%=u1.getInterest() %></td></tr>
  <%} }%> 
</table>
</body>
</html>




