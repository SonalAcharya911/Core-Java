<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Recipe Details</title>
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

<form action="getRecipe" method="post"
      style="max-width: 500px; margin: 50px auto; background-color: #fff; padding: 30px; border-radius: 10px; box-shadow: 0 0 10px rgba(0,0,0,0.1);">
    <h3 style="text-align: center; color: #dc3545;">${message}</h3>
    <ul type="none" style="padding-left: 0;">
        <li style="margin-bottom: 15px;">Recipe Name:
            <input type="text" name="name" style="width: 100%; padding: 8px; border-radius: 5px; border: 1px solid #ccc;">
        </li>
        <li style="margin-bottom: 15px;">Ingredient 1:
            <input type="text" name="ing1" style="width: 100%; padding: 8px; border-radius: 5px; border: 1px solid #ccc;">
        </li>
        <li style="margin-bottom: 15px;">Ingredient 2:
            <input type="text" name="ing2" style="width: 100%; padding: 8px; border-radius: 5px; border: 1px solid #ccc;">
        </li>
        <li style="margin-bottom: 15px;">Ingredient 3:
            <input type="text" name="ing3" style="width: 100%; padding: 8px; border-radius: 5px; border: 1px solid #ccc;">
        </li>
        <li style="margin-bottom: 15px;">Ingredient 4:
            <input type="text" name="ing4" style="width: 100%; padding: 8px; border-radius: 5px; border: 1px solid #ccc;">
        </li>
        <li style="margin-bottom: 15px;">Ingredient 5:
            <input type="text" name="ing5" style="width: 100%; padding: 8px; border-radius: 5px; border: 1px solid #ccc;">
        </li>
    </ul>
    <div style="text-align: center;">
        <input type="submit" value="Save"
               style="background-color: #0d6efd; color: white; padding: 10px 20px; border: none; border-radius: 5px;">
    </div>
</form>
</body>
</html>
