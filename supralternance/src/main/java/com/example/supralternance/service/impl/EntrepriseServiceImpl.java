package com.example.supralternance.service.impl;

import com.example.supralternance.candidatures.model.Entreprise;
import com.example.supralternance.repository.EntrepriseRepository;
import com.example.supralternance.service.EntrepriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntrepriseServiceImpl implements EntrepriseService {

    private final EntrepriseRepository entrepriseRepository;

    @Autowired
    public EntrepriseServiceImpl(EntrepriseRepository entrepriseRepository) {
        this.entrepriseRepository = entrepriseRepository;
    }

    @Override
    public Entreprise get(Integer id) {
        return entrepriseRepository.findById(id).orElse(null);
    }

    @Override
    public List<Entreprise> getAll() {
        return entrepriseRepository.findAll();
    }

    @Override
    public Entreprise insert(Entreprise entreprise) {
        return entrepriseRepository.save(entreprise);
    }

    @Override
    public Entreprise update(Entreprise entreprise) {
        return entrepriseRepository.save(entreprise);
    }

    @Override
    public void delete(Integer id) {
        entrepriseRepository.deleteById(id);
    }
}