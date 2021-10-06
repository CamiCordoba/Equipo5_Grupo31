package Controlador;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import javax.swing.JOptionPane;

import Modelo.ProductsDAO;

@WebServlet("/Products")
@MultipartConfig

public class Products extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Products() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ProductsDAO productDao = new ProductsDAO();

        if (request.getParameter("cargar") != null) {
            Part archivo = request.getPart("archivo");
            String nombre = request.getParameter("nombreArch");
            // JOptionPane.showMessageDialog(null, archivo.getSubmittedFileName());
            String Url = "C:\\Users\\vivis\\eclipse-workspace\\Prestamos_31\\src\\main\\webapp\\Doc\\";
            // JOptionPane.showMessageDialog(null, Url);
            try {
                InputStream file = archivo.getInputStream();
                File copia = new File(Url + nombre + ".csv");
                FileOutputStream escribir = new FileOutputStream(copia);
                int num = file.read();
                while (num != -1) {
                    escribir.write(num);
                    num = file.read();
                }
                escribir.close();
                file.close();
                JOptionPane.showMessageDialog(null, "Archivo Cargado Correctamente");
                if (productDao.Cargar_Productos(Url + nombre + ".csv")) {
                    JOptionPane.showMessageDialog(null, "Productos Registrado Correctamente");
                } else {
                    JOptionPane.showMessageDialog(null, "Productos no se Registraron");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al cargar Archivo" + e);
            }
        }
    }
}
