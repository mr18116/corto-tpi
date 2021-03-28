/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.corto2.controller;

import com.mycompany.corto2.Bibliotecario;
import com.mycompany.corto2.Libro;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author noe
 */
public class BibliotecarioControllerTest {
    
    public BibliotecarioControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of BibliotecaController method, of class BibliotecarioController.
     */
    @Test
    public void testBibliotecaController() {
        System.out.println("BibliotecaController");
        String email = "mail";
        String login = "login";
        String password = "pass";
        String nif = "nif";
        BibliotecarioController instance = new BibliotecarioController();
        Bibliotecario result = instance.BibliotecaController(email, login, password, nif);
        assertEquals(email, result.getEmail());
        assertEquals(login, result.getLogin());
        assertEquals(password, result.getPassword());
        assertEquals(nif , result.getNif());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of ConsultarLibros method, of class BibliotecarioController.
     */
    @Test
    public void testConsultarLibros() {
        System.out.println("ConsultarLibros");
        BibliotecarioController instance = new BibliotecarioController();

        List<Libro> expResult = new ArrayList<Libro>();
        Libro libro1 = new Libro();
        libro1.setId(Long.parseLong("1"));
        libro1.setIsbn("345");
        libro1.setTitulo("Libro1");
        libro1.setAutor("Marshall");
        libro1.setNumPaginas(130);
        libro1.setFechaAlta(new Date(1,02,2021));
        libro1.setNumDisponibles(5);
        expResult.add(libro1);
        
        List<Libro> result = instance.ConsultarLibros();
        assertEquals(expResult, result);

    }
    
}
