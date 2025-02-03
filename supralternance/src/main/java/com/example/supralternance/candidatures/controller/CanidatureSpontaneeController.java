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

import com.example.supralternance.candidatures.model.CandidaturesSpontanee;
import com.example.supralternance.service.CandidatureSpontaneeService;


@RestController
@RequestMapping("/candidature_spontanée")
public class CanidatureSpontaneeController {

    private final CandidatureSpontaneeService candidatureSpontaneeService;

    public CanidatureSpontaneeController(CandidatureSpontaneeService candidatureSpontaneeService){
        this.candidatureSpontaneeService= candidatureSpontaneeService;
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<CandidaturesSpontanee> findCandidatureSpontParOffre (@PathVariable("id") int id){
        CandidaturesSpontanee candidaturesSP = (CandidaturesSpontanee) candidatureSpontaneeService.findCandidatureSpontanee(id);
        return new ResponseEntity<>( candidaturesSP , HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<CandidaturesSpontanee>> getAllCandidatureViaOffres (){
        List<CandidaturesSpontanee> candidaturesSP = (List<CandidaturesSpontanee>) candidatureSpontaneeService.getCandidaturesSpontanees();
        return new ResponseEntity<>(candidaturesSP, HttpStatus.OK);
    }


    @PostMapping("/add")
    public ResponseEntity<CandidaturesSpontanee> saveNewCandidaturesParOffre (@RequestBody CandidaturesSpontanee candidatureSpontanee){
        CandidaturesSpontanee candidaturesSPsave= candidatureSpontaneeService.saveCandidatureSpontanee(candidatureSpontanee);
        return new ResponseEntity<>(candidaturesSPsave, HttpStatus.CREATED);    
    }

    @PutMapping("/update")
    public ResponseEntity<CandidaturesSpontanee> updateCandidaturesParOffre(@RequestBody CandidaturesSpontanee candidatureSpontanee){
        CandidaturesSpontanee candidaturesUpdateSP = (CandidaturesSpontanee) candidatureSpontaneeService.updateCandidatureSpontanee(candidatureSpontanee);
        return new ResponseEntity<>(candidaturesUpdateSP, HttpStatus.OK);  
    }

    @DeleteMapping("/delete")
    public void delCandidaturesParOffre(@RequestBody CandidaturesSpontanee candidatureSpontanee){
        candidatureSpontaneeService.delCandidaturesSpontanee(candidatureSpontanee);
        
    }
  
}
