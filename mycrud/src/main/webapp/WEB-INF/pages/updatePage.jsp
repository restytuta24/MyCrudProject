<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> <%-- For JSTL --%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Update Customer</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
            padding: 20px;
        }
        .container {
            max-width: 500px;
            margin: auto;
            padding: 20px;
            border: 1px solid #ddd;
            border-radius: 5px;
            box-shadow: 2px 2px 10px rgba(0, 0, 0, 0.1);
        }
        label {
            display: block;
            margin-top: 10px;
        }
        input {
            width: 100%;
            padding: 8px;
            margin-top: 5px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        button {
            margin-top: 15px;
            padding: 10px;
            background-color: #28a745;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
        button:hover {
            background-color: #218838;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Update Customer</h2>
        <form action="/mycrud-0.0.1-SNAPSHOT/finalupdate/${editCustomer.id}" method="post">
            <input type="hidden" name="id" value="${editCustomer.id}">
            <label for="username">Name:</label>
            <input type="text" id="username" name="username" value="${editCustomer.username}" required>
            
            <label for="email">Email:</label>
            <input type="email" id="email" name="email" value="${editCustomer.email}" required>
            
            <label for="placeOfResidence">placeOfResidence:</label>
            <input type="text" id="placeOfResidence" name="placeOfResidence" value="${editCustomer.placeOfResidence}" required>
            
            <button type="submit">Update</button>
        </form>
    </div>
</body>
</html>