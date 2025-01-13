package com.example.supralternance.objectifs;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="deadline")
public class DeadlineModel extends ObjectifsModel{
    @Id
    private Integer id_Deadline;
    private Date dateDeadline;
    
    public DeadlineModel(){}

    public DeadlineModel(boolean accomplis, Date deadline){
        super(accomplis);
        this.dateDeadline = deadline;
    }
}
