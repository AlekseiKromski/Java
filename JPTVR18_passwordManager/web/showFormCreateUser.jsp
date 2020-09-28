<%-- 
    Document   : showFormAddResource
    Created on : Sep 10, 2020, 2:50:54 PM
    Author     : pupil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

        <div class="container-fluid">
            <div class="row justify-content-center">
                <div class="col-3 main-block shadow p-5">
                    <form method="post" action="createUser">
                        <h2>Sign in</h2><span class="error-message">${info}</span> 
                        <hr>
                        <div class="form-group">
                          <label for="exampleInputlogin 1">User Name: </label>
                          <input type="text" name="login" class="form-control" id="exampleInputLogin1" aria-describedby="loginHelp" placeholder="Enter login">
                        </div>
                        <div class="form-group">
                          <label for="exampleInputPassword1">Password: </label>
                          <input type="password" class="form-control" id="exampleInputPassword1"  name="password" placeholder="password">
                        </div>
                        <button type="submit" class="btn btn-primary">Sign in</button>
                        
                    </form>
                </div>
            </div>
        </div>