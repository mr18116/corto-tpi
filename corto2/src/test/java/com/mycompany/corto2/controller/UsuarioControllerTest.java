/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.corto2.controller;

import com.mycompany.corto2.Ejemplar;
import com.mycompany.corto2.Libro;
import com.mycompany.corto2.Usuario;
import com.mycompany.corto2.list.EjemplaresList;
import com.mycompany.corto2.list.LibrosList;
import com.mycompany.corto2.list.ReservasList;
import com.mycompany.corto2.list.UsuariosList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

    @Test
    public void testConsultarEjemplares() {
        System.out.println("ConsultarEjemplares");
        UsuariosList user = new UsuariosList();
        EjemplaresList ejemplares = new EjemplaresList();
        Usuario usuario = user.getUsuarios().get(0);
        
        List<Ejemplar> obtenido = new ArrayList<Ejemplar>();
        
        UsuarioController userController = new UsuarioController();
        obtenido = userController.consultarEjemplares(usuario);
        System.out.println(obtenido);
        assertEquals(obtenido, ejemplares.getEjemplares());
    }
    
    @Test
    public void testConsultarTodosLibros(){
        System.out.println("ConsultarTodosLibros");
        LibrosList librosEsperados = new LibrosList();        
        UsuarioController usuario = new UsuarioController();        
        assertEquals(librosEsperados.getLibros(), usuario.consultarTodosLibros());        
    }
    
    @Test
    public void testConsultarTodosEjemplares(){
        System.out.println("ConsultarTodosLibros");
       EjemplaresList ejemplaresEsperados = new EjemplaresList();
        UsuarioController usuario = new UsuarioController();        
        assertEquals(ejemplaresEsperados.getEjemplares(),usuario.consultarTodosEjemplares());        
    }
    
    @Test
    public void testHistoricoPrestamosEjemplar(){
        System.out.println("HistoricoPrestamos");
        List<Ejemplar> ejemplarEsperado = new EjemplaresList().getEjemplares();
        
        UsuarioController usuario = new UsuarioController();     
        Usuario user = new UsuariosList().getUsuarios().get(0);
        
        
        assertEquals(ejemplarEsperado, usuario.historicoPrestamosEjemplar(user));        
    }
    
    @Test
    public void testReservaLibros(){
        System.out.println("ReservaLibros");
        Libro LibroEsperado = new ReservasList().getReservas().get(0).getLibroId();
        
        List<Libro> librosEsperados = new ArrayList<>();
        librosEsperados.add(LibroEsperado);
        
        UsuarioController usuario = new UsuarioController();     
        Usuario user = new UsuariosList().getUsuarios().get(0);
        
        
        assertEquals(librosEsperados, usuario.reservasLibros(user));        
    }
    
    @Test
    public void testConsultarLibros(){
        System.out.println("ConsultarLibros");
        Map<Libro, List<Ejemplar>> esperado = new HashMap<>();
        List<Ejemplar> ejemplares = new ArrayList<>();
        ejemplares.add(new EjemplaresList().getEjemplares().get(0));
        Libro libro = new LibrosList().getLibros().get(0);
        esperado.put(libro, ejemplares);
        
        UsuarioController usuario = new UsuarioController();
        
        Usuario user = new UsuariosList().getUsuarios().get(0);
        
        assertEquals(esperado, usuario.consultarLibros(user));
        
        
    }
    
    
}