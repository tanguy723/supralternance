package com.example.supralternance.service;

import java.util.UUID;

import com.example.supralternance.candidatures.model.Candidatures;
import com.example.supralternance.candidatures.model.CandidaturesSpontanee;
import com.example.supralternance.repository.CandidatureSpontaneeRepo;

public class CandidatureSpontaneeServiceImpl implements CandidatureSpontaneeService {

    @SuppressWarnings("FieldMayBeFinal")
    private CandidatureSpontaneeRepo candidatureSpontaneeRepo;

    public CandidatureSpontaneeServiceImpl(CandidatureSpontaneeRepo cdsR){
        this.candidatureSpontaneeRepo = cdsR;
    }

    @Override
    public Candidatures findCandidatureSpontanee(int id){
        return candidatureSpontaneeRepo.getReferenceById(id);
    }


    @Override
    public Iterable<CandidaturesSpontanee> getCandidaturesSpontanees(){
        return candidatureSpontaneeRepo.findAll();
    }
    
    @Override
    public CandidaturesSpontanee saveCandidatureSpontanee(CandidaturesSpontanee candidaturesSpontanee){
        candidaturesSpontanee.setCandidatureSpontaneeID(UUID.randomUUID());
        return candidatureSpontaneeRepo.save(candidaturesSpontanee);
    }

    @Override
    public Candidatures updateCandidatureSpontanee(CandidaturesSpontanee candidatureSpontanee){
        return candidatureSpontaneeRepo.save(candidatureSpontanee);
    }

    @Override
    public void delCandidaturesSpontanee(CandidaturesSpontanee candidaturesSpontanee){
        candidatureSpontaneeRepo.delete(candidaturesSpontanee);
    }
}
