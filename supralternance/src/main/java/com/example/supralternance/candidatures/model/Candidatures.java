package com.example.supralternance.candidatures.model;

import java.util.Date;
import java.util.UUID;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name="candidatures")
public class Candidatures {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name=  "id_candidature")
    private UUID id_candidature;

   

    @Column(name = "date_candidature")
    private Date dateCandidature;

    @Column(name= "poste_candidate")
    private String nomCandidature;

    public enum reponse{ POSITIF, NEGATIF, ATTENTE }

    @Column(name="reponse")
    private  reponse reponseCandidature;

    @Column(name="id_entreprise")
    private int id_entreprise;


    public Candidatures() { }

    public Candidatures(UUID id,Date date, String nom, reponse repCandidature){
        super();
        this.id_candidature = id;
        this.dateCandidature = date;
        this.nomCandidature = nom;
        this.reponseCandidature = repCandidature;

    }

    
    public UUID getId_candidature() {
        return id_candidature;
    }

    public void setCandidatureID(UUID id) {
        this.id_candidature = id;
    }

    public Date getDateCandidature() {
        return dateCandidature;
    }

    public void setDateCandidature(Date dateCandidature) {
        this.dateCandidature = dateCandidature;
    }

    public String getNomCandidature() {
        return nomCandidature;
    }

    public void setNomCandidature(String nomCandidature) {
        this.nomCandidature = nomCandidature;
    }

    public reponse getReponseCandidature() {
        return reponseCandidature;
    }

    public void setReponseCandidature(reponse reponseCandidature) {
        this.reponseCandidature = reponseCandidature;
    }

    public int getId_entreprise() {
        return id_entreprise;
    }

    public void setId_entreprise(int id_entreprise) {
        this.id_entreprise = id_entreprise;
    }



    
}


