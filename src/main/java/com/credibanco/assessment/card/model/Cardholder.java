package com.credibanco.assessment.card.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Class that models a Cardholder entity
 * @author Diego Torres
 *
 */

@Entity
@Table(name="Cardholder")
public class Cardholder implements Serializable {


	@Id
	@Column(name="id_cardholder")
	private String idCardholder;
	
	private String telephone;
	
	
	
	public String getIdCardholder() {
		return idCardholder;
	}



	public void setIdCardholder(String idCardholder) {
		this.idCardholder = idCardholder;
	}



	public String getTelephone() {
		return telephone;
	}



	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}
