<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<H2>Update Car Details</H2>
	<form action="saveCar">
		<table>
			<tr>
				<td>Car Id</td>
				<td><input type="text" name="id" value="${car.id}" readonly/></td>
			</tr>
			<tr>
				<td>Car Name</td>
				<td><input type="text" name="name" value="${car.name}"/></td>
			</tr>
			<tr>
				<td>Car Price</td>
				<td><input type="text" name="price" value="${car.price}"/></td>
			</tr>
				<tr>
				<td>Car Color</td>
				<td><input type="text" name="color" value="${car.color}"/></td>
			</tr>
			<tr>
				<td>Car Company</td>
				<td><input type="text" name="company" value="${car.company}"/></td>
			</tr>
			<tr>
				<td>Car Model</td>
				<td><input type="text" name="model" value="${car.model}"/></td>
			</tr>
			<tr>
				<td>Engine Capacity</td>
				<td><input type="text" name="engineCapacity" value="${car.engineCapacity}"/></td>
			</tr>
			<tr>
				<td>Licence Plate Number</td>
				<td><input type="text" name="licencePlateNumber" value="${car.licencePlateNumber}"/></td>
			</tr>
				<tr>
				<td>Seating Capacity </td>
				<td><input type="text" name="seatingCapacity" value="${car.seatingCapacity}"/></td>
			</tr>
			<tr>
				<td><input type="Submit" value="Update"/></td>
			</tr>
		</table>
	</form>
</body>
</html>