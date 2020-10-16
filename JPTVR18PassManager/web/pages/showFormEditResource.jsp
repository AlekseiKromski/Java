<%@page contentType="text/html" pageEncoding="UTF-8"%>
    <h3 class="w-100 text-center">Изменение ресурса!</h3>
    <form action="updateResource" method="POST">
        <div class="form-group w-50 mx-auto">    
            <label for="name">Название ресурса</label>
            <input type="hidden" name="idResource" value="${resource.id}">
            <input value="${resource.name}"  type="text" class="form-control" id="name" name="name" aria-describedby="nameHelp" placeholder="name">
            <small id="nameHelp" class="form-text text-muted"></small>
        </div>
        <div class="form-group w-50 mx-auto">    
            <label for="url">Url ресурса</label>
            <input value="${resource.url}"  type="text" class="form-control" id="url" name="url" aria-describedby="urlHelp" placeholder="resurce">
            <small id="urlHelp" class="form-text text-muted"></small>
        </div>
        <div class="form-group w-50 mx-auto">    
            <label for="login">Логин</label>
            <input value="${resource.login}"  type="text" class="form-control" id="login" name="login" aria-describedby="loginHelp" placeholder="Логин">
            <small id="emailHelp" class="form-text text-muted"></small>
        </div>
        <div class="form-group w-50 mx-auto">    
            <label for="password">Пароль</label>
            <input value="${resource.password}"  type="text" class="form-control" id="password" name="password" aria-describedby="passwordHelp" placeholder="Пароль">
            <small id="emailHelp" class="form-text text-muted"></small>
        </div>
        <div class="form-group w-50 mx-auto text-center">
            <button type="submit" class="btn btn-primary w-50 mt-4">Изменить</button>
        </div>                  
    </form>
 