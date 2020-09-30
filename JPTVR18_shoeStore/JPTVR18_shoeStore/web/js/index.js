$(document).ready(function(){
    
    let path = window.location.href;
    if(path.lastIndexOf("shoes") == -1){
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
                $(e).addClass("col-3")
                $(e).removeClass("col-2")

                $(e).on("mouseleave", () => {
                    $(e).removeClass("shadow-lg");
                    $(e).addClass("col-2")
                    $(e).removeClass("col-3")
                });
            });

        })
    }else{
        console.log('ok')
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
    }
    
    
    //Hide notification element before 5000 seconds
    setTimeout(() => {
        $(".notification").hide();
    }, 5000);
   
})
