<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario de Login</title>
<link rel="stylesheet" href="css/stylesLogin.css">
</head>
<body>
	<form action="Login" method="post">
        <h2>Bienvenidos a TIC SUPPS</h2>
        <input type="text" placeholder="&#128100; Usuario" name="usuario">
        <input type="password" placeholder="&#128272; Contraseña" name="pass">
        <input type="submit" name="Ingresar" value="Ingresar">
        <input type="reset" value="Refrescar">
    </form>
</body>
</html>