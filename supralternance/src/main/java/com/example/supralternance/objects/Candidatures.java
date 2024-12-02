package com.example.supralternance.objects;

import java.util.Date;


public class Candidatures {

    private int idCandidature;
    private Date dateCandidature;
    private String nomCandidature;

    private enum reponse{ POSITIF, NEGATIF, ATTENTE }

    private  reponse reponseCandidature;

    private String nomEntreprise;
    private String adresseEntreprise;
    private String telephoneEntreprise;
    private String emailEntreprise;

}
