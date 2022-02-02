package com.credibanco.assessment.card.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.credibanco.assessment.card.model.Purchase;

public interface IPurchaseRepository extends JpaRepository<Purchase,Long> {

	
}
