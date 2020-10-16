
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<form action="updateUserRoles" method="POST">
    <h3 class="w-100 text-center ">Изменить данные пользователя</h3>
    <div class="form-group w-50 mx-auto">    
        <label for="newLogin">Логин</label>
        <input value="${editUser.id}" type="hidden" name="userId">
        <input value="${editUser.login}" type="text" class="form-control" id="newLogin" name="newLogin" aria-describedby="newLoginHelp" placeholder="Логин">
        <small id="newLoginHelp" class="form-text text-muted"></small>
    </div>
    <div class="form-group w-50 mx-auto">    
        <label for="newPassword">Пароль</label>
        <input value="" type="text" class="form-control" id="password" name="newPassword" aria-describedby="newPasswordHelp" placeholder="Пароль">
        <small id="newPasswordHelp" class="form-text text-muted"></small>
    </div>
    <div class="form-group w-50 mx-auto">    
        <label for="currentRole">Текущая роль</label>
        <input value="${topRoleEditUser}" type="text" class="form-control" id="currentRole" name="currentRole" aria-describedby="currentRoleHelp" placeholder="Текущая роль">
        <small id="currentRoleHelp" class="form-text text-muted"></small>
    </div>
    <div class="form-group w-50 mx-auto">    
        <label for="newRole">Назначенная роль</label>
        <select class="custom-select" name="newRole" id="newRole">
          <c:forEach var="role" items="${listRoles}">
              <c:if test="${role.name eq topRoleEditUser}">
                  <option value="${role.id}" selected="">${role.name}</option>
              </c:if>
              <c:if test="${role.name ne topRoleEditUser}">
                  <option value="${role.id}">${role.name}</option>
              </c:if>
          </c:forEach>
        </select> 
    </div>
    <div class="form-group w-50 mx-auto text-center">
        <button type="submit" class="btn btn-primary w-50 mt-4">Изменить</button>
    </div>