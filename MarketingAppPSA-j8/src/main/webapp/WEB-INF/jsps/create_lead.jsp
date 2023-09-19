<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Hello JSP</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            display: flex;
            justify-content: center; /* Center horizontally */
            align-items: center; /* Center vertically */
            height: 100vh; /* Full viewport height */
        }

        h1 {
            text-align: center;
            color: #333;
        }

        form {
            width: 400px;
            padding: 20px;
            background-color: #fff;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        pre {
            padding: 10px;
        }

        input[type="text"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 3px;
        }

        input[type="Submit"] {
            width: 100%;
            padding: 10px;
            background-color: #007BFF;
            color: #fff;
            border: none;
            border-radius: 3px;
            cursor: pointer;
        }

        input[type="Submit"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <h1>Create New Lead</h1>
    <form action="saveReg" method="post">
        
            First Name <input type="text" name="firstName" required />
             Last Name <input type="text" name="lastName" required />
                 Email <input type="text" name="email" required />
                Mobile <input type="text" name="mobile" required />
            <input type="Submit" value="Save" />
        
    </form>
    ${msg}
</body>
</html>
