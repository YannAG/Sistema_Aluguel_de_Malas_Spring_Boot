package com.alugueldemalas.yancampos.repository;

import com.alugueldemalas.yancampos.model.ReservaMala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservaMalaRespository extends JpaRepository<ReservaMala, Long> {
    List<ReservaMala> findByUsuarioId(Long usuarioId);
}
