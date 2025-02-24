<!-- customerList.jsp -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Customer List</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
        }
        th, td {
            padding: 8px;
            text-align: left;
            border: 1px solid #ddd;
        }
        th {
            background-color: #f2f2f2;
        }
        a {
            text-decoration: none;
            color: #007bff;
        }
        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <h1>Customer List</h1>
    
    <!-- Display customers in a table -->
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Username</th>
                <th>Email</th>
                <th>Place of Residence</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
            <!-- Loop through the list of customers and display their data -->
            <c:forEach var="customer" items="${customers}">
                <tr>
                    <td>${customer.id}</td>
                    <td>${customer.username}</td>
                    <td>${customer.email}</td>
                    <td>${customer.placeOfResidence}</td>
                    <td>
                        <!-- Links for edit and delete actions -->
                        <a href="/mycrud-0.0.1-SNAPSHOT/edit/${customer.id}">Edit</a> |
                        <a href="/mycrud-0.0.1-SNAPSHOT/delete/${customer.id}">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

    <!-- Link to create a new customer -->
    <br>
    <a href="/mycrud-0.0.1-SNAPSHOT/new">Create New Customer</a>
</body>
</html>
