package com.example.supralternance.candidatures.controller;

import com.example.supralternance.candidatures.model.Entreprise;
import com.example.supralternance.service.EntrepriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/entreprises")
@CrossOrigin(origins = "http://localhost:4200")  // Autorise Angular à accéder à l'API
public class EntrepriseController {

    private final EntrepriseService entrepriseService;

    @Autowired
    public EntrepriseController(EntrepriseService entrepriseService) {
        this.entrepriseService = entrepriseService;
    }

    @GetMapping("/{id}")
    public Entreprise get(@PathVariable("id") final Integer id) {
        return this.entrepriseService.get(id);
    }

    @GetMapping
    public List<Entreprise> getAll() {
        return this.entrepriseService.getAll();
    }

    @PostMapping
    public Entreprise insert(@RequestBody final Entreprise entreprise) {
        return this.entrepriseService.insert(entreprise);
    }

    @PutMapping
    public Entreprise update(@RequestBody final Entreprise entreprise) {
        return this.entrepriseService.update(entreprise);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") final Integer id) {
        this.entrepriseService.delete(id);
    }
}