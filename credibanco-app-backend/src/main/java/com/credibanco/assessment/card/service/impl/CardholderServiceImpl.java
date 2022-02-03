package com.credibanco.assessment.card.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.credibanco.assessment.card.model.Cardholder;
import com.credibanco.assessment.card.repository.ICardholderRepository;
import com.credibanco.assessment.card.service.ICardholderService;


@Service
public class CardholderServiceImpl implements ICardholderService {

	@Autowired
	private ICardholderRepository cardholderRepository;
	
	@Transactional
	@Override
	public void create(Cardholder cardholder) {
		cardholderRepository.save(cardholder);
	}

	@Override
	public Cardholder findOneById(String id) {
		return cardholderRepository.findById(id).orElse(null);
	}

	
}
