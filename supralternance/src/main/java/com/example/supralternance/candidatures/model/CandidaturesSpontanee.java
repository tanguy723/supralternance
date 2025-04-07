package com.example.supralternance.candidatures.model;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CandidaturesSpontanee extends Candidatures {


    private int  id_candidature_spontanee;
    
    public enum com{ ReseauSocial, Email, VisitePhysique, AppelTelephonique }
    
    private com moyenCommunication;
    
    public CandidaturesSpontanee() {
        super();
    }


    public CandidaturesSpontanee(int idCandidature, Date date, String nom, reponse repCandidature, com moyenCommunication) {
            super(idCandidature, date, nom, repCandidature);
            this.moyenCommunication = moyenCommunication;
    }

    @Override
    public String toString() {
        return "Candidatures [id=" + super.getId_candidature() + ", dateCandidature=" + super.getId_candidature() + 
        ", nomCandidature=" + super.getNomCandidature() + ", reponseCandidature= " + super.getReponseCandidature() + 
        ", moyenCommunication=" + this.moyenCommunication + "]";
    }


   
}




