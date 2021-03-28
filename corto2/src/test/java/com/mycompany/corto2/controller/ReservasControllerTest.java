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
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author zarco
 */
public class ReservasControllerTest {
    
    public ReservasControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of ReservaController method, of class ReservasController.
     */
    @Test
    public void testReservaController() {
        System.out.println("ReservaController");
        Long id = Long.parseLong("1");;
        Usuario usuarioId = new Usuario();
        Libro libroId = new Libro();
        Date fechaReserva = new Date(1,02,2021);
        Date fechadeFinalizacion = new Date(1,04,2021);
        String estado = "activo";
        String tipoFinal = "cancelada";
        
        ReservasController instance = new ReservasController();
        Reserva result = instance.ReservaController(id, usuarioId, libroId, fechaReserva, fechadeFinalizacion, estado, tipoFinal);
        assertEquals(id, result.getId());
        assertEquals(usuarioId, result.getUsuarioId());
        assertEquals(libroId, result.getLibroId());
        assertEquals(fechaReserva, result.getFecha());
        assertEquals(fechadeFinalizacion, result.getFechaFin());
        assertEquals(estado, result.getEstado());
        assertEquals(tipoFinal, result.getTipoFinal());
    }
    
}
