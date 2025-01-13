package com.example.supralternance.objectifs;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="semainier")
public class SemainierModel extends ObjectifsModel{

    private int ObjectifParSemaine;

    public SemainierModel(){}

    public SemainierModel(boolean accomplis, int objectifs){
        super(accomplis);
        this.ObjectifParSemaine = objectifs;
    }
    
}
