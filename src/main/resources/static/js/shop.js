//<!DOCTYPE html>
//<html lang="en">
//
//<head>
//  <title>easyShop</title>
//  <meta charset="utf-8">
//  <meta name="viewport" content="width=device-width, initial-scale=1">
//  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
//  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
//  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
//  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
//
//  <style>
//    .close {
//      position: absolute;
//      right: 0;
//      top: 0;
//
//    }
//
//    .close:hover {
//      background-color: #b8c4cf;
//      color: white;
//    }
//
//    /* Style the header */
//    .header {
//      background-color: #b8c4cf;
//      padding: 30px 40px;
//      color: white;
//      text-align: left;
//    }
//
//    /* Clear floats after the header */
//    .header:after {
//      content: "";
//      display: table;
//      clear: both;
//    }
//
//    /* Style the input */
//    input {
//      margin: 0;
//      border: none;
//      border-radius: 0;
//      width: 75%;
//      padding: 10px;
//      float: center;
//      font-size: 16px;
//    }
//
//
//    .addBtn {
//      padding: 10px;
//      width: 25%;
//      background: #d9d9d9;
//      color: #555;
//      float: center;
//      text-align: center;
//      font-size: 16px;
//      cursor: pointer;
//      transition: 0.3s;
//      border-radius: 0;
//    }
//
//    .addBtn:hover {
//      background-color: #bbb;
//    }
//
//    .ul li {
//      cursor: pointer;
//      position: relative;
//      padding: 12px 8px 12px 40px;
//      list-style-type: none;
//      background: #eee;
//      font-size: 18px;
//      transition: 0.2s;
//    }
//
//    .card {
//      text-align: center;
//    }
//  </style>
//</head>
//
//<body>
//  <nav class="navbar navbar-expand-sm bg-primary navbar-dark">
//    <ul class="navbar-nav">
//      <li class="nav-item active">
//        <h1> <a class="nav-link" href="#">
//            <p class="text-warning"><I> easyShop </p>
//          </a> </I> </h1>
//      </li>
//      <li class="nav-item">
//
//        <h3><a class="nav-link" href="Wireframe.html">
//            <p class="text-white"> <U> <B> Lists </U> </B></p>
//          </a></h3>
//      </li>
//
//      <li class="nav-item">
//        <h4><a class="nav-link" href="Wireframe2.html">
//            <p class="text-white"> Meals </p>
//          </a> </h4>
//      </li>
//      <li class="nav-item">
//        <h4><a class="nav-link" href="Wireframe3.html">
//            <p class="text-white"> Dates </p>
//          </a></h4>
//      </li>
//    </ul>
//
//  </nav>
//
//  <form onsubmit="return postItem(this)">
//
//    <div id="myDIV" class="header">
//      <h5 class="m-1">Add item</h5>
//      <input type="text" name="name" placeholder="Type...">
//      <input class="btn btn-primary" type="submit"> </input>
//    </div>
//  </form>
//
//  <div class="container m-2 p-0">
//    <div class="row" id="list-items">
//      <div class="card col-10 col-sm-5 col-md-4 col-lg-3 p-2 m-3">
//        Cheese
//      </div>
//
//    </div>
//
//  </div>
//
//
//  </body>
//  <script>
    function renderToScreen(jsData) {
      let row = document.getElementById("list-items");
      row.innerHTML = "";
      for (let item of jsData) {
        let card = document.createElement("div");
        card.className = "card col-10 col-sm-5 col-md-4 col-lg-3 p-2 m-3"
        card.innerText = item.name;
        $(card).attr("id", item.id);
        $(card).attr("onclick", "deleteItem(this.id)");
        row.appendChild(card);
      }
    }

    function getItems() {
      let request = new XMLHttpRequest();
      request.open("GET", "http://localhost:9002/items/");
      request.onload = function () {
        renderToScreen(JSON.parse(request.response));
      }
      request.send();
    }


    getItems();


    function postItem(form) {
      let body = {};
      for (let input of form) {
        if (input.name) {
          body[input.name] = input.value;
        }
      }
      body = JSON.stringify(body);
      let request = new XMLHttpRequest();
      request.open("POST", "http://localhost:9002/items");
      request.setRequestHeader("Content-Type", "application/json");
      request.onload = function () {
        getItems();
      }
      request.send(body);
      return false;
    }
    function deleteItem(id) {
        console.log(id);
        var toRemove = document.getElementById(id);
        toRemove.remove();
        
        let request = new XMLHttpRequest();
        request.open("Delete", "http://"+location.hostname+":9002/items/" + id);
        request.setRequestHeader("Content-Type", "application/json");
        request.onload = function () {
          getItems();
        }
        request.send();
      }

//
//  
//  </script>




//</html>