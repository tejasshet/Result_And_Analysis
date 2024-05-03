package com.thbs.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thbs.demo.model.ResultAndAnalysis;
import com.thbs.demo.repository.ResultRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ResultServiceImp implements ResultService {

	@Autowired
	private ResultRepository repository;
	
	@Override
	public void saveResult(ResultAndAnalysis resultAndAnalysis) {
		
		repository.save(resultAndAnalysis);
	}

}
