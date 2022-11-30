<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online Voting System</title> <link rel="stylesheet" type="text/css" href="style.css">
</head>
<%@ include file="NavBar.jsp"%>
<body> <div class="form-container">
<form action = "Contactus" method = "post">
<label for="name" class="form-elements"><b>Name :</b></label> <br>
<input id="name" class="form-elements form-input" type="text"/>
<br>
<label for="number" class="form-elements"><b>Phone Number :</b></label> <br>
<input id="number" class="form-elements form-input" type="number"/>
<br> <label for="email" class="form-elements"><b>Email :</b></label>
<br>
<input id="email" class="form-elements form-input" type="email"/>
<br>
<label for="comment" class="form-elements"><b>Comments :</b></label>
<br>
<textarea id="comment" class="form-elements form-input" ></textarea>
<br>
<button type="submit" class="form-elements form-button">Submit</button>
</form>
</div>
</body>
</html>