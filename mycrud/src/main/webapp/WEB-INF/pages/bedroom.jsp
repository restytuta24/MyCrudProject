<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Bedroom Furniture Form</title>
    <style>
        body { font-family: Arial, sans-serif; }
        form { width: 300px; margin: 0 auto; padding: 20px; border: 1px solid #ccc; border-radius: 5px; }
        label, input, select { display: block; width: 100%; margin-bottom: 10px; }
        input[type="submit"] { background-color: #4CAF50; color: white; border: none; padding: 10px; cursor: pointer; }
    </style>
</head>
<body>
    <h2 style="text-align: center;">Bedroom Furniture Form</h2>
    <form action="furnitureOrder" method="post">
		
		<label for="furnitureId">furnitureId:</label>
		<input type="number" id="furnitureId" name="furnitureId" value="${bedroomApparatus.furnitureId}" required>
		
        <label for="furnitureType">Furniture Type:</label>
        <input type="text" id="furnitureType" name="furnitureType" value="${bedroomApparatus.furnitureType}" required>
        
        <label for="material">Material:</label>
        <input type="text" id="material" name="material" value="${bedroomApparatus.material}" required>
        
        <label for="color">Color:</label>
        <input type="text" id="color" name="color" value="${bedroomApparatus.color}" required>
        
        <label for="price">Price (£):</label>
        <input type="number" id="price" name="price" step="0.01" value="${bedroomApparatus.price}" required>
        
        <input type="submit" value="Save">
    </form>
</body>
</html>
