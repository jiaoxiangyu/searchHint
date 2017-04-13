<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>百度一下</title>

<script src="js/search.js"></script>
<link rel="stylesheet" type="text/css" href="css/index.css"/>
</head>
<body>
	<form action="searchCon" name="form" class="form1" id="form1" method="post">
		<input class="search" id="search" name="search" type="search" tabindex="1"
			required="required" onkeyup="sreach()" onblur="loseFocus()" onfocus="sreach()" >
	    <input class="but" type="submit" value="百度一下"
			onclick="check()">
		<div class="myDiv" id="myDiv"></div>		
	</form>
	
</body>
</html>