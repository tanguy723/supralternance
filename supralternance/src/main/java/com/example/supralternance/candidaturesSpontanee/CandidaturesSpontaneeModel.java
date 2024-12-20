package com.example.supralternance.candidaturesSpontanee;
import com.example.supralternance.candidatures.CandidaturesModel;

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

    public CandidaturesSpontaneeModel(com moyenCommunication) {
            super();
            this.moyenCommunication = moyenCommunication;
    }
}




