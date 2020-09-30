<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!-- Notification zone -->
<c:if test = "${send}">
    <div class="container-fluid notification">
            <div class="row justify-content-center">
                <div class="col-10">
                    <div class="alert alert-success" role="alert">
                        Your message has been delivered
                    </div>
                </div>
            </div>
    </div>
</c:if>
<c:if test = "${order}">
    <div class="container-fluid notification">
            <div class="row justify-content-center">
                <div class="col-10">
                    <div class="alert alert-success" role="alert">
                        Your order has been created
                    </div>
                </div>
            </div>
    </div>
</c:if>
<c:if test = "${join}">
    <div class="container-fluid notification">
            <div class="row justify-content-center">
                <div class="col-10">
                    <div class="alert alert-success" role="alert">
                        Your join code has been sent
                    </div>
                </div>
            </div>
    </div>
</c:if>
<c:if test = "${!join and join ne null}">
    <div class="container-fluid notification">
            <div class="row justify-content-center">
                <div class="col-10">
                    <div class="alert alert-danger" role="alert">
                        You have already received a coupon
                    </div>
                </div>
            </div>
    </div>
</c:if>
<!-- Slider -->
    <div class="single-item slider">
        <div class="container-fluid">
            <div class="row justify-content-center">
                <div class="col-10">
                    <div class="container-fluid p-0 m-0 slider-element">
                        <div class="row justify-content-center h-100 p-0 m-0">
                            <div class="col-6 align-self-center">
                                <h1>ADIDAS BY STELLA MCCARTNEY TRUEPACE MULTIPURPOSE SHORTS</h1>
                                <h2 class="mt-2">BREATHABLE SHORTS FOR RUNNING AND HIGH-INTENSITY WORKOUTS.</h2>
                                <p class="mt-3">
                                    Set your pins free in the high-fashion, high-performance TruePace Shorts.??The ultra-lightweight shorts feature an elasticated mesh waistband for optimal comfort and coverage and have a loose fit around the legs to minimize distractions as you put in your miles. ??The sweat-absorbent fabric and breathable mesh inserts make them the ideal choice for almost any workout?from hot yoga and HIIT to your next spin class. ??The sleek design and subtle adidas by Stella McCartney branding ensure they'll go with everything in your wardrobe. Throw on a hoodie and sneakers for an effortless errand-running look on the weekend. 
                                </p>
                            </div>
                            <div class="col-4">
                                <img src="img/model1.jpg" alt="" class="img">
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="container-fluid">
            <div class="row justify-content-center">
                <div class="col-10">
                    <div class="container-fluid p-0 m-0 slider-element">
                        <div class="row justify-content-center h-100 p-0 m-0">
                            <div class="col-4">
                                <img src="img/model2.jpg" alt="" class="img">
                            </div>
                            <div class="col-6 align-self-center">
                                <h1>HOODIE</h1>
                                <h2 class="mt-2">A COZY HOODIE WITH STANDOUT EMBROIDERY ON THE SLEEVES</h2>
                                <p class="mt-3">
                                    Set your pins free in the high-fashion, high-performance TruePace Shorts.??The ultra-lightweight shorts feature an elasticated mesh waistband for optimal comfort and coverage and have a loose fit around the legs to minimize distractions as you put in your miles. ??The sweat-absorbent fabric and breathable mesh inserts make them the ideal choice for almost any workout?from hot yoga and HIIT to your next spin class. ??The sleek design and subtle adidas by Stella McCartney branding ensure they'll go with everything in your wardrobe. Throw on a hoodie and sneakers for an effortless errand-running look on the weekend. 
                                </p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- 
            <div class="container-fluid">
            <div class="row justify-content-center">
                <div class="col-10">
                    <div class="container-fluid p-0 m-0 slider-element">
                        <div class="row justify-content-center h-100 p-0 m-0">
                            <div class="col-6 align-self-center">
                                <h1>FAVORITES SWEATSHIRT</h1>
                                <h2 class="mt-2">A LOOSE-FITTING PULLOVER WITH EXTRA ADIDAS GRAPHICS</h2>
                                <p class="mt-3">
                                    Set your pins free in the high-fashion, high-performance TruePace Shorts.??The ultra-lightweight shorts feature an elasticated mesh waistband for optimal comfort and coverage and have a loose fit around the legs to minimize distractions as you put in your miles. ??The sweat-absorbent fabric and breathable mesh inserts make them the ideal choice for almost any workout?from hot yoga and HIIT to your next spin class. ??The sleek design and subtle adidas by Stella McCartney branding ensure they'll go with everything in your wardrobe. Throw on a hoodie and sneakers for an effortless errand-running look on the weekend. 
                                </p>
                            </div>
                            <div class="col-4">
                                <img src="img/model3.jpg" alt="" class="img">
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
         -->
    </div>

    <!-- About us -->
    <div class="container-fluid about-us">
        <div class="row h-100 justify-content-center">
            <div class="col-10">
                <h1>About us</h1>
                <hr>
                <div class="container-fluid about-us p-0 mt-4">
                    <div class="row h-100 justify-content-center p-0 m-0">
                        <div class="col-6 p-0 m-0">
                            <h2>Our creative design</h2>
                            <p>
                                Lorem Ipsum is simply dummy text of the printing and typesetting industry. 
                                Lorem Ipsum has been the industry's standard dummy text ever since the
                                1500s, when an unknown printer took a galley of type and scrambled it to
                                make a type specimen book. It has survived not only five centuries, but also
                                the leap into electronic typesetting, remaining essentially unchanged. It was
                                popularised in the 1960s with the release of Letraset sheets containing Lorem
                                Ipsum passages, and more recently with desktop publishing software like Aldus
                                PageMaker including versions of Lorem Ipsum.
                            </p>
                        </div>
                        <div class="col-6 p-0 m-0">
                            <h2>About our service</h2>
                            <p>
                                Lorem Ipsum is simply dummy text of the printing and typesetting industry. 
                                Lorem Ipsum has been the industry's standard dummy text ever since the
                                1500s, when an unknown printer took a galley of type and scrambled it to
                                make a type specimen book. It has survived not only five centuries, but also
                                the leap into electronic typesetting, remaining essentially unchanged. It was
                                popularised in the 1960s with the release of Letraset sheets containing Lorem
                                Ipsum passages, and more recently with desktop publishing software like Aldus
                                PageMaker including versions of Lorem Ipsum.
                            </p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- Top shoes -->
    <div class="container-fluid top-shoes">
        <div class="row justify-content-center h-100">
            <div class="col-8 text-center">
                <h1>Top shoes</h1>
                <div class="container-fluid mt-5 p-0">
                    <c:forEach var="products" items="${topshoes}">
                        <div class="row justify-content-center mt-5">
                            <c:forEach var="product" items="${products}">
                                <div class="col-2 mx-4 p-0 shadow shoes-item mt-2" id="shoes-item-${product.id}">
                                    <img src="${product.img}" alt="" class="img">
                                    <h2 class="my-2">${product.title} <span class="currency ml-2">$${product.price}</span></h2>
                                    <p>${product.category}</p>
                                    <a href="detail?id=${product.id}"><button class="button-buy mb-2" id="shoes-item-${product.id}-button">BUY</button></a> 
                                </div>
                            </c:forEach> 
                        </div>
                    </c:forEach>
                </div>
            </div>
        </div>
    </div>

    <!-- Join -->
    <div class="container-fluid join">
        <div class="row justify-content-center align-items-center h-100">
            <div class="col-4">
                <h1>JOIN OUR CREATORS CLUB & GET 15%</h1>
            </div>
            <div class="col-1"></div>
            <div class="3">
                <a class="join-link py-3 px-5" href="join">SIGN UP FOR FREE</a>
            </div>
        </div>
    </div>

    <!-- Top shoes - 2 -->
    <div class="container-fluid top-shoes-2">
        <div class="row justify-content-center align-items-center h-100">
            <div class="col-8 p-0">
                <div class="container-fluid p-0">
                    <c:forEach var="product" items="${topshoes2}">
                        <c:if test = "${product.align == 'left'}">
                            <div class="row justify-content-center align-items-center h-100 shadow p-0 shoes-item-2">
                                <div class="col-3 p-0">
                                    <img src="${product.img}" class="img img-round" alt="">
                                </div>
                                <div class="col-1"></div>
                                <div class="col-7 p-0">
                                    <h1>${product.title} <span class="currency-2">$${product.price}</span></h1>
                                    <h2 class="mt-2">${product.category}</h2>
                                    <p class="mt-2">
                                        ${product.text}
                                    </p>
                                    <a href="detail?id=${product.id}"><button class="button-buy mb-2" id="shoes-item-${product.id}-button">BUY</button></a> 
                                </div>
                                <div class="col-1"></div>
                            </div>
                        </c:if>
                        <c:if test = "${product.align == 'right'}">
                            <div class="row justify-content-center align-items-center h-100 shadow p-0 shoes-item-2">
                                <div class="col-1"></div>
                                <div class="col-7 p-0">
                                    <h1>${product.title} <span class="currency-2">$${product.price}</span></h1>
                                    <h2 class="mt-2">${product.category}</h2>
                                    <p class="mt-2">
                                        ${product.text}
                                    </p>
                                    <a href="detail?id=${product.id}"><button class="button-buy mb-2" id="shoes-item-${product.id}-button">BUY</button></a> 
                                </div>
                                <div class="col-1"></div>
                                <div class="col-3 p-0">
                                    <img src="${product.img}" class="img img-round-2" alt="">
                                </div>
                            </div>
                        </c:if>
                      
                    </c:forEach>
                </div>
            </div>
        </div>
    </div>

    <!-- Review -->
    <div class="single-item-2">
        <div class="container-fluid review-1 review-block">
            <div class="row justify-content-center align-items-center h-100">
                <div class="col-8">
                    <h1>Mike Wasovsky</h1>
                    <h2>Creative derector</h2>
                    <p>As a business it is crucial to target the curiosity of customers, this is why everything we do is meticulously thought out and expertly crafted. Our amazing team of developers work closely and embrace new coding languages.</p>
                </div>
            </div>
        </div>
        <div class="container-fluid review-2 review-block">
            <div class="row justify-content-center align-items-center h-100">
                <div class="col-8">
                    <h1>Mike Wasovsky2</h1>
                    <h2>Creative derector</h2>
                    <p>As a business it is crucial to target the curiosity of customers, this is why everything we do is meticulously thought out and expertly crafted. Our amazing team of developers work closely and embrace new coding languages.</p>
                </div>
            </div>
        </div>
        <div class="container-fluid review-3 review-block">
            <div class="row justify-content-center align-items-center h-100">
                <div class="col-8">
                    <h1>Mike Wasovsky3</h1>
                    <h2>Creative derector</h2>
                    <p>As a business it is crucial to target the curiosity of customers, this is why everything we do is meticulously thought out and expertly crafted. Our amazing team of developers work closely and embrace new coding languages.</p>
                </div>
            </div>
        </div>
    </div>
    
    <!-- Form -->
    <%@ include file="WEB-INF/form/form.jsp" %>