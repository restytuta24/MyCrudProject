<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Today's Highs and Lows</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            line-height: 1.6;
            margin: 0;
            padding: 0;
            background-color: #f9f9f9;
        }
        .container {
            max-width: 800px;
            margin: 50px auto;
            background: #fff;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }
        h1 {
            text-align: center;
            color: #333;
        }
        .highs, .lows {
            margin-top: 20px;
            padding: 15px;
            border-radius: 8px;
        }
        .highs {
            background-color: #d4edda;
            color: #155724;
        }
        .lows {
            background-color: #f8d7da;
            color: #721c24;
        }
        footer {
            text-align: center;
            margin-top: 30px;
            color: #777;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Today's Highs and Lows</h1>

        <div class="highs">
            <h2>Highs</h2>
            <ul>
                <li> The name of the head of IT department is ${Tuesday.name} and she heads the ${Tuesday.department} and she is ${Tuesday.age} years of age </li>
                <li>The residents were alright and well cared for.</li>
                <li>I maintained a healthy working relationship with my colleagues.</li>
                <li>I got home safely.</li>
            </ul>
        </div>

        <div class="lows">
            <h2>Lows</h2>
            <ul>
                <li>My hip bone has been paining today, limiting some of my movements.</li>
            </ul>
            <p>However, I am glad to be back home to rest.</p>
        </div>

        <footer>
            <p>Reflection helps us grow. Here's to a better tomorrow!</p>
        </footer>
    </div>
</body>
</html>
