/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.corto2.controller;

import com.mycompany.corto2.Multa;
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
public class MultaControllerTest {
    
    public MultaControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of MultaController method, of class MultaController.
     */
    @Test
    public void testCrearMulta() {
        System.out.println("MultaController");
        String estado = "ACTIVO";
        Date fechaFin = new Date(1, 12, 2021);
        Date fechaInicio = new Date(1, 11, 2021);
        Usuario uID = new Usuario();
        MultaController instance = new MultaController();
        Multa result = instance.crearMulta(estado, fechaFin, fechaInicio, uID);
        assertEquals(estado, result.getEstado());
        assertEquals(fechaFin, result.getFechaFin());
        assertEquals(fechaInicio, result.getFechaInicio());
        assertEquals(uID, result.getUsuarioId());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
