$(document).ready(function(){
    //Make arr
    let shoes_arr = [];
    for(let i = 1; i <= 12; i++){
        shoes_arr.push("#shoes-item-" + i);
    }
    
    shoes_arr.forEach(e => {
        $(e).on("mouseenter", () => {
            $(e).addClass("shadow-lg")
            $(e).addClass("col-3")
            $(e).removeClass("col-2")

            $(e).on("mouseleave", () => {
                $(e).removeClass("shadow-lg");
                $(e).addClass("col-2")
                $(e).removeClass("col-3")
            });
        });
        
    })
})