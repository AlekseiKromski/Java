<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<c:if test = "${not empty info}  ">
    <div class="container-fluid">
            <div class="row justify-content-center">
                <div class="col-10">
                    <div class="alert alert-success" role="alert">
                        A simple success alert—check it out!
                    </div>
                </div>
            </div>
    </div>
</c:if>
<c:if test = "${send  == 'error'}">
    <div class="container-fluid">
            <div class="row justify-content-center">
                <div class="col-10">
                    <div class="alert alert-danger" role="alert">
                        A simple success alert—check it out!
                    </div>
                </div>
            </div>
    </div>
</c:if>