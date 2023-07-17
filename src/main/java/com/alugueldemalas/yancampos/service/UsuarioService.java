package com.alugueldemalas.yancampos.service;


import com.alugueldemalas.yancampos.model.Usuario;
import com.alugueldemalas.yancampos.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class UsuarioService {

    @Autowired
    UsuarioRepository repository;

    public Usuario create(Usuario usuario) {
        return repository.save(usuario);
    }

    public List<Usuario> findAll() { return repository.findAll();}

    public Optional<Usuario> findById(Long id) {
        return repository.findById(id);
    }

    public void delete(Long id) {

        repository.deleteById(id);
    }
}
