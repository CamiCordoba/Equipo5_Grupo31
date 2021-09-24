<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/styles.css">
<title>Usuarios</title>
</head>
<body>
<%!String mensaje=""; 
Long cedula;      //CLASE MINUTO 1:10:59
String email="",nombre="",pass="",user="",estado="";%>
<%
if(request.getParameter("cedula")!=null){
cedula=Long.parseLong(request.getParameter("cedula"));
email=request.getParameter("email");
nombre=request.getParameter("nombre");
pass=request.getParameter("pass");
user=request.getParameter("user");
//estado="disabled";
estado="readonly";
}
%>
<%
if(request.getParameter("men")!=null){
cedula=null;
email="";
nombre="";
pass="";
user="";
estado="";
mensaje=request.getParameter("men");
out.print("<script>alert('"+mensaje+"')</script>");//Mensaje con alert de js
}
%>
<div class="topnav">
        <a href="Administrador.jsp">Inicio</a>
        <a href="Usuarios.jsp">Usuarios</a>
        <a href="clients.html">Clientes</a>
        <a href="provider.html">Proveedores</a>
        <a href="products.html">Productos</a>
        <a href="sales.html">Ventas</a>
        <a href="report.html">Reportes</a>
    </div>
    <h1 class="title">TIC SUPPS</h1>
    
<!-- ____________________________________________________________________________________
<fieldset>
<legend>Datos del usuario</legend>
<form action="Usuario" method="post">
<div><label>Cedula: </label><input type="number" name="cedula" value="<%=cedula %>" required <%=estado %>></div>
<div><label>Email: </label><input type="text" name="email" value="<%=email %>"></div>
<div><label>Nombre: </label><input type="text" name="nombre" value="<%=nombre %>"></div>
<div><label>Contraseña: </label><input type="text" name="pass" value="<%=pass %>"></div>
<div><label>Usuario: </label><input type="text" name="user" value="<%=user %>"></div>
<div><input type="submit" name="registrar" value="registrar">
<input type="submit" name="modificar" value="modificar">
<input type="submit" name="eliminar" value="eliminar"></div>
</form>
</fieldset>

<form action="Usuario" method="post">
<fieldset>
<legend>Consultar</legend>
<div><label>Cedula: </label><input type="number" name="cedula_usuario" required></div>
<input type="submit" name="consultar" value="consultar">
</fieldset>
</form>
 _______________________________________________________________________________ -->
      <form action="Usuario" method="post">
      <div class="form-content">
            <div class="form-container">
                <div>
                    <form>
                        <div class="form-group">
                            <label for="identifier">Cedula</label><br>
                            <input type="number" name="cedula" value="<%=cedula %>" required <%=estado %>><br>
                        </div>
                        <div class="form-group">
                            <label for="name">Nombre</label><br>
                            <input ttype="text" name="nombre" value="<%=nombre %>">
                        </div>
                        <div class="form-group">
                            <label for="email">Email</label><br>
                            <input type="text" name="email" value="<%=email %>">
                        </div>
                    </form>
                </div>
                <div>
                    <form>
                        <div class="form-group">
                            <label for="identifier">Usuario</label><br>
                            <input type="text" name="user" value="<%=user %>"><br>
                        </div>
                        <div class="form-group">
                            <label for="name">Contraseña</label><br>
                            <input type="password" name="pass" value="<%=pass %>">
                        </div>
                    </form>
                </div>
            </div>
            
            <div class="btn-group">
                <div><input type="submit" name="registrar" value="registrar">
				<input type="submit" name="modificar" value="modificar">
				<input type="submit" name="eliminar" value="eliminar">
				<!--  <input type="reset" value="Refrescar">--></div>
				</form>
				<fieldset>
				<legend>Consultar</legend>
				<form action="Usuario" method="post">
					<div class="form-container"><label for="identifier">Cedula</label><br>
					<input type="number" name="cedula_usuario" required></div>
					<input type="submit" name="consultar" value="consultar">
					</form>
					</fieldset>
            </div>
        </div>
</body>
</html>