package Modelo;

public class SalesDTO {
	private Long cod_sale;
	private Long Id_customer;
	private Long Id_user;
	private Float iva_sale;
	private Float total_sale;
	private Float sale_;
	
	
	public SalesDTO(Long cod_sale, Long id_customer, Long id_user,
			Float iva_sale, Float total_sale, Float sale_) {
		super();
		this.cod_sale = cod_sale;
		Id_customer = id_customer;
		Id_user = id_user;
		this.iva_sale = iva_sale;
		this.total_sale = total_sale;
		this.sale_ = sale_;
	}

	public Long getCod_sale() {
		return cod_sale;
	}

	public void setCod_sale(Long cod_sale) {
		this.cod_sale = cod_sale;
	}

	public Long getId_customer() {
		return Id_customer;
	}

	public void setId_customer(Long id_customer) {
		Id_customer = id_customer;
	}

	public Long getId_user() {
		return Id_user;
	}

	public void setId_user(Long id_user) {
		Id_user = id_user;
	}

	public Float getIva_sale() {
		return iva_sale;
	}

	public void setIva_sale(Float iva_sale) {
		this.iva_sale = iva_sale;
	}

	public Float getTotal_sale() {
		return total_sale;
	}

	public void setTotal_sale(Float total_sale) {
		this.total_sale = total_sale;
	}

	public Float getSale_() {
		return sale_;
	}

	public void setSale_(Float sale_) {
		this.sale_ = sale_;
	}
	
	

	
	
	
	
}
