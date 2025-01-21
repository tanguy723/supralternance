package com.example.supralternance.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.supralternance.candidatures.model.CandidaturesModel;

@Repository
public interface CandidaturesRepository extends CrudRepository<CandidaturesModel, Integer>{


}
