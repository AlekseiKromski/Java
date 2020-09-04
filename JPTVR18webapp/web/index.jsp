<%-- 
    Document   : index
    Created on : Jan 7, 2020, 9:04:31 AM
    Author     : pupil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Our library</title>
    </head>
    <body>
        <h1>Hello user!</h1>
        <span style="color:green">${info}</span>
        <hr>
        <h2>Books</h2>
        <a href="showAddBook">Add book</a><br>
        <a href="deleteBook">Delete book</a><br>
        <a href="listBooks">List of books</a>
        <hr>
        <h2>Readers</h2>
        <a href="addReader">Add reader</a><br>
        <a href="deleteReader">Delete reader</a><br>
        <a href="listReader">List of reader</a>
        <hr>
        <h2>History</h2>
        <a href="addHistory">Give book</a><br>
        <a href="returnBook">Return book</a><br>
        <a href="listHistory">List of history</a>
    </body>
</html>
