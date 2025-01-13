package com.example.supralternance.candidatures;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="candidature_par_offre")
public class CandidatureViaOffreModel extends CandidaturesModel{
    private String nomOffre;
    private String addresseOffre;
    private String descriptionOffre;
    private String originOffre;

    public CandidatureViaOffreModel() {}

    CandidatureViaOffreModel(int idCandidature, Date date, String nom, reponse repCandidature, String nomOffre, String lienOffre, String setDescriptionOffre, String setOriginOffre){
        super(idCandidature, date, nom, repCandidature);
        this.nomOffre = nomOffre;
        this.addresseOffre = lienOffre;
        this.descriptionOffre = setDescriptionOffre;
        this.originOffre = setOriginOffre;

    }

}
