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
        }).then(data => {
            if(response != null && response != undefined){
                global_variable.obj.info_block.innerHTML = `
                <div class="alert alert-success" role="alert">
                    OK
                </div>
                `;
                sessionStorage.setItem('user', JSON.stringify(response.data.user))
            }else{
                global_variable.obj.info_block.innerHTML = `
                <div class="alert alert-danger" role="alert">
                    ${data.info}
                </div>
                `;
            }
            
        });
    }
} 

let auth = new Auth();
export default {auth};