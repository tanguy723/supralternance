package com.example.supralternance.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.supralternance.candidatures.model.CandidaturesViaOffre;
import com.example.supralternance.repository.CandidatureViaOffreRepo;
import com.example.supralternance.service.CandidatureViaOffreService;

@Service
public class CandidatureViaOffreServiceImpl implements CandidatureViaOffreService{

    
    @Autowired
    @SuppressWarnings("FieldMayBeFinal")
    private CandidatureViaOffreRepo candidatureViaOffreRepo;

    @Autowired
    public CandidatureViaOffreServiceImpl(CandidatureViaOffreRepo cdofR){
        this.candidatureViaOffreRepo = cdofR;
    }

    @Override
    public CandidaturesViaOffre get(final Integer id){
        return this.candidatureViaOffreRepo.get(id);
    }

    @Override
    public List<CandidaturesViaOffre> getAll(){
        return this.candidatureViaOffreRepo.getAll();
    }


    @Override
    public CandidaturesViaOffre insert(final CandidaturesViaOffre candidatures){
        return this.candidatureViaOffreRepo.insert(candidatures);
    }


    @Override
    public CandidaturesViaOffre update(final CandidaturesViaOffre candidatures){
        return this.candidatureViaOffreRepo.update(candidatures);
    }

   
    @Override
    public Integer delete( final Integer id){
        return this.candidatureViaOffreRepo.delete(id);
    }
}
