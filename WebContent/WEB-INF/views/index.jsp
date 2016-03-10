<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>hello App Server</title>
</head>

<body>
Hello App Server :
<a href="viewprofile.html">view</a>

<form action="viewprofile.html" method="get">
	<input type="number" name="id"/><br>		
	<input type="submit" value="View Profile" />
</form>


</body>

</html>