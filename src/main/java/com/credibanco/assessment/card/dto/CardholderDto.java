package com.credibanco.assessment.card.dto;


/**
 * Class that models a Cardholder DTO
 * @author Diego Torres
 *
 */
public class CardholderDto {

	private String idCardholder;
	
	private String telephone;

	public CardholderDto(String idCardholder, String telephone) {
		this.idCardholder = idCardholder;
		this.telephone = telephone;
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
	
	
	
	
}
