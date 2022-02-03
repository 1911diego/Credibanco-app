package com.credibanco.assessment.card.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Class that models a Card Entity
 * @author dftor
 *
 */
@Entity
public class Card implements Serializable {

	
	@Id
	@Column(name="id_card")
	private String idCard;
	
	@Column(name="PAN")
	private String pan;
	
	@Column(name="validation_number")
	private Integer validationNumber;
	
	@JoinColumn(name = "fk_status",referencedColumnName = "id_status")
	@ManyToOne
	private Status status;
	
	@JoinColumn(name="fk_card_type",referencedColumnName = "id_card_type")
	@ManyToOne
	private CardType cardType;
	
	@JoinColumn(name="fk_cardholder",referencedColumnName = "id_cardholder")
	@ManyToOne
	private Cardholder cardholder;
	
	
	
	
	public String getIdCard() {
		return idCard;
	}




	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}




	public String getPan() {
		return pan;
	}




	public void setPan(String pan) {
		this.pan = pan;
	}




	public Integer getValidationNumber() {
		return validationNumber;
	}




	public void setValidationNumber(Integer validationNumber) {
		this.validationNumber = validationNumber;
	}




	public Status getStatus() {
		return status;
	}




	public void setStatus(Status status) {
		this.status = status;
	}




	public CardType getCardType() {
		return cardType;
	}




	public void setCardType(CardType cardType) {
		this.cardType = cardType;
	}




	public Cardholder getCardholder() {
		return cardholder;
	}




	public void setCardholder(Cardholder cardholder) {
		this.cardholder = cardholder;
	}




	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
