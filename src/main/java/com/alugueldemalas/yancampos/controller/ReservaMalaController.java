package com.alugueldemalas.yancampos.controller;

import com.alugueldemalas.yancampos.model.ReservaMala;
import com.alugueldemalas.yancampos.service.ReservaMalaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reserva-mala")
public class ReservaMalaController {

    @Autowired
    ReservaMalaService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<ReservaMala> crete(@RequestBody ReservaMala reservaMala) {
        ReservaMala reservaMalaCreated = service.create(reservaMala);

        return ResponseEntity.status(201).body(reservaMalaCreated);
    }

    @PatchMapping("/atualiza-status/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void atualizaStatus(@PathVariable Long id) throws Exception {
        service.updateStatusToBreak(id);
    }
}
