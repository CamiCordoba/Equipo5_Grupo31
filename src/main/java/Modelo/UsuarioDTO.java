package Modelo;

public class UsuarioDTO {
	
	private Long cedula_usuario;
	private String email_usuario;
	private String nombre_usuario;
	private String password;
	private String usuario;
	
	public UsuarioDTO(Long cedula_usuario, String email_usuario, String nombre_usuario, String password,
			String usuario) {
		super();
		this.cedula_usuario = cedula_usuario;
		this.email_usuario = email_usuario;
		this.nombre_usuario = nombre_usuario;
		this.password = password;
		this.usuario = usuario;
	}

	public Long getCedula_usuario() {
		return cedula_usuario;
	}

	public void setCedula_usuario(Long cedula_usuario) {
		this.cedula_usuario = cedula_usuario;
	}

	public String getEmail_usuario() {
		return email_usuario;
	}

	public void setEmail_usuario(String email_usuario) {
		this.email_usuario = email_usuario;
	}

	public String getNombre_usuario() {
		return nombre_usuario;
	}

	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
}
