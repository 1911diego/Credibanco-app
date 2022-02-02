package com.credibanco.assessment.card.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.credibanco.assessment.card.model.CardType;

public interface ICardTypeRepository extends JpaRepository<CardType,Long>{
	
	@Query("SELECT t FROM CardType t WHERE t.description LIKE '?'")
	CardType findByName(String name);

}
