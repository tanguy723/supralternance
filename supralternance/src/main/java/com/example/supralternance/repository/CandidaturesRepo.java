package com.example.supralternance.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.supralternance.candidatures.model.Candidatures;

@Repository
public interface CandidaturesRepo extends CrudRepository<Candidatures, Integer> {


 
}
