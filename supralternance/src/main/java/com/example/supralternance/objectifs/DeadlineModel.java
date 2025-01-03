package com.example.supralternance.objectifs;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table()
public class DeadlineModel extends ObjectifsModel{
    private Date dateDeadline;
    
    public DeadlineModel(){}

    public DeadlineModel(boolean accomplis, Date deadline){
        super(accomplis);
        this.dateDeadline = deadline;
    }
}
