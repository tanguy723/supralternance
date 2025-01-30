package com.example.supralternance.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.supralternance.candidatures.model.CandidaturesViaOffre;

@Repository
public interface CandidatureViaOffreRepo extends CrudRepository<CandidaturesViaOffre, Integer>{

}
