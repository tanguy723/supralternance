package com.example.supralternance.candidatures.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "candidature_par_offre")
public class CandidatureViaOffre extends Candidature {


    @Column(name= "addresse_de_offre")
    private String addresseOffre;

    @Column(name= "description_de_offre")
    private String descriptionOffre;

    @Column(name= "provenance_de_offre")
    private String originOffre;

    public CandidatureViaOffre() {
        super();
    }

    public CandidatureViaOffre(int idCandidature, Date date, String nom, Reponse repCandidature, String nomOffre, String lienOffre, String descriptionOffre, String originOffre) {
        super(idCandidature, date, nom, repCandidature);

        this.addresseOffre = lienOffre;
        this.descriptionOffre = descriptionOffre;
        this.originOffre = originOffre;
    }
}