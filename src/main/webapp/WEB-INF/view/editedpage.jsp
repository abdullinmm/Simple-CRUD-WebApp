<%--
  Created by IntelliJ IDEA.
  User: marsel
  Date: 11.09.18
  Time: 15:04
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Edited page</title>
</head>
<body>
<h1>Articles</h1>
<p>You have edited a article with id ${article.id} and title ${article.title} at <%= new java.util.Date() %></p>

<c:url var="mainUrl" value="/coinflipflop/main/articles" />
<p>Return to <a href="$mainUrl">Main List</a></p>
</body>
</html>
