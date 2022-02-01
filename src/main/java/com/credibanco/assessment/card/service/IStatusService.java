package com.credibanco.assessment.card.service;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.qos.logback.core.status.Status;

public interface IStatusService extends JpaRepository<Status, Long> {

}
