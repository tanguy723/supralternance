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
@Table(name="candidature_par_offre")
public class CandidaturesViaOffre extends Candidatures{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name=  "id_candidature_spontanee")
    private UUID id_candidature_par_offre;

    @Column(name= "addresse_de_offre")
    private String addresseOffre;

    @Column(name= "description_de_offre")
    private String descriptionOffre;

    @Column(name= "provenance_de_offre")
    private String originOffre;


    
    public String getAddresseOffre() {
        return addresseOffre;
    }

    public void setAddresseOffre(String addresseOffre) {
        this.addresseOffre = addresseOffre;
    }

    public String getDescriptionOffre() {
        return descriptionOffre;
    }

    public void setDescriptionOffre(String descriptionOffre) {
        this.descriptionOffre = descriptionOffre;
    }

    public String getOriginOffre() {
        return originOffre;
    }

    public void setOriginOffre(String originOffre) {
        this.originOffre = originOffre;
    }

    public CandidaturesViaOffre() {}

    CandidaturesViaOffre(UUID idCandidature, Date date, String nom, reponse repCandidature, UUID id, String nomOffre, String lienOffre, String setDescriptionOffre, String setOriginOffre){
        super(idCandidature, date, nom, repCandidature);
        this.id_candidature_par_offre = id;
        this.addresseOffre = lienOffre;
        this.descriptionOffre = setDescriptionOffre;
        this.originOffre = setOriginOffre;

    }

    public void setCandidatureViaOffreID(UUID id_candidature_par_offre) {
        this.id_candidature_par_offre = id_candidature_par_offre;
    }


}
