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
    
<c:if test = "${create}">
    <div class="container-fluid notification">
            <div class="row justify-content-center">
                <div class="col-10">
                    <div class="alert alert-success" role="alert">
                        Your product has been created
                    </div>
                </div>
            </div>
    </div>
</c:if>
<c:if test = "${change}">
    <div class="container-fluid notification">
            <div class="row justify-content-center">
                <div class="col-10">
                    <div class="alert alert-success" role="alert">
                        Your product has been created
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
                                                    <th scope="col">Login</th>
                                                    <th scope="col">Functionality</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <c:forEach var="user" items="${users}">
                                                <tr>
                                                    <td>${user.login}</td>
                                                    <td>
                                                        <a href="delete-user?id=${user.id}"><button class="btn btn-danger">Delete</button></a>
                                                        <a href="change-user?id=${user.id}"><button class="btn btn-warning">Change</button></a>
                                                    </td>
                                                    <td></td>
                                                </tr>
                                                </c:forEach>
    
                                            </tbody>
                                        </table>
                    </div>
                </div>
            </div>