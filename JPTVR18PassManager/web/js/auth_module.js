class Auth{
    login(login, password) {
        let request_data = {
            login, password
        }
        fetch("loginInByJson", {
            method: "POST",
            headers: {
                "Content-Type": "json/application;charset=utf-8"
            },
            body:JSON.stringify(request_data)
        }).then(response => {
            if(response.status >= 200){
                return response.json();
            }
        }).then(response => {
            console.log(response.info);
            if(response.auth && response != null && response != undefined){
                global_variable.obj.info_block.innerHTML = `
                <div class="alert alert-success" role="alert">
                    Hello, ${response.data.login}
                </div>
                `;

                sessionStorage.setItem('user', JSON.stringify(response.data));
                document.querySelector("#menu").innerHTML += `
                    <li class="nav-item">
                        <a class="nav-link" href="">Выйти <span class="sr-only">(current)</span></a>
                    </li>
                `
                document.querySelector("#loginInSys").remove();
                global_variable.obj.node_list = document.querySelectorAll(".nav-link");
                render.obj.re_render();
                
            }else{
                global_variable.obj.info_block.innerHTML = `
                <div class="alert alert-danger" role="alert">
                    ${response.info}
                </div>
                `;
            }
            
        });
    }
} 
import global_variable from './global_variables.js';
import render from './render.js';
let auth = new Auth();
export default {auth};