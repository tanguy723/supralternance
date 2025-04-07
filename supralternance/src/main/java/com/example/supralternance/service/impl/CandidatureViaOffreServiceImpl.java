package com.example.supralternance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.supralternance.candidatures.model.CandidaturesViaOffre;
import com.example.supralternance.repository.CandidatureViaOffreRepo;
import com.example.supralternance.service.CandidatureViaOffreService;

@Service
public class CandidatureViaOffreServiceImpl implements CandidatureViaOffreService{

    
    @SuppressWarnings("FieldMayBeFinal")
    private CandidatureViaOffreRepo candidatureViaOffreRepo;

    @Autowired
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
