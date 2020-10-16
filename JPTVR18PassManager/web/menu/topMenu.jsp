<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
  <a class="navbar-brand" href="index">Менеджер паролей</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarColor01" aria-controls="navbarColor01" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarColor01">
    <ul class="navbar-nav mr-auto">
    <c:if test="${topRoleCurrnetUser ne null}">
      <li class="nav-item active">
        <a class="nav-link" href="logout">Выйти <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="showFormAddResource">Добавить новый ресурс</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="listResources">Список ресурсов</a>
      </li>
        <li class="nav-item">
          <c:if test="${topRoleCurrnetUser eq 'ADMIN'}">
            <a class="nav-link" href="showListUsers">Список пользователей</a>
          </c:if>
      </li>
    </c:if>
    <c:if test="${topRoleCurrnetUser eq null}"> 
      <li class="nav-item">
        <a class="nav-link" href="showFormLogin">Войти в систему</a>
      </li>
    </c:if>
      <li class="nav-item dropdown">
        <div class="dropdown-menu">
          <c:if test="${topRoleCurrnetUser ne null}">
            <a class="dropdown-item" href="logout">Выйти </a>
            <a class="dropdown-item" href="showFoormAddResurce">Добавить новый ресурс</a>
            <a class="dropdown-item" href="listResources">Список ресурсов</a>
            <c:if test="${topRoleCurrnetUser eq 'ADMIN'}">
                <a class="dropdown-item" href="showListUsers">Список пользователей</a>
            </c:if>
          </c:if>
        <c:if test="${topRoleCurrnetUser eq null}"> 
            <a class="dropdown-item" href="showFormLogin">Войти</a>
        </c:if>
        </div>
      </li>
    </ul>
    <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="text" placeholder="Search">
      <button class="btn btn-secondary my-2 my-sm-0" type="submit">Search</button>
    </form>
  </div>
</nav>
<div class="jumbotron bg-white">

