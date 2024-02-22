<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="com.expleo.busReservationSystem.entity.CustomerList" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>See All Customers</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f4f4;
        margin: 0;
        padding: 0;
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
 <div class="navbar">
        <a href="addBus">Add Buses</a>
        <a href="seeBuses">See All Buses</a>
        <a href="#showCustomerList">Show Customer List</a>
    </div>
    <h2>See All Customers</h2>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Gender</th>
                <th>Mobile No</th>
                <th>Date</th>
                <!-- Add more columns as needed -->
            </tr>
        </thead>
        <tbody>  
           <% 
            
            Iterable<CustomerList> customerList = (Iterable<CustomerList>)request.getAttribute("customerList");
            for(CustomerList c: customerList){
            %>
            <tr>
                <td><%=c.getId() %></td>
                <td><%=c.getName() %></td>
                <td><%=c.getGender() %></td>
                <td><%=c.getMobile() %></td>
                <td><%=c.getDate() %></td>
                
            </tr>
			  <%
            }
            %>
            
        </tbody>
    </table>
</body>
</html>
