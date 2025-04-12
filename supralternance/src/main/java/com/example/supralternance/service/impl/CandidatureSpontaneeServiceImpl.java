package com.example.supralternance.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.supralternance.candidatures.model.CandidaturesSpontanee;
import com.example.supralternance.repository.CandidatureSpontaneeRepo;
import com.example.supralternance.service.CandidatureSpontaneeService;

@Service
public class CandidatureSpontaneeServiceImpl implements CandidatureSpontaneeService {

    @Autowired
    @SuppressWarnings("FieldMayBeFinal")
    private CandidatureSpontaneeRepo candidatureSpontaneeRepo;

    @Autowired
    public CandidatureSpontaneeServiceImpl(CandidatureSpontaneeRepo cdsR){
        this.candidatureSpontaneeRepo = cdsR;
    }

    @Override
    public CandidaturesSpontanee get(final Integer id){
        return this.candidatureSpontaneeRepo.get(id);
    }

    @Override
    public List<CandidaturesSpontanee> getAll(){
        return this.candidatureSpontaneeRepo.getAll();
    }


    @Override
    public CandidaturesSpontanee insert(final CandidaturesSpontanee candidatures){
        return this.candidatureSpontaneeRepo.insert(candidatures);
    }


    @Override
    public CandidaturesSpontanee update(final CandidaturesSpontanee candidatures){
        return this.candidatureSpontaneeRepo.update(candidatures);
    }

   
    @Override
    public Integer delete( final Integer id){
        return this.candidatureSpontaneeRepo.delete(id);
    }
}
