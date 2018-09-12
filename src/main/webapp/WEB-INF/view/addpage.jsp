<%--
  Created by IntelliJ IDEA.
  User: marsel
  Date: 11.09.18
  Time: 15:03
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Add Article</title>
</head>
<body>
<h2>Create new Article</h2>
<c:url var="saveUrl" value="/coinflipflop/main/articles/add" />
<form:form modelAttribute="articleAttribute" method="POST" action="${saveUrl}">
  <table>
    <tr>
      <td><form:label path="title">Title</form:label></td>
      <td><form:input path="title" /></td>
    </tr>
    <tr>
      <td><form:label path="article">Article</form:label></td>
      <td><form:input path="article" /></td>
    </tr>
    <tr>
      <td><form:label path="code">Code</form:label></td>
      <td><form:input path="code" /></td>
    </tr>
  </table>
  <button type="submit" value="Save">Save</button>
</form:form>
</body>
</html>
