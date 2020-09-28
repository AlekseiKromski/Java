<%-- 
    Document   : index
    Created on : Sep 10, 2020, 2:01:18 PM
    Author     : pupil
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div class="container-fluid">
    <c:if test="${not empty logout}">   
        <div class="row justify-content-center">
            <div class="col-8">
                <div class="alert alert-success" role="alert">
                    ${logout}
                </div>
            </div>
        </div>
    </c:if>

    <c:if test = "${not empty info}">
        <div class="row justify-content-center">
            <div class="col-8">
                <div class="alert alert-success" role="alert">
                    ${info}
                </div>
            </div>
        </div>   
    </c:if>
    <div class="row justify-content-center p-5">
        <div class="col-8">
            <div class="container-fluid">
                <div class="row justify-content-center main-block shadow p-3">
                    <div class="col-5 p-5 align-self-center">
                        <h2>Hello to password manager service</h2>
                        <c:if test = "${loginOn == false}">
                            <a href="<c:url value='/showFormCreateUser'/>" class="btn button">Register account</a>
                        </c:if>
                    </div>
                    <div class="col-3 pl-3 p-2 align-self-center" style="border-left: 2px solid black;">
                        <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's </p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<div class="container-fluid">
    <div class="row justify-content-center ">
        <div id="box1" class="col-2 shadow box-to-advant text-center p-2">
            <svg width="100%" height="80px" viewBox="0 0 16 16" class="bi bi-check2-all" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
                <path fill-rule="evenodd" d="M12.354 3.646a.5.5 0 0 1 0 .708l-7 7a.5.5 0 0 1-.708 0l-3.5-3.5a.5.5 0 1 1 .708-.708L5 10.293l6.646-6.647a.5.5 0 0 1 .708 0z"/>
                <path d="M6.25 8.043l-.896-.897a.5.5 0 1 0-.708.708l.897.896.707-.707zm1 2.414l.896.897a.5.5 0 0 0 .708 0l7-7a.5.5 0 0 0-.708-.708L8.5 10.293l-.543-.543-.707.707z"/>
             </svg>
            <h4>Lorem ipsum</h4>
            <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry.</p>
        </div>
        <div id="box2" class="col-2 shadow mx-5 box-to-advant text-center p-2">
            <svg width="100%" height="80px" viewBox="0 0 16 16" class="bi bi-cloud-arrow-down" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
                <path fill-rule="evenodd" d="M4.406 3.342A5.53 5.53 0 0 1 8 2c2.69 0 4.923 2 5.166 4.579C14.758 6.804 16 8.137 16 9.773 16 11.569 14.502 13 12.687 13H3.781C1.708 13 0 11.366 0 9.318c0-1.763 1.266-3.223 2.942-3.593.143-.863.698-1.723 1.464-2.383zm.653.757c-.757.653-1.153 1.44-1.153 2.056v.448l-.445.049C2.064 6.805 1 7.952 1 9.318 1 10.785 2.23 12 3.781 12h8.906C13.98 12 15 10.988 15 9.773c0-1.216-1.02-2.228-2.313-2.228h-.5v-.5C12.188 4.825 10.328 3 8 3a4.53 4.53 0 0 0-2.941 1.1z"/>
                <path fill-rule="evenodd" d="M7.646 10.854a.5.5 0 0 0 .708 0l2-2a.5.5 0 0 0-.708-.708L8.5 9.293V5.5a.5.5 0 0 0-1 0v3.793L6.354 8.146a.5.5 0 1 0-.708.708l2 2z"/>
            </svg>
            <h4>Lorem ipsum</h4>
            <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry.</p>
        </div>
        <div id="box3" class="col-2 shadow box-to-advant text-center p-2">
            <svg width="100%" height="80px" viewBox="0 0 16 16" class="bi bi-credit-card-2-back" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
                <path fill-rule="evenodd" d="M14 3H2a1 1 0 0 0-1 1v8a1 1 0 0 0 1 1h12a1 1 0 0 0 1-1V4a1 1 0 0 0-1-1zM2 2a2 2 0 0 0-2 2v8a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2V4a2 2 0 0 0-2-2H2z"/>
                <path d="M11 5.5a.5.5 0 0 1 .5-.5h2a.5.5 0 0 1 .5.5v1a.5.5 0 0 1-.5.5h-2a.5.5 0 0 1-.5-.5v-1zM1 9h14v2H1V9z"/>
            </svg>
            <h4>Lorem ipsum</h4>
            <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry.</p>
        </div>
    </div>        
</div>