package com.example.supralternance.candidatures.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "entreprises")
public class Entreprise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_entreprise")
    private int idEntreprise;

    @Column(name = "nom_entreprise_concerne")
    private String nom;

    @Column(name = "addresse_electronique")
    private String emailEntreprise;

    @Column(name = "telephone")
    private String telephoneEntreprise;

    @Column(name = "addresse_phys")
    private String addresseEntreprise;

    public Entreprise() {}

    public Entreprise(int id, String nom, String email, String telephone, String addresse) {
        this.idEntreprise = id;
        this.nom = nom;
        this.emailEntreprise = email;
        this.telephoneEntreprise = telephone;
        this.addresseEntreprise = addresse;
    }
}
