package com.example.supralternance.candidatures.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.supralternance.candidatures.model.Candidatures;
import com.example.supralternance.service.CandidatureService;

@RestController
@RequestMapping("/candidatures")
public class CandidaturesController {
    private final CandidatureService candidatureService;

    public CandidaturesController(CandidatureService candidatureService) {
        this.candidatureService = candidatureService;
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Candidatures> findCandidatures (@PathVariable("id") int id){
        Candidatures candidatures = candidatureService.findCandidatures(id);
        return new ResponseEntity<>(candidatures, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Candidatures>> getAllCandidatures (){
        List<Candidatures> candidatures = (List<Candidatures>) candidatureService.getCandidatures();
        return new ResponseEntity<>(candidatures, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Candidatures> saveNewCandidatures(@RequestBody Candidatures candidatures){
        Candidatures candidaturesToBeSaved = candidatureService.saveCandidatures(candidatures);
        return new ResponseEntity<>(candidaturesToBeSaved, HttpStatus.CREATED);    }

    @PutMapping("/update")
    public ResponseEntity<Candidatures> updateCandidatures(@RequestBody Candidatures candidatures){
        Candidatures candidaturesToBeSaved = candidatureService.updateCandidatures(candidatures);
        return new ResponseEntity<>(candidaturesToBeSaved, HttpStatus.OK);  }

    @DeleteMapping("/delete")
    public void delCandidatures(@RequestBody Candidatures candidatures){
        candidatureService.delCandidatures(candidatures);
        
    }
}
