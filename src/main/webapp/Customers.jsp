<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/styles.css">
    <title>Modulo Clientes</title>
</head>

<body>

<%!String stencil=""; 
String address="",email="",name="",phone="",estado="";
long ID=0;
%>
<%
if(request.getParameter("ID")!=null){
	ID=Long.parseLong(request.getParameter("ID"));
	address=request.getParameter("address");
	email=request.getParameter("email");
	name=request.getParameter("name");
	phone=request.getParameter("phone");
	estado="disabled";
	}
%>

<%
if(request.getParameter("sten")!=null){
	ID=0;
	address="";
	email="";
	name="";
	phone="";
	estado="";
	stencil=request.getParameter("sten");
	out.print("<script>alert('"+stencil+"')</script>");
	}
%>

<div class="container">        
   <div class="topnav">
      <a href="Administrador.jsp">Inicio</a>
      <a href="Usuarios.jsp">Usuarios</a>
      <a href="Customers.jsp">Clientes</a>
      <a href="Proveedores.jsp">Proveedores</a>
      <a href="products.jsp">Productos</a>
      <a href="Sales.jsp">Ventas</a>
      <a href="Reports.jsp">Reportes</a>
   </div>
        
<h1 class="title">Modulo Clientes</h1>
   
   <form action="Customers" method="post">
      <fieldset>
         <div class="form-content">
            <div class="form-container">
               
               <div class="form-group">
                  <label for="id">ID:</label><br>
                  <input type="number" id="id" name="id" value ="<%=ID%>"required <%=estado%>>
                  <input type="hidden" name="i_d" value ="<%=ID%>">
               </div>

               <div class="form-group">
                  <label for="address">Address:</label><br>
                  <input type="text" id="address" name="address" value ="<%=address%>"required>
               </div>
   
               <div class="form-group">
                  <label for="email">Email:</label><br> 
                  <input type="email" id="email" name="email" value ="<%=email%>"required>
               </div>

               <div class="form-group">
                  <label for="name">Name:</label>
                  <input type="text" id="name" name="name" value ="<%=name %>"required>
               </div>

               <div class="form-group">
                  <label for="phone">Phone:</label>
                  <input type="text" id="phone" name="phone" value ="<%=phone%>"required>
              </div>
           </div>
           
              <div>
                 <input type="submit" name="create" value = Create>
                 <input type="submit" name="update" value = Update>
                 <input type="submit" name="delete" value = Delete>
             </div>
         </div>
      </fieldset>
   </form>

   <form action="Customers" method="post">
      <fieldset>
      
         <div class="form-content">
            
            <div class="form-container">
               
               <div class="form-group">
                  <label for=ID>ID:</label>
                  <input type="text" id="ID" name="ID" required>
               </div>            <!-- name:--servlet al metodo do post cuando hago click en consultar -->
            </div>
            
               <div>
                  <input type="submit" name="read" value = Read>
               </div>
          </div>
      </fieldset>
   </form>
</div>

<!--  -->
   
  



</body>
</html>