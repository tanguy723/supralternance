package com.example.supralternance.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.supralternance.candidatures.model.CandidatureViaOffreModel;

@Repository
public interface CandidatureViaOffreRepo extends CrudRepository<CandidatureViaOffreModel, Integer>{

}
