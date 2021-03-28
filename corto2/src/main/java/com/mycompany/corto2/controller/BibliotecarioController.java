/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.corto2.controller;

import com.mycompany.corto2.Bibliotecario;

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
    
}
