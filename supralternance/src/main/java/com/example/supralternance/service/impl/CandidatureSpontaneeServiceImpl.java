package com.example.supralternance.service.impl;

import com.example.supralternance.candidatures.model.CandidatureSpontanee;
import com.example.supralternance.repository.CandidatureSpontaneeRepo;
import com.example.supralternance.service.CandidatureSpontaneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidatureSpontaneeServiceImpl implements CandidatureSpontaneeService {

    private final CandidatureSpontaneeRepo candidatureSpontaneeRepo;

    @Autowired
    public CandidatureSpontaneeServiceImpl(CandidatureSpontaneeRepo candidatureSpontaneeRepo) {
        this.candidatureSpontaneeRepo = candidatureSpontaneeRepo;
    }

    @Override
    public CandidatureSpontanee get(Integer id) {
        return candidatureSpontaneeRepo.findById(id).orElse(null);
    }

    @Override
    public List<CandidatureSpontanee> getAll() {
        return candidatureSpontaneeRepo.findAll();
    }

    @Override
    public CandidatureSpontanee insert(CandidatureSpontanee candidatureSpontanee) {
        return candidatureSpontaneeRepo.save(candidatureSpontanee);
    }

    @Override
    public CandidatureSpontanee update(CandidatureSpontanee candidatureSpontanee) {
        return candidatureSpontaneeRepo.save(candidatureSpontanee);
    }

    @Override
    public void delete(Integer id) {
        candidatureSpontaneeRepo.deleteById(id);
    }
}