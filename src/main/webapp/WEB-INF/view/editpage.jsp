<%--
  Created by IntelliJ IDEA.
  User: marsel
  Date: 11.09.18
  Time: 15:02
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<html>
<head>
  <title>Edit Article</title>
</head>
<body>
<h1>Edit Article</h1>
<c:url var="saveUrl" value="/coinflipflop/main/articles/edit?id=${articleAttribute.id}" />
<form:form modelAttribute="articleAttribute" method="POST" action="${saveurl}">
  <table>
    <tr>
      <td><form:label path="id">Id:</form:label></td>
      <td><form:input path="id" disabled="true" /></td>
    </tr>
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
