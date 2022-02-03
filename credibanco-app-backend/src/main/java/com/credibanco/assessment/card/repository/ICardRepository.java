package com.credibanco.assessment.card.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.credibanco.assessment.card.model.Card;

public interface ICardRepository extends JpaRepository<Card,String>{

}
