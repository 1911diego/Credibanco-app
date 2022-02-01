package com.credibanco.assessment.card.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.credibanco.assessment.card.model.CardType;

public interface ICardTypeService extends JpaRepository<CardType,Long>{

}
