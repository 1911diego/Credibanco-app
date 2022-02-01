package com.credibanco.assessment.card.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.credibanco.assessment.card.model.CardTransaction;

public interface ICardTransactionService extends JpaRepository<CardTransaction, Long> {

}
