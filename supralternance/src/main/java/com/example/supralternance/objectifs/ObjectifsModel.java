package com.example.supralternance.objectifs;
import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="objectifs")
public class ObjectifsModel {

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    @Id
    private Integer id_objectif;
    private boolean accomplis;

    public ObjectifsModel(){}

    public ObjectifsModel(boolean accomplis){
        this.accomplis = accomplis;
    }
}
