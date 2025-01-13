package com.example.supralternance.objectifs;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="evenements")
public class EvenementsModel extends ObjectifsModel{

    private String nomEvent;
    private Date dateEvent;
    private String descriptionEvent;

    public EvenementsModel(){}

    public EvenementsModel(boolean accomplis, String nomEvents, Date dateEvent, String descriptionEvent){
        super(accomplis);
        this.nomEvent = nomEvent;
        this.dateEvent = dateEvent;
        this.descriptionEvent = descriptionEvent;
        
    }
    
}
