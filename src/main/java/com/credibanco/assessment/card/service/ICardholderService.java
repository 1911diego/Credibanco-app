package com.credibanco.assessment.card.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.credibanco.assessment.card.model.Cardholder;

public interface ICardholderService extends JpaRepository<Cardholder,String>{

}
