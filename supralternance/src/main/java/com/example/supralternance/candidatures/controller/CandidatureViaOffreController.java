package com.example.supralternance.candidatures.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.supralternance.candidatures.model.Candidatures;
import com.example.supralternance.candidatures.model.CandidaturesViaOffre;
import com.example.supralternance.service.CandidatureViaOffreService;

@Controller
@RequestMapping("/candidature_par_offre")
public class CandidatureViaOffreController {

    private final CandidatureViaOffreService candidatureViaOffreService;

    public CandidatureViaOffreController(CandidatureViaOffreService candidaturesViaOffreService){
        this.candidatureViaOffreService= candidaturesViaOffreService;
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<CandidaturesViaOffre> findCandidatureParOffre (@PathVariable("id") int id){
        Candidatures candidaturesVO = candidatureViaOffreService.findCandidatureParOffre(id);
        return new ResponseEntity<>( candidaturesVO , HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<CandidaturesViaOffre> saveNewCandidaturesParOffre (@RequestBody CandidaturesViaOffre candidaturesViaOffre){
        Candidatures candidaturesVOsave= candidatureViaOffreService.saveCandidaturesViaOffre(candidaturesViaOffre);
        return new ResponseEntity<>(candidaturesVOsave, HttpStatus.CREATED);    
    }

    @PutMapping("/update")
    public ResponseEntity<CandidaturesViaOffre> updateCandidaturesParOffre(@RequestBody CandidaturesViaOffre candidaturesViaOffre){
        Candidatures candidaturesUpdateVO = candidatureViaOffreService.updateCandidaturesViaOffre(candidaturesViaOffre);
        return new ResponseEntity<>(candidaturesUpdateVO, HttpStatus.OK);  
    }

    @DeleteMapping("/delete")
    public void delCandidaturesParOffre(@RequestBody CandidaturesViaOffre candidatures){
        candidatureViaOffreService.delCandidaturesParOffre(candidatures);
        
    }
  
    
}
