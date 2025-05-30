package com.example.supralternance.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.supralternance.candidatures.model.Candidature;
import com.example.supralternance.repository.CandidatureRepo;
import com.example.supralternance.service.CandidatureService;

@Service
public class CandidatureServiceImpl implements CandidatureService {

    private final CandidatureRepo candidatureRepo;


    @Autowired
    public CandidatureServiceImpl(CandidatureRepo candidatureRepo) {
        this.candidatureRepo= candidatureRepo;
    }

    @Override
    public Candidature get(Integer id) {

        return this.candidatureRepo.findById(id).orElse(null);
    }

    @Override
    public List<Candidature> getAll() {
        return this.candidatureRepo.findAll();
    }

    @Override
    public Candidature insert(Candidature candidature) {

        return this.candidatureRepo.save(candidature);
    }

    @Override
    public Candidature update(Candidature candidature) {

        return this.candidatureRepo.save(candidature);
    }

    @Override
    public void delete(Integer id) {

        this.candidatureRepo.deleteById(id);
    }
}


