const node_list = document.querySelectorAll(".nav-link");
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
    }); 
}
