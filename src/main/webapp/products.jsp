<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/styles.css">
    <title>Modulo Productos</title>
</head>

<body>
    <div class="topnav">

        <a href="Administrador.jsp">Inicio</a>
      <a href="Usuarios.jsp">Usuarios</a>
      <a href="Customers.jsp">Clientes</a>
      <a href="Proveedores.jsp">Proveedores</a>
      <a href="products.jsp">Productos</a>
      <a href="Sales.jsp">Ventas</a>
      <a href="Reports.jsp">Reportes</a>

        <a href="main.html">Inicio</a>
        <a href="users.html">Usuarios</a>
        <a href="clients.html">Clientes</a>
        <a href="Proveedores.jsp">Proveedores</a>
        <a href="products.jsp">Productos</a>
        <a href="sales.html">Ventas</a>
        <a href="report.html">Reportes</a>
>>>>>>> branch 'master' of https://github.com/CamiCordoba/Equipo5_Grupo31.git
    </div>
    <h1 class="title">Modulo Productos</h1>
    <div class="form-content">
    	<div class="form-container">
    		<form action="file" method="post" enctype="multipart/form-data">
    		<div><label>Archivo: </label><input type="text" name="filename"> <input type="file" value="Examinar" name="file" ></div>
    		<div><input type="submit" name="upload" value="cargar arrchivo"></div>
    		</form>
    	</div>
    </div>
    
</body>

</html>