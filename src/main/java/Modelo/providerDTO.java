
package Controlador;


public class providerDTO {
	
		private Long NIT;
		private String city;
		private String address;
		private String name;
		private String phone;
		
		
		public providerDTO(Long nIT, String city, String address, String name, String phone) {
			super();
			NIT = nIT;
			this.city = city;
			this.address = address;
			this.name = name;
			this.phone = phone;
		}


		public Long getNIT() {
			return NIT;
		}


		public void setNIT(Long nIT) {
			NIT = nIT;
		}


		public String getCity() {
			return city;
		}


		public void setCity(String city) {
			this.city = city;
		}


		public String getAddress() {
			return address;
		}


		public void setAddress(String address) {
			this.address = address;
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

