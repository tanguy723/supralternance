package com.example.supralternance.candidatureViaOffre;
import com.example.supralternance.candidatures.Candidatures;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table()
public class CandidatureViaOffre extends Candidatures{
    private String nomOffre;
    private String lienOffre;
    private String descriptionOffre;
    private String originOffre;

    CandidatureViaOffre() {}

    CandidatureViaOffre(String nomOffre, String lienOffre, String setDescriptionOffre, String setOriginOffre){
        super();
        this.nomOffre = nomOffre;
        this.lienOffre = lienOffre;
        this.descriptionOffre = setDescriptionOffre;
        this.originOffre = setOriginOffre;

    }
}
