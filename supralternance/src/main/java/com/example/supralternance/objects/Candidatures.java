package com.example.supralternance.objects;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Candidatures {

    private int idCandidature;
    private Date dateCandidature;
    private String nomCandidature;

    public enum reponse{ POSITIF, NEGATIF, ATTENTE }

    private  reponse reponseCandidature;

    private String nomEntreprise;
    private String adresseEntreprise;
    private String telephoneEntreprise;
    private String emailEntreprise;

}
