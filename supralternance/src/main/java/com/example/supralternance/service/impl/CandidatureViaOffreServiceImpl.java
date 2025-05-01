package com.example.supralternance.service.impl;

import com.example.supralternance.candidatures.model.CandidatureViaOffre;
import com.example.supralternance.repository.CandidatureViaOffreRepo;
import com.example.supralternance.service.CandidatureViaOffreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidatureViaOffreServiceImpl implements CandidatureViaOffreService {

    private final CandidatureViaOffreRepo candidatureViaOffreRepo;

    @Autowired
    public CandidatureViaOffreServiceImpl(CandidatureViaOffreRepo candidatureViaOffreRepo) {
        this.candidatureViaOffreRepo = candidatureViaOffreRepo;
    }

    @Override
    public CandidatureViaOffre get(Integer id) {
        return candidatureViaOffreRepo.findById(id).orElse(null);
    }

    @Override
    public List<CandidatureViaOffre> getAll() {
        return candidatureViaOffreRepo.findAll();
    }

    @Override
    public CandidatureViaOffre insert(CandidatureViaOffre candidature) {
        return candidatureViaOffreRepo.save(candidature);
    }

    @Override
    public CandidatureViaOffre update(CandidatureViaOffre candidature) {
        return candidatureViaOffreRepo.save(candidature);
    }

    @Override
    public void delete(Integer id) {
        candidatureViaOffreRepo.deleteById(id);
    }
}
