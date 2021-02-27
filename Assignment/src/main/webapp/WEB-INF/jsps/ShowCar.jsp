<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Show Car Details</h2>
	<table border="1">
		<tr>
			<th>Car Name</th>
			<th>Car Price</th>
			<th>Car Color</th>
			<th>Car Company</th>
			<th>Car Model</th>
			<th>Engine Capacity</th>
			<th>Licence Plate Number</th>
			<th>Seating Capacity</th>
			<th>Delete</th>
			<th>Update</th>
		</tr>
		<c:forEach items="${car}" var="car">
			<tr>
				<td>${car.name}</td>
				<td>${car.price}</td>
				<td>${car.color}</td>
				<td>${car.company}</td>
				<td>${car.model}</td>
				<td>${car.engineCapacity}</td>
				<td>${car.licencePlateNumber}</td>
				<td>${car.seatingCapacity}</td>
				<td><a href="deleteCar?id=${car.id}">Delete</a></td>
                <td><a href="updateCar?id=${car.id}">Update</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>