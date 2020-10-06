<%-- 
    Document   : listResource
    Created on : Sep 10, 2020, 2:51:35 PM
    Author     : pupil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

        
        
        <div class="container-fluid">
            <div class="row justify-content-center">
                <div class="col-6 main-block shadow p-5">
                    <h2>List of resources</h2>
                    <hr>
                    <table class="table">
                        <thead class="thead-dark">
                          <tr>
                            <th scope="col">Login</th>                       
                            <th scope="col">Role</th>                       
                            <th scope="col">Functionality</th>
                          </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="entry" items="${usersMap}">
                                <tr>
                                    <td>${entry.key.login}</td>
                                    <td>${entry.value}</td>
                                    <td><a class="btn btn-warning" href="form-edit-user-role?id=${entry.key.id}">Изменить</a></td>
                                </tr>
                            </c:forEach>
                        </tbody>
                      </table>

                </div>
            </div>
        </div>