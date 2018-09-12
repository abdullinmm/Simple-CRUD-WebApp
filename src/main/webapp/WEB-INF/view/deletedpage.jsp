<%--
  Created by IntelliJ IDEA.
  User: marsel
  Date: 11.09.18
  Time: 15:05
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Title</title>
</head>
<body>
<h2>Articles</h2>
<p>You have deleted a article with id ${id} at <%= new java.util.Date() %></p>

<c:url var="mainUrl" value="/coinflipflop/main/articles" />
<p>Return to <a href="${mainUrl}">Main List</a></p>
</body>
</html>
