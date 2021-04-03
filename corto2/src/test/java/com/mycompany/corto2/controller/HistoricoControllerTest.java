/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.corto2.controller;

import com.mycompany.corto2.Ejemplar;
import com.mycompany.corto2.Historico;
import com.mycompany.corto2.Usuario;
import java.util.Date;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author noe
 */
public class HistoricoControllerTest {
    
    public HistoricoControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of HistoricoConHistorico method, of class HistoricoController.
     */
    @Test
    public void testCrearHistorico() {
        System.out.println("HistoricoConHistorico");
        Date fechaDevolucion = new Date(31, 1, 2021);
        Date fechaDevolucionReal = new Date(15, 1, 2021);
        Date fechaPrestamo = new Date(1, 1, 2021);
        Usuario usuario_id = new Usuario();
        Ejemplar ejemplar_id = new Ejemplar();
        HistoricoController instance = new HistoricoController();
        Historico result = instance.crearHistorico(fechaDevolucion, fechaDevolucionReal, fechaPrestamo, usuario_id, ejemplar_id);
        assertEquals(fechaDevolucion, result.getFechaDevolucion());
        assertEquals(fechaDevolucionReal, result.getFechaDevolucionReal());
        assertEquals(fechaPrestamo, result.getFechaPrestamo());
        assertEquals(usuario_id, result.getUsuarioId());
        assertEquals(ejemplar_id, result.getEjemplarId());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
