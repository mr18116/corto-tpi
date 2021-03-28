/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.corto2.controller;

import com.mycompany.corto2.Libro;
import com.mycompany.corto2.Reserva;
import com.mycompany.corto2.Usuario;
import java.util.Date;

/**
 *
 * @author zarco
 */
public class ReservasController {
        
    public Reserva ReservaController(Long id, Usuario usuarioId, Libro libroId, Date fechaReserva, Date fechadeFinalizacion, String estado, String tipoFinal){
        Reserva reserva = new Reserva();
        reserva.setId(id);
        reserva.setUsuarioId(usuarioId);
        reserva.setLibroId(libroId);
        reserva.setFecha(fechaReserva);
        reserva.setFechaFin(fechadeFinalizacion);
        reserva.setEstado(estado);
        reserva.setTipoFinal(tipoFinal);
        
        return reserva;
    }
}
