<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 14/02/2024
  Time: 13:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>edit user</title>
</head>
<body>
<%@page import="com.example.crupjsp.UserDao"%>
<jsp:useBean id="u" class="com.example.crupjsp.User"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>
<%
    int i=UserDao.update(u);
    response.sendRedirect("viewUsers.jsp");
%>
</body>
</html>
