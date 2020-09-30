<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>  
    <!-- Top shoes -->
    <div class="container-fluid top-shoes">
        <div class="row justify-content-center h-100">
            <div class="col-8 text-center">
                <h1>All shoes</h1>
                <div class="container-fluid mt-5 p-0">
                    <div class="row mt-5 justify-content-center">
                        <c:forEach var="product" items="${products}">
                            <div class="col-2 mx-4 p-0 shadow shoes-item mt-5" id="shoes-item-${product.id}">
                                <img src="${product.img}" alt="" class="img">
                                <h2 class="my-2">${product.title} <span class="currency ml-2">$${product.price}</span></h2>
                                <p>${product.category}</p>
                                <a href="detail?id=${product.id}"><button class="button-buy mb-2" id="shoes-item-${product.id}-button">BUY</button></a> 
                            </div>
                        </c:forEach>
                </div>
            </div>
        </div>
    </div>

   <%@ include file="WEB-INF/form/form.jsp" %>