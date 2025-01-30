package com.example.supralternance.service;

import org.springframework.stereotype.Service;

import com.example.supralternance.candidatures.model.CandidaturesViaOffre;

@Service
public interface CandidatureViaOffreService {
    
    public Iterable<CandidaturesViaOffre> getCandidaturesViaOffres();
}
