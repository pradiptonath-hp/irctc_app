<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>List All leads</title>
</head>
<body>
    <h1>List all leads ... </h1>
    <table>
        <tr>
            <th>FirstName</th>
            <th>LastName</th>
            <th>Email</th>
            <th>Mobile</th>
        </tr>
   
        <c:forEach var="lead" items="${leads}" >
            <tr> <!-- Corrected here -->
                <td>${lead.firstName}</td>
                <td>${lead.lastName}</td>
                <td>${lead.email}</td>
                <td>${lead.mobile}</td>
            </tr> <!-- Corrected here -->
        </c:forEach>
    </table>
</body>
</html>
