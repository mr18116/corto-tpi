/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.corto2.list;

import com.mycompany.corto2.Reserva;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author fernando
 */
public class ReservasList {
    
    public List<Reserva> getReservas(){
        List<Reserva> reservas = new ArrayList<>();
        
        Reserva reserva1 = new Reserva();
        reserva1.setId(new Long(1));
        reserva1.setUsuarioId(new UsuariosList().getUsuarios().get(0));
        reserva1.setLibroId(new LibrosList().getLibros().get(0));
        reserva1.setFecha(new Date(1,02,2021));
        reserva1.setFechaFin(new Date(1,02,2022));
        reserva1.setEstado("ACTIVA");
        reserva1.setTipoFinal("CANCELADO");
        reservas.add(reserva1);
        
        return reservas;
    }
    
}
