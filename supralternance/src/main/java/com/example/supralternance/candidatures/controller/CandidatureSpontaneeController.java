package com.example.supralternance.candidatures.controller;

import com.example.supralternance.candidatures.model.CandidatureSpontanee;
import com.example.supralternance.service.CandidatureSpontaneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/candidatures/spontanees")
@CrossOrigin(origins = "http://localhost:5432")
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

    @PutMapping("/{id}")
    public ResponseEntity<CandidatureSpontanee> update(@PathVariable Integer id, @RequestBody CandidatureSpontanee candidature) {
        candidature.setIdCandidatureSpontanee(id);  // MAJ explicite si tu tiens à ce champ
        return ResponseEntity.ok(candidatureSpontaneeService.update(candidature));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
        candidatureSpontaneeService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
