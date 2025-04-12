package com.example.supralternance.candidatures.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

    @GetMapping("/{id}")
    public CandidaturesViaOffre get (@PathVariable("id") final Integer id){
        return this.candidatureViaOffreService.get( id );
    }

    @GetMapping
    public List< CandidaturesViaOffre > getAll(){
        return this.candidatureViaOffreService.getAll();
    }

    @PostMapping
    public CandidaturesViaOffre insert(@RequestBody final CandidaturesViaOffre candidatures){
        return this.candidatureViaOffreService.insert( candidatures);
        }

    @PutMapping
    public CandidaturesViaOffre update(@RequestBody final CandidaturesViaOffre candidatures){
        return this.candidatureViaOffreService.update( candidatures);
      }

    @DeleteMapping("/{id}")
    public Integer delete(@PathVariable ( "id" ) final Integer id){
        return this.candidatureViaOffreService.delete( id );
        
    }
  
    
}
