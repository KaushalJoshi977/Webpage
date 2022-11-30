<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome User !</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<%@ include file="NavBar.jsp" %>
<body> <div class="form-container">
<form action = "Vote" method = "post">
<label for="voterNumber" class="form-elements form-label"><b>Enter your voter card number</b></label> 
<br>
<input id="voterNumber"  name="voterNumber" class="form-elements form-input" type="text"/>
<br>
<label for="party" class="form-elements form-label"><b>Choose your party</b></label> 
<br>
<select id="partie" name="partie" class="form-elements form-input">
<option value="Aam Aadmi Party">AAP</option>
<option value="BJP">BJP</option>
<option value="BSP">BSP</option>
<option value="Congress">Congress</option>
<option value="CPI">CPI</option>
</select>
<br>
<button type="submit" class="form-elements form-button">Submit</button>
</form>
</div>
</body>
</html>
