package com.alugueldemalas.yancampos.service;

import com.alugueldemalas.yancampos.model.ReservaMala;
import com.alugueldemalas.yancampos.repository.ReservaMalaRespository;
import com.alugueldemalas.yancampos.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class ReservaMalaService {

    @Autowired
    ReservaMalaRespository respository;
    @Autowired
    private UsuarioRepository usuarioRepository;

    public ReservaMala create(ReservaMala reservaMala) {
        reservaMala.setStatus("RESERVADO");
        return respository.save(reservaMala);
    }

    public void updateStatusToBreak(Long reservaUsuarioId) throws Exception {
        Optional<ReservaMala> reservaUsuarioToUpdate = respository.findById(reservaUsuarioId);

        if (reservaUsuarioToUpdate.isPresent()) {
            ReservaMala reservaMala = reservaUsuarioToUpdate.get();
            String currentStatus = reservaMala.getStatus();

            if (currentStatus.equals("RESERVADO")) {
                reservaMala.setStatus("CANCELADO");
                respository.save(reservaMala);
            } else {
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Só é possível cancelar uma reserva com status RESERVADO");
            }
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "RESERVA NÃO ENCONTRADA");
        }



    }
}
