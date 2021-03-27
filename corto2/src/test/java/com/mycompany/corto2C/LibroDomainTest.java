/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.corto2C;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author zarco
 */
public class LibroDomainTest {
/*** Dos libros son iguales cuando tienen el mismo ISBN*/
@Test
public void testEquals() {
	LibroDomain libro1 = new LibroDomain("123456789");
	LibroDomain libro2 = new LibroDomain("123456789");
	assertTrue(libro1.equals(libro2));
	libro2.setIsbn(null);
	assertFalse(libro1.equals(libro2));
}

@Test
public void testContainsEjemplares() {
	LibroDomain libro1 = new LibroDomain("123456789");
	EjemplarDomain ejemplar1 = new EjemplarDomain(libro1, "A");
	EjemplarDomain ejemplar2 = new EjemplarDomain(libro1, "B");
	EjemplarDomain ejemplar3 = new EjemplarDomain(libro1, "C");
	libro1.getEjemplares().add(ejemplar1);
	libro1.getEjemplares().add(ejemplar2);
	// Comprueba igualdad de referencia
	//assertTrue(libro1.getEjemplares().contains(ejemplar1));
        //assertFalse(libro1.getEjemplares().contains(ejemplar3));
	// Comprueba igualdad de valor
        //assertTrue(libro1.getEjemplares().contains(new EjemplarDomain(libro1, "A")));
}
}