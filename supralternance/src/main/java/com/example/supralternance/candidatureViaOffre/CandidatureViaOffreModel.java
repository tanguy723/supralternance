package com.example.supralternance.candidatureViaOffre;

import com.example.supralternance.candidatures.CandidaturesModel;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table()
public class CandidatureViaOffreModel extends CandidaturesModel{
    private String nomOffre;
    private String lienOffre;
    private String descriptionOffre;
    private String originOffre;

    public CandidatureViaOffreModel() {}

    CandidatureViaOffreModel(String nomOffre, String lienOffre, String setDescriptionOffre, String setOriginOffre){
        super();
        this.nomOffre = nomOffre;
        this.lienOffre = lienOffre;
        this.descriptionOffre = setDescriptionOffre;
        this.originOffre = setOriginOffre;

    }

}
