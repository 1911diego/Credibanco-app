package com.credibanco.assessment.card.service;

import com.credibanco.assessment.card.model.CardTransaction;

public interface ICardTransactionService {

	public void save(CardTransaction cardTransaction);
	
	public CardTransaction findOneById(Long idTransaction);
	
}
