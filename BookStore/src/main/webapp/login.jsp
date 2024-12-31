<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Login</title>
		<link rel="stylesheet"
			href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
			integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
			crossorigin="anonymous">
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
		<div align="center">
			<h2>Login</h2>
			<br>
			<form action="LoginServlet" method="post">
			<div class="imgcontainer">
    			<img src="image.jpg" alt="Avatar" class="avatar">
  			</div>
  
  			<div class="container">
				<table>
					<tr>
						<td>Name:</td>
						<td><input type="text" placeholder="Enter Username" name="name" required></td>
					</tr>
			
					<tr>
						<td>Password:</td>
						<td><input type="password" placeholder="Enter Password" name="password" required></td>
					</tr>
					
					<tr>
						<td colspan="2"><button><input type="submit" value="Login"></button></td>
					</tr>
				</table>
			</div>
			<br>
			</form>
			<div class="container">
					<table>
						<tr>
							<td colspan="4"><button><a href="register.jsp"><input type="submit" value="Sign-up"></a></button></td>
						</tr>
					</table>
			</div>
		</div>
	</body>
</html>