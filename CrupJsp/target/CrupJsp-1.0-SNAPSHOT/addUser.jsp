<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 13/02/2024
  Time: 16:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="com.example.crupjsp.UserDao"%>
<jsp:useBean id="u" class="com.example.crupjsp.User"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    int i=UserDao.save(u);
    if(i>0){
        response.sendRedirect("adduser-success.jsp");
    }
    else{
        response.sendRedirect("adduser-error.jsp ");
    }
%>


</body>
</html>
