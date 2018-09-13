<%-- 
    Document   : agecalculator
    Created on : Sep 13, 2018, 11:57:24 AM
    Author     : 601354
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>

        <form action="age" method="post">
            current age: <input type="text" name="age"><br>
            <input type="submit" value="Age next birthday">
        </form>
        
        <div>
            ${message}
        </div>
        
        <div>
            <a href="arithmetic">Arithemtic Calculator</a>
        </div>
    </body>
</html>
