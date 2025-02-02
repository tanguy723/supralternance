package com.example.supralternance.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.supralternance.candidatures.model.CandidaturesViaOffre;
import com.example.supralternance.repository.CandidatureViaOffreRepo;

@Service
public class CandidatureViaOffreService {

    
    @SuppressWarnings("FieldMayBeFinal")
    private CandidatureViaOffreRepo candidatureViaOffreRepo;

    @Autowired
    public CandidatureViaOffreService(CandidatureViaOffreRepo cdofR){
        this.candidatureViaOffreRepo = cdofR;
    }

    
    public CandidaturesViaOffre findCandidatureParOffre(int id){
        return candidatureViaOffreRepo.getReferenceById(id);
    }

    
    public Iterable<CandidaturesViaOffre> getCandidaturesViaOffres(){
        return candidatureViaOffreRepo.findAll();
    }

     
    public CandidaturesViaOffre saveCandidaturesViaOffre(CandidaturesViaOffre candidaturesViaOffre){
        candidaturesViaOffre.setCandidatureViaOffreID(UUID.randomUUID());
        return candidatureViaOffreRepo.save(candidaturesViaOffre);
    }

    
    public CandidaturesViaOffre updateCandidaturesViaOffre(CandidaturesViaOffre candidaturesViaOffre){
        return candidatureViaOffreRepo.save(candidaturesViaOffre);
    }

    
    public void delCandidaturesParOffre(CandidaturesViaOffre candidaturesOffre){
        candidatureViaOffreRepo.delete(candidaturesOffre);
    }
}
