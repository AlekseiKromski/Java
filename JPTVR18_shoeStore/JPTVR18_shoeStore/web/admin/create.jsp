<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../WEB-INF/layout_admin/left-bar.jsp" %>
<div class="page-content">
                    <div class="main-wrapper">
                        <div class="row justify-content-center">
                            <div class="col-xl-5">
                                <div class="card">
                                    <div class="card-body">
                                        <h5 class="card-title">Create product</h5>
                                        <form method="post" action="createTreatment">
                                            <div class="form-group">
                                                <label for="title">Title:</label>
                                                <input name="title" type="text" class="form-control" id="title"  placeholder="title">
                                            </div>
                                            <div class="form-group">
                                                <label for="title">Text:</label>
                                                <textarea name="text" class="form-control"></textarea>
                                            </div>
                                            <div class="form-group">
                                                <label for="category">Category:</label>
                                                <input name="category" type="text" class="form-control" id="category"  placeholder="category">
                                            </div>
                                            <div class="form-group">
                                                <label for="price">Price:</label>
                                                <input name="price" type="text" class="form-control" id="price"  placeholder="price">
                                            </div>
                                            <div class="form-group">
                                                <label for="img">Img_path:</label>
                                                <input name="img" type="text" class="form-control" id="img"  placeholder="img">
                                            </div>
                                            <div class="form-group">
                                                <label for="align">Align:</label>
                                                <select class="form-control" name="align">
                                                    <option value="left">left</option>
                                                    <option value="right">right</option>
                                                </select>
                                            </div>
                                            <button type="submit" class="btn btn-primary">Create</button>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>