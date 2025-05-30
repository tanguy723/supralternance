package com.example.supralternance.candidatures.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "candidature_spontanée")
public class CandidatureSpontanee extends Candidature {



    public enum communication { ReseauSocial, Email, VisitePhysique, AppelTelephonique }

    @Enumerated(EnumType.STRING)
    @Column(name = "moyen_de_communication")
    private communication moyenCommunication;

    public CandidatureSpontanee() {
        super();
    }

    public CandidatureSpontanee(int idCandidature, Date date, String nom, Reponse repCandidature, communication moyenCommunication) {
        super(idCandidature, date, nom, repCandidature);
        this.moyenCommunication = moyenCommunication;
    }
}




