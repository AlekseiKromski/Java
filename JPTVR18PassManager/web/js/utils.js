const node_list = document.querySelectorAll(".nav-link");
const content = document.querySelector("#content-js");
let active_link = null;

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
    if(id === "showFormAddResource"){
        console.log(content);
        content.innerHTML = 
                `
                    <form action="createResource" method="POST">
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
                          <button type="submit" class="btn btn-primary w-50 mt-4">Добавить ресурс</button>
                      </div>
                      </form>
                `;
    }
}