/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.corto2.controller;

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
        
        String nombre = "Juan";
        String apellido1 = "Perez";
        String apellido2 = "Perez";
        String email = "jp@gmail.com";
        String login = "9ty0";
        String password = "pass";
        String estado = "ACTIVO";
        String calle = "street";
        String ciudad = "city";
        String piso = "floor";
        Integer numero = 79490000;
        String codigoPostal = "0000";
        
        // Para usurio alumno
        String tipo = "alumno";
        String tutor = "Pedro";
        String departamento = "";
        
        UsuarioController alumno = new UsuarioController();
        Usuario result = alumno.crearUsuario(nombre, apellido1, apellido2, email, login, password, tipo, estado, calle, ciudad, piso, numero, codigoPostal, tutor, departamento);
        assertEquals(nombre, result.getNombre());
        assertEquals(apellido1, result.getApellido1());
        assertEquals(apellido2, result.getApellido2());
        assertEquals(email, result.getEmail());
        assertEquals(login, result.getLogin());
        assertEquals(password, result.getPassword());
        assertEquals(estado, result.getEstado());
        assertEquals(calle, result.getCalle());
        assertEquals(piso, result.getPiso());
        assertEquals(ciudad, result.getCiudad());
        assertEquals(numero, result.getNumero());
        assertEquals(codigoPostal, result.getCodigoPostal());
        
        assertEquals(tipo, result.getTipo());
        assertEquals(tutor, result.getTutor());
        
        // Para usuario profesor
        tipo = "profesor";
        tutor = "";
        departamento = "letras";
        
        UsuarioController profesor = new UsuarioController();
        result = profesor.crearUsuario(nombre, apellido1, apellido2, email, login, password, tipo, estado, calle, ciudad, piso, numero, codigoPostal, tutor, departamento);
        assertEquals(nombre, result.getNombre());
        assertEquals(apellido1, result.getApellido1());
        assertEquals(apellido2, result.getApellido2());
        assertEquals(email, result.getEmail());
        assertEquals(login, result.getLogin());
        assertEquals(password, result.getPassword());
        assertEquals(estado, result.getEstado());
        assertEquals(calle, result.getCalle());
        assertEquals(piso, result.getPiso());
        assertEquals(ciudad, result.getCiudad());
        assertEquals(numero, result.getNumero());
        assertEquals(codigoPostal, result.getCodigoPostal());
        
        assertEquals(tipo, result.getTipo());
        assertEquals(departamento, result.getDepartamento());
    }
    
}
