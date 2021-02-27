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
<h2>Show Cars</h2>
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
			</tr>
		</c:forEach>
	</table>
</body>
</html>