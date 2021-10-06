<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/stylesVentas.css">
</head>
<body>
<div class="topnav"> <!-- cambiar el hipervinculo en todos -->
        <a href="Administrador.jsp">Inicio</a>
        <a href="Usuarios.jsp">Usuarios</a>
        <a href="clients.html">Clientes</a>
        <a href="provider.html">Proveedores</a>
        <a href="products.html">Productos</a>
        <a href="Ventas.jsp">Ventas</a>
        <a href="report.html">Reportes</a>
    </div>
    <h1 class="title">TIC SUPPS</h1>

    <form action="Usuario" method="post">
      <div class="form-content">
            <div class="form-container">
                <div>
                    <form>
                        <div class="form-group">
                            <label for="identifier">Cedula</label>
                            <input type="number" name="cedula">
                            <input type="submit" name="consultar_cedulaCliente" value="Consultar" id="boton">
                            <label for="identifier">Cliente</label>
                            <input type="text" name="cliente">
                            <label for="identifier">Consec</label>
                            <input type="text" name="consec"> <br>
                            
                            <label for="identifier">Cedula</label>
                            <input type="number" name="cedula">
                            <input type="submit" name="consultar_cedulaUsuario" value="Consultar" id="boton">
                            <label for="identifier">Usuario</label>
                            <input type="text" name="usuario">
                          
                       
                        	<br><br> 
                            <label for="name" id="titulo_columna">Cod. Producto-</label><label for="name" id="titulo_columna">Nombre Producto-</label><label for="name" id="titulo_columna">Vlr. Unitario-</label><label for="name" id="titulo_columna">Cant-</label><label for="name" id="titulo_columna">Vlr. Total</label><br>
                            <input type="text" name="cod_producto1" value="">
                            <input type="submit" name="Consultar_producto1" value="Consultar" id="boton">
                            <input type="text" name="nombre_producto1" value="">
                            <input type="text" name="valorUnitarioP1" value="">
                            <input type="text" name="cantidad_producto1" value="" id="cantidad">
                            <input type="submit" name="ok1" value="ok" id="boton">
                            <input type="text" name="valorTotalP1" value=""><br>
                            
                            <input type="text" name="cod_producto1" value="">
                            <input type="submit" name="Consultar_producto2" value="Consultar" id="boton">
                            <input type="text" name="nombre_producto2" value="">
                            <input type="text" name="valorUnitarioP2" value="">
                            <input type="text" name="cantidad_producto2" value="" id="cantidad">
                            <input type="submit" name="ok2" value="ok" id="boton">
                            <input type="text" name="valorTotalP2" value=""><br>
                            
                            <input type="text" name="cod_producto3" value="">
                            <input type="submit" name="Consultar_producto3" value="Consultar" id="boton">
                            <input type="text" name="nombre_producto3" value="">
                            <input type="text" name="valorUnitarioP3" value="">
                            <input type="text" name="cantidad_producto3" value="" id="cantidad">
                            <input type="submit" name="ok3" value="ok" id="boton">
                            <input type="text" name="valorTotalP3" value=""><br>
                           </div>
                           <div class="form-group1">
                            <label for="name">Total Venta</label>
                            <input type="text" name="total_venta"><br>
                            <label for="name">Total IVA</label>
                            <input type="text" name="total_iva"><br>
                            <label for="name">Total con IVA</label>
                            <input type="text" name="total_con_iva"><br>
                            
                            <input type="submit" name="calcular" value="Calcular" id="boton">
                            <input type="submit" name="confirmar" value="Confirmar" id="boton">
                        	</div>
                        	</form>
                        	</div>
                        	</div>
                        	</div>
                        	</form>
</body>
</html>