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

        .form-container {
          display: flex;
          justify-content: center;
          align-items: center;
          min-height: 85vh;
        }

        form {
          background: linear-gradient(to right, #e0f7fa, #b2ebf2);
          padding: 30px;
          border-radius: 15px;
          width: 100%;
          max-width: 600px;
          box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
        }

        label {
          font-weight: 600;
          color: #006064;
          margin-bottom: 5px;
        }

        input[type="text"],
        input[type="number"],
        input[type="time"],
        select {
          width: 100%;
          padding: 8px 10px;
          border: 1px solid #81d4fa;
          border-radius: 6px;
        }

        input[type="submit"] {
          background-color: #0288d1;
          color: white;
          border: none;
          padding: 10px 15px;
          border-radius: 6px;
          cursor: pointer;
          width: 100%;
        }

        input[type="submit"]:hover {
          background-color: #0277bd;
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

<div class="form-container">
    <form action="weather" method="post">
        <h6>${message}</h6><br>
        <div class="mb-3">
            <label>Place Name:</label>
            <input type="text" name="place">
        </div>

        <div class="mb-3">
            <label>Weather:</label>
            <input type="text" name="weather">
        </div>

        <div class="mb-3">
            <label>Minimum Temperature:</label>
            <input type="number" name="minTemp">
        </div>

        <div class="mb-3">
            <label>Maximum Temperature:</label>
            <input type="number" name="maxTemp">
        </div>

        <div class="row mb-3">
            <div class="col-md-6">
                <label>Cloudy:</label>
                <select name="cloudy">
                    <option selected disabled>Select</option>
                    <option value="yes">Yes</option>
                    <option value="no">No</option>
                </select>
            </div>
            <div class="col-md-6">
                <label>Raining:</label>
                <select name="raining">
                    <option selected disabled>Select</option>
                    <option value="yes">Yes</option>
                    <option value="no">No</option>
                </select>
            </div>
        </div>

        <div class="mb-3">
            <label>Rain in mm:</label>
            <input type="number" name="rainAmount">
        </div>

        <div class="mb-3">
            <label>Humidity:</label>
            <input type="number" name="humidity">
        </div>

        <div class="mb-3">
            <label>Wind Speed:</label>
            <input type="number" name="windSpeed">
        </div>

        <div class="row mb-3">
            <div class="col-md-6">
                <label>Sunrise Time:</label>
                <input type="time" name="sunriseTime">
            </div>
            <div class="col-md-6">
                <label>Sunset Time:</label>
                <input type="time" name="sunsetTime">
            </div>
        </div>

        <div class="row mb-3">
            <div class="col-md-6">
                <label>Moonrise Time:</label>
                <input type="time" name="moonriseTime">
            </div>
            <div class="col-md-6">
                <label>Moonset Time:</label>
                <input type="time" name="moonsetTime">
            </div>
        </div>

        <div class="row mb-3">
            <div class="col-md-6">
                <label>Rain Start Time:</label>
                <input type="time" name="rainStartTime">
            </div>
            <div class="col-md-6">
                <label>Rain End Time:</label>
                <input type="time" name="rainEndTime">
            </div>
        </div>

        <div class="mb-4">
            <label>Precipitation:</label>
            <input type="text" name="precipitation">
        </div>

        <input type="submit" value="Save Weather Info">
    </form>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
