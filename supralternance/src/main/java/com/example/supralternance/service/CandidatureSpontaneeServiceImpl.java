package com.example.supralternance.service;

import com.example.supralternance.candidatures.model.CandidaturesSpontanee;
import com.example.supralternance.repository.CandidatureSpontaneeRepo;

public class CandidatureSpontaneeServiceImpl implements CandidatureSpontaneeService {

    @SuppressWarnings("FieldMayBeFinal")
    private CandidatureSpontaneeRepo candidatureSpontaneeRepo;

    public CandidatureSpontaneeServiceImpl(CandidatureSpontaneeRepo cdsR){
        this.candidatureSpontaneeRepo = cdsR;
    }

    @Override
    public Iterable<CandidaturesSpontanee> getCandidaturesSpontanees(){
        return candidatureSpontaneeRepo.findAll();
    }
    
}
