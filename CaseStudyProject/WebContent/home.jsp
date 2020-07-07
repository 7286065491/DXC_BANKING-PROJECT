<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.dxc.loginpage.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
		String username = request.getParameter("loginname");
		String uemail = request.getParameter("loginmail");
		User mUser = (User) session.getAttribute("userObject");
		if(mUser.getName().equalsIgnoreCase(username) && mUser.getEmail().equalsIgnoreCase(uemail))
			{
			out.print("Welcome "+mUser.getName()+" "+mUser.getEmail());
		    out.println("Name :" +mUser.getName()+ "\n Email:" +mUser.getEmail()+ "\n Phone: " +mUser.getPhone()+ "\nPasseord:" +mUser.getPassword()+ "\n Country:" +mUser.getCountry());
			}else 
		{
			pageContext.forward("error.jsp");
		}
	%><br>
	<br>
</body>
</html>