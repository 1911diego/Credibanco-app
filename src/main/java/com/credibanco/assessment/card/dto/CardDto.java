package com.credibanco.assessment.card.dto;

/**
 * Class that models a Card DTO
 * @author Diego Torres
 *
 */
public class CardDto {

	private String idCard;
	
	private String pan;
	
	private Integer validationNumber;
	
	private StatusDto status;
	
	private CardTypeDto cardType;
	
	private CardholderDto cardholder;

	public CardDto(String idCard, String pan, Integer validationNumber, StatusDto status, CardTypeDto cardType,
			CardholderDto cardholder) {
		this.idCard = idCard;
		this.pan = pan;
		this.validationNumber = validationNumber;
		this.status = status;
		this.cardType = cardType;
		this.cardholder = cardholder;
	}

	
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

	public StatusDto getStatus() {
		return status;
	}

	public void setStatus(StatusDto status) {
		this.status = status;
	}

	public CardTypeDto getCardType() {
		return cardType;
	}

	public void setCardType(CardTypeDto cardType) {
		this.cardType = cardType;
	}

	public CardholderDto getCardholder() {
		return cardholder;
	}

	public void setCardholder(CardholderDto cardholder) {
		this.cardholder = cardholder;
	}
	
	
	
	
	
}
