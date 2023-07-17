package com.alugueldemalas.yancampos.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Mala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String modelo;


    private String tamanho;


    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    // getters e setters
}

