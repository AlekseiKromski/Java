let menu_list = [
    {
        id: 'showFormAddResource',
        text: 'Добавить новый ресурс',
        show: false,
    },
    {
        id: 'showFormAddUser',
        text: 'Добавить нового пользователя',
        show: false,
    },
    {
        id: 'showListResources',
        text: 'Список ресурсов',
        show: false,
    },
    {
        id: 'loginForm',
        text: 'Вход в систему',
        show: true,
    },
    {
        id: 'logOut',
        text: 'Выход из системы',
        show: false,
    },
];


class menu{
    constructor(menu_list){
        this.menu_list = menu_list;
    }
    changeMenuIfLogin(role){
        if(role == "ADMIN"){
            console.log(menu_list);
            this.menu_list[0].show = true;
            this.menu_list[1].show = true;
            this.menu_list[2].show = true;
            this.menu_list[3].show = false;
            this.menu_list[4].show = true;
        }
        document.querySelector("#menu").innerHTML = '';
        this.menu_list.forEach(e => {
            if(e.show){
                document.querySelector("#menu").innerHTML += `
                <li class="nav-item">
                    <a class="nav-link" href="" id="${e.id}">${e.text}</a>
                </li> 
                `
            }
        })
        global_variable.obj.node_list = document.querySelectorAll(".nav-link")
        render.obj.re_render();
        console.log(global_variable.obj.node_list);
    }
}
import render from './render.js';
import global_variable from './global_variables.js';
let obj = new menu(menu_list);
export default {obj};