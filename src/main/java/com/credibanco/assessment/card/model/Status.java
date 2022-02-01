package com.credibanco.assessment.card.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Class that models a Status Entity
 * @author Diego Torres
 *
 */
@Entity
@Table(name = "Status")
public class Status implements Serializable {

	
	@Id
	@Column(name = "id_status")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idStatus;
	
	private String description;
	


	public Long getIdStatus() {
		return idStatus;
	}


	public void setIdStatus(Long idStatus) {
		this.idStatus = idStatus;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}




	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
}
