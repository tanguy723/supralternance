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

    // Constructeur avec injection du repository
    @Autowired
    public CandidatureServiceImpl(CandidatureRepo candidatureRepo) {
        this.candidatureRepo= candidatureRepo;
    }

    @Override
    public Candidature get(Integer id) {
        // `findById` renvoie un Optional, on peut utiliser `orElse(null)` pour gérer le cas où l'entité n'existe pas.
        return this.candidatureRepo.findById(id).orElse(null);
    }

    @Override
    public List<Candidature> getAll() {
        return this.candidatureRepo.findAll();
    }

    @Override
    public Candidature insert(Candidature candidature) {
        // `save` peut être utilisé pour insérer ou mettre à jour une entité
        return this.candidatureRepo.save(candidature);
    }

    @Override
    public Candidature update(Candidature candidature) {
        // `save` va mettre à jour si l'ID existe déjà
        return this.candidatureRepo.save(candidature);
    }

    @Override
    public void delete(Integer id) {
        // `deleteById` supprime l'entité correspondante à l'ID
        this.candidatureRepo.deleteById(id);
    }
}


