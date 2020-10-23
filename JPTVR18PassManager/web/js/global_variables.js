const node_list = document.querySelectorAll(".nav-link");
const content = document.querySelector("#content-js");
let active_link = null;
let active_id = null;
let home_link = document.querySelector("#index");
let info_block = document.querySelector("#info");
active_link = home_link;

class global_variable{
    constructor(node_list, content, active_link, active_id, home_link, info_block) {
        this.node_list = node_list;
        this.content = content;
        this.active_id = active_id;
        this.home_link = home_link;
        this.info_block = info_block;
        this.active_link = active_link;
    }
}

let obj = new global_variable(node_list, content, active_link, active_id, home_link, info_block);
export default {obj};