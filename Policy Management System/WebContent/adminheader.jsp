<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Welcome <%=request.getAttribute("name") %> <a href="VendorRegistration.html">Vendor Registration</a> | <a href="Policyregistration.html">Policy Creation</a> | 
<a href="viewpolicies.jsp"> View All Policies</a> | <a href="editpolicy.jsp">Edit Policy</a> | <a href="searchpolicies.jsp">Search Policies</a>

</body>
</html>