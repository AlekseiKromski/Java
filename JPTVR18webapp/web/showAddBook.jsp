<%-- 
    Document   : showAddBook
    Created on : Jan 7, 2020, 10:21:42 AM
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
        <h1>Add book</h1>
        <form action="createBook"  method="post">
            Name book:<br>
            <input type="text" name="name"><br>
            
            Author book:<br>
            <input type="text" name="author"><br>
            
            Publiseh year book:<br>
            <input type="text" name="publishedYear"><br>
            
            ISBN book:<br>
            <input type="text" name="isbn"><br>
            
            Count book:<br>
            <input type="text" name="quantity"><br>
            
            <input type="submit" value="create">
            
            
        </form>
    </body>
</html>
