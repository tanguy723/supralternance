package com.example.supralternance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.supralternance.candidatures.model.CandidaturesSpontanee;
import com.example.supralternance.repository.CandidatureSpontaneeRepo;
import com.example.supralternance.service.CandidatureSpontaneeService;

@Service
public class CandidatureSpontaneeServiceImpl implements CandidatureSpontaneeService {

    @SuppressWarnings("FieldMayBeFinal")
    private CandidatureSpontaneeRepo candidatureSpontaneeRepo;

    @Autowired
    public CandidatureSpontaneeServiceImpl(CandidatureSpontaneeRepo cdsR){
        this.candidatureSpontaneeRepo = cdsR;
    }

    
    @Override
    public CandidaturesSpontanee findCandidatureSpontanee(int id){
        return candidatureSpontaneeRepo.getReferenceById(id);
    }

    @Override
    public Iterable<CandidaturesSpontanee> getCandidaturesSpontanees(){
        return candidatureSpontaneeRepo.findAll();
    }
    
    @Override
    public CandidaturesSpontanee saveCandidatureSpontanee(CandidaturesSpontanee candidaturesSpontanee){
        return candidatureSpontaneeRepo.save(candidaturesSpontanee);
    }

    @Override
    public CandidaturesSpontanee updateCandidatureSpontanee(CandidaturesSpontanee candidatureSpontanee){
        return candidatureSpontaneeRepo.save(candidatureSpontanee);
    }

    @Override
    public void delCandidaturesSpontanee(CandidaturesSpontanee candidaturesSpontanee){
        candidatureSpontaneeRepo.delete(candidaturesSpontanee);
    }
}
