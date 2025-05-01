package com.example.supralternance.candidatures.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.supralternance.candidatures.model.Candidature;
import com.example.supralternance.service.CandidatureService;

@RestController
@RequestMapping("/candidatures")
@CrossOrigin(origins = "http://localhost:5432") // Autorise Angular à accéder à l'API
public class CandidatureController {

    private final CandidatureService candidatureService;

    @Autowired
    public CandidatureController(CandidatureService candidatureService) {
        this.candidatureService = candidatureService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Candidature> get(@PathVariable("id") Integer id) {
        Candidature candidature = this.candidatureService.get(id);
        if (candidature == null) {
            return ResponseEntity.notFound().build();  // Retourne un 404 si l'élément n'existe pas
        }
        return ResponseEntity.ok(candidature);  // Retourne l'objet avec un code 200
    }

    @GetMapping
    public List<Candidature> getAll() {
        return this.candidatureService.getAll();
    }

    @PostMapping
    public ResponseEntity<Candidature> insert(@RequestBody Candidature candidature) {
        Candidature savedCandidature = this.candidatureService.insert(candidature);
        return ResponseEntity.ok(savedCandidature);  // Retourne l'objet créé avec un code 200
    }

    @PutMapping("/{id}")
    public ResponseEntity<Candidature> update(@PathVariable Integer id, @RequestBody Candidature candidature) {
        candidature.setIdCandidature(id);  // On s'assure que l'ID est bien mis à jour.
        Candidature updatedCandidature = this.candidatureService.update(candidature);
        if (updatedCandidature == null) {
            return ResponseEntity.notFound().build();  // Retourne un 404 si l'élément à mettre à jour n'existe pas
        }
        return ResponseEntity.ok(updatedCandidature);  // Retourne l'objet mis à jour
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
        this.candidatureService.delete(id);  // Appel du service pour supprimer
        return ResponseEntity.noContent().build();  // Retourne un code 204 (pas de contenu) pour indiquer une suppression réussie
    }
}