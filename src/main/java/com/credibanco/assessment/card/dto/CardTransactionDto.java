package com.credibanco.assessment.card.dto;


/**
 * Class that model a CardTransaction DTO
 * @author dftor
 *
 */
public class CardTransactionDto {

	
	private Long idCardTransaction;
	
	private PurchaseDto purchase;
	
	private CardDto card;
	

	public CardTransactionDto(Long idCardTransaction, PurchaseDto purchase, CardDto card) {
		this.idCardTransaction = idCardTransaction;
		this.purchase = purchase;
		this.card = card;
	}

	public Long getIdCardTransaction() {
		return idCardTransaction;
	}

	public void setIdCardTransaction(Long idCardTransaction) {
		this.idCardTransaction = idCardTransaction;
	}

	public PurchaseDto getPurchase() {
		return purchase;
	}

	public void setPurchase(PurchaseDto purchase) {
		this.purchase = purchase;
	}

	public CardDto getCard() {
		return card;
	}

	public void setCard(CardDto card) {
		this.card = card;
	}
	
	
	
}
