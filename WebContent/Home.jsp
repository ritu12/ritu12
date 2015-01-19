<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.util.Dictionary"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.awt.Image" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ page import="java.io.*,java.util.*, javax.servlet.*" %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Display Current Date & Time</title>
</head>
<body>
<center>
<fieldset>
<h2 style="border-bottom-style:groove;" > Current Time:::<%= java.util.Calendar.getInstance().getTime() %> </h2>
</fieldset>
</div>
</center>
<div>
<fieldset style="play-during: repeat; ">
<table width="500%">
<%-- <tr><img src="<%= request.getContextPath() %>/adminuser/WebContent/images/Forward.jpg" /></tr>
 --%>
 <tr height="100" width="50" ><td height="80" width="40" align="left" ><img src="images/Forward.jpg" /></td></tr>
</table>
<fieldset>
</div>
<%-- <%@jsp:include page="Index.html"%>;  --%>

 <%@ include file="Index.html" %>
</body>
</html>