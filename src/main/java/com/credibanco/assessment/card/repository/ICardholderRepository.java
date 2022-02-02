package com.credibanco.assessment.card.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.credibanco.assessment.card.model.Cardholder;

public interface ICardholderRepository extends JpaRepository<Cardholder,String>{

}
