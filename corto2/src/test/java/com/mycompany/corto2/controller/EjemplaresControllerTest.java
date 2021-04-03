/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.corto2.controller;

import com.mycompany.corto2.Ejemplar;
import java.util.Date;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dany
 */
public class EjemplaresControllerTest {
    
    public EjemplaresControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of EjemplaresController method, of class EjemplaresController.
     */
    @Test
    public void testCrearEjemplar() {
      System.out.println("EjemplaresController");
        Date fechaAdquisicion = new Date(1, 10, 2223);
        Date fechaDevolucion = new Date(1, 10, 2220);
        Date fechaPrestamo = new Date(1, 10, 2222);
        String idEjemplar = "idEjemplar";
        String localizacion = "localizacion";
        String observaciones = "observaciones";
        EjemplaresController instance = new EjemplaresController();
        Ejemplar expResult = new Ejemplar();
        expResult.setFechaAdquisicion(fechaAdquisicion);
        expResult.setFechaDevolucion(fechaDevolucion);
        expResult.setFechaPrestamo(fechaPrestamo);
        expResult.setIdEjemplar(idEjemplar);
        expResult.setLocalizacion(localizacion);
        expResult.setObservaciones(observaciones);

        Ejemplar result = instance.crearEjemplar(fechaAdquisicion, fechaDevolucion, fechaPrestamo, idEjemplar, localizacion, observaciones);
        assertEquals(fechaAdquisicion, result.getFechaAdquisicion());
        assertEquals(fechaDevolucion, result.getFechaDevolucion());
        assertEquals(fechaPrestamo, result.getFechaPrestamo());
        assertEquals(idEjemplar, result.getIdEjemplar());
        assertEquals(localizacion, result.getLocalizacion());
        assertEquals(observaciones, result.getObservaciones());
    }
    
}
