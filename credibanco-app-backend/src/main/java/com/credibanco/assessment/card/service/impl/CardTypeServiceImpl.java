package com.credibanco.assessment.card.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.credibanco.assessment.card.model.CardType;
import com.credibanco.assessment.card.repository.ICardTypeRepository;
import com.credibanco.assessment.card.service.ICardTypeService;

@Service
public class CardTypeServiceImpl implements ICardTypeService{

	@Autowired
	private ICardTypeRepository cardTypeRepository;
	
	
	@Override
	public CardType findOneById(Long id) {
		return cardTypeRepository.findById(id).orElse(null);
	}


	@Override
	public CardType findByName(String name) {
		return cardTypeRepository.findByName(name);
	}

}
