package com.example.supralternance.objectifs;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="objectifs")
public class ObjectifsModel {
    private boolean accomplis;

    
    public ObjectifsModel(){}

    public ObjectifsModel(boolean accomplis){
        this.accomplis = accomplis;
    }
}
