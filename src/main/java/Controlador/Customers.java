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

/**
 * Servlet implementation class Customers
 */
@WebServlet("/Customers")
public class Customers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Customers() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CustomerDAO custDao = new CustomerDAO();
		
		if (request.getParameter("create")!=null) {
			Long ID;
			String address,email,name,phone;
			ID = Long.parseLong(request.getParameter("id"));
			address = request.getParameter("address");
			email = request.getParameter("email");
			name = request.getParameter("name");
			phone = request.getParameter("phone");
			CustomerDTO custDto = new CustomerDTO(ID,address,email,name,phone);
			if(custDao.createCustomer(custDto)) {
				//JOptionPane.showMessageDialog(null, "Cliente creado exitosamente....");
				response.sendRedirect("Customers.jsp?sten=Cliente creado exitosamente ");
			}else {
				//JOptionPane.showMessageDialog(null, "Registro fallido");
				response.sendRedirect("Customers.jsp?sten=Registro fallido");
				}
			}
		
		if(request.getParameter("read")!=null) {
			long ID;
			String address,email,name,phone;
			ID = Long.parseLong(request.getParameter("ID"));
			CustomerDTO custDto = custDao.readCustomer(ID);
			if(custDto!=null) {//Validacion el cliente no existe
			ID = custDto.getId();
			address = custDto.getAddress();
			email = custDto.getEmail();
			name = custDto.getName();
			phone = custDto.getPhone();
			response.sendRedirect("Customers.jsp?ID="+ID+"&&address="+address+"&&email="+email+"&&name="+name+"&&phone="+phone);
			}else {
				response.sendRedirect("Customers.jsp?sten=El cliente no existe en la base de datos");
			}
			}
		
		if(request.getParameter("update")!=null) {
			long ID;
			String address,email,name,phone;
			ID=Long.parseLong(request.getParameter("i_d"));
			address=request.getParameter("address");
			email=request.getParameter("email");
			name=request.getParameter("name");
			phone=request.getParameter("phone");
			CustomerDTO custDto = new CustomerDTO(ID,address,email,name,phone);
			if(custDao.updateCustomer(custDto)) {
				//JOptionPane.showMessageDialog(null, "Cliente actualizado exitosamente");
				response.sendRedirect("Customers.jsp?sten=Cliente actualizado exitosamente");
			}else {
				//JOptionPane.showMessageDialog(null, "Error al actualizar");
				response.sendRedirect("Customers.jsp?sten=Error al actualizar");
			}
			}
		if (request.getParameter("delete")!=null) {
			long ID;
			ID=Long.parseLong(request.getParameter("i_d"));
			int option=JOptionPane.showConfirmDialog(null, "Desea eliminar el cliente con identificacion: "+ID);
			if(option==0) {
				if(custDao.deleteCustomer(ID)) {
					response.sendRedirect("Customers.jsp?sten=Cliente eliminado exitosamente");
					}
				}else {
					response.sendRedirect("Customers.jsp");
				}
			}
		}
	}
