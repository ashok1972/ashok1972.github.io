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
  <%
  List<PolicyEntry> li=new PolicyBo().getAllPolicies();
  Set<String> setpo=new TreeSet<String>();
  for(PolicyEntry pe:li){
	  setpo.add(pe.getPolicyType());
  }
  
  
  %>
<center><h1>Policy Details</h1></center>
<form action="display1.jsp">
Select the policy Type : <select name="policy_type">
<%for(String s:setpo) { %>
<option value="<%=s%>"><%=s%></option>
<% } %>
</select>
<input type="submit" value="search">
</form>

<form>
Pilicy id: <input type="text" name="pid">
<input type="submit" value="Serch Id">

</form>




</body>
</html>




