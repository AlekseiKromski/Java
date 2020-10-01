<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../WEB-INF/layout_admin/left-bar.jsp" %>
<div class="page-content">
                    <div class="main-wrapper">
                        <div class="row justify-content-center">
                            <div class="col-xl-5">
                                <div class="card">
                                    <div class="card-body">
                                        <h5 class="card-title">Create product</h5>
                                        <form method="post" action="change-user-treatment?id=${user.id}">
                                            <div class="form-group">
                                                <label for="login">Login:</label>
                                                <input name="login" type="text" class="form-control" id="login"  value="${user.login}">
                                            </div>
                                            <div class="form-group">
                                                <label for="password">Password:</label>
                                                <input name="password" type="password" class="form-control" id="password"  value="${user.password}">
                                            </div>
                                            <button type="submit" class="btn btn-primary">Create</button>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>