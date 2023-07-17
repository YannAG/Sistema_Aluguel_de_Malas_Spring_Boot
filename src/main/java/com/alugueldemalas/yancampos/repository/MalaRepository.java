package com.alugueldemalas.yancampos.repository;


import com.alugueldemalas.yancampos.model.Mala;
import com.alugueldemalas.yancampos.model.Usuario;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MalaRepository extends JpaRepository<Mala, Long> {

}
