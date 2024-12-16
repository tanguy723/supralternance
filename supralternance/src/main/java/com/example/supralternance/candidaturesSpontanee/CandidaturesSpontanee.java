package com.example.supralternance.candidaturesSpontanee;
import com.example.supralternance.candidatures.Candidatures;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table()
public class CandidaturesSpontanee extends Candidatures {
    public enum com{ ReseauSocial, Email, VisitePhysique, AppelTelephonique }
    private com moyenCommunication;
    
    public CandidaturesSpontanee() {

    }

    public CandidaturesSpontanee(com moyenCommunication) {
            super();
            this.moyenCommunication = moyenCommunication;
    }
}




