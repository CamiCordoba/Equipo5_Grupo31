package Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import Modelo.UsuarioDAO;
import Modelo.UsuarioDTO;

/**
 * Servlet implementation class Usuario
 */
@WebServlet("/Usuario")
public class Usuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Usuario() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UsuarioDAO usuDao= new UsuarioDAO();
		if(request.getParameter("registrar")!=null) {
		Long cedula;
		String email,nombre,pass,user;
		cedula =Long.parseLong(request.getParameter("cedula"));
		email = request.getParameter("email");
		nombre = request.getParameter("nombre");
		pass = request.getParameter("pass");
		user = request.getParameter("user");
		UsuarioDTO usuDto = new UsuarioDTO(cedula,email,nombre,pass,user);
		if(usuDao.Inserta_Usuario(usuDto)) {
			//JOptionPane.showMessageDialog(null, "Usuario registado exitosamente");
			response.sendRedirect("Usuarios.jsp?men=Usuario registrado exitosamente");
		}
		else {
			//JOptionPane.showMessageDialog(null, "El usuario no se pudo registar");
			response.sendRedirect("Usuarios.jsp?men=El usuario no se pudo registrar");
		}
		}
		
		if(request.getParameter("consultar")!=null) {
			
			Long cedula;
			String email, nombre, contraseña, usuario;
			cedula=Long.parseLong(request.getParameter("cedula_usuario"));
			UsuarioDTO usu=usuDao.Buscar_Usuario(cedula);
			if(usu!=null) {
			cedula=usu.getCedula_usuario();
			email=usu.getEmail_usuario();
			nombre=usu.getNombre_usuario();
			contraseña=usu.getPassword();
			usuario=usu.getUsuario();
			//JOptionPane.showMessageDialog(null, contraseña+usuario);
			response.sendRedirect("Usuarios.jsp?cedula="+cedula+"&&email="+email+"&&nombre="+nombre+"&&pass="+contraseña+"&&user="+usuario);
			}else {
				response.sendRedirect("Usuarios.jsp?men=El usuario no existe");
			}
			
		}
		if(request.getParameter("modificar")!=null) {
			Long cedula;
			String email, nombre, contraseña, usuario;
			cedula = Long.parseLong(request.getParameter("cedula"));
			email = request.getParameter("email");
			nombre = request.getParameter("nombre");
			contraseña = request.getParameter("pass");
			usuario = request.getParameter("user");
			UsuarioDTO usuario_act = new UsuarioDTO(cedula,email,nombre,contraseña,usuario);
			if(usuDao.Actualizar_Usuario(usuario_act)) {
				//JOptionPane.showMessageDialog(null, "Libro se Actualizo Exitosamente.");
				response.sendRedirect("Usuarios.jsp?men=Usuario Actualizado Exitosamente.");
			}else {
				//JOptionPane.showMessageDialog(null, "El libro no se Modifico.");
				response.sendRedirect("Usuarios.jsp?men=El usuario no se Modifico.");
			}
			}
		if(request.getParameter("eliminar")!=null) {
			Long cedula;
			cedula = Long.parseLong(request.getParameter("cedula"));
			int op=JOptionPane.showConfirmDialog(null, "Desea eliminar a el usuario con cedula:"+cedula);
			if(op==0) {
			if(usuDao.Eliminar_Usuario(cedula)) {
				response.sendRedirect("Usuarios.jsp?men=Usuario Eliminado");
			}else {
				response.sendRedirect("Usuarios.jsp?men=Usuario no se pudo eliminar");
			}
			}response.sendRedirect("Usuarios.jsp");
		}
	}

}
