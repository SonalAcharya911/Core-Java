<!DOCTYPE html>
<html xmlns:style="http://www.w3.org/1999/xhtml">
<head>
    <title>Ring Details Form</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body style="margin: 0; font-family: Arial, sans-serif; background-color: #fff8e1;">


<nav class="navbar navbar-expand-lg navbar-light" style="background-color: #bfa06d;">
    <div class="container-fluid">
        <a class="navbar-brand text-white fw-bold" href="#">Royal Gold Jewellers</a>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ms-3">
                <li class="nav-item">
                    <a class="nav-link text-white " href="index.jsp">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link text-white active" href="ring.jsp">Ring Form</a>
                </li>
            </ul>
        </div>
    </div>
</nav>
<br><br><br>

<div style="display: flex; justify-content: center; align-items: center; height: 90vh;">


    <form action="search" method="post"
          style="background-color: #fff3e0; padding: 30px; border-radius: 10px; box-shadow: 0 0 10px rgba(0,0,0,0.2); min-width: 320px;">

        <div style="margin-bottom: 15px;">
            <label>ID:</label>
            <input type="number" name="ringId" style="width: 100%; padding: 8px;" placeholder="enter ring ID">
            <span id="materialError" style="color:red; font-size: 13px;"></span>
        </div>

        <div style="text-align: center;">
            <input type="submit" value="Submit"
                   style="background-color: #bfa06d; color: white; padding: 10px 20px; border: none; border-radius: 5px; cursor: pointer;">
        </div>
    </form>
</div>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
<script src="validations.js"></script>
</body>
</html>
