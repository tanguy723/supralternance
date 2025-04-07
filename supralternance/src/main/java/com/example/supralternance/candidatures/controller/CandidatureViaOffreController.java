package com.example.supralternance.candidatures.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.supralternance.candidatures.model.CandidaturesViaOffre;
import com.example.supralternance.service.impl.CandidatureViaOffreServiceImpl;

@RestController
@RequestMapping("/candidature_par_offre")
@CrossOrigin(origins = "localhost:5432")
public class CandidatureViaOffreController {

    @Autowired
    private final CandidatureViaOffreServiceImpl candidatureViaOffreService;

    public CandidatureViaOffreController(CandidatureViaOffreServiceImpl candidaturesViaOffreService){
        this.candidatureViaOffreService= candidaturesViaOffreService;
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<CandidaturesViaOffre> findCandidatureParOffre (@PathVariable("id") int id){
        CandidaturesViaOffre candidaturesVO = (CandidaturesViaOffre) candidatureViaOffreService.findCandidatureParOffre(id);
        return new ResponseEntity<>( candidaturesVO , HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<CandidaturesViaOffre>> getAllCandidatureViaOffres (){
        List<CandidaturesViaOffre> candidaturesVO = (List<CandidaturesViaOffre>) candidatureViaOffreService.getCandidaturesViaOffres();
        return new ResponseEntity<>(candidaturesVO, HttpStatus.OK);
    }


    @PostMapping("/add")
    public ResponseEntity<CandidaturesViaOffre> saveNewCandidaturesParOffre (@RequestBody CandidaturesViaOffre candidaturesViaOffre){
        CandidaturesViaOffre candidaturesVOsave= candidatureViaOffreService.saveCandidaturesViaOffre(candidaturesViaOffre);
        return new ResponseEntity<>(candidaturesVOsave, HttpStatus.CREATED);    
    }

    @PutMapping("/update")
    public ResponseEntity<CandidaturesViaOffre> updateCandidaturesParOffre(@RequestBody CandidaturesViaOffre candidaturesViaOffre){
        CandidaturesViaOffre candidaturesUpdateVO = candidatureViaOffreService.updateCandidaturesViaOffre(candidaturesViaOffre);
        return new ResponseEntity<>(candidaturesUpdateVO, HttpStatus.OK);  
    }

    @DeleteMapping("/delete")
    public void delCandidaturesParOffre(@RequestBody CandidaturesViaOffre candidatures){
        candidatureViaOffreService.delCandidaturesParOffre(candidatures);
        
    }
  
    
}
