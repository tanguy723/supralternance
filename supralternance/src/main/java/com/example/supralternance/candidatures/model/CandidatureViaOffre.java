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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_candidature_par_offre")
    private int idCandidatureParOffre;

    private String addresseOffre;
    private String descriptionOffre;
    private String originOffre;

    public CandidatureViaOffre() {
        super();
    }

    public CandidatureViaOffre(int idCandidature, Date date, String nom, Reponse repCandidature, int id, String nomOffre, String lienOffre, String descriptionOffre, String originOffre) {
        super(idCandidature, date, nom, repCandidature);
        this.idCandidatureParOffre = id;
        this.addresseOffre = lienOffre;
        this.descriptionOffre = descriptionOffre;
        this.originOffre = originOffre;
    }
}