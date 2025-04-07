package com.example.supralternance.candidatures.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CandidaturesViaOffre extends Candidatures{


    private int id_candidature_par_offre;

    private String addresseOffre;

    private String descriptionOffre;

    private String originOffre;


    public CandidaturesViaOffre() {
        super();
    }

    public CandidaturesViaOffre(int idCandidature, Date date, String nom, reponse repCandidature, int id, String nomOffre, String lienOffre, String setDescriptionOffre, String setOriginOffre){
        super(idCandidature, date, nom, repCandidature);
        this.id_candidature_par_offre = id;
        this.addresseOffre = lienOffre;
        this.descriptionOffre = setDescriptionOffre;
        this.originOffre = setOriginOffre;

    }

    @Override
    public String toString() {
        return "Candidatures [id=" + super.getId_candidature() + ", dateCandidature=" + super.getId_candidature() + 
        ", nomCandidature=" + super.getNomCandidature() + ", reponseCandidature= " + super.getReponseCandidature() + 
        ", addresseOffre=" + this.addresseOffre + ", descriptionOffre" + this.descriptionOffre 
        + ", originOffre" + "]";
    }

}
