package com.credibanco.assessment.card.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Class that models a CardType Entity
 * @author Diego Torres
 *
 */

@Entity
@Table(name="Card_type")
public class CardType implements Serializable {

	
	@Id
	@Column(name="id_card_type")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCardType;
	
	private String description;
	


	public Long getIdCardType() {
		return idCardType;
	}


	public void setIdCardType(Long idCardType) {
		this.idCardType = idCardType;
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
