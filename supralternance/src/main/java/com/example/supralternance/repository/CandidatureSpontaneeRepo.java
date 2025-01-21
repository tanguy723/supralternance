package com.example.supralternance.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.supralternance.candidatures.model.CandidaturesSpontaneeModel;

@Repository
public interface CandidatureSpontaneeRepo extends CrudRepository<CandidaturesSpontaneeModel, Integer>{

}
