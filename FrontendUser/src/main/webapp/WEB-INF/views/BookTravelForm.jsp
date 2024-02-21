<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Book Travel</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
        }

        h2 {
            text-align: center;
            margin-bottom: 20px;
        }

        form {
            max-width: 400px;
            margin: 0 auto;
            background-color: #fff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        label {
            display: block;
            margin-bottom: 5px;
        }

        input[type="text"],
        input[type="date"],
        select {
            width: 100%;
            padding: 10px;
            margin-bottom: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-sizing: border-box;
        }

        button[type="submit"] {
            width: 100%;
            padding: 10px;
            background-color: #007bff;
            border: none;
            border-radius: 5px;
            color: #fff;
            cursor: pointer;
            transition: background-color 0.3s;
        }

        button[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <h2>Book Travel</h2>
    <form action="submitBooking" method="POST">
        <label for="userId">User ID:</label>
        <input type="text" id="userId" name="userId" required><br>
        
        <label for="busId">Select Bus:</label>
        <select id="busId" name="busId" required>
            <option value="">Select Bus</option>
            <!-- Iterate over the list of buses retrieved from the database -->
            <!-- Example: Assume you have a List of Bus objects named 'busList' -->
           <% 
            Iterable<BusList> busList = (Iterable<BusList>)request.getAttribute("busList");
            for(BusList bus: busList){
            %>
              <%
            }
            %>
        </select><br>
        
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br>
        
        <label for="mobile">Mobile:</label>
        <input type="text" id="mobile" name="mobile" required><br>
        
        <label for="gender">Gender:</label>
        <select id="gender" name="gender" required>
            <option value="Male">Male</option>
            <option value="Female">Female</option>
            <option value="Other">Other</option>
        </select><br>
        
        <label for="date">Date:</label>
        <input type="date" id="date" name="date" required><br>
        
        <button type="submit">Book Travel</button>
    </form>
</body>
</html>
