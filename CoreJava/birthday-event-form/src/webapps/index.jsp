<!DOCTYPE html>
<html>
<head>
    <title>Birthday Event Home</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #ffd6f6;
            font-family: 'Segoe UI', sans-serif;
        }
        .welcome-section {
            background-color: #ffaeae;
            border-radius: 15px;
            padding: 60px;
            max-width: 700px;
            margin: 80px auto;
            text-align: center;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }
        .welcome-title {
            color: #613425;
            font-size: 2rem;
            margin-bottom: 20px;
        }
        .navbar {
            background-color: #ff94ba;
        }
        .navbar .nav-link,
        .navbar-brand {
            color: white !important;
        }
    </style>
</head>
<body>

<nav class="navbar navbar-expand-lg">
    <div class="container-fluid">
        <a class="navbar-brand fw-bold" href="#">Birthday Event Planner</a>
        <div class="collapse navbar-collapse">
            <ul class="navbar-nav ms-3">
                <li class="nav-item">
                    <a class="nav-link active" href="index.jsp">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="BirthdayForm.jsp">Guest Form</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="guestViewer.jsp">Guest Viewer</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<div class="welcome-section">
    <h2 class="welcome-title">🎉 Welcome to the Birthday Event Planner 🎂</h2>
    <p class="mb-4">We're excited to have you join the celebration! Click below to submit your guest details.</p>
    <a href="BirthdayForm.jsp" class="btn btn-primary px-4 py-2">Fill Guest Form</a>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
