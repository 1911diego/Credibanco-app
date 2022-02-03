package com.credibanco.assessment.card.service;

import com.credibanco.assessment.card.model.Purchase;

public interface IPurchaseService {

	public void save(Purchase purchase);
	
	public Purchase findOneById(Long id);
}
