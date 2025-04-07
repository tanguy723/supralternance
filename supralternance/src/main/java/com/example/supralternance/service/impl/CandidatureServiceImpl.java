package com.example.supralternance.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.supralternance.candidatures.model.Candidatures;
import com.example.supralternance.repository.CandidatureRepo;
import com.example.supralternance.service.CandidatureService;

@Service
public class CandidatureServiceImpl implements CandidatureService {


    @Autowired
    private CandidatureRepo candidatureRepository;

    @Autowired
    public CandidatureServiceImpl(CandidatureRepo cdR){
        this.candidatureRepository = cdR;
    }
  
    @Override
    public Candidatures get(final Integer id){
        return this.candidatureRepository.get(id);
    }

   
    @Override
    public List<Candidatures> getAll(){
        return this.candidatureRepository.getAll();
    }


    @Override
    public Candidatures insert(final Candidatures candidatures){
        return this.candidatureRepository.insert(candidatures);
    }


    @Override
    public Candidatures update(final Candidatures candidatures){
        return this.candidatureRepository.update(candidatures);
    }

   
    @Override
    public void delete( final Integer id){
        return this.candidatureRepository.delete(id);
    }

}

