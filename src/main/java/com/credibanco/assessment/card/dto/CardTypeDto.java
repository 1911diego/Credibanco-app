package com.credibanco.assessment.card.dto;


/**
 * Class that model a CardType DTO
 * @author Diego Torres
 *
 */
public class CardTypeDto {

	
	private Long idCardType;
	
	private String description;
	
	
	public CardTypeDto(Long idCardType,String description) {
		this.idCardType = idCardType;
		this.description = description;
	}


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
	
	
	
}
