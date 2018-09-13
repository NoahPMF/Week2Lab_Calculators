<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 13, 2018, 12:03:03 PM
    Author     : 601354
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form action="arithmetic" method="post">
            First number:<input type ="text" name="first" value="${one}"><br>
            Second number:<input type ="text" name="second" value="${two}"><br>
            <input type="submit" value="+">
            <input type="submit" value="-">
            <input type="submit" value="*">
            <input type="submit" value="%">
        </form>
            Result:<div>${result}</div><br>
            <a href="age">Age Calculator</a>
    </body>
</html>
