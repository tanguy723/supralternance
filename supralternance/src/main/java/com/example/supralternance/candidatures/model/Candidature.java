
package com.example.supralternance.candidatures.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;


@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.JOINED) // Polymorphisme avec une table par classe
@Table(name = "candidature")
public class Candidature implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_candidature")
    private int idCandidature;

    @Temporal(TemporalType.DATE)
    @Column(name = "date_candidature")
    private Date dateCandidature;

    @Column(name = "poste_candidate")
    private String nomCandidature;

    @Enumerated(EnumType.STRING)
    private Reponse reponseCandidature;

    @Column(name = "id_entreprise")
    private int id_entreprise;


    public enum Reponse {
        POSITIF, NEGATIF, ATTENTE
    }

    public Candidature() {

    }

    public Candidature(int id, Date date, String nom, Reponse repCandidature) {
        this.idCandidature = id;
        this.dateCandidature = date;
        this.nomCandidature = nom;
        this.reponseCandidature = repCandidature;
    }
}

