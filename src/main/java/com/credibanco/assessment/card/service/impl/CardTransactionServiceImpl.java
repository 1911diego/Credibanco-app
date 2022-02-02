package com.credibanco.assessment.card.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.credibanco.assessment.card.model.CardTransaction;
import com.credibanco.assessment.card.repository.ICardTransactionRepository;

import com.credibanco.assessment.card.service.ICardTransactionService;

@Service
public class CardTransactionServiceImpl implements ICardTransactionService{

	
	@Autowired
	private ICardTransactionRepository transactionRepository;

	@Override
	public void save(CardTransaction cardTransaction) {
		transactionRepository.save(cardTransaction);
		
	}

	@Override
	public CardTransaction findOneById(Long idTransaction) {
		return transactionRepository.findById(idTransaction).orElse(null);
	}

	
	
	
}
