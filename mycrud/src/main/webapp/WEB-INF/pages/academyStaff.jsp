<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Programming Academy Staff</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
            padding: 20px;
            background-color: #f4f4f4;
        }
        .container {
            max-width: 800px;
            margin: auto;
            background: white;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0px 0px 10px 0px rgba(0, 0, 0, 0.1);
        }
        h1 {
            text-align: center;
        }
        table {
            width: 100%;
            border-collapse: collapse;
        }
        table, th, td {
            border: 1px solid black;
        }
        th, td {
            padding: 10px;
            text-align: left;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Programming Academy Staff</h1>
        <table>
            <tr>
                <th>IDNO</th>
                <th>Name</th>
                <th>Email</th>
				<th>Residence</th>
				
            </tr>
            <tr>
                <td>${Staff.id}</td>
                <td>${Staff.username}</td>
                <td>${Staff.email}</td>
				<td>${Staff.placeOfResidence}</td>
            </tr>
            <tr>
                <td>Jane Smith</td>
                <td>Course Coordinator</td>
                <td>janesmith@example.com</td>
            </tr>
            <tr>
                <td>Mike Brown</td>
                <td>Technical Support</td>
                <td>mikebrown@example.com</td>
            </tr>
        </table>
    </div>
</body>
</html>
