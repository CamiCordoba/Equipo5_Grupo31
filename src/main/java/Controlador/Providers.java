package Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import Modelo.CustomerDAO;
import Modelo.CustomerDTO;


@WebServlet("/Providers")
public class Providers extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final providerDTO ProvDto = null;
  
    public Providers() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
ProviderDAO ProvDao = new ProviderDAO();
		
		if (request.getParameter("create")!=null) {
			long NIT;
			String  city,address,name,phone;
			NIT = Long.parseLong(request.getParameter("NIT"));
			city = request.getParameter("city");
			address = request.getParameter("address");
			name = request.getParameter("name");
			phone = request.getParameter("phone");
			providerDTO ProvDto = new providerDTO(NIT,city,address,name,phone);
			if(ProvDao.createProvider(ProvDto)) {
				//JOptionPane.showMessageDialog(null, "Proveedor creado exitosamente....");
				response.sendRedirect("Providers.jsp?sten=Proveedor creado exitosamente ");
			}else {
				//JOptionPane.showMessageDialog(null, "Registro fallido");
				response.sendRedirect("Providers.jsp?sten=Registro fallido");
				}
			}
		
		if(request.getParameter("read")!=null) {
			long NIT;
			String  city,address,name,phone;
			NIT = Long.parseLong(request.getParameter("NIT"));
			providerDTO ProvDto = ProvDao.readprovider(NIT);
			if(ProvDto!=null) {
			NIT = ProvDto.getNIT();
			city = ProvDto.getCity();
			address = ProvDto.getAddress();
			name = ProvDto.getName();
			phone = ProvDto.getPhone();
			response.sendRedirect("Providers.jsp?NIT="+NIT+"&&city="+city+"&&address="+address+"&&name="+name+"&&phone="+phone);
			}else {
				response.sendRedirect("Providers.jsp?sten=El proveedor no existe en la base de datos");
			}
			}
		
		if(request.getParameter("update")!=null) {
			long NIT;
			String  city,address,name,phone;
			NIT=Long.parseLong(request.getParameter("NIT"));
			city=request.getParameter("city");
			address=request.getParameter("address");
			name=request.getParameter("name");
			phone=request.getParameter("phone");
			providerDTO ProvDto = new providerDTO(NIT,city,address,name,phone);
			if(ProvDao.updateprovider(ProvDto)) {
				//JOptionPane.showMessageDialog(null, "Proveedor actualizado exitosamente");
				response.sendRedirect("Providers.jsp?sten=Proveedor actualizado exitosamente");
			}else {
				//JOptionPane.showMessageDialog(null, "Error al actualizar");
				response.sendRedirect("Providers.jsp?sten=Error al actualizar");
			}
			}
		
		
		if (request.getParameter("delete")!=null) {
			long NIT;
			
			NIT=Long.parseLong(request.getParameter("NIT"));
			int option=JOptionPane.showConfirmDialog(null, "Desea eliminar el proveedor con NIT: "+NIT);
			if(option==0) {
				if(ProvDao.deleteprovider(NIT)) {
					response.sendRedirect("Providers.jsp?sten=Proveedor eliminado exitosamente");
					}
				}else {
					response.sendRedirect("Providers.jsp");
				}
			}
		
		
	}

}
