package com.example.supralternance.service;

import org.springframework.stereotype.Service;

import com.example.supralternance.candidatures.model.Candidatures;

@Service
public interface CandidatureService {

    public Iterable<Candidatures> getCandidatures();
}
