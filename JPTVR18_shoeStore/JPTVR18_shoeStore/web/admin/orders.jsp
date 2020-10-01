    <!--- Import left bar ---!>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../WEB-INF/layout_admin/left-bar.jsp" %>



<div class="page-container mt-5">
                <div class="page-content">
    <c:if test = "${delete}">
    <div class="container-fluid notification">
            <div class="row justify-content-center">
                <div class="col-10">
                    <div class="alert alert-success" role="alert">
                        Your product has been deleted
                    </div>
                </div>
            </div>
    </div>
</c:if>
                    <div class="page-info">
                        <nav aria-label="breadcrumb">
                            <ol class="breadcrumb">
                                <li class="breadcrumb-item"><a href="home">Slick Store</a></li>
                                <li class="breadcrumb-item active" aria-current="page">List of products</li>
                            </ol>
                        </nav>
                        <div class="page-options">
                            <a href="logout" class="btn btn-primary">Logout</a>
                        </div>
                    </div>
                    <div class="main-wrapper">
                        <table class="table">
                                            <thead class="thead-dark">
                                                <tr>
                                                    <th scope="col">Product</th>
                                                    <th scope="col">Address</th>
                                                    <th scope="col">Email</th>
                                                    <th scope="col">Phone</th>
                                                    <th scope="col">User name</th>
                                                    <th scope="col">Functionality</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <c:forEach var="order" items="${orders}">
                                                <tr>
                                                    <td><a href="${pageContext.request.contextPath}/detail?id=${order.product.id}">${order.product.title}</a></td>
                                                    <td>${order.address}</td>
                                                    <td>${order.email}</td>
                                                    <td>$${order.phone}</td>
                                                    <td>${order.user_name}</td>
                                                    <td><a href="deleteOrder?id=${order.id}"><button class="btn btn-danger">Delete</button></a></td>
                                                </tr>
                                                </c:forEach>
    
                                            </tbody>
                                        </table>
                    </div>
                </div>
            </div>