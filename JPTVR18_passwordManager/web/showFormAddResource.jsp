<%-- 
    Document   : showFormAddResource
    Created on : Sep 10, 2020, 2:50:54 PM
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
        <h1>Создание нового ресурса</h1>
        <form method="post" action="createResource">
            <p>
                Name of resource: 
                <input type="text" name="name">
            </p>
            <p>
                Url of resource: 
                <input type="text" name="url">
            </p>
            <p>
                Login of resource: 
                <input type="text" name="login">
            </p>
            <p>
                Password of resource: 
                <input type="password" name="password">
            </p>
            <input type="submit" name="submit" value="add resource">

        </form>
    </body>
</html>
