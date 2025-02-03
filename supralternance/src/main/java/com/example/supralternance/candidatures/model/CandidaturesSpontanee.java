package com.example.supralternance.candidatures.model;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;


@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) 
@Table(name="candidature_spontanée")
public class CandidaturesSpontanee extends Candidatures {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name=  "id_candidature_par_offre")
    private int  id_candidature_spontanee;
    
    public enum com{ ReseauSocial, Email, VisitePhysique, AppelTelephonique }

    @Column(name="moyen_de_communication")
    private com moyenCommunication;
    
    public CandidaturesSpontanee() {

    }


     public void setCandidatureSpontaneeID(int id_candidature_spontanee) {
        this.id_candidature_spontanee = id_candidature_spontanee;
    }

    public com getMoyenCommunication() {
        return moyenCommunication;
    }


    public void setMoyenCommunication(com moyenCommunication) {
        this.moyenCommunication = moyenCommunication;
    }


    public CandidaturesSpontanee(int idCandidature, Date date, String nom, reponse repCandidature, com moyenCommunication) {
            super(idCandidature, date, nom, repCandidature);
            this.moyenCommunication = moyenCommunication;
    }




   
}




