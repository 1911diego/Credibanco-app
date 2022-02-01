package com.credibanco.assessment.card.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.credibanco.assessment.card.model.Purchase;

public interface IPurchaseService extends JpaRepository<Purchase,Long> {

	
}
