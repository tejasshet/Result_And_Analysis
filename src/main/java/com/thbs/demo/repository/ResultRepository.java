package com.thbs.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.thbs.demo.model.ResultAndAnalysis;

public interface ResultRepository extends MongoRepository<ResultAndAnalysis, Long> {

}
