package com.credibanco.assessment.card.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.credibanco.assessment.card.model.Card;
import com.credibanco.assessment.card.repository.ICardRepository;
import com.credibanco.assessment.card.service.ICardService;

/**
 * Class that implements a Card Service
 * @author Diego Torres
 *
 */
@Service
public class CardServiceImpl implements ICardService {

	
	@Autowired
	private ICardRepository cardRepository;
	
	
	@Override
	public void save(Card card) {
		cardRepository.save(card);
		
	}

	@Override
	public Card findOneById(String idCard) {
		return cardRepository.findById(idCard).orElse(null);	
	}


	@Override
	public void deleteById(String idCard) {
		cardRepository.deleteById(idCard);
	}

	
}
