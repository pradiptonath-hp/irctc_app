
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Display Data</title>
</head>
<body>
    <h1>Person Information</h1>
    <table border="1">
        <tr>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Email</th>
            <th>Mobile</th>
        </tr>
        <c:forEach items="${leads}" var="lead">
            <tr>
                <td><c:out value="${lead.firstName}" /></td>
                <td><c:out value="${lead.lastName}" /></td>
                <td><c:out value="${lead.email}" /></td>
                <td><c:out value="${lead.mobile}" /></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
