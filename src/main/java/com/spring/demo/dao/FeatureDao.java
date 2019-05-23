package com.spring.demo.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.demo.model.Feature;

public interface FeatureDao extends MongoRepository<Feature, Double>
{
	List<Feature> findByOwner(String owner);
	List<Feature> findByDependencies(String dependencies);
	List<Feature> findByComments(String comments);
	List<Feature> findByOnfor(String on_for);
}
