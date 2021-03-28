/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.corto2.list;

import com.mycompany.corto2.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fernando
 */
public class UsuariosList {
    
    public List<Usuario> getUsuarios(){
        List<Usuario> usuarios = new ArrayList<>();
        
        Usuario usuario1 = new Usuario();
        usuario1.setNombre("Juan");
        usuario1.setApellido1("Perez");
        usuario1.setApellido2("Perez");
        usuario1.setEmail("jp@gmail.com");
        usuario1.setLogin("9ty0");
        usuario1.setPassword("pass");
        usuario1.setEstado("ACTIVO");
        usuario1.setCalle("street");
        usuario1.setCiudad("city");
        usuario1.setPiso("floor");
        usuario1.setNumero(79490000);
        usuario1.setCodigoPostal("0000");
        usuario1.setTipo("alumno");
        usuario1.setTutor("Pedro");
        usuario1.setDepartamento("");
        usuarios.add(usuario1);
        
        return usuarios;
    }
    
}
