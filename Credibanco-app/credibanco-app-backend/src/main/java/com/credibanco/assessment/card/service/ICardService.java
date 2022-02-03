package com.credibanco.assessment.card.service;

import com.credibanco.assessment.card.model.Card;

public interface ICardService {

	public void save(Card card);
	
	public Card findOneById(String idCard);
	
	public void deleteById(String idCard);
}
