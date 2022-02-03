package com.credibanco.assessment.card.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.credibanco.assessment.card.model.Status;
import com.credibanco.assessment.card.repository.IStatusRepository;
import com.credibanco.assessment.card.service.IStatusService;


@Service
public class StatusServiceImpl implements IStatusService{

	@Autowired
	private IStatusRepository statusRepository;
	
	
	@Override
	public void save(Status status) {
		statusRepository.save(status);
	}

	@Override
	public Status findOneById(Long id) {
		return statusRepository.getById(id);
	}

	
	
	
}
