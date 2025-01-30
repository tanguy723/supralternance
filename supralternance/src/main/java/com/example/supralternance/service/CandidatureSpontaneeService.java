package com.example.supralternance.service;

import org.springframework.stereotype.Service;

import com.example.supralternance.candidatures.model.CandidaturesSpontanee;

@Service
public interface CandidatureSpontaneeService {

    public Iterable<CandidaturesSpontanee> getCandidaturesSpontanees();
}
