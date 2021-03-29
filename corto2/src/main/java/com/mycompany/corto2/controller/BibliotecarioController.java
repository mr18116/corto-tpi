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
import java.util.ArrayList;
import com.mycompany.corto2.list.LibrosList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author noe
 */
public class BibliotecarioController {
    
    public Bibliotecario BibliotecaController(String email, String login, String password, String nif){
        Bibliotecario bib = new Bibliotecario();
        bib.setEmail(email);
        bib.setLogin(login);
        bib.setPassword(password);
        bib.setNif(nif);
        
        return bib;
    }
    
    public List<Libro> ConsultarLibros(){
        return new LibrosList().getLibros();
    }
    
    public List<Ejemplar> ConsultarEjemplares(){
        return new EjemplaresList().getEjemplares();
    }
    
    public Libro BajarLibro(Libro libro){
        return libro;
    }
    
    public Ejemplar BajarEjemplar(Ejemplar ejemplar){
        return ejemplar;
    }
    
    public Libro ModificarLibro(Libro libro){
        return libro;
    }
    
    public Ejemplar ModificarEjemplar(Ejemplar ejemplar){
        return ejemplar;
    }
    
    public Map<Ejemplar, Usuario> EjemplaresPrestados(Libro libro){
        Map<Ejemplar, Usuario> prestados = new HashMap<>();
        List<Ejemplar> ejemplares = new EjemplaresList().getEjemplares();
        for(Ejemplar e: ejemplares){
            if (e.getLibroId().equals(libro)) {
                prestados.put(e, e.getUsuarioId());
            }
        }
        
        return prestados;
    }
    
}
