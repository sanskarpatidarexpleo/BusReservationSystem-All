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
                <th>Bus Number</th>
                <th>Bus Name</th>
                <th>Travel From</th>
                <th>Travel To</th>
                <th>Departure Time</th>
                <th>Arrival Time</th>
                <th>Total Seats available</th>
                <th>Price per seat </th>
                <!-- Add more columns as needed -->
            </tr>
        </thead>
        <tbody>  
           <% 
            
            Iterable<BusList> busList = (Iterable<BusList>)request.getAttribute("busList");
            for(BusList bus: busList){
            %>
            <tr>
                <td><%=bus.getBusNo() %></td>
                <td><%=bus.getTravelName() %></td>
                <td><%=bus.getTravelFrom() %></td>
                <td><%=bus.getTravelTo() %></td>
                <td><%=bus.getDepartureTime() %></td>
                <td><%=bus.getArrivalTime() %></td>
                <td><%=bus.getTotalSeats() %></td>
                <td><%=bus.getPrice() %></td>
            </tr>
			  <%
            }
            %>
            
        </tbody>
    </table>
</body>
</html>
