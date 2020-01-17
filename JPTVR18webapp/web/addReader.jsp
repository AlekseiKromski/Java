<%-- 
    Document   : addReader
    Created on : Jan 14, 2020, 10:53:18 AM
    Author     : pupil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Add reader</h1>
        <form action="addReaderAction" method="post">
            Fname:<br>
            <input type="text" name="Fname"><br>
            
            Lname:<br>
            <input type="text" name="Lname"><br>
            
            day:<br>
            <input type="number" name="day"><br>
            
            mounth:<br>
            <input type="number" name="mounth"><br>
            
            year:<br>
            <input type="number" name="year"><br>
            
            phone number:<br>
            <input type="text" name="number"><br>
            
            <input type="submit" value="submit">
            
            
        </form>
    </body>
</html>
