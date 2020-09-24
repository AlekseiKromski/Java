<%-- 
    Document   : index
    Created on : Sep 10, 2020, 2:01:18 PM
    Author     : pupil
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div class="container-fluid">
    <c:if test="${not empty logout}">
        <div class="alert alert-success" role="alert">
            ${logout}
        </div>
    </c:if>
    <p>
        ${info}
    </p> 
    <div class="row justify-content-center block p-5">
        <div class="col-8 p-5 main-block shadow align-self-center">
            
            <h1>Hello to password manager service</h1>
            <hr>
            <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</p>
            
        </div>
    </div>
     <div class="row justify-content-center block">
        <div class="col-5 p-5 main-block shadow align-self-center">
            
            <h1>Hello to password manager service</h1>
            <hr>
            <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</p>
            
        </div>
         <div class="col-1"></div>
        <div class="col-2 p-5 main-block shadow align-self-center">
            
            <h1>Hello to password manager service</h1>
            <hr>
            <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</p>
            
        </div>
    </div>
</div>