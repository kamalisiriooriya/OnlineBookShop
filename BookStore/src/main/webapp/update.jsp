<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update the Details</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
			body {
			font-family: Arial, Helvetica, sans-serif;
			background-image: url("Backgroundimage.avif");

  			height: 100%; 

  			background-position: center;
  			background-repeat: no-repeat;
  			background-size: cover;
			}
			form {border: 3px solid #f1f1f1;}
			
			input[type=text], input[type=password] {
			  width: 100%;
			  padding: 12px 20px;
			  margin: 8px 0;
			  display: inline-block;
			  border: 1px solid #ccc;
			  box-sizing: border-box;
			}
			
			button {
			  background-color: #04AA6D;
			  color: white;
			  padding: 14px 20px;
			  margin: 8px 0;
			  border: none;
			  cursor: pointer;
			  width: 100%;
			}
			
			button:hover {
			  opacity: 0.8;
			}
			.imgcontainer {
			  text-align: center;
			  margin: 12px 0 12px 0;
			}
			
			img.avatar {
			  width: 10%;
			  border-radius: 50%;
			}
			
			.container {
			  padding: 16px;
			}
			
		</style>
</head>
<body>
<header>
	<nav class="navbar navbar-expand-md navbar-dark"
	style="background-color:blue">
	<div>
	<a href="http://www.xadmin.net" class="navbar-brand"> Online Book Shop</a>
	</div>
	</header>
	<div class="topnav">
	  <a class="active" href="display.jsp">Home Page</a>
	</div>
	<br>
<div align="center">
<h2>Please Enter the Update Details</h2>
	<%
		String id = request.getParameter("id");
		String name= request.getParameter("name");
		String author= request.getParameter("author");
		String publication= request.getParameter("publication");
		String price= request.getParameter("price");
	%>
	
	<form action="UpdateServlet" method="post">
		<table>
			<tr>
				<td>Id:</td>
				<td><input type="text" id="id" name="id" value="<%=id%>" readonly></td>
			</tr>
			<tr>
				<td>Name:</td>
				<td><input type="text" id="name" name="name" value="<%=name%>" required></td>
			</tr>
			<tr>
				<td>Author:</td>
				<td><input type="text" id="author" name="author" value="<%=author%>" required></td>
			</tr>
			<tr>
				<td>Publication:</td>
				<td><input type="text" id="publication" name="publication" value="<%=publication%>" required></td>
			</tr>
			<tr>
				<td>Price:</td>
				<td><input type="text" id="price" name="price" value="<%=price%>" required></td>
			</tr>
			
			<tr>
				<td colspan="2"><button><input type="submit" value="Submit"></button></td>
			</tr>
		</table>
	
	</form>

</div>
</body>
</html>