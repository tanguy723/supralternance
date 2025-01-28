package com.example.supralternance.service;



import com.example.supralternance.candidatures.model.CandidaturesModel;
import com.example.supralternance.repository.CandidaturesRepository;


public class CandidatureServiceImpl implements CandidatureService{

    private CandidaturesRepository candidatureRepository;

    public CandidatureServiceImpl(CandidaturesRepository cdR){
        this.candidatureRepository = cdR;
    }

   
    

    public Iterable<CandidaturesModel> getCandidatures(){
            return candidatureRepository.findAll();
    }
}

