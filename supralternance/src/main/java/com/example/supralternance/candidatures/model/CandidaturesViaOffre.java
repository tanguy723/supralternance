package com.example.supralternance.candidatures.model;

import java.util.Date;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="candidature_par_offre")
public class CandidaturesViaOffre extends Candidatures{

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name=  "id_candidature_spontanee")
    private Integer id_candidature_par_offre;

    @Column(name= "addresse_de_offre")
    private String addresseOffre;

    @Column(name= "description_de_offre")
    private String descriptionOffre;

    @Column(name= "provenance_de_offre")
    private String originOffre;



    
    public CandidaturesViaOffre() {}

    CandidaturesViaOffre(int idCandidature, Date date, String nom, reponse repCandidature, Integer id, String nomOffre, String lienOffre, String setDescriptionOffre, String setOriginOffre){
        super(idCandidature, date, nom, repCandidature);
        this.id_candidature_par_offre = id;
        this.addresseOffre = lienOffre;
        this.descriptionOffre = setDescriptionOffre;
        this.originOffre = setOriginOffre;

    }


}
