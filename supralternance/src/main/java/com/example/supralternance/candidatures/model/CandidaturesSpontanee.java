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
@Table(name="candidature_spontanée")
public class CandidaturesSpontanee extends Candidatures {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name=  "id_candidature_par_offre")
    private UUID id_candidature_spontanee;
    
    public enum com{ ReseauSocial, Email, VisitePhysique, AppelTelephonique }

    @Column(name="moyen_de_communication")
    private com moyenCommunication;
    
    public CandidaturesSpontanee() {

    }


     public void setCandidatureSpontaneeID(UUID id_candidature_spontanee) {
        this.id_candidature_spontanee = id_candidature_spontanee;
    }

    public com getMoyenCommunication() {
        return moyenCommunication;
    }


    public void setMoyenCommunication(com moyenCommunication) {
        this.moyenCommunication = moyenCommunication;
    }


    public CandidaturesSpontanee(UUID idCandidature, Date date, String nom, reponse repCandidature, com moyenCommunication) {
            super(idCandidature, date, nom, repCandidature);
            this.moyenCommunication = moyenCommunication;
    }




   
}




