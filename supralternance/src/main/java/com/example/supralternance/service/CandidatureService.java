package com.example.supralternance.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.supralternance.candidatures.model.Candidatures;
import com.example.supralternance.repository.CandidaturesRepo;

@Service
public class CandidatureService {


    @SuppressWarnings("FieldMayBeFinal")
    private CandidaturesRepo candidatureRepository;

    @Autowired
    public CandidatureService(CandidaturesRepo cdR){
        this.candidatureRepository = cdR;
    }

    
    public Candidatures findCandidatures(int id){
        return candidatureRepository.getReferenceById(id);
    }


    
    public Iterable<Candidatures> getCandidatures(){
        return candidatureRepository.findAll();
    }


    
    public Candidatures saveCandidatures(Candidatures candidatures){
        candidatures.setCandidatureID(UUID.randomUUID());
        return candidatureRepository.save(candidatures);
    }

    
    public Candidatures updateCandidatures(Candidatures candidatures){
        return candidatureRepository.save(candidatures);
    }

   
    public void delCandidatures(Candidatures candidatures){
        candidatureRepository.delete(candidatures);
    }

}

