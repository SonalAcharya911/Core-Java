<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Product Details</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body style="background-color: #fef7f9;">


<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">MyCompany</a>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0 ms-3">
                <li class="nav-item">
                    <a class="nav-link " aria-current="page" href="index.jsp">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" href="product.jsp">Product</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>



<table class="table table-info table-bordered table-striped">
    <thead>
    <tr>
        <th scope="col">sl.no.</th>
        <th scope="col">Field</th>
        <th scope="col">Details</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <th scope="row">1</th>
        <td>Product Name</td>
        <td>${name}</td>

    </tr>
    <tr>
        <th scope="row">2</th>
        <td>Product Type</td>
        <td>${type}</td>

    </tr>
    <tr>
        <th scope="row">3</th>
        <td>Cost Price</td>
        <td>${costp}</td>
    </tr>
    <tr>
        <th scope="row">3</th>
        <td>Selling Price</td>
        <td>${sellp}</td>
    </tr>
    <tr>
        <th scope="row">3</th>
        <td>MRP</td>
        <td>${mrp}</td>
    </tr>
    <tr>
        <th scope="row">3</th>
        <td>Description</td>
        <td>${description}</td>
    </tr>
    <tr>
        <th scope="row">3</th>
        <td>Brand</td>
        <td>${brand}</td>
    </tr>
    <tr>
        <th scope="row">3</th>
        <td>Quantity</td>
        <td>${quantity}</td>
    </tr>
    <tr>
        <th scope="row">3</th>
        <td>Color</td>
        <td>${color}</td>
    </tr>
    <tr>
        <th scope="row">3</th>
        <td>Product Weight</td>
        <td>${productWeight}</td>
    </tr>
    </tbody>
</table>


</body>
</html>
