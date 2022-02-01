package com.credibanco.assessment.card.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.credibanco.assessment.card.model.Card;

public interface ICardService extends JpaRepository<Card,String>{

}
