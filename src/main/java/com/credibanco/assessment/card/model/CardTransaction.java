package com.credibanco.assessment.card.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Class that models a CarTransaction Entity
 * @author Diego Torres
 *
 */

@Entity
@Table(name="Card_transaction")
public class CardTransaction implements Serializable {

	

	@Id
	private Long idCardTransaction;
	
	@JoinColumn(name="fk_purchase",referencedColumnName = "id_purchase")
	@OneToOne
	private Purchase purchase;
	
	@JoinColumn(name="fk_card",referencedColumnName = "id_card")
	@ManyToOne
	private Card card;
	
	
	
	
	public Long getIdCardTransaction() {
		return idCardTransaction;
	}





	public void setIdCardTransaction(Long idCardTransaction) {
		this.idCardTransaction = idCardTransaction;
	}





	public Purchase getPurchase() {
		return purchase;
	}





	public void setPurchase(Purchase purchase) {
		this.purchase = purchase;
	}





	public Card getCard() {
		return card;
	}





	public void setCard(Card card) {
		this.card = card;
	}





	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
}
