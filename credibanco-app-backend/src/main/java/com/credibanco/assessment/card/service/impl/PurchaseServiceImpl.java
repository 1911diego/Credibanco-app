package com.credibanco.assessment.card.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.credibanco.assessment.card.model.Purchase;
import com.credibanco.assessment.card.repository.IPurchaseRepository;
import com.credibanco.assessment.card.service.IPurchaseService;

@Service
public class PurchaseServiceImpl implements IPurchaseService {

	@Autowired
	private IPurchaseRepository purchaseRepository;
	
	
	@Override
	public Purchase findOneById(Long id) {
		return purchaseRepository.findById(id).orElse(null);
	}


	@Override
	public void save(Purchase purchase) {
		purchaseRepository.save(purchase);
	}

}
