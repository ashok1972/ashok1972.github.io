<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@page import="java.util.*,com.cts.policymanagementsystem.businessclass.*,com.cts.policymanagementsystem.controller.*,com.cts.policymanagementsystem.model.*,java.io.*"%> 
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./EditPolicyServlet" method="post">
<%
String id=request.getParameter("id");

PolicyBo pb=new PolicyBo();
ArrayList<PolicyEntry> al=pb.viewAllPolicies();
 for(PolicyEntry u1:al) 
 {
	  if(id.equals(u1.getPolicyId())){
%>
<input type="hidden" name="id"  value="<%=u1.getPolicyId()%>"><br><br>
Policy name : <input type="text" name="uname" value="<%=u1.getPolicyName()%>"><br><br>

Policy type : <input type="text" name="ptype" value="<%=u1.getPolicyType()%>"><br><br>

Policy duration : <input type="text" name="pduration" value="<%=u1.getDurationOfYears()%>"><br><br>

Policy amount : <input type="text" name="pamount" value="<%=u1.getTermAmount()%>"><br><br>

<%}} %>

<input type="submit" value="Update Policy">
</form>
</body>
</html>