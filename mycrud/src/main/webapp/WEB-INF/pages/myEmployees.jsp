<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Employee Form</title>
</head>
<body>
    <form action="academy" method="post">
        <label for="name">Name:</label>
        <input type="text" id="username" name="username" value="${customer.username}" required><br><br>
	
        <label for="department">Department:</label>
        <input type="text" id="department" name="department" value="${customer.department}" required><br><br>
        
        <label for="email">Email:</label>
        <input type="text" id="email" name="email" value="${customer.email}" required><br><br>
		
		<label for="placeOfResidence">PlaceOfResidence:</label>
	    <input type="text" id="placeOfResidence" name="placeOfResidence" value="${customer.placeOfResidence}" required><br><br>
        
        <button type="submit">Submit</button>
    </form>
</body>
</html>
