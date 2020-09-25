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
                            <th scope="col">Name</th>
                            <th scope="col">URL</th>
                            <th scope="col">Login</th>
                            <th scope="col">Password</th>                            
                            <th scope="col">Functionality</th>
                          </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="resource" items="${listResources}">
                                <tr>
                                    <td>${resource.name}</td>
                                    <td>${resource.url}</td>
                                    <td>${resource.login}</td>
                                    <td>${resource.password}</td>
                                    <td><a class="btn btn-danger" href="deleteResource?id=${resource.id}">Удалить</a></td>
                                </tr>
                            </c:forEach>
                        </tbody>
                      </table>

                </div>
            </div>
        </div>