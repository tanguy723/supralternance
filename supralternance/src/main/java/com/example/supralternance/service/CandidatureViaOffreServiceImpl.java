package com.example.supralternance.service;

import java.util.UUID;

import com.example.supralternance.candidatures.model.CandidaturesViaOffre;
import com.example.supralternance.repository.CandidatureViaOffreRepo;



public class CandidatureViaOffreServiceImpl implements CandidatureViaOffreService{

    
    @SuppressWarnings("FieldMayBeFinal")
    private CandidatureViaOffreRepo candidatureViaOffreRepo;

    public CandidatureViaOffreServiceImpl(CandidatureViaOffreRepo cdofR){
        this.candidatureViaOffreRepo = cdofR;
    }

    @Override
    public CandidaturesViaOffre findCandidatureParOffre(int id){
        return candidatureViaOffreRepo.getReferenceById(id);
    }

    @Override
    public Iterable<CandidaturesViaOffre> getCandidaturesViaOffres(){
        return candidatureViaOffreRepo.findAll();
    }

     @Override
    public CandidaturesViaOffre saveCandidaturesViaOffre(CandidaturesViaOffre candidaturesViaOffre){
        candidaturesViaOffre.setCandidatureViaOffreID(UUID.randomUUID());
        return candidatureViaOffreRepo.save(candidaturesViaOffre);
    }

    @Override
    public CandidaturesViaOffre updateCandidaturesViaOffre(CandidaturesViaOffre candidaturesViaOffre){
        return candidatureViaOffreRepo.save(candidaturesViaOffre);
    }

    @Override
    public void delCandidaturesParOffre(CandidaturesViaOffre candidaturesOffre){
        candidatureViaOffreRepo.delete(candidaturesOffre);
    }
}
