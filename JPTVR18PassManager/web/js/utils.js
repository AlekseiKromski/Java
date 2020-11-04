import global_variable from './global_variables.js';
import render from './render.js';
import menu_module from './menu_module.js';

//Add listener to home link 
global_variable.obj.home_link.addEventListener("click", e => {
    e.preventDefault();
    render.obj.changeContent(global_variable.obj.home_link.id);

})

//Search element with active class
for(let i = 0; i < global_variable.obj.node_list.length; i++){
    if(global_variable.obj.node_list[i].parentNode.classList.contains("active")){
        global_variable.obj.active_link = global_variable.obj.node_list[i].parentNode;
    }
}

//ChekIfLogin [need move to auth_module]
if(sessionStorage.getItem('user')){
    const user = JSON.parse(sessionStorage.getItem('user'));
    menu_module.obj.changeMenuIfLogin(user.role);
}else{
    menu_module.obj.changeMenuIfLogin("NONE");
}
render.obj.re_render();



