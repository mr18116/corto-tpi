/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.corto2.controller;

import com.mycompany.corto2.Bibliotecario;
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
    
}
