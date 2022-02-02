package com.credibanco.assessment.card.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
	
	@Column(name="creation_date")
	private Date creationDate;
	
	@JoinColumn(name="fk_status",referencedColumnName = "id_status")
	@ManyToOne
	private Status status;
	
	
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

	




	public Status getStatus() {
		return status;
	}





	public void setStatus(Status status) {
		this.status = status;
	}


	




	public Date getCreationDate() {
		return creationDate;
	}





	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}







	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
}
