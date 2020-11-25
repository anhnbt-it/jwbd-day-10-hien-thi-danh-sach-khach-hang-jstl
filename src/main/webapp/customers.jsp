<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 25/11/2020
  Time: 9:21 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
</head>
<body>
<table class="table">
    <thead>
    <tr>
        <th scope="col">Name</th>
        <th scope="col">Date Of Birth</th>
        <th scope="col">Address</th>
        <th scope="col">Avatar</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${customers}" var="customer">
        <tr>
            <th scope="row">${customer.getName()}</th>
            <td>${customer.getDateToString()}</td>
            <td>${customer.getAddress()}</td>
            <td><img src="./images/${customer.getAvatar()}" alt="${customer.getName()}" width="75"></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
