<%--
  Created by IntelliJ IDEA.
  User: Ablazzing
  Date: 18.05.2021
  Time: 18:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
 Name ${employee.name}
 <br>
 Surname ${employee.surname}
 <br>
 Salary ${employee.salary}
 <br>
 Phone ${employee.phone}
 <br>
 Email ${employee.email}
 <br>
 Department ${employee.department}
<br>
 Car ${employee.carBrand}
<br>
 Languages
<ul>
 <c:forEach var="lang" items="${employee.languages}">
  <li>${lang}</li>
 </c:forEach>
</ul>

</body>
</html>
