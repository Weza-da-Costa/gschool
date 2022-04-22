package com.ramossoft.demo.entities.generics;


import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class GenericValue extends GenericId{

    @Column(nullable = false, unique = true)
    private String designation;
    private String description;

}