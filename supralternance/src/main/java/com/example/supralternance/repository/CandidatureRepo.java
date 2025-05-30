package com.example.supralternance.repository;

import org.springframework.stereotype.Repository;
import com.example.supralternance.candidatures.model.Candidature;

@Repository
public interface CandidatureRepo extends AbstractDAO<Candidature, Integer> {

}

