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

import com.example.supralternance.candidatures.model.CandidaturesSpontanee;
import com.example.supralternance.service.impl.CandidatureSpontaneeServiceImpl;


@RestController
@RequestMapping("/candidature_spontanée")
@CrossOrigin(origins = "localhost:5432")
public class CandidatureSpontaneeController {

    @Autowired
    private final CandidatureSpontaneeServiceImpl candidatureSpontaneeService;

    public CandidatureSpontaneeController(CandidatureSpontaneeServiceImpl candidatureSpontaneeService){
        this.candidatureSpontaneeService= candidatureSpontaneeService;
    }

    @GetMapping("/{id}")
    public CandidaturesSpontanee get (@PathVariable("id") final Integer id){
        return this.candidatureSpontaneeService.get( id );
    }

    @GetMapping
    public List< CandidaturesSpontanee > getAll(){
        return this.candidatureSpontaneeService.getAll();
    }

    @PostMapping
    public CandidaturesSpontanee insert(@RequestBody final CandidaturesSpontanee candidatures){
        return this.candidatureSpontaneeService.insert( candidatures);
        }

    @PutMapping
    public CandidaturesSpontanee update(@RequestBody final CandidaturesSpontanee candidatures){
        return this.candidatureSpontaneeService.update( candidatures);
      }

    @DeleteMapping("/{id}")
    public Integer delete(@PathVariable ( "id" ) final Integer id){
        return this.candidatureSpontaneeService.delete( id );
        
    }
  
}
