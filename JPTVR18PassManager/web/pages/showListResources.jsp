<%-- 
    Document   : showListResources
    Created on : Sep 17, 2020, 1:53:20 PM
    Author     : Melnikov
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<h3 class="w-100 text-center ">Список ресурсов:</h3>
<div class="form-group w-50 mx-auto">
        <c:forEach var="resource" items="${listResources}">
         <p>  
            <div class="form-group row w-100 mx-auto my-0">
                <label for="name" class="col-sm-5 col-form-label">Название ресурса</label>
                <div class="col-sm-7">
                    <input  value="${resource.id}" type="hidden" name="idResource">
                    <input  value="${resource.name}" class="form-control-plaintext" readonly="" type="text" id="name" name="name" aria-describedby="nameResource" placeholder="Введите имя ресурса" >
                    <small id="nameResource" class="form-text text-muted"></small>
                </div>    
            </div>
            <div class="form-group row w-100 mx-auto my-0">   
                <label for="url" class="col-sm-5 col-form-label">URL ресурса</label>
                <div class="col-sm-7">
                    <input value="${resource.url}" class="form-control-plaintext" readonly="" type="text" id="url" name="url" aria-describedby="urlHelp" placeholder="Введите url ресурса">
                    <small id="urlHelp" class="form-text text-muted"></small>
                </div>
            </div>
            <div class="form-group row w-100 mx-auto my-0">  
                <label for="login" class="col-sm-5 col-form-label">Логин</label>
                <div class="col-sm-7">
                    <input value="${resource.login}" class="form-control-plaintext" readonly="" type="text" id="login" name="login" aria-describedby="loginHelp" placeholder="Логин">
                    <small id="loginHelp" class="form-text text-muted"></small>
                </div>
            </div>
            <div class="form-group row w-100 mx-auto my-0">    
                <label for="password" class="col-sm-5 col-form-label">Пароль</label>
                <div class="col-sm-7">
                    <input value="${resource.password}" class="form-control-plaintext" readonly="" type="text" id="password" name="password" aria-describedby="passwordHelp" placeholder="Пароль">
                    <small id="passwordHelp" class="form-text text-muted"></small>
                </div>
            </div>
            <div class="form-group w-100 mx-auto">
                <div class="col-sm-7">
                    <a class="btn btn-primary btn-sm mr-1" href="deleteResource?id=${resource.id}">Удалить</a>
                    <a class="btn btn-primary btn-sm" href="showEditResource?idResource=${resource.id}">Редактировать</a>
                </div>
            </div>
          </p>
        </c:forEach>
</div>
