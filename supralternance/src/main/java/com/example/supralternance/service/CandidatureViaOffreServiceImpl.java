package com.example.supralternance.service;

import com.example.supralternance.candidatures.model.CandidaturesViaOffre;
import com.example.supralternance.repository.CandidatureViaOffreRepo;



public class CandidatureViaOffreServiceImpl implements CandidatureViaOffreService{

    
    @SuppressWarnings("FieldMayBeFinal")
    private CandidatureViaOffreRepo candidatureViaOffreRepo;

    public CandidatureViaOffreServiceImpl(CandidatureViaOffreRepo cdofR){
        this.candidatureViaOffreRepo = cdofR;
    }


    @Override
    public Iterable<CandidaturesViaOffre> getCandidaturesViaOffres(){
        return candidatureViaOffreRepo.findAll();
    }
}
