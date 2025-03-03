import React from "react";
import { Link } from "react-router";

const Navbar = () =>{
    return(
<>
<body class="p-3 m-0 border-0 bd-example m-0 border-0">
<nav class="navbar  navbar-expand-lg p-3 m-0 border-0 bd-example fixed-top bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Prodrct management System</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <Link to = "/" class="nav-link active" aria-current="page" href="#">Home</Link>
        </li>

        <li class="nav-item">
          <Link to = "addProduct" class="nav-link active" aria-current="page" href="#">Add Product</Link>
        </li>
        
       
       
      </ul>
      <form class="d-flex" role="search">
        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search"/>
        <button class="btn btn-outline-success" type="submit">Search</button>
      </form>
    </div>
  </div>
</nav>
</body>
</>
    )
}
export default Navbar