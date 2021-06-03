<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%--
  Created by IntelliJ IDEA.
  User: Ablazzing
  Date: 02.06.2021
  Time: 22:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="updateEmp" modelAttribute="employee">
    Имя <form:input path="name" value="${employee.name}" />
    <br/>
    Фамилия <form:input path="surname" value="${employee.surname}"/>
    <br/>
    Департамент <form:input path="department" value="${employee.department}"/>
    <br/>
    Зарплата <form:input path="salary" value="${employee.salary}"/>
    <br/>
    <form:input path="id" type="hidden" value="${employee.id}"/>
    <input value="Изменить" type="submit">
</form:form>

</body>
</html>
