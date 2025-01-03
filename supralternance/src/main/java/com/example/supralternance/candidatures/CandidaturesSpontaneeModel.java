package com.example.supralternance.candidatures;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table()
public class CandidaturesSpontaneeModel extends CandidaturesModel {
    public enum com{ ReseauSocial, Email, VisitePhysique, AppelTelephonique }
    private com moyenCommunication;
    
    public CandidaturesSpontaneeModel() {

    }

    public CandidaturesSpontaneeModel(int idCandidature, Date date, String nom, reponse repCandidature, com moyenCommunication) {
            super(idCandidature, date, nom, repCandidature);
            this.moyenCommunication = moyenCommunication;
    }
}




