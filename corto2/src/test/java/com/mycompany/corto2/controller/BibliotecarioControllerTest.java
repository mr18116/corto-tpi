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
import com.mycompany.corto2.list.UsuariosList;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
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
        Libro libro = new LibrosList().getLibros().get(0);
        BibliotecarioController instance = new BibliotecarioController();
        Map<Ejemplar, List<Usuario>> expResult = new HashMap<>();
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new UsuariosList().getUsuarios().get(0));
        expResult.put(new EjemplaresList().getEjemplares().get(0), usuarios);
        Map<Ejemplar, List<Usuario>> result = instance.EjemplaresPrestados(libro);
        assertEquals(expResult, result);
        System.out.println(result);
    }

    /**
     * Test of AltaLibro method, of class BibliotecarioController.
     */
    @Test
    public void testAltaLibro() {
        System.out.println("AltaLibro");
        Long id = new Long(1);
        String isbn = "isbn";
        String titulo = "Don Quijote de la Mancha";
        String autor = "Miguel de Cervantes";
        Integer numPaginas = 10;
        Date fechaAlta = new Date(1,02,2021);
        Integer numDisponibles = 5;
        BibliotecarioController instance = new BibliotecarioController();
        Libro result = instance.AltaLibro(id, isbn, titulo, autor, numPaginas, fechaAlta, numDisponibles);
        assertEquals(id, result.getId());
        assertEquals(isbn, result.getIsbn());
        assertEquals(titulo, result.getTitulo());
        assertEquals(autor, result.getAutor());
        assertEquals(numPaginas, result.getNumPaginas());
        assertEquals(fechaAlta, result.getFechaAlta());
        assertEquals(numDisponibles, result.getNumDisponibles());

    }

    /**
     * Test of AltaEjemplar method, of class BibliotecarioController.
     */
    @Test
    public void testAltaEjemplar() {
        System.out.println("AltaEjemplar");
        Date fechaAdquisicion = new Date(1, 10, 2223);
        Date fechaDevolucion = new Date(1, 10, 2220);
        Date fechaPrestamo = new Date(1, 10, 2222);
        String idEjemplar = "idEjemplar";
        String localizacion = "localizacion";
        String observaciones = "observaciones";
        BibliotecarioController instance = new BibliotecarioController();
        
        Ejemplar result = instance.AltaEjemplar(fechaAdquisicion, fechaDevolucion, fechaPrestamo, idEjemplar, localizacion, observaciones);
        assertEquals(fechaAdquisicion, result.getFechaAdquisicion());
        assertEquals(fechaDevolucion, result.getFechaDevolucion());
        assertEquals(fechaPrestamo, result.getFechaPrestamo());
        assertEquals(idEjemplar, result.getIdEjemplar());
        assertEquals(localizacion, result.getLocalizacion());
        assertEquals(observaciones, result.getObservaciones());

    }

    /**
     * Test of LibrosReservados method, of class BibliotecarioController.
     */
    @Test
    public void testLibrosReservados() {
        System.out.println("LibrosReservados");
        BibliotecarioController instance = new BibliotecarioController();
        Map<Libro, List<Usuario>> expResult = new HashMap<>();
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new UsuariosList().getUsuarios().get(0));
        expResult.put(new LibrosList().getLibros().get(0), usuarios);
        Map<Libro, List<Usuario>> result = instance.LibrosReservados();
        assertEquals(expResult, result);
        System.out.println(result);
    }
    
}
