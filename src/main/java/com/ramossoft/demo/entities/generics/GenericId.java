package com.ramossoft.demo.entities.generics;

import com.ramossoft.demo.entities.enumerators.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class GenericId {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id = null;
    // default = activo
    @Enumerated(EnumType.STRING)
    private Status status = Status.ACTIVE;
    private LocalDateTime timestamp = LocalDateTime.now();


}