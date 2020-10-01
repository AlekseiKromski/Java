<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="page-content">
                    <div class="main-wrapper">
                        <c:if test = "${login}">
                                <div class="container-fluid notification">
                                        <div class="row justify-content-center">
                                            <div class="col-10">
                                                <div class="alert alert-danger" role="alert">
                                                    Error, try again
                                                </div>
                                            </div>
                                        </div>
                                </div>
                            </c:if>
                        <div class="row justify-content-center">
                            
                            <div class="col-xl-5">
                                <div class="card">
                                    <div class="card-body">
                                        <h5 class="card-title">Login to system</h5>
                                        <form method="post" action="loginTreatment">
                                            <div class="form-group">
                                                <label for="exampleInputEmail1">Email address</label>
                                                <input name="email" type="email" class="form-control" id="exampleInputEmail1" aria-describedby="em      ailHelp" placeholder="Enter email">
                                            </div>
                                            <div class="form-group">
                                                <label for="exampleInputPassword1">Password</label>
                                                <input name="password" type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
                                            </div>
                                            <button type="submit" class="btn btn-primary">Submit</button>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>