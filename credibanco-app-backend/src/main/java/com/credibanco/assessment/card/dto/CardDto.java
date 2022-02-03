package com.credibanco.assessment.card.dto;

import java.io.Serializable;

/**
 * Class that models a card Dto
 * @author Diego Torres
 *
 */
public class CardDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String idCard;
	
	private Integer validationNumber;
	
	private String pan;
	
	private String idCardholder;
	
	private String name;
	
	private String telephone;
	
	private Long status;
	
	private Long typeCard;

	public CardDto(String idCard, Integer validationNumber, String pan, String idCardholder, String name,
			String telephone, Long status,Long typeCard) {
		this.idCard = idCard;
		this.validationNumber = validationNumber;
		this.pan = pan;
		this.idCardholder = idCardholder;
		this.name = name;
		this.telephone = telephone;
		this.status = status;
		this.typeCard = typeCard;
	}
	
	
	public CardDto(String idCard,String pan,Integer validationNumber) {
		this.idCard = idCard;
		this.pan = pan;
		this.validationNumber = validationNumber;
	}
	
	public CardDto(String pan,String name,String idCardholder,String telephone,Long status) {
		this.pan = pan;
		this.name = name;
		this.idCardholder = idCardholder;
		this.telephone = telephone;
		this.status = status;
	}
	

	
	public CardDto() {
		
	}




	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public Integer getValidationNumber() {
		return validationNumber;
	}

	public void setValidationNumber(Integer validationNumber) {
		this.validationNumber = validationNumber;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getIdCardholder() {
		return idCardholder;
	}

	public void setIdCardholder(String idCaldholder) {
		this.idCardholder = idCaldholder;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Long getStatus() {
		return status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	public Long getTypeCard() {
		return typeCard;
	}

	public void setTypeCard(Long typeCard) {
		this.typeCard = typeCard;
	}



	@Override
	public String toString() {
		return "CardDto [idCard=" + idCard + ", validationNumber=" + validationNumber + ", pan=" + pan
				+ ", idCardholder=" + idCardholder + ", name=" + name + ", telephone=" + telephone + ", status="
				+ status + ", typeCard=" + typeCard + "]";
	}
	
	
	
	
	
}
