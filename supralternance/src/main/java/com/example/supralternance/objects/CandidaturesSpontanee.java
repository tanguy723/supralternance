package com.example.supralternance.objects;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CandidaturesSpontanee extends Candidatures {
    public enum com{ ReseauSocial, Email, VisitePhysique, AppelTelephonique }
    private com moyenCommunication;


    public CandidaturesSpontanee() {

    }

    public com getMoyenCommunication() {
        return moyenCommunication;
    }

    public com setMoyenCommunication(com moyenCommunication) {
        this.moyenCommunication = moyenCommunication;
        return moyenCommunication;
    }
}



