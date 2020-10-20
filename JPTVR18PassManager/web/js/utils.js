fetch('')

const node_list = document.querySelectorAll(".nav-link");
const content = document.querySelector("#content-js");
let active_link = null;
let active_id = null;
let home_link = document.querySelector("#index");
active_link = home_link;

//Add listener to home link 
home_link.addEventListener("click", e => {
    e.preventDefault();
    changeContent(home_link.id);

})

//Search element with active class
for(let i = 0; i < node_list.length; i++){
    if(node_list[i].parentNode.classList.contains("active")){
        active_link = node_list[i].parentNode;
    }
}

for(let i = 0; i < node_list.length; i++){
    node_list[i].addEventListener("click", (e) => {
        e.preventDefault();
        
        //Delete old active
        active_link.classList.remove("active");
        
        //Set new class to element
        node_list[i].parentNode.classList.add("active");
        
        //Save new element with active class
        active_link = node_list[i].parentNode;
        
        changeContent(node_list[i].id);
    }); 
}


function changeContent(id){
    if(id !== active_id){
        if(id === "showFormAddResource"){
            active_id = id;
            content.innerHTML = `
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
                console.log(request_data.name);
                fetch("createResourceByJson", {
                    method: "POST",
                    headers: {
                        "Content-Type": "json/application;charset=utf-8"
                    },
                    body:JSON.stringify(request_data)
                }).then(response => {
                    if(response.status >= 200){
                        console.log(response.json());
                    }
                })
            })

            
        }else if(id === "index"){
            active_id = id;
            content.innerHTML = `
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
            active_id = id;
            content.innerHTML = `
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
            active_id = id;
            content.innerHTML = `
                <form action="login" method="POST">
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
                    <div class="form-group w-50 mx-auto text-center">
                        <button type="submit" class="btn btn-primary w-50 mt-4">Войти</button>
                            <small id="emailHelp" class="form-text text-muted">
                            Нет логина? <a href="showFormAddUser">Зарегистрируйтесь</a>
                            </small>
                    </div>
                </form>`;
        }
    }
}
