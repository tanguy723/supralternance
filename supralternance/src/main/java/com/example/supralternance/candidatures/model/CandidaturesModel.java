package com.example.supralternance.candidatures.model;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Getter
@Setter
@Entity
@Table(name="candidatures")
public class CandidaturesModel {

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name=  "id_candidature")
    private int id_candidature;

    @Column(name = "date_candidature")
    private Date dateCandidature;

    @Column(name= "poste_candidate")
    private String nomCandidature;

    public enum reponse{ POSITIF, NEGATIF, ATTENTE }

    @Column(name="reponse")
    private  reponse reponseCandidature;

    @Column(name="id_entreprise")
    private int id_entreprise;


    public CandidaturesModel() { }

    public CandidaturesModel(int id,Date date, String nom, reponse repCandidature){
        super();
        this.id_candidature = id;
        this.dateCandidature = date;
        this.nomCandidature = nom;
        this.reponseCandidature = repCandidature;

    }

}


