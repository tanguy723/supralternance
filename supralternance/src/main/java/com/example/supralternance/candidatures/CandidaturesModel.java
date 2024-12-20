package com.example.supralternance.candidatures;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Getter
@Setter
@Entity
@Table()
public class CandidaturesModel {

    private int idCandidature;
    private Date dateCandidature;
    private String nomCandidature;

    public enum reponse{ POSITIF, NEGATIF, ATTENTE }

    private  reponse reponseCandidature;

    private String nomEntreprise;

    private String adresseEntreprise;


    private String telephoneEntreprise;


    private String emailEntreprise;

    
    public CandidaturesModel() { }

    public CandidaturesModel(int id,Date date, String nom, reponse repCandidature, String nomEntreprise, String addrEntreprise, String tel, String mail){
        super();
        this.idCandidature = id;
        this.dateCandidature = date;
        this.nomCandidature = nom;
        this.reponseCandidature = repCandidature;
        this.nomEntreprise = nomEntreprise;
        this.adresseEntreprise = addrEntreprise;
        this.telephoneEntreprise = tel;
        this.emailEntreprise = mail;

    }

}
