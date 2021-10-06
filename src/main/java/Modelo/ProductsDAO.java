package Modelo;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

import Controlador.Conexion;

public class ProductsDAO {
	Conexion cnn = new Conexion();
	Connection con = cnn.Conectar();
	PreparedStatement ps = null;

	public boolean Cargar_Productos(String Url) {
		boolean resul = false;
		try {
			String sql = "load data infile '" + Url
					+ "' into table productos fields terminated by ',' lines terminated by '\r\n'";
			ps = con.prepareStatement(sql);
			// ps.setString(1, Url);
			resul = ps.executeUpdate() > 0;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "error al insertar Productos: " + ex);
		}
		return resul;

	}
}
