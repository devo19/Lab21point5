<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Time Form</title>
<link rel = "stylesheet" href = "/milagestyle.css"/>
</head>
<body>

    <form action="/time-result">
		<p>Miles to travel: <input type="number" name="miles" /> </p>
		<p>Speed: <input type="number" step=".01" name="speed" /> </p>
		<p><button type="submit">Calculate time</button></p>
	</form>

</body>
</html>