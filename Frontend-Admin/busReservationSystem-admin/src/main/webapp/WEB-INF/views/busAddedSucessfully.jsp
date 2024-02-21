<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>AddBus</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f2f2f2;
        }
        .navbar {
            background-color: #333;
            overflow: hidden;
        }
        .navbar a {
            float: left;
            display: block;
            color: white;
            text-align: center;
            padding: 14px 20px;
            text-decoration: none;
        }
        .navbar a:hover {
            background-color: #ddd;
            color: black;
        }
        .container {
            width: 80%;
            margin: auto;
            padding-top: 50px;
        }
        h2 {
            text-align: center;
            color: #333;
        }
        .add-bus-form {
            background-color: #fff;
            padding: 20px;
            margin-bottom: 20px;
            border-radius: 8px;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
        }
        .add-bus-form input[type="text"],
        .add-bus-form input[type="number"],
        .add-bus-form input[type="date"],
        .add-bus-form input[type="time"],
        .add-bus-form input[type="submit"] {
            width: 100%;
            margin-bottom: 10px;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box; /* Ensure padding and border are included in width */
        }
        .add-bus-form input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            border: none;
            cursor: pointer;
        }
        .add-bus-form input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <div class="navbar">
        <a href="#addBus">Add Buses</a>
        <a href="seeAllBuses">See All Buses</a>
        <a href="#showCustomerList">Show Customer List</a>
    </div>
    
    <div class="container">
        <h2>Add More Busses</h2>
        <div id="addBus" class="add-bus-form">
            <h3>Add Bus</h3>
            <form id="addBusForm" action="addingBus" method="POST">
                <input type="text" name="busName" placeholder="Bus Name" required><br>
                <input type="text" name="busNumber" placeholder="Bus Number" required><br>
                <input type="number" name="seatsAvailable" placeholder="Bus seats" required><br>
                <input type="text" name="source" placeholder="Source" required><br>
                <input type="text" name="destination" placeholder="Destination" required><br>
                <input type="date" name="departuredate" placeholder="Date" required><br>
                <input type="time" name="departureTime" placeholder="Departure Time" required><br>
                <input type="submit" onclick="myfunction()" value="Add Bus">
            </form>
        </div>
    </div>
    
    <script>
    function myfunction(){
    	alert("Bus Added Sucessfully");
    }
    </script>
</body>
</html>

