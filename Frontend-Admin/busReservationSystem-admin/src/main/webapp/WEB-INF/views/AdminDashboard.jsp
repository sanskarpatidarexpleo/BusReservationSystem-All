

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Dashboard</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f2f2f2;
        }
        .container {
            max-width: 1200px;
            margin: auto;
            padding-top: 145px;
            display: flex;
            flex-wrap: wrap;
            justify-content: space-around;
        }
        .dashboard-block {
            width: 200px;
            background-color: #fff;
            padding: 20px;
            margin: 20px;
            border-radius: 8px;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
            text-align: center;
        }
        .dashboard-block a {
            text-decoration: none;
            color: #333;
            display: block;
        }
        .dashboard-block img {
            width: 80px;
            height: 80px;
            margin-bottom: 10px;
        }
        .dashboard-block span {
            display: block;
            font-size: 16px;
            font-weight: bold;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="dashboard-block">
            <a href="addBus">
                <img src="https://th.bing.com/th/id/OIP.ncx5PF4BGm4E5oagQOZzfgHaDt?w=317&h=174&c=7&r=0&o=5&pid=1.7" alt="Add Buses">
                <span>Add Buses</span>
            </a>
        </div>
        <div class="dashboard-block">
            <a href="seeBuses">
                <img src="https://th.bing.com/th/id/OIP.2rcK2d7FxN4bkSqUh9zxIwHaHa?w=184&h=184&c=7&r=0&o=5&pid=1.7" alt="See All Buses">
                <span>See All Buses</span>
            </a>
        </div>
        <div class="dashboard-block">
            <a href="seeCustomers">
                <img src="https://th.bing.com/th?id=OIP.swW6ltaZFvmd-vVng-cZUwHaHa&w=250&h=250&c=8&rs=1&qlt=90&o=6&pid=3.1&rm=2" alt="Show Customer List">
                <span>Show Customer List</span>
            </a>
        </div>
        <div class="dashboard-block">
            <a href="#help">
                <img src="https://th.bing.com/th?id=OIP.4Up5ug4k18luKrDbzBnSSwHaGk&w=265&h=235&c=8&rs=1&qlt=90&o=6&pid=3.1&rm=2" alt="Help">
                <span>Help</span>
            </a>
        </div>
    </div>
</body>
</html>
