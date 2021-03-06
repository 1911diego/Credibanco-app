package com.credibanco.assessment.card.dto;

import java.io.Serializable;

/**
 * Class that models a CardTransaction DTO
 * @author Diego Torres
 *
 */
public class CardTransactionDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String idCard;
	
	private Long idTransaction;
	
	private Double total;
	
	private String address;
	
	private String status;
	
	

	public CardTransactionDto(String idCard, Long idPurchase, Double total, String address, String status) {
		this.idCard = idCard;
		this.idTransaction = idPurchase;
		this.total = total;
		this.address = address;
		this.status = status;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	

	public Long getIdTransaction() {
		return idTransaction;
	}

	public void setIdTransaction(Long idTransaction) {
		this.idTransaction = idTransaction;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
}
