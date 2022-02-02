package com.credibanco.assessment.card.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.credibanco.assessment.card.model.Status;



public interface IStatusRepository extends JpaRepository<Status, Long> {

}
