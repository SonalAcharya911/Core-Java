<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Weather Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
          font-family: 'Segoe UI', sans-serif;
          background: #f0faff;
        }

        .navbar {
          background: linear-gradient(to right, #87CEFA, #B0E0E6);
        }

        .navbar-brand, .nav-link {
          color: #003366 !important;
        }

        .nav-link:hover {
          background-color: rgba(255, 255, 255, 0.3);
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
                    <a class="nav-link" href="index.jsp">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" href="Weather.jsp">Fill Weather Form</a>
                </li>
            </ul>
        </div>
    </div>
</nav>
<br><br>

<center><h1>Data saved successfully</h1>
    <h2><a href="Weather.jsp">Fill another form</a></h2>
</center>




    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
