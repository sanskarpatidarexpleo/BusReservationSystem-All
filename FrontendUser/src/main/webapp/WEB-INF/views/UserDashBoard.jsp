<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Dashboard</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
        }

        .container {
            max-width: 800px;
            margin: 20px auto;
            padding: 20px;
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        h1 {
            text-align: center;
            margin-bottom: 20px;
        }

        .button {
            display: inline-block;
            padding: 10px 20px;
            background-color: #007bff;
            color: #fff;
            text-decoration: none;
            border-radius: 5px;
            transition: background-color 0.3s ease;
        }

        .button:hover {
            background-color: #0056b3;
        }

        .functionality {
            margin-bottom: 20px;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>User Dashboard</h1>
        
        <div class="functionality">
            <h2>1. Search and Book Travels</h2>
            <a href="search_travel.html" class="button">Search and Book</a>
        </div>

        <div class="functionality">
            <h2>2. Get Booking Details</h2>
            <a href="booking_details.html" class="button">View Details</a>
        </div>

        <div class="functionality">
            <h2>3. Book a Seat</h2>
            <a href="book_seat.html" class="button">Book Seat</a>
        </div>
    </div>
</body>
</html>
