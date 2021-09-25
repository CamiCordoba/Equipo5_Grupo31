package Modelo;

//Clase para transferir datos del Objeto 

public class CustomerDTO {
	private Long Id;
	private String address;
	private String email;
	private String name;
	private String phone;
	
//INICIALIZANDO MI OBJETO CUSTOMER---CONSTRUCTOR----	
	public CustomerDTO(Long id, String address, String email, String name, String phone) {
		super();
		Id = id;
		this.address = address;
		this.email = email;
		this.name = name;
		this.phone = phone;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	
}
