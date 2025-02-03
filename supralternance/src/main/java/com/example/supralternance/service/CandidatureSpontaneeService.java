package com.example.supralternance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.supralternance.candidatures.model.Candidatures;
import com.example.supralternance.candidatures.model.CandidaturesSpontanee;
import com.example.supralternance.repository.CandidatureSpontaneeRepo;

@Service
public class CandidatureSpontaneeService {


    
    @SuppressWarnings("FieldMayBeFinal")
    private CandidatureSpontaneeRepo candidatureSpontaneeRepo;

    @Autowired
    public CandidatureSpontaneeService(CandidatureSpontaneeRepo cdsR){
        this.candidatureSpontaneeRepo = cdsR;
    }

    
    public Candidatures findCandidatureSpontanee(int id){
        return candidatureSpontaneeRepo.getReferenceById(id);
    }

    
    public Iterable<CandidaturesSpontanee> getCandidaturesSpontanees(){
        return candidatureSpontaneeRepo.findAll();
    }
    
    
    public CandidaturesSpontanee saveCandidatureSpontanee(CandidaturesSpontanee candidaturesSpontanee){
        return candidatureSpontaneeRepo.save(candidaturesSpontanee);
    }

    
    public Candidatures updateCandidatureSpontanee(CandidaturesSpontanee candidatureSpontanee){
        return candidatureSpontaneeRepo.save(candidatureSpontanee);
    }

    
    public void delCandidaturesSpontanee(CandidaturesSpontanee candidaturesSpontanee){
        candidatureSpontaneeRepo.delete(candidaturesSpontanee);
    }
}
