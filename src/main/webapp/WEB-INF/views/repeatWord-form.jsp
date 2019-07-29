<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Enter Word</title>
<link rel = "stylesheet" href = "/milagestyle.css"/>
</head>
<body>

   <form action="/repeatWord-result">
		<p>Enter word: <input type="text" name="word" /> </p>
		<p>how many times: <input type="number" name="times" /> </p>
		<p><button type="submit">Show the word</button></p>
	</form>

</body>
</html>