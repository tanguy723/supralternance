package com.example.supralternance.service;

import org.springframework.stereotype.Service;

import com.example.supralternance.candidatures.model.Candidatures;
import com.example.supralternance.candidatures.model.CandidaturesViaOffre;

@Service
public interface CandidatureViaOffreService {
    
    public Iterable<CandidaturesViaOffre> getCandidaturesViaOffres();
    public Candidatures findCandidatureParOffre(int id);
    public CandidaturesViaOffre saveCandidaturesViaOffre(CandidaturesViaOffre candidaturesViaOffre);
    public CandidaturesViaOffre updateCandidaturesViaOffre(CandidaturesViaOffre candidaturesViaOffre);
    public void delCandidaturesParOffre(CandidaturesViaOffre candidaturesOffre);
}
