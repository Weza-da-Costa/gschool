package com.ramossoft.demo.entities.generics;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity(name = "person")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class AbstractPerson extends GenericId{

    @Column(nullable = false)
    private String name;
    private String surname;
    @Column(unique = true)
    private String email;
    @Column(unique = true)
    private String telephone;
    private LocalDateTime birthday;
    private String country;
    private String city;
    private String street;
    private String county;
    private String fotograph;


}