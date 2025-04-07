package com.example.supralternance.candidatures.model;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Candidatures implements Serializable{

    private int  id_candidature;

    private Date dateCandidature;

    private String nomCandidature;

    public enum reponse{ POSITIF, NEGATIF, ATTENTE }

    private  reponse reponseCandidature;

    private int id_entreprise;


    public Candidatures() {
        super();
     }

    public Candidatures(int id,Date date, String nom, reponse repCandidature){
        super();
        this.id_candidature = id;
        this.dateCandidature = date;
        this.nomCandidature = nom;
        this.reponseCandidature = repCandidature;

    }


    @Override
    public String toString() {
        return "Candidatures [id=" + this.id_candidature + ", dateCandidature=" + this.dateCandidature + 
        ", nomCandidature=" + this.nomCandidature + ", reponseCandidature= " + this.reponseCandidature + "]";
    }

    
}


