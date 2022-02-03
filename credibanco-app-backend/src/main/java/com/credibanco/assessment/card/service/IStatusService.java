package com.credibanco.assessment.card.service;

import com.credibanco.assessment.card.model.Status;

public interface IStatusService {
	
	public void save(Status status);
	
	public Status findOneById(Long id);
	

}
