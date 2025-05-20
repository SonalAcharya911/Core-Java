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
                    <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="product.jsp">Product</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

<center>
    <h1 style="padding-top:20px">Product Details Form</h1>
</center>


<div style="width: 80vh; margin: 30px auto 60px auto; background-color: #fff0f5; padding: 30px; border-radius: 10px; box-shadow: 0 0 10px rgba(0,0,0,0.1);">
    <form action="">
        <div class="mb-3">
            <label for="name" class="form-label">Name</label>
            <input type="text" class="form-control" id="name" placeholder="Enter product name" name="name">
        </div>

        <div class="mb-3">
            <label for="productType" class="form-label">Type</label>
            <select class="form-select" id="productType" name="type">
                <option selected>Open this select menu</option>
                <option value="electronics">Electronics</option>
                <option value="clothing">Clothing</option>
                <option value="books">Books</option>
                <option value="furniture">Furniture</option>
                <option value="appliances">Home Appliances</option>
                <option value="toys">Toys & Games</option>
                <option value="beauty">Beauty & Personal Care</option>
                <option value="sports">Sports & Fitness</option>
                <option value="groceries">Groceries</option>
                <option value="stationery">Stationery</option>
            </select>
        </div>

        <div class="mb-3">
            <label for="costprice" class="form-label">Cost Price</label>
            <input type="number" class="form-control" id="costprice" placeholder="Enter cost price" name="costPrice">
        </div>
        <div class="mb-3">
            <label for="sellprice" class="form-label">Selling Price</label>
            <input type="number" class="form-control" id="sellprice" placeholder="Enter selling price" name="SellingPrice">
        </div>

        <div class="mb-3">
            <label for="mrp" class="form-label">MRP</label>
            <input type="number" class="form-control" id="mrp" placeholder="Enter MRP" name="mrp">
        </div>

        <div class="mb-3">
            <label for="description" class="form-label">Product Description</label>
            <textarea class="form-control" id="description" rows="2" name="description"></textarea>
        </div>

        <div class="mb-3">
            <label for="brand" class="form-label">Brand</label>
            <input type="text" class="form-control" id="brand" placeholder="Enter brand name" name="brand">
        </div>

        <div class="mb-3">
            <label for="quantity" class="form-label">Quantity</label>
            <input type="number" class="form-control" id="quantity" placeholder="Enter Quantity" name="quantity">
        </div>

        <div class="mb-3">
            <label for="color" class="form-label">Color</label>
            <select class="form-select" id="color" name="color">
                <option selected>Open this select menu</option>
                <option value="black">Black</option>
                <option value="white">White</option>
                <option value="gold">Gold</option>
                <option value="silver">Silver</option>
                <option value="yellow">Yellow</option>
                <option value="red">Red</option>
                <option value="green">Green</option>
                <option value="blue">Blue</option>
            </select>
        </div>

        <div class="mb-3">
            <label for="weight" class="form-label">Weight</label>
            <input type="number" class="form-control" id="weight" placeholder="Enter weight" name="weight">
        </div>

        <div class="mb-3">
            <label for="manufDate" class="form-label">Manufactured Date</label>
            <input type="date" class="form-control" id="manufDate" name="manufDate">
        </div>

        <div class="mb-3">
            <label for="warranty" class="form-label">Warranty</label>
            <select class="form-select" id="warranty" name="warranty">
                <option selected>Open this select menu</option>
                <option value="6">6 months</option>
                <option value="12">12 months</option>
                <option value="18">18 months</option>
                <option value="24">2 years</option>
                <option value="36">3 years</option>
            </select>
        </div>

        <div class="form-check mb-3">
            <input class="form-check-input" type="checkbox" value="" id="flexCheckChecked" name="retpol">
            <label class="form-check-label" for="flexCheckChecked">
                Return policy
            </label>
        </div>

        <div class="d-grid gap-2">
            <input type="submit" value="submit">
        </div>
    </form>
</div>

</body>
</html>
