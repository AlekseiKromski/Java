<%-- 
    Document   : showListResources
    Created on : Sep 17, 2020, 1:53:20 PM
    Author     : Melnikov
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<form action="showResource" method="POST" id="formShowResource">   
    
        <h3 class="w-100 text-center">Список пользователей:</h3>
            <div class="form-group w-50 mx-auto">
              <c:forEach var="entry" items="${usersMap}" varStatus="status">
                    <p>${status.index + 1}. ${entry.key.login} роль: ${entry.value} 
                      <a href="editUserRoles?userId=${entry.key.id}">Редактировать</a>
                    </p>
                </c:forEach>
            </div>

</form>
        