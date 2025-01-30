package com.example.supralternance.service;



import com.example.supralternance.candidatures.model.Candidatures;
import com.example.supralternance.repository.CandidaturesRepo;


public class CandidatureServiceImpl implements CandidatureService{

    @SuppressWarnings("FieldMayBeFinal")
    private CandidaturesRepo candidatureRepository;

    public CandidatureServiceImpl(CandidaturesRepo cdR){
        this.candidatureRepository = cdR;
    }


    @Override
    public Iterable<Candidatures> getCandidatures(){
            return candidatureRepository.findAll();
    }
}

