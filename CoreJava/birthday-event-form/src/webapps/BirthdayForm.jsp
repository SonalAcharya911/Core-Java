<!DOCTYPE html>
<html>
<head>
    <title>Birthday Event Guest Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #ffd6f6;
            font-family: 'Segoe UI', sans-serif;
        }
        .form-section {
            background-color: #ffaeae;
            border-radius: 15px;
            padding: 40px;
            max-width: 700px;
            margin: auto;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }
        .form-title {
            color: #613425;
            margin-bottom: 30px;
        }
        label {
            font-weight: 500;
        }
        .navbar {
            background-color: #ff94ba;
        }
        .navbar .nav-link,
        .navbar-brand {
            color: rgb(255, 255, 255) !important;
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
                    <a class="nav-link" href="index.jsp">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" href="birthdayForm.jsp">Guest Form</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="guestViewer.jsp">Guest Viewer</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<br><br>

<div class="form-section">
    <h2 class="form-title text-center">🎉 Birthday Guest Entry Form 🎂</h2>
    <form action="saveGuest" method="post">
        <span><h6 style="color: green">${success}</h6>
            <h6 style="color: red">${failure}</h6></span>
        <div class="mb-3">
            <label for="guestName" class="form-label">Guest Name</label>
            <input type="text" class="form-control" id="guestName" name="guestName" required placeholder="${dto.guestName}">
        </div>
        <div class="mb-3">
            <label for="contactNumber" class="form-label">Contact Number</label>
            <input type="tel" class="form-control" id="contactNumber" name="contactNumber" placeholder="${dto.contactNumber}">
        </div>
        <div class="mb-3">
            <label for="email" class="form-label">Email Address</label>
            <input type="email" class="form-control" id="email" name="email" placeholder="${dto.email}">
        </div>
        <div class="mb-3">
            <label for="rsvpStatus" class="form-label">RSVP Status</label>
            <select class="form-select" id="rsvpStatus" name="rsvpStatus" placeholder="${dto.rsvpStatus}">
                <option value="Yes">Yes</option>
                <option value="No">No</option>
                <option value="Maybe">Maybe</option>
            </select>
        </div>
        <div class="mb-3">
            <label for="attendees" class="form-label">Number of Attendees</label>
            <input type="number" class="form-control" id="attendees" name="attendees" placeholder="${dto.numberOfAttendees}">
        </div>
        <div class="mb-3">
            <label for="food" class="form-label">Food Preference</label>
            <select class="form-select" id="food" name="foodPreference" placeholder="${dto.foodPreference}">
                <option value="Veg">Veg</option>
                <option value="Non-Veg">Non-Veg</option>
                <option value="Vegan">Vegan</option>
                <option value="Jain">Jain</option>
            </select>
        </div>
        <div class="mb-3">
            <label for="specialRequests" class="form-label">Special Requests</label>
            <textarea class="form-control" id="specialRequests" name="specialRequests" rows="3" placeholder="e.g., allergic to dairy, bringing a toddler...If no requests please type 'none'"></textarea>
        </div>
        <div class="text-center">
            <input type="submit" class="btn btn-primary px-4" value="Save Guest">
        </div>
    </form>
</div>

<br><br>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>

