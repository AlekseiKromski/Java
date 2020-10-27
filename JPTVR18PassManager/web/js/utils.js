import global_variable from './global_variables.js';
import render from './render.js';

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

render.obj.re_render();



