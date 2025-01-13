package com.example.supralternance.candidatures;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Getter
@Setter
@Entity
@Table(name="candidatures")
public class CandidaturesModel {

    private int idCandidature;
    private Date dateCandidature;
    private String nomCandidature;

    public enum reponse{ POSITIF, NEGATIF, ATTENTE }

    private  reponse reponseCandidature;


    
    public CandidaturesModel() { }

    public CandidaturesModel(int id,Date date, String nom, reponse repCandidature){
        super();
        this.idCandidature = id;
        this.dateCandidature = date;
        this.nomCandidature = nom;
        this.reponseCandidature = repCandidature;

    }

}


