package com.credibanco.assessment.card.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.credibanco.assessment.card.model.CardTransaction;

public interface ICardTransactionRepository extends JpaRepository<CardTransaction, Long> {

}
