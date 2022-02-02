package com.credibanco.assessment.card.service;

import com.credibanco.assessment.card.model.Cardholder;

public interface ICardholderService {

	public void create(Cardholder cardholder);
	
	public Cardholder findOneById(String id);
	
}
