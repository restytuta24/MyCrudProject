<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> <%-- For JSTL --%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Customer List</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
        }
        th, td {
            border: 1px solid black;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <h2>List of Customers</h2>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>User Name</th>
                <th>Email</th>
                <th>Place Of Residence</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="customer" items="${listYaange}">
                <tr>
                    <td>${customer.id}</td>
                    <td>${customer.username}</td>
                    <td>${customer.email}</td>
                    <td>${customer.placeOfResidence}</td>
<td>
                    <a href="${pageContext.request.contextPath}/update/${customer.id}">Update</a>
                    <a href="${pageContext.request.contextPath}/delete/${customer.id}">Delete</a>
                </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
