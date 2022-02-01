package com.credibanco.assessment.card.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.credibanco.assessment.card.model.Card;
import com.credibanco.assessment.card.service.ICardService;

/**
 * Class that implements a Card Service
 * @author Diego Torres
 *
 */
@Service
public class CardServiceImpl {

	@Autowired
	private ICardService cardService;
	
	
	public void save (Card card) {
		cardService.save(card);
	}
	
	public Card findOne(String idCard) {
		return cardService.findById(idCard).orElse(null);
	}
	
	public void delete (String idCard) {
		cardService.deleteById(idCard);
	}
}
