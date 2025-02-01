package com.example.supralternance.service;

import org.springframework.stereotype.Service;

import com.example.supralternance.candidatures.model.Candidatures;
import com.example.supralternance.candidatures.model.CandidaturesSpontanee;

@Service
public interface CandidatureSpontaneeService {

    public Iterable<CandidaturesSpontanee> getCandidaturesSpontanees();

    public Candidatures findCandidatureSpontanee(int id);

    public CandidaturesSpontanee saveCandidatureSpontanee(CandidaturesSpontanee candidaturesSpontanee);

    public Candidatures updateCandidatureSpontanee(CandidaturesSpontanee candidatureSpontanee);

    public void delCandidaturesSpontanee(CandidaturesSpontanee candidaturesSpontanee);
}
