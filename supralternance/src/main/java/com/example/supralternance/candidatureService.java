package com.example.supralternance;
import com.example.supralternance.candidatures.model.CandidaturesModel;
import com.example.supralternance.repository.CandidaturesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface candidatureService {

    @Autowired 
    public CandidaturesRepository CandidaturesRepository;

    public Iterable<CandidaturesModel> getCandidatures() {
            return CandidaturesRepository.findAll();
        }
}
