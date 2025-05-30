package com.example.supralternance.candidatures.controller;

import com.example.supralternance.candidatures.model.CandidatureViaOffre;
import com.example.supralternance.service.CandidatureViaOffreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/candidatures/offres")
@CrossOrigin(origins = "http://localhost:4200")  // Autorise Angular à accéder à l'API
public class CandidatureViaOffreController {

    private final CandidatureViaOffreService candidatureViaOffreService;

    @Autowired
    public CandidatureViaOffreController(CandidatureViaOffreService candidatureViaOffreService) {
        this.candidatureViaOffreService = candidatureViaOffreService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<CandidatureViaOffre> get(@PathVariable("id") Integer id) {
        CandidatureViaOffre candidature = candidatureViaOffreService.get(id);
        return candidature != null ? ResponseEntity.ok(candidature) : ResponseEntity.notFound().build();
    }

    @GetMapping
    public List<CandidatureViaOffre> getAll() {
        return candidatureViaOffreService.getAll();
    }

    @PostMapping
    public ResponseEntity<CandidatureViaOffre> insert(@RequestBody CandidatureViaOffre candidature) {
        return ResponseEntity.ok(candidatureViaOffreService.insert(candidature));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
        candidatureViaOffreService.delete(id);
        return ResponseEntity.noContent().build();
    }
}