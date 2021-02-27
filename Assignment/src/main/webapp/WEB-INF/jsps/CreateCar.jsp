<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Enter new car Details</h2>
	<a href="showCar">View Car</a>
	<br />
	<br />
	<a href="searchCar">Search Car</a>
	<br />
	<br />
	<form action="saveCar">
		<table>
			<tr>
				<td>Car Name</td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td>Car Price</td>
				<td><input type="text" name="price" /></td>
			</tr>
			<tr>
				<td>Car Color</td>
				<td><input type="text" name="color" /></td>
			</tr>
			<tr>
				<td>Car Company</td>
				<td><input type="text" name="company" /></td>
			</tr>
			<tr>
				<td>Car Model</td>
				<td><input type="text" name="model" /></td>
			</tr>
			<tr>
				<td>Engine Capacity</td>
				<td><input type="text" name="engineCapacity" /></td>
			</tr>
			<tr>
				<td>Licence Plate Number</td>
				<td><input type="text" name="licencePlateNumber" /></td>
			</tr>
			<tr>
				<td>Seating Capacity</td>
				<td><input type="text" name="seatingCapacity" /></td>
			</tr>
			<tr>
				<td><input type="Submit" value="Save" /></td>
			</tr>
		</table>
	</form>
</body>
</html>