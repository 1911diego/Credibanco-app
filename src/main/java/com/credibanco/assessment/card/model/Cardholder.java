package com.credibanco.assessment.card.model;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	
	@Column(name="id_document_cardholder")
	private String idCardholder;
	
	private String name;
	
	private String telephone;
	
	
	
	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



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


	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}




	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}
