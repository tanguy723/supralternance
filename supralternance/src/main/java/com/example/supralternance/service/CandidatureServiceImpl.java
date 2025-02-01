package com.example.supralternance.service;


import java.util.UUID;

import com.example.supralternance.candidatures.model.Candidatures;
import com.example.supralternance.repository.CandidaturesRepo;


public class CandidatureServiceImpl implements CandidatureService{



    @SuppressWarnings("FieldMayBeFinal")
    private CandidaturesRepo candidatureRepository;

    public CandidatureServiceImpl(CandidaturesRepo cdR){
        this.candidatureRepository = cdR;
    }

    @Override
    public Candidatures findCandidatures(int id){
        return candidatureRepository.getReferenceById(id);
    }


    @Override
    public Iterable<Candidatures> getCandidatures(){
        return candidatureRepository.findAll();
    }


    @Override
    public Candidatures saveCandidatures(Candidatures candidatures){
        candidatures.setCandidatureID(UUID.randomUUID());
        return candidatureRepository.save(candidatures);
    }

    @Override
    public Candidatures updateCandidatures(Candidatures candidatures){
        return candidatureRepository.save(candidatures);
    }

    @Override
    public void delCandidatures(Candidatures candidatures){
        candidatureRepository.delete(candidatures);
    }
}

