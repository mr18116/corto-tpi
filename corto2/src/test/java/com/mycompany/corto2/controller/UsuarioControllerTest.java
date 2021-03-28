/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.corto2.controller;

import com.mycompany.corto2.controller.UsuarioController;
import com.mycompany.corto2.Usuario;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fernando
 */
public class UsuarioControllerTest {
    
    public UsuarioControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of crearUsuario method, of class UsuarioController.
     */
    @Test
    public void testCrearUsuario() {
        System.out.println("crearUsuario");
        UsuarioController instance = new UsuarioController();
        //Usuario expResult = "new";
        String nombre = "NOMBRE";
        Usuario result = instance.crearUsuario();
        assertEquals(nombre, result.getNombre());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
