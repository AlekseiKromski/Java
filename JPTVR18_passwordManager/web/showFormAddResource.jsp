<%-- 
    Document   : showFormAddUser
    Created on : 14.09.2020, 21:18:48
    Author     : yanikarp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

        <div class="container-fluid">
            <div class="row justify-content-center">
                <div class="col-4 main-block shadow p-5">
                    <form method="post" action="createResource">
                        <h2>Create new resource</h2><span class="error-message">${info}</span> 
                        <hr>
                        <div class="form-group">
                          <label for="name">Name of resource: </label>
                          <input type="text" name="name" class="form-control" id="name" aria-describedby="url" placeholder="Name">
                        </div>
                        <div class="form-group">
                          <label for="url">URL of resource: </label>
                          <input type="text" name="url" class="form-control" id="url" aria-describedby="url" placeholder="Url">
                        </div>
                        <div class="form-group">
                          <label for="login">Login of resource: </label>
                          <input type="text" name="login" class="form-control" id="login" aria-describedby="login" placeholder="login">
                        </div>
                        <div class="form-group">
                          <label for="exampleInputPassword1">Password: </label>
                          <input type="password" class="form-control" id="exampleInputPassword1"  name="password" placeholder="password">
                        </div>
                        <button type="submit" class="btn btn-primary">Create resource</button>
                        
                    </form>
                </div>
            </div>
        </div>