/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.corto2.controller;

import com.mycompany.corto2.Libro;
import com.mycompany.corto2.Usuario;

/**
 *
 * @author fernando
 */
public class UsuarioController {
    
    public Usuario crearUsuario(){
        Usuario usuario = new Usuario();
        usuario.setNombre("NOMBRE");
        return usuario;
    }
    
    
}
