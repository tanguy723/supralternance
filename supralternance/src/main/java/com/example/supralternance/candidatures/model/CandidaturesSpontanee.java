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
@Table(name="candidature_spontanée")
public class CandidaturesSpontanee extends Candidatures {

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name=  "id_candidature_par_offre")
    private Integer id_candidature_spontanee;
    
    public enum com{ ReseauSocial, Email, VisitePhysique, AppelTelephonique }

    @Column(name="moyen_de_communication")
    private com moyenCommunication;
    
    public CandidaturesSpontanee() {

    }

    public CandidaturesSpontanee(int idCandidature, Date date, String nom, reponse repCandidature, com moyenCommunication) {
            super(idCandidature, date, nom, repCandidature);
            this.moyenCommunication = moyenCommunication;
    }
}




