<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="obj" class="com.dxc.loginpage.User"/>
<%
String username = request.getParameter("uname");
String uemail = request.getParameter("email");
String uphone= request.getParameter("uphone");
String upassword= request.getParameter("upassword");
String ucountry= request.getParameter("ucountry");
obj.setName(username);
obj.setEmail(uemail);
obj.setPhone(uphone);
obj.setPassword(upassword);
obj.setCountry(ucountry);
session.setAttribute("userObject", obj);
%>
<form action="home.jsp" >
Name:<input type="text" name="loginname" placeholder="Enter username"/><br>
Email<input type="text" name="loginmail" placeholder="Enter email"/><br>
<input type="submit" value="Login" />
</form>

</body>
</html>