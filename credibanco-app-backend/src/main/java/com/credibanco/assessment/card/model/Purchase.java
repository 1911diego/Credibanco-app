package com.credibanco.assessment.card.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Class that models a Purchase entity
 * @author Diego Torres
 *
 */

@Entity
@Table(name="Purchase")
public class Purchase implements Serializable {

	
	@Id
	@Column(name="id_purchase")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPurchase;
	
	@NotNull
	private String address;
	
	@NotNull
	private Double total;
	
	

	public Long getIdPurchase() {
		return idPurchase;
	}






	public void setIdPurchase(Long idPurchase) {
		this.idPurchase = idPurchase;
	}






	public String getAddress() {
		return address;
	}






	public void setAddress(String address) {
		this.address = address;
	}






	public Double getTotal() {
		return total;
	}






	public void setTotal(Double total) {
		this.total = total;
	}






	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
}
