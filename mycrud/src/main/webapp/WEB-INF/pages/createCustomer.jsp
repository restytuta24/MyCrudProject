<!-- createCustomer.jsp -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Create Customer</title>
    <style>
        form {
            width: 300px;
            margin: 0 auto;
            padding: 20px;
            border: 1px solid #ddd;
            border-radius: 8px;
        }
        input {
            width: 100%;
            padding: 8px;
            margin: 8px 0;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
    </style>
</head>
<body>
    <h1>Create New Customer</h1>

    <!-- Form to create a new customer -->
    <form action="/mycrud-0.0.1-SNAPSHOT/save" method="POST">
        <input type="hidden" name="id" value="${customer.id}">

        <label for="username">Username:</label>
        <input type="text" name="username" id="username" value="${customer.username}" required>

        <label for="email">Email:</label>
        <input type="email" name="email" id="email" value="${customer.email}" required>

        <label for="placeOfResidence">Place of Residence:</label>
        <input type="text" name="placeOfResidence" id="placeOfResidence" value="${customer.placeOfResidence}" required>

        <button type="submit">Save Customer</button>
    </form>

    <br>
    <a href="/mycrud-0.0.1-SNAPSHOT/customers">Back to Customer List</a>
</body>
</html>
