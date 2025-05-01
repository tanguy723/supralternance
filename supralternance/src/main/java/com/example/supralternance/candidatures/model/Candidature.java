
package com.example.supralternance.candidatures.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;


@Getter
@Setter
@Entity  // <- Indique que cette classe est une entité JPA
@Inheritance(strategy = InheritanceType.JOINED) // Polymorphisme avec une table par classe
@Table(name = "candidature")  // <- Nom de la table dans la BDD
public class Candidature implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // <- Clé primaire auto-incrémentée
    @Column(name = "id_candidature") // <- pour que le champ corresponde au nom dans la base
    private int idCandidature;

    @Temporal(TemporalType.DATE) // <- Précise qu'on ne stocke que la date (sans l'heure)
    private Date dateCandidature;

    private String nomCandidature;

    @Enumerated(EnumType.STRING) // <- Stocke le nom de l'enum en base (et pas sa position)
    private Reponse reponseCandidature;

    @Column(name = "id_entreprise") // <- correspond à la colonne SQL
    private int id_entreprise;

    // Enum interne (pas besoin de la sortir pour l'instant)
    public enum Reponse {
        POSITIF, NEGATIF, ATTENTE
    }

    public Candidature() {
        // Constructeur vide requis par JPA
    }

    public Candidature(int id, Date date, String nom, Reponse repCandidature) {
        this.idCandidature = id;
        this.dateCandidature = date;
        this.nomCandidature = nom;
        this.reponseCandidature = repCandidature;
    }
}

