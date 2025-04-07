package com.example.supralternance.service;

import com.example.supralternance.candidatures.model.CandidaturesViaOffre;

public interface CandidatureViaOffreService {
    
    CandidaturesViaOffre findCandidatureParOffre(int id);

    Iterable<CandidaturesViaOffre> getCandidaturesViaOffres();

    CandidaturesViaOffre saveCandidaturesViaOffre(CandidaturesViaOffre candidaturesViaOffre);

    CandidaturesViaOffre updateCandidaturesViaOffre(CandidaturesViaOffre candidaturesViaOffre);

    void delCandidaturesParOffre(CandidaturesViaOffre candidaturesOffre);
    
}
