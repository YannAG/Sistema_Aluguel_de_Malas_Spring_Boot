package com.alugueldemalas.yancampos.service;

import com.alugueldemalas.yancampos.model.Mala;
import com.alugueldemalas.yancampos.model.Usuario;
import com.alugueldemalas.yancampos.repository.MalaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MalaService {

    @Autowired
    MalaRepository repository;

    public Mala create(Mala mala) {
        return repository.save(mala);
    }

    public List<Mala> findAll() {
        return repository.findAll();
    }

    public Optional<Mala> findById(Long id) { return repository.findById(id);}

    public void delete(Long id) { repository.deleteById(id);}
}
