<%--
  Created by IntelliJ IDEA.
  User: GPrabhu
  Date: 4/8/2015
  Time: 10:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Goals Report</title>
</head>
<body>
<table>
    <tr>
        <th>ID</th>
        <th>Minutes</th>
    </tr>
    <c:forEach items="${goals}" var="goal">
        <tr>
            <td>${goal.id}</td>
            <td>${goal.minutes}</td>
            <td>
                <table>
                    <tr>
                        <th>Exercise id</th>
                        <th>Exercise Minutes</th>
                        <th>Exercise activity</th>
                    </tr>
                    <c:forEach items="${goal.exercise}" var="exercise">
                        <tr>
                            <td>${exercise.id}</td>
                            <td>${exercise.minutes}</td>
                            <td>${exercise.activity}</td>
                        </tr>
                    </c:forEach>
                </table>
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
