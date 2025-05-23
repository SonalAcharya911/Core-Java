<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Product Details</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body style="background-color: #fef7f9;">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Navbar</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link " aria-current="page" href="index.jsp">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" href="recipe.jsp">Recipe Details</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<table class="table table-info table-bordered table-striped">
    <thead>
    <tr>
        <th scope="col">sl.no.</th>
        <th scope="col">Recipe Name</th>
        <th scope="col">Ingredient 1</th>
        <th scope="col">Ingredient 2</th>
        <th scope="col">Ingredient 3</th>
        <th scope="col">Ingredient 4</th>
        <th scope="col">Ingredient 5</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <th scope="row">1</th>
        <td>${recipeDto.recipeName}</td>
        <td>${recipeDto.ing1}</td>
        <td>${recipeDto.ing2}</td>
        <td>${recipeDto.ing3}</td>
        <td>${recipeDto.ing4}</td>
        <td>${recipeDto.ing5}</td>

    </tr>
    </tbody>
</table>


</body>
</html>