/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.corto2.controller;

import com.mycompany.corto2.Bibliotecario;

import com.mycompany.corto2.Libro;
import java.util.ArrayList;
import com.mycompany.corto2.list.LibrosList;
import java.util.Date;
import java.util.List;

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
    
}
