$(document).ready(function(){
    $('.single-item').slick({
        "setting-name": "setting-value",
        "arrows" : false,
        "dots": true,
        "fade": true,
        "fadeSpeed": 1000,
        "autoplay": true
    });
    $('.single-item-2').slick({
        "setting-name": "setting-value",
        "arrows" : false,
        "dots": true,
        "fade": true,
        "fadeSpeed": 1000,
        "autoplay": true
    });

    //Make arr
    let shoes_arr = [];
    for(let i = 1; i <= 8; i++){
        shoes_arr.push("#shoes-item-" + i);
    }



    shoes_arr.forEach(e => {
        $(e).on("mouseenter", () => {
            
            $(e).addClass("shadow-lg")
            $(e).css({"height" : "300px"})
            $(e + "-button").show();
            

            $(e).on("mouseleave", () => {
                $(e).removeClass("shadow-lg");
                $(e + "-button").hide();
                $(e).css({"height" : "250px"})
                
            });
        });
        
    })
})
