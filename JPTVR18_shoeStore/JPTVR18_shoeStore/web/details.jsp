
    <!-- Detail block -->
    <div class="container-fluid detail">
        <div class="row justify-content-center">
            <div class="col-10">
                <div class="row justify-content-center align-items-center">
                    <div class="col-4">
                        <img src="${product.img}" class="img" alt="">
                    </div>
                    <div class="col-6">
                        <h1>
                            ${product.title} <b>$${product.price}</b>
                        </h1>
                        <h2 class="mt-2">
                            ${product.category}
                        </h2>
                        <p>
                            ${product.text}
                        </p>
                        <a href="order?id=${product.id}"><button class="button-buy">buy</button></a>
                    </div>
                </div>
            </div>
        </div>
    </div>


    <!-- Form -->
    <%@ include file="WEB-INF/form/form.jsp" %>