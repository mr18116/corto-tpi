/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.corto2.controller;

import com.mycompany.corto2.Libro;
import java.util.Date;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author zarco
 */
public class LibroControllerTest {
    
    public LibroControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of LibroController method, of class LibroController.
     */
    @Test
    public void testCrearLibro() {
        System.out.println("LibroController");
        Long id = Long.parseLong("1");
        String isbn = "isbn";
        String titulo = "Don Quijote de la Mancha";
        String autor = "Miguel de Cervantes";
        Integer numPaginas = 10;
        Date fechaAlta = new Date(1,02,2021);
        Integer numDisponibles = 5;
        
        LibroController instance = new LibroController();
        Libro result = instance.crearLibro(id, isbn, titulo, autor, numPaginas, fechaAlta, numDisponibles);
        assertEquals(id, result.getId());
        assertEquals(isbn, result.getIsbn());
        assertEquals(titulo, result.getTitulo());
        assertEquals(autor, result.getAutor());
        assertEquals(numPaginas, result.getNumPaginas());
        assertEquals(fechaAlta, result.getFechaAlta());
        assertEquals(numDisponibles, result.getNumDisponibles());
    }
    
}
