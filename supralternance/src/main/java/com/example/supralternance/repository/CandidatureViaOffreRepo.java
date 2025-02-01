package com.example.supralternance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.supralternance.candidatures.model.CandidaturesViaOffre;

@Repository
public interface CandidatureViaOffreRepo extends JpaRepository<CandidaturesViaOffre, Integer>{

}
