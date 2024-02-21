<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="com.expleo.busReservationSystem.entity.BusList" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>See All Buses</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f4f4;
        margin: 0;
        padding: 0;
    }

    h2 {
        text-align: center;
        margin-top: 20px;
    }

    table {
        width: 80%;
        margin: 20px auto;
        border-collapse: collapse;
        background-color: #fff;
        box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
    }

    th, td {
        padding: 10px;
        border: 1px solid #ccc;
        text-align: left;
    }

    th {
        background-color: #007bff;
        color: #fff;
    }

    tr:nth-child(even) {
        background-color: #f2f2f2;
    }

    tr:hover {
        background-color: #ddd;
    }
</style>
</head>
<body>
    <h2>See All Buses</h2>
    <table>
        <thead>
            <tr>
                <th>Bus Name</th>
                <th>Bus Number</th>
                <th>Seats Available</th>
                <th>Source</th>
                <th>Destination</th>
                <th>Date</th>
                <th>Time</th>
                <th>Price</th>
                <!-- Add more columns as needed -->
            </tr>
        </thead>
        <tbody>  
           <% 
            
            Iterable<BusList> bs = (Iterable<BusList>)request.getAttribute("bs");
            for(BusList bus: bs){
            %>
            <tr>
                <td>${bus.getBusName()}</td>
                <td>${bus.getBusNumber()}</td>
                <td>${bus.getSeatsAvailable()}</td>
                <td>${bus.getSource()}</td>
                <td>${bus.getDestination()}</td>
                <td>${bus.getDeparturedate()}</td>
                <td>${bus.getDepartureTime()}</td>
                <td>${bus.getPrice()}</td>
            </tr>
			  <%
            }
            %>
            
        </tbody>
    </table>
</body>
</html>
