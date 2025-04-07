package com.example.supralternance.service;

import com.example.supralternance.candidatures.model.CandidaturesSpontanee;

public interface CandidatureSpontaneeService {
    
    CandidaturesSpontanee findCandidatureSpontanee(int id);

    Iterable<CandidaturesSpontanee> getCandidaturesSpontanees();

    CandidaturesSpontanee saveCandidatureSpontanee(CandidaturesSpontanee candidaturesSpontanee);

    CandidaturesSpontanee updateCandidatureSpontanee(CandidaturesSpontanee candidatureSpontanee);

    void delCandidaturesSpontanee(CandidaturesSpontanee candidaturesSpontanee);

}