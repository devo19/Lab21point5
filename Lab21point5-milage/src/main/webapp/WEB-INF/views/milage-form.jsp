<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Milage Form</title>
<link rel = "stylesheet" href = "/milagestyle.css"/>
</head>
<body>

    <form action="/milage-result">
		<p>Mileage (MPG): <input type="number" name="mpg" /> </p>
		<p>Gallons in tank: <input type="number" name="gallons" /> </p>
		<p><button type="submit">Calculate range</button></p>
	</form>

</body>
</html>