package com.example.supralternance.candidatures.controller;

import com.example.supralternance.candidatures.model.CandidatureSpontanee;
import com.example.supralternance.service.CandidatureSpontaneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/candidatures/spontanees")
@CrossOrigin(origins = "http://localhost:4200")  // Autorise Angular à accéder à l'API
public class CandidatureSpontaneeController {

    private final CandidatureSpontaneeService candidatureSpontaneeService;

    @Autowired
    public CandidatureSpontaneeController(CandidatureSpontaneeService candidatureSpontaneeService) {
        this.candidatureSpontaneeService = candidatureSpontaneeService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<CandidatureSpontanee> get(@PathVariable("id") Integer id) {
        CandidatureSpontanee candidature = candidatureSpontaneeService.get(id);
        return candidature != null ? ResponseEntity.ok(candidature) : ResponseEntity.notFound().build();
    }

    @GetMapping
    public List<CandidatureSpontanee> getAll() {
        return candidatureSpontaneeService.getAll();
    }

    @PostMapping
    public ResponseEntity<CandidatureSpontanee> insert(@RequestBody CandidatureSpontanee candidature) {
        return ResponseEntity.ok(candidatureSpontaneeService.insert(candidature));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
        candidatureSpontaneeService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
