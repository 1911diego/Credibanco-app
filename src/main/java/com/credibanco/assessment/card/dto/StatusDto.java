package com.credibanco.assessment.card.dto;

/**
 * Class that model a Status DTO
 * @author dftor
 *
 */
public class StatusDto {

	
	private Long idStatus;
	
	private String description;

	public StatusDto(Long idStatus, String description) {
		this.idStatus = idStatus;
		this.description = description;
	}

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
	
	
	
	
}
