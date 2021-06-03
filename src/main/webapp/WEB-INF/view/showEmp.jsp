<%--
  Created by IntelliJ IDEA.
  User: Ablazzing
  Date: 18.05.2021
  Time: 18:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Show Employees</title>
</head>

<body>
  <h1>Список сотрудников</h1>
  <table>
   <tr>
    <th>Имя</th>
    <th>Фамилия</th>
    <th>Департамент</th>
    <th>Зарплата</th>
   </tr>
   <c:forEach var="emp" items="${empList}">
    <tr>
     <td>${emp.name}</td>
     <td>${emp.surname}</td>
     <td>${emp.department}</td>
     <td>${emp.salary}</td>
        <td> <form:form action="editEmp?id=${emp.id}">
            <input value="Изменить" type="submit"/>
        </form:form>
        </td>
        <td> <form:form action="deleteEmp?id=${emp.id}">
            <input value="Удалить" type="submit"/>
        </form:form>
        </td>

    </tr>
   </c:forEach>
  </table>
  <button onclick="window.location.href='addEmp'">Добавить сотрудника</button>


</body>
</html>
