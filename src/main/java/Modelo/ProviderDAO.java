
package Controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ProviderDAO {
	
	Conexion cnn= new Conexion();
	Connection con= cnn.Conectar();
	PreparedStatement ps= null; 
	ResultSet result= null; 
	
	public boolean createProvider(providerDTO provider) {
		boolean result=false;
		try {
			String sql="INSERT INTO providers VALUES(?,?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setLong(1, provider.getNIT());
			ps.setString(2, provider.getCity());
			ps.setString(3, provider.getAddress());
			ps.setString(4, provider.getName());
			ps.setString(5, provider.getPhone());
			result=ps.executeUpdate()>0;
		}catch(SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error al crear"+ex);
		}
		
		return result;
	}
	
	public providerDTO readprovider(Long NIT) {
		providerDTO provider = null;
		try {
			String sql="select* from providers where NIT_provider=?";
			ps = con.prepareStatement(sql);
			ps.setLong(1, NIT);
			result=ps.executeQuery();
			
			while(result.next()) {
				provider = new providerDTO(result.getLong(1),result.getString(2),result.getString(3),result.getString(4),result.getString(5));
			}
		}catch(SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error al leer"+ex);
			}
		return provider;
		}
	
	public boolean updateprovider(providerDTO provider) {
		boolean result=false;
		try {
			String sql="update providers set address_provider=?,city_provider=?,full_name=?,phone_number=? where NIT_provider=?";
			ps = con.prepareStatement(sql);
			
			ps.setLong(1, provider.getNIT());
			ps.setString(2, provider.getCity());
			ps.setString(3, provider.getAddress());
			ps.setString(4, provider.getName());
			ps.setString(5, provider.getPhone());
			result=ps.executeUpdate()>0;
			}catch(SQLException ex) {
				JOptionPane.showMessageDialog(null,"Error al actualizar"+ex);
			}
		return result;
		}
	
	public boolean deleteprovider(Long NIT) {
		boolean result=false;
		try {
			String sql="delete from providers where NIT_provider=?";
			ps = con.prepareStatement(sql);
			ps.setLong(1, NIT);
			result=ps.executeUpdate()>0;
			}catch(SQLException ex) {
				JOptionPane.showMessageDialog(null,"Error al eliminar"+ex);
			}
		return result;
		}
	
	
	
	

}

