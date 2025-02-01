package com.example.supralternance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.supralternance.candidatures.model.Candidatures;

@Repository
public interface CandidaturesRepo extends JpaRepository<Candidatures, Integer> {


 
}
