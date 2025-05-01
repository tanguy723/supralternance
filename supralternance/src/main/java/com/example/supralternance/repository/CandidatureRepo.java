package com.example.supralternance.repository;

import org.springframework.stereotype.Repository;
import com.example.supralternance.candidatures.model.Candidature;

@Repository
public interface CandidatureRepo extends AbstractDAO<Candidature> {
    // Aucune méthode supplémentaire pour l'instant,
    // mais tu peux ajouter des requêtes personnalisées ici si nécessaire.
}

