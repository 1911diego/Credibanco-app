package com.credibanco.assessment.card.service;

import com.credibanco.assessment.card.model.CardType;

public interface ICardTypeService {
	
	public CardType findOneById(Long id);
	
	public CardType findByName(String name);

}
