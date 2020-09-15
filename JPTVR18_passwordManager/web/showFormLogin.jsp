<%-- 
    Document   : showFormLogin
    Created on : Sep 15, 2020, 1:20:55 PM
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
        <h1>Вход в систему</h1>
        <p>
            ${info}
        </p>
        <form method="post" action="login">
            <p>
                Login of user 
                <input type="text" name="login">
            </p>
            <p>
                Password of resource: 
                <input type="password" name="password">
            </p>
            <input type="submit" name="submit" value="login">

        </form>
    </body>
</html>
