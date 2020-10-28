
class Render{
    re_render(){
        for(let i = 0; i < global_variable.obj.node_list.length; i++){
            global_variable.obj.node_list[i].addEventListener("click", (e) => {
                e.preventDefault();
                
                //Delete old active
                global_variable.obj.active_link.classList.remove("active");
                
                //Set new class to element
                global_variable.obj.node_list[i].parentNode.classList.add("active");
                
                //Save new element with active class
                global_variable.obj.active_link = global_variable.obj.node_list[i].parentNode;
        
                this.changeContent(global_variable.obj.node_list[i].id);
            }); 
        }
    }
    changeContent(id){
        if(id !== global_variable.obj.active_id){
            if(id === "showFormAddResource"){
                global_variable.obj.active_id = id;
                global_variable.obj.content.innerHTML = `
                            <form action="createResource" id="createResource" method="POST">
                                <h3 class="w-100 text-center ">Создание нового ресурса!</h3>
                                <div class="form-group w-50 mx-auto">    
                                    <label for="name">Название ресурса</label>
                                    <input value="" type="text" class="form-control" id="name" name="name" aria-describedby="nameHelp" placeholder="name">
                                    <small id="nameHelp" class="form-text text-muted"></small>
                                </div>
                                <div class="form-group w-50 mx-auto">    
                                    <label for="url">Url ресурса</label>
                                    <input value="" type="text" class="form-control" id="url" name="url" aria-describedby="urlHelp" placeholder="url">
                                    <small id="urlHelp" class="form-text text-muted"></small>
                                </div>
                                <div class="form-group w-50 mx-auto">    
                                    <label for="login">Логин</label>
                                    <input value="" type="text" class="form-control" id="login" name="login" aria-describedby="loginHelp" placeholder="Логин">
                                    <small id="emailHelp" class="form-text text-muted"></small>
                                </div>
                                <div class="form-group w-50 mx-auto">    
                                    <label for="password">Пароль</label>
                                    <input value="" type="text" class="form-control" id="password" name="password" aria-describedby="passwordHelp" placeholder="Пароль">
                                    <small id="emailHelp" class="form-text text-muted"></small>
                                </div>
                                <div class="form-group w-50 mx-auto text-center">
                                    <button type="submit" class="btn btn-primary w-50 mt-4" id="addResource">Добавить ресурс</button>
                                </div>
                            </form>
                        `;
                
                //Custom events
                document.querySelector('#addResource').addEventListener('click', e => {
                    e.preventDefault();
                    let name = document.querySelector('#name').value;
                    let url = document.querySelector('#url').value;
                    let login = document.querySelector('#login').value;
                    let password = document.querySelector('#password').value;
                    let request_data = { 
                        name: name,
                        url: url,
                        login: login,
                        password: password
                    }
                    fetch("createResourceByJson", {
                        method: "POST",
                        headers: {
                            "Content-Type": "json/application;charset=utf-8"
                        },
                        body:JSON.stringify(request_data)
                    }).then(response => {
                        if(response.status >= 200){
                            return response.json();
                        }
                    }).then(data => {
                        global_variable.obj.info_block.innerHTML = `
                        <div class="alert alert-success" role="alert">
                            ${data.info}
                        </div>
                        `;
                    });
                })
    
                
            }else if(id === "index"){
                global_variable.obj.active_id = id;
                global_variable.obj.content.innerHTML = `
                    <div class="jumbotron bg-white">
                        <h3 class="w-100 text-center ">Добро пожаловать в наш менеджер паролей!</h3>
                        <p class="lead">Проект предлагает удобное хранение логина и пароля к конкретному ресурсу в сети Интернет.</p>
                        <p class="lead">Не используйте одинаковые аккаунты для разных ресурсов, это небезопасно, потому что злоумышленник, получив доступ к одному из ресурсов
                        сможет воспользоваться и другими. </p> 
                        <p class="lead">Реализуйте принцип: для каждого ресурса - свой уникальный аккаунт!</p>
                        <p class="lead">Мы гарантируем удобное надежное хранение и доступность выших данных!</p>
                    </div>
                `;
            }else if(id === "showListResources"){
                global_variable.obj.active_id = id;
                global_variable.obj.content.innerHTML = `
                <h3 class="w-100 text-center ">Список ресурсов:</h3>
                <div class="form-group w-50 mx-auto">
                        <c:forEach var="resource" items="listResources">
                         <p>  
                            <div class="form-group row w-100 mx-auto my-0">
                                <label for="name" class="col-sm-5 col-form-label">Название ресурса</label>
                                <div class="col-sm-7">
                                    <input  value="resource.id" type="hidden" name="idResource">
                                    <input  value="resource.name" class="form-control-plaintext" readonly="" type="text" id="name" name="name" aria-describedby="nameResource" placeholder="Введите имя ресурса" >
                                    <small id="nameResource" class="form-text text-muted"></small>
                                </div>    
                            </div>
                            <div class="form-group row w-100 mx-auto my-0">   
                                <label for="url" class="col-sm-5 col-form-label">URL ресурса</label>
                                <div class="col-sm-7">
                                    <input value="resource.url" class="form-control-plaintext" readonly="" type="text" id="url" name="url" aria-describedby="urlHelp" placeholder="Введите url ресурса">
                                    <small id="urlHelp" class="form-text text-muted"></small>
                                </div>
                            </div>
                            <div class="form-group row w-100 mx-auto my-0">  
                                <label for="login" class="col-sm-5 col-form-label">Логин</label>
                                <div class="col-sm-7">
                                    <input value="resource.login" class="form-control-plaintext" readonly="" type="text" id="login" name="login" aria-describedby="loginHelp" placeholder="Логин">
                                    <small id="loginHelp" class="form-text text-muted"></small>
                                </div>
                            </div>
                            <div class="form-group row w-100 mx-auto my-0">    
                                <label for="password" class="col-sm-5 col-form-label">Пароль</label>
                                <div class="col-sm-7">
                                    <input value="resource.password" class="form-control-plaintext" readonly="" type="text" id="password" name="password" aria-describedby="passwordHelp" placeholder="Пароль">
                                    <small id="passwordHelp" class="form-text text-muted"></small>
                                </div>
                            </div>
                            <div class="form-group w-100 mx-auto">
                                <div class="col-sm-7">
                                    <a class="btn btn-primary btn-sm mr-1" href="deleteResource?id=resource.id">Удалить</a>
                                    <a class="btn btn-primary btn-sm" href="showEditResource?idResource=resource.id">Редактировать</a>
                                </div>
                            </div>
                          </p>
                        </c:forEach>
                </div>
                `;
            }else if(id === "loginForm"){
                global_variable.obj.active_id = id;
                global_variable.obj.content.innerHTML = `
                    <form action="login" method="POST" id="loginIn">
                        <h4 class="w-100 text-center ">Введите логин и пароль</h4>
                        <div class="form-group w-50 mx-auto">    
                            <label for="login">Логин</label>
                            <input type="text" class="form-control" id="login" name="login" aria-describedby="loginHelp" placeholder="Логин">
                            <small id="emailHelp" class="form-text text-muted"></small>
                        </div>
                        <div class="form-group w-50 mx-auto">    
                            <label for="password">Пароль</label>
                            <input type="password" class="form-control" id="password" name="password" aria-describedby="passwordHelp" placeholder="Пароль">
                            <small id="emailHelp" class="form-text text-muted"></small>
                        </div>
                        <div class="form-group w-50 mx-auto">    
                            <button type="submit" class="btn btn-primary w-50 mt-4" >Войти</button>
                        </div>
                    </form>
                    
                    <div class="form-group w-50 mx-auto text-center">
                        <small id="emailHelp" class="form-text text-muted">
                        Нет логина? <a href="showFormAddUser">Зарегистрируйтесь</a>
                        </small>
                    </div>
                    `;
                    

                document.querySelector("#loginIn").addEventListener('submit', (e) => {
                    e.preventDefault();
                    auth.auth.login(document.querySelector('#login').value,document.querySelector('#password').value);
                });
                document.querySelector("#loginIn button").addEventListener('keydown', (e) => {
                    e.preventDefault();
                    if (e.isComposing || e.keyCode === 13) {
                        auth.auth.login(document.querySelector('#login').value,document.querySelector('#password').value);
                    }
                });
            }else if(id === "showFormAddUser"){
                global_variable.obj.active_id = id;
                global_variable.obj.content.innerHTML = `
                <form action="createUser" method="POST">
                    <h4 class="w-100 text-center ">Заполните форму</h4>
                    <div class="form-group w-50 mx-auto">    
                        <label for="login">Логин</label>
                        <input type="text" class="form-control" id="login" name="login" aria-describedby="loginHelp" placeholder="Логин">
                        <small id="emailHelp" class="form-text text-muted"></small>
                    </div>
                    <div class="form-group w-50 mx-auto">    
                        <label for="password">Пароль</label>
                        <input type="password" class="form-control" id="password" name="password" aria-describedby="passwordHelp" placeholder="Пароль">
                        <small id="emailHelp" class="form-text text-muted"></small>
                    </div>
                    <div class="form-group w-50 mx-auto text-center">
                        <button type="submit" id="addUser" class="btn btn-primary w-50 mt-4">Зарегистрировать</button>
                    </div>
                </form>`;

                //Custom events
                document.querySelector('#addUser').addEventListener('click', e => {
                    e.preventDefault();
                
                    let login = document.querySelector('#login').value;
                    let password = document.querySelector('#password').value;
                    let request_data = { 
                        login: login,
                        password: password,
                    }
                    fetch("createUserByJson", {
                        method: "POST",
                        headers: {
                            "Content-Type": "json/application;charset=utf-8"
                        },
                        body:JSON.stringify(request_data)
                    }).then(response => {
                        if(response.status >= 200){
                            return response.json();
                        }
                    }).then(data => {
                        global_variable.obj.info_block.innerHTML = `
                        <div class="alert alert-success" role="alert">
                            ${data.info}
                        </div>
                        `;
                    });
                })
            }
        }
    }
    
}
import global_variable from './global_variables.js';
import auth from './auth_module.js';
let obj = new Render();
export default  {obj};