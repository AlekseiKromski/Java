
<%@page contentType="text/html" pageEncoding="UTF-8"%>

    <form action="createResource" method="POST">
      <h3 class="w-100 text-center ">Создание нового ресурса!</h3>
    <div class="form-group w-50 mx-auto">    
        <label for="name">Название ресурса</label>
        <input value="${name}" type="text" class="form-control" id="name" name="name" aria-describedby="nameHelp" placeholder="name">
        <small id="nameHelp" class="form-text text-muted"></small>
    </div>
    <div class="form-group w-50 mx-auto">    
        <label for="url">Url ресурса</label>
        <input value="${url}" type="text" class="form-control" id="url" name="url" aria-describedby="urlHelp" placeholder="url">
        <small id="urlHelp" class="form-text text-muted"></small>
    </div>
    <div class="form-group w-50 mx-auto">    
        <label for="login">Логин</label>
        <input value="${login}" type="text" class="form-control" id="login" name="login" aria-describedby="loginHelp" placeholder="Логин">
        <small id="emailHelp" class="form-text text-muted"></small>
    </div>
    <div class="form-group w-50 mx-auto">    
        <label for="password">Пароль</label>
        <input value="${password}" type="text" class="form-control" id="password" name="password" aria-describedby="passwordHelp" placeholder="Пароль">
        <small id="emailHelp" class="form-text text-muted"></small>
    </div>
    <div class="form-group w-50 mx-auto text-center">
        <button type="submit" class="btn btn-primary w-50 mt-4">Добавить ресурс</button>
    </div>
    </form>
  