<%-- 
    Document   : showFormAddUser
    Created on : 14.09.2020, 21:18:48
    Author     : yanikarp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<h1>Create new user</h1>
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