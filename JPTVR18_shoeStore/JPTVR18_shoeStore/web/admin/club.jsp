    <!--- Import left bar ---!>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../WEB-INF/layout_admin/left-bar.jsp" %>



<div class="page-container mt-5">
                <div class="page-content">
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
                                                    <th scope="col">Email</th>
                                                    <th scope="col">Join key</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <c:forEach var="c" items="${club}">
                                                <tr>
                                                    <td>${c.email}</td>
                                                    <td>${c.join_key}</td>
                                                </tr>
                                                </c:forEach>
    
                                            </tbody>
                                        </table>
                    </div>
                </div>
            </div>