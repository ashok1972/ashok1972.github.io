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
<table>
<tr>
    <th>Policy Id </th>
    <th>Policy Name </th>
    <th>Policy type </th> 
    <th>Duration of years </th>
      <th>Company </th>
        <th>Initial Deposit </th>
          <th>User type </th>
            <th>Term amount </th>
              <th>Interest </th>
              <th>Payment </th>
              
</tr>
<%
PolicyBo pb=new PolicyBo();
ArrayList<PolicyEntry> al=pb.viewAllPolicies();
 for(PolicyEntry u1:al) 
 {
	 %><tr>
    <td><%=u1.getPolicyId() %></td>
    <td><%=u1.getPolicyName()  %></td>
    <td><%=u1.getPolicyType() %></td>
<td><%=u1.getDurationOfYears() %></td>
    <td><%=u1.getCompany() %></td>
    <td><%=u1.getIntialDeposit() %></td>
    <td><%=u1.getUserType() %></td>
    <td><%=u1.getTermAmount() %></td>
    <td><%=u1.getInterest() %></td></tr>
    <td><a href="confirmpayment.jsp?id=<%=u1.getTermAmount() %>">Pay</a></td></tr>
  
  <% }%> 
</table>

</body>
</html>