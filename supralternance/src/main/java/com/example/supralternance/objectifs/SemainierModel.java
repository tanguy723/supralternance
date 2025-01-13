package com.example.supralternance.objectifs;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="semainier")
public class SemainierModel extends ObjectifsModel{

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    @Id
    private int id_semainier;
    private int ObjectifParSemaine;

    public SemainierModel(){}

    public SemainierModel(boolean accomplis, int objectifs){
        super(accomplis);
        this.ObjectifParSemaine = objectifs;
    }
    
}
