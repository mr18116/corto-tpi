/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.corto2.controller;

import com.mycompany.corto2.Bibliotecario;
import com.mycompany.corto2.Ejemplar;
import com.mycompany.corto2.Libro;
import com.mycompany.corto2.Usuario;
import com.mycompany.corto2.list.EjemplaresList;
import com.mycompany.corto2.list.LibrosList;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
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

        List<Libro> expResult = new LibrosList().getLibros();
        
        List<Libro> result = instance.ConsultarLibros();
        assertEquals(expResult, result);

    }

    /**
     * Test of ConsultarEjemplares method, of class BibliotecarioController.
     */
    @Test
    public void testConsultarEjemplares() {
        System.out.println("ConsultarEjemplares");
        BibliotecarioController instance = new BibliotecarioController();
        List<Ejemplar> expResult = new EjemplaresList().getEjemplares();
        List<Ejemplar> result = instance.ConsultarEjemplares();
        assertEquals(expResult, result);

    }

    /**
     * Test of BajarLibro method, of class BibliotecarioController.
     */
    @Test
    public void testBajarLibro() {
        System.out.println("BajarLibro");
        Libro libro = new LibrosList().getLibros().get(0);
        BibliotecarioController instance = new BibliotecarioController();
        Libro expResult = new LibrosList().getLibros().get(0);
        Libro result = instance.BajarLibro(libro);
        assertEquals(expResult, result);
        System.out.println("Libro dado de baja\ntitulo:" + result.getTitulo() + "\nISBN: " + result.getIsbn());
    }

    /**
     * Test of BajarEjemplar method, of class BibliotecarioController.
     */
    @Test
    public void testBajarEjemplar() {
        System.out.println("BajarEjemplar");
        Ejemplar ejemplar = new EjemplaresList().getEjemplares().get(0);
        BibliotecarioController instance = new BibliotecarioController();
        Ejemplar expResult = new EjemplaresList().getEjemplares().get(0);
        Ejemplar result = instance.BajarEjemplar(ejemplar);
        assertEquals(expResult, result);
        System.out.println("Ejemplar dado de baja\nid:" + result.getIdEjemplar());
    }

    /**
     * Test of ModificarLibro method, of class BibliotecarioController.
     */
    @Test
    public void testModificarLibro() {
        System.out.println("ModificarLibro");
        Libro libro = new LibrosList().getLibros().get(0);
        BibliotecarioController instance = new BibliotecarioController();
        Libro expResult = new LibrosList().getLibros().get(0);
        Libro result = instance.ModificarLibro(libro);
        assertEquals(expResult, result);
        System.out.println("Libro modificado\ntitulo:" + result.getTitulo() + "\nISBN: " + result.getIsbn());
    }

    /**
     * Test of ModificarEjemplar method, of class BibliotecarioController.
     */
    @Test
    public void testModificarEjemplar() {
        System.out.println("ModificarEjemplar");
        Ejemplar ejemplar = new EjemplaresList().getEjemplares().get(0);;
        BibliotecarioController instance = new BibliotecarioController();
        Ejemplar expResult = new EjemplaresList().getEjemplares().get(0);;
        Ejemplar result = instance.ModificarEjemplar(ejemplar);
        assertEquals(expResult, result);
        System.out.println("Ejemplar dado de baja\nid:" + result.getIdEjemplar());
    }

    /**
     * Test of EjemplaresPrestados method, of class BibliotecarioController.
     */
    @Test
    public void testEjemplaresPrestados() {
        System.out.println("EjemplaresPrestados");
        Libro libro = null;
        BibliotecarioController instance = new BibliotecarioController();
        Map<Ejemplar, Usuario> expResult = null;
        Map<Ejemplar, Usuario> result = instance.EjemplaresPrestados(libro);
        assertEquals(expResult, result);

    }
    
}
