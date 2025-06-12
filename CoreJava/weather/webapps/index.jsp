<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Weather Navbar</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        .navbar {
          background: linear-gradient(to right, #87CEFA, #B0E0E6); /* SkyBlue to PowderBlue */
        }
        .navbar-brand, .nav-link, .dropdown-toggle {
          color: #003366 !important; /* Deep blue for readability */
        }
        .nav-link:hover, .dropdown-item:hover {
          background-color: rgba(255, 255, 255, 0.3); /* light hover effect */
        }
        .dropdown-menu {
          background-color: #e0f7ff; /* very light blue */
        }
        .btn-outline-success {
          border-color: #00688B;
          color: #00688B;
        }
        .btn-outline-success:hover {
          background-color: #00688B;
          color: white;
        }
    </style>
</head>
<body>

<nav class="navbar navbar-expand-lg">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">WeatherApp</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">

                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="Weather.jsp">Fill Weather Form</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<div class="d-flex justify-content-center align-items-center" style="height: 80vh;">
    <h1 class="text-primary">Welcome to the WeatherApp!</h1>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
