<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <div class="container-fluid">
            <div class="row justify-content-center">
                <div class="col-3 main-block shadow p-5">
                    <form method="post" action="edit-user-role">
                        <h3>
                            User: ${edit_user.getLogin()} <br/>
                            <small>Role: ${topRoleEditUser}</small>
                        </h3>
                        <hr>
                        <input name="id_user" type="hidden" value="${edit_user.getId()}">
                        <div class="form-group">
                          <label for="exampleInputlogin 1">Change User Name: </label>
                          <input type="text" name="login" class="form-control" id="exampleInputLogin1" aria-describedby="loginHelp" placeholder="Enter login" value="${edit_user.getLogin()}">
                        </div>
                        <div class="form-group">
                          <label for="exampleInputPassword1">Change Password: </label>
                          <input type="password" class="form-control" id="exampleInputPassword1"  name="password" placeholder="password" value="">
                        </div>
                        <div class="form-group">
                            <label for="role">Change role:</label>
                            <select name="role" class="form-control">
                                <c:forEach var="role" items="${listRoles}">
                                    <c:if test="${role.getName() eq topRoleEditUser}">
                                        <option selected="" value="${role.getId()}">
                                            ${role.getName()}
                                        </option>
                                    </c:if>
                                    <c:if test="${role.getName() ne topRoleEditUser}">
                                        <option value="${role.getId()}">
                                            ${role.getName()}
                                        </option>
                                    </c:if>
                                </c:forEach>
                            </select>
                        </div>
                        <button type="submit" class="btn btn-warning">Change user</button>
                        
                    </form>
                </div>
            </div>
        </div>