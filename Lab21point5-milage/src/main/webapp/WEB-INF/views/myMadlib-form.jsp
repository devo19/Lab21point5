<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Enter words</title>
<link rel = "stylesheet" href = "/milagestyle.css"/>
</head>
<body>

   <h1>Pick Words</h1>
   
   <form action ="myMadlib-story">   
      <p> Noun: <input type = "text" name = "noun" /> </p>
      <p> Adjective: <input type = "text" name = "adj"/> </p>
      <p> Part of body: <input type = "text" name = "bodypart" /> </p>
      <p> Adverb: <input type = "text" name = "adv" /> </p>
      <p> Color: <input type = "text" name = "color" /> </p>
      <p> Verb: <input type = "text" name = "verb" /> </p>
      <p> <button type = "submit">Tell me a story!</button></p>     
   </form>

</body>
</html>