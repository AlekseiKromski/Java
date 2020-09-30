
    <div class="container-fluid order">
        <div class="row justify-content-center">
            <div class="col-6">
                <h1>Order: <b>RACER TR 2.0</b></h1>
                <hr>
                <div class="row justify-content-center align-items-center">
                    <div class="col-3">
                        <img src="${product.img}" class="img" alt="">
                    </div>
                    <div class="col-9">
                        <h1>
                            ${product.title} <b>$${product.price}</b>
                        </h1>
                        <h2 class="mt-2">
                            ${product.category}
                        </h2>
                    </div>
                </div>

                <form action="orderProduct?id=${product.id}" method="post" class="mt-5 p-5 rounded shadow">
                    <div class="row">
                        <div class="col">
                            <label for="exampleInputfirstName1">First name: </label>
                            <input name="firstName" type="text" class="form-control" id="exampleInputfirstName1"  placeholder="Enter first name">
                        </div>
                        <div class="col">
                            <label for="exampleInputsecondName">Second name: </label>
                            <input name="secondName" type="text" class="form-control" id="exampleInputsecondName" placeholder="Enter second name">
                        </div>
                        <div class="col">
                            <label for="exampleInputsecondEmail">Email: </label>
                            <input name="email" type="email" class="form-control" id="exampleInputsecondEmail" placeholder="Enter email">
                        </div>
                    </div>
                    <div class="row my-3">
                        <div class="col">
                            <label for="phone">Phone: </label>
                            <input name="phone" type="text" class="form-control" id="phone" placeholder="Enter phone">
                        </div>
                        <div class="col">
                            <label for="address">Addres: </label>
                            <input name="address" type="text" class="form-control" id="address" placeholder="Enter address">
                        </div>
                    </div>
                    <button type="submit" class="btn btn-dark-personal">ORDER</button>
                </form>
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
    <!-- Form -->
    <div class="container-fluid form-block">
        <div class="row justify-content-center align-items-center h-100">
            <div class="col-8 p-0">
                <div class="container-fluid p-0">
                    <div class="row justify-content-center align-items-center h-100 p-0">
                        <div class="col-5 p-0">
                            <h1>Quastions ?</h1>
                            <form action="" class="form mt-2">
                                <div class="form-group">
                                    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
                                  </div>
                                  <div class="form-group">
                                    <textarea name="textarea" id="textarea" style="width: 100%;" rows="5" class="form-control" placeholder="Enter message"></textarea>
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
