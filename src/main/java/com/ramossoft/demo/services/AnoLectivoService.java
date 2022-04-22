package com.ramossoft.demo.services;

import com.ramossoft.demo.entities.AnoLectivoEntity;
import com.ramossoft.demo.repositories.AnoLectivoRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Data
@RequiredArgsConstructor

public class AnoLectivoService {
    private final AnoLectivoRepository repository;

    public AnoLectivoEntity save(AnoLectivoEntity ano_lectivo){
        return Optional.of(this.repository.save(ano_lectivo)).orElseThrow(() -> new IllegalArgumentException("Algum valor mal passado"));
    }
    public List<AnoLectivoEntity> getAll(){
        return this.repository.findAll();
    }
    public Optional<AnoLectivoEntity> listById(long id){
        return Optional.ofNullable(this.repository.findAll().stream()
                .filter(repository -> repository.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("id nao encontrado")));
    }
}
