<%-- 
    Document   : showListResources
    Created on : Sep 17, 2020, 1:53:20 PM
    Author     : Melnikov
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<form action="updateResource" method="POST">
    <h3 class="w-100 text-center ">Ресурс: ${resource.name}</h3>
    <div class="form-group w-50 mx-auto">
        <label for="name">Название ресурса</label>
        <input  value="${resource.id}" type="hidden" name="idResource">
        <input  value="${resource.name}" disabled type="text" class="form-control" id="name" name="name" aria-describedby="nameResource" placeholder="Введите имя ресурса" >
        <small id="nameResource" class="form-text text-muted"></small>
    </div>
    <div class="form-group w-50 mx-auto">    
        <label for="url">URL ресурса</label>
        <input value="${resource.url}" disabled type="text" class="form-control" id="url" name="url" aria-describedby="urlHelp" placeholder="Введите url ресурса">
        <small id="urlHelp" class="form-text text-muted"></small>
    </div>
    <div class="form-group w-50 mx-auto">    
        <label for="login">Логин</label>
        <input value="${resource.login}" disabled type="text" class="form-control" id="login" name="login" aria-describedby="loginHelp" placeholder="Логин">
        <small id="emailHelp" class="form-text text-muted"></small>
    </div>
    <div class="form-group w-50 mx-auto">    
        <label for="password">Пароль</label>
        <input value="${resource.password}" disabled type="password" class="form-control" id="password" name="password" aria-describedby="passwordHelp" placeholder="Пароль">
        <small id="emailHelp" class="form-text text-muted"></small>
    </div>
    <div class="form-group w-50 mx-auto">    
      <a class="btn btn-primary" href="deleteResource?idResource=${resource.id}">Удалить</a>
        <button type="submit" class="btn btn-primary">Изменить</button>
    </div>
</form>
  
