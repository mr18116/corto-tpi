/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.corto2C;

import java.util.Date;
import java.util.Set;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author zarco
 */
public class LibroDomainTest {
    
    public LibroDomainTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getIsbn method, of class LibroDomain.
     */
    @Test
    public void testGetIsbn() {
        System.out.println("getIsbn");
        LibroDomain instance = null;
        String expResult = "";
        String result = instance.getIsbn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIsbn method, of class LibroDomain.
     */
    @Test
    public void testSetIsbn() {
        System.out.println("setIsbn");
        String isbn = "";
        LibroDomain instance = null;
        instance.setIsbn(isbn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitulo method, of class LibroDomain.
     */
    @Test
    public void testGetTitulo() {
        System.out.println("getTitulo");
        LibroDomain instance = null;
        String expResult = "";
        String result = instance.getTitulo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitulo method, of class LibroDomain.
     */
    @Test
    public void testSetTitulo() {
        System.out.println("setTitulo");
        String titulo = "";
        LibroDomain instance = null;
        instance.setTitulo(titulo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAutor method, of class LibroDomain.
     */
    @Test
    public void testGetAutor() {
        System.out.println("getAutor");
        LibroDomain instance = null;
        String expResult = "";
        String result = instance.getAutor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAutor method, of class LibroDomain.
     */
    @Test
    public void testSetAutor() {
        System.out.println("setAutor");
        String autor = "";
        LibroDomain instance = null;
        instance.setAutor(autor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumPaginas method, of class LibroDomain.
     */
    @Test
    public void testGetNumPaginas() {
        System.out.println("getNumPaginas");
        LibroDomain instance = null;
        Integer expResult = null;
        Integer result = instance.getNumPaginas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumPaginas method, of class LibroDomain.
     */
    @Test
    public void testSetNumPaginas() {
        System.out.println("setNumPaginas");
        Integer numPaginas = null;
        LibroDomain instance = null;
        instance.setNumPaginas(numPaginas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaAlta method, of class LibroDomain.
     */
    @Test
    public void testGetFechaAlta() {
        System.out.println("getFechaAlta");
        LibroDomain instance = null;
        Date expResult = null;
        Date result = instance.getFechaAlta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaAlta method, of class LibroDomain.
     */
    @Test
    public void testSetFechaAlta() {
        System.out.println("setFechaAlta");
        Date fechaAlta = null;
        LibroDomain instance = null;
        instance.setFechaAlta(fechaAlta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEjemplares method, of class LibroDomain.
     */
    @Test
    public void testGetEjemplares() {
        System.out.println("getEjemplares");
        LibroDomain instance = null;
        Set<EjemplarDomain> expResult = null;
        Set<EjemplarDomain> result = instance.getEjemplares();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEjemplares method, of class LibroDomain.
     */
    @Test
    public void testSetEjemplares() {
        System.out.println("setEjemplares");
        Set<EjemplarDomain> ejemplares = null;
        LibroDomain instance = null;
        instance.setEjemplares(ejemplares);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReservas method, of class LibroDomain.
     */
    @Test
    public void testGetReservas() {
        System.out.println("getReservas");
        LibroDomain instance = null;
        Set<ReservaDomain> expResult = null;
        Set<ReservaDomain> result = instance.getReservas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReservas method, of class LibroDomain.
     */
    @Test
    public void testSetReservas() {
        System.out.println("setReservas");
        Set<ReservaDomain> reservas = null;
        LibroDomain instance = null;
        instance.setReservas(reservas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumDisponibles method, of class LibroDomain.
     */
    @Test
    public void testGetNumDisponibles() {
        System.out.println("getNumDisponibles");
        LibroDomain instance = null;
        Integer expResult = null;
        Integer result = instance.getNumDisponibles();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumDisponibles method, of class LibroDomain.
     */
    @Test
    public void testSetNumDisponibles() {
        System.out.println("setNumDisponibles");
        Integer numDisponibles = null;
        LibroDomain instance = null;
        instance.setNumDisponibles(numDisponibles);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class LibroDomain.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        LibroDomain instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class LibroDomain.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        LibroDomain instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
