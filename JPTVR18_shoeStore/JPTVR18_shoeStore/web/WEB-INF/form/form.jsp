<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- Form -->
    <div class="container-fluid form-block">
        <div class="row justify-content-center align-items-center h-100">
            <div class="col-8 p-0">
                <div class="container-fluid p-0">
                    <div class="row justify-content-center align-items-center h-100 p-0">
                        <div class="col-5 p-0">
                            <h1>Quastions ?</h1>
                            <form action="sendMessage" method="post" class="form mt-2">
                                <div class="form-group">
                                    <input type="email" name="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
                                  </div>
                                  <div class="form-group">
                                    <textarea name="message" id="textarea" style="width: 100%;" rows="5" class="form-control" placeholder="Enter message"></textarea>
                                  </div>
                                  <button type="submit" class="btn btn-dark-personal">SEND</button>
                            </form>
                        </div>
                        <div class="col-1"></div>
                        <div class="col-5 p-0 reclam">
                            <div class="row h-100 align-items-center justify-content-center">
                                <div class="col-8 p-5">
                                    <h1>
                                        SALE - 15%
                                        JOIN OUR CREATORS CLUB
                                    </h1>
                                    <button>JOIN</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>