package com.example.supralternance.candidatures;
import java.util.Date;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name="candidature_spontanée")
public class CandidaturesSpontaneeModel extends CandidaturesModel {

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    @Id
    private Integer id_candidature_spontanee;
    
    public enum com{ ReseauSocial, Email, VisitePhysique, AppelTelephonique }

    @Column(name="moyen_de_communication")
    private com moyenCommunication;
    
    public CandidaturesSpontaneeModel() {

    }

    public CandidaturesSpontaneeModel(int idCandidature, Date date, String nom, reponse repCandidature, com moyenCommunication) {
            super(idCandidature, date, nom, repCandidature);
            this.moyenCommunication = moyenCommunication;
    }
}




