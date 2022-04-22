package com.ramossoft.demo.controllers;

import com.ramossoft.demo.entities.AnoLectivoEntity;
import com.ramossoft.demo.services.AnoLectivoService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(path = "api/ano_lectivo")
@Data
@RequiredArgsConstructor

public class AnoLectivoController {
    private final AnoLectivoService service;

    @PostMapping(path = "/create")
    public ResponseEntity<AnoLectivoEntity> create(@RequestBody AnoLectivoEntity entity){
        return new ResponseEntity<>(service.save(entity), HttpStatus.CREATED);
    }
    @GetMapping(path = "/findAll")
    public ResponseEntity<List<AnoLectivoEntity>> findAll(){
        return ResponseEntity.ok(service.getAll());
    }
    @GetMapping(path = "/listById/{id}")
    public ResponseEntity<Optional<AnoLectivoEntity>> getById(@PathVariable long id){
        return ResponseEntity.ok(service.listById(id));
    }
}
