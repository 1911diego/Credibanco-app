package com.credibanco.assessment.card.dto;

import javax.validation.constraints.NotNull;

/**
 * Class that model a Purchase DTO
 * @author Diego Torres
 *
 */
public class PurchaseDto {

	
	private Long idPurchase;
	
	@NotNull
	private String address;
	
	@NotNull
	private Double total;

	public PurchaseDto(Long idPurchase, @NotNull String address, @NotNull Double total) {
		this.idPurchase = idPurchase;
		this.address = address;
		this.total = total;
	}

	public Long getIdPurchase() {
		return idPurchase;
	}

	public void setIdPurchase(Long idPurchase) {
		this.idPurchase = idPurchase;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
	
	
	
	
	
}
