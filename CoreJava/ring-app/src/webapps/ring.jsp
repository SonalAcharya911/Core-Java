<!DOCTYPE html>
<html>
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


<div style="display: flex; justify-content: center; align-items: center; height: 90vh;">


    <form action="ring" method="post"
          style="background-color: #fff3e0; padding: 30px; border-radius: 10px; box-shadow: 0 0 10px rgba(0,0,0,0.2); min-width: 320px;">
        <h3 style="text-align: center; color: #8d6e63;">Fill Ring Details
            <br><br><center>${message}</center>
            <br><br>
        </h3>


        <div style="margin-bottom: 15px;">
            <label>Material:</label>
            <input type="text" name="material" style="width: 100%; padding: 8px;">
        </div>
        <div style="margin-bottom: 15px;">
            <label>Weight:</label>
            <input type="number" name="weight" style="width: 100%; padding: 8px;">
        </div>
        <div style="margin-bottom: 15px;">
            <label>Size:</label>
            <input type="number" name="size" style="width: 100%; padding: 8px;">
        </div>
        <div style="margin-bottom: 15px;">
            <label>Price:</label>
            <input type="number" name="price" style="width: 100%; padding: 8px;">
        </div>
        <div style="margin-bottom: 15px;">
            <label>Purchase Date:</label>
            <input type="date" name="purchaseDate" style="width: 100%; padding: 8px;">
        </div>


        <div style="margin-bottom: 10px;">
            <label style="display: flex; align-items: center;">
                <input type="checkbox" name="haveStones" style="margin-right: 10px;" value="true">
                Have Stones
            </label>
        </div>
        <div style="margin-bottom: 20px;">
            <label style="display: flex; align-items: center;">
                <input type="checkbox" name="customMade" style="margin-right: 10px;">
                Custom Made
            </label>
        </div>


        <div style="text-align: center;">
            <input type="submit" value="Submit"
                   style="background-color: #bfa06d; color: white; padding: 10px 20px; border: none; border-radius: 5px; cursor: pointer;">
        </div>
    </form>
</div>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
