/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.corto2.list;

import com.mycompany.corto2.Multa;
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
        usuario1.setId(new Long(1));
        usuarios.add(usuario1);
        
        Usuario usuario2 = new Usuario();
        usuario2.setNombre("Pedro");
        usuario2.setApellido1("Paz");
        usuario2.setApellido2("Perez");
        usuario2.setEmail("pp@outlook.com");
        usuario2.setLogin("9ty0023");
        usuario2.setPassword("pass");
        usuario2.setEstado("MULTADO");
        usuario2.setCalle("street");
        usuario2.setCiudad("city");
        usuario2.setPiso("floor");
        usuario2.setNumero(79490000);
        usuario2.setCodigoPostal("0000");
        usuario2.setTipo("alumno");
        usuario2.setTutor("Raul");
        usuario2.setDepartamento("");
        usuario2.setId(new Long(2));
        usuarios.add(usuario2);
        
        return usuarios;
    }
    
}
