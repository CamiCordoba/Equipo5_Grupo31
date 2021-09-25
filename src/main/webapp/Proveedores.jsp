<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/styles.css">
    <title>Módulo Proveedores</title>
</head>

<body>
    <div class="topnav">
        <a href="Administrador.jsp">Inicio</a>
        <a href="Usuarios.jsp">Usuarios</a>
        <a href="Customers.jsp">Clientes</a>
        <a href="Proveedores.jsp">Proveedores</a>
        <a href="Products.jsp">Productos</a>
        <a href="Sales.jsp">Ventas</a>
        <a href="Reports.jsp">Reportes</a>
    </div>
    <h1 class="title">Modulo Proveedores</h1>
           <div class="form-content">
            <div class="form-container">
                <div>
                    <form>
                        <div class="form-group">
                            <label for="identifier">Nit</label><br>
                            <input type="text" id="identifier" name="identifier"><br>
                        </div>
                        <div class="form-group">
                            <label for="name">Nombre Proveedor</label><br>
                            <input type="text" id="name" name="name">
                        </div>
                        <div class="form-group">
                            <label for="email">Dirección</label><br>
                            <input type="text" id="direction" name="direction">
                        </div>
                    </form>
                </div>
                <div>
                    <form>
                        <div class="form-group">
                            <label for="identifier">Teléfono</label><br>
                            <input type="number" id="phone" name="phone"><br>
                        </div>
                        <div class="form-group">
                            <label for="name">Ciudad</label><br>
                            <input type="text" id="city" name="city">
                        </div>
                    </form>
                </div>
            </div>
            <div class="btn-group">
                <button>Consultar</button>
                <button>Crear</button>
                <button>Actualizar</button>
                <button>Eliminar</button>
            </div>
        </div>
</body>

</html>