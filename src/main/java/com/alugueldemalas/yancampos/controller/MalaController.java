package com.alugueldemalas.yancampos.controller;

import com.alugueldemalas.yancampos.model.Mala;
import com.alugueldemalas.yancampos.model.Usuario;
import com.alugueldemalas.yancampos.service.MalaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/mala")
public class MalaController {

    @Autowired
    MalaService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Mala> create(@RequestBody Mala mala) {
        Mala malaCreated = service.create(mala);

        return ResponseEntity.status(201).body(malaCreated);
    }

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<Mala> findAlld() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Mala> findById(@PathVariable Long id) { return service.findById(id);}

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {service.delete(id);}
}
