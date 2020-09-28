$(document).ready(() => {
    
    
    let box_list = ["#box1", "#box2", "#box3"];
    box_list.forEach(e => {
        $(e).on("mouseenter", () => {
            //Delete and add shadow
            $(e).removeClass("shadow");
            $(e).addClass("shadow-lg");

            //Resize object
            $(e).removeClass("col-2");
            $(e).addClass("col-3");
            
            //Change color on svg
            $(e + " > svg").css({color: "#00ff5ab0"});
            
            //Add event listener
            $(e).on("mouseleave", () => {
                //Return back all settings
                $(e).removeClass("shadow-lg");
                $(e).addClass("shadow");

                $(e).removeClass("col-3");
                $(e).addClass("col-2");
                
                $(e + " > svg").css({color: "black"});
            })    
        })
    })
})