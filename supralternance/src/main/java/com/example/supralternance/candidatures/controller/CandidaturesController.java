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

import com.example.supralternance.candidatures.model.Candidatures;
import com.example.supralternance.service.CandidatureService;
import com.example.supralternance.service.impl.CandidatureServiceImpl;

@RestController
@RequestMapping("/candidatures")
@CrossOrigin(origins = "localhost:5432")
public class CandidaturesController {

    @Autowired
    private final CandidatureService candidatureService;

    public CandidaturesController(CandidatureServiceImpl candidatureService) {
        this.candidatureService = candidatureService;
    }

    @GetMapping("/{id}")
    public Candidatures get (@PathVariable("id") final Integer id){
        return this.candidatureService.get( id );
    }

    @GetMapping
    public List< Candidatures > getAll(){
        return this.candidatureService.getAll();
    }

    @PostMapping
    public Candidatures insert(@RequestBody final Candidatures candidatures){
        return this.candidatureService.insert( candidatures);
        }

    @PutMapping
    public Candidatures update(@RequestBody final Candidatures candidatures){
        return this.candidatureService.update( candidatures);
      }

    @DeleteMapping("/{id}")
    public Integer delete(@PathVariable ( "id" ) final Integer id){
        return this.candidatureService.delete( id );
        
    }
}
