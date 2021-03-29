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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author fernando
 */
public class UsuarioController {
      
    public Usuario crearUsuario(String nombre, String apellido1, String apellido2, String email, String login, String password,
            String tipo, String estado, String calle, String ciudad, String piso, Integer numero, String codigoPostal, String tutor, String departamento){
        Usuario usuario = new Usuario();
        usuario.setNombre(nombre);
        usuario.setApellido1(apellido1);
        usuario.setApellido2(apellido2);
        usuario.setEmail(email);
        usuario.setLogin(login);
        usuario.setPassword(password);
        usuario.setTipo(tipo);
        usuario.setEstado(estado);
        usuario.setCalle(calle);
        usuario.setCiudad(ciudad);
        usuario.setPiso(piso);
        usuario.setNumero(numero);
        usuario.setCodigoPostal(codigoPostal);
        if(tutor != null && !tutor.equals("")){
            usuario.setTutor(tutor);
        }
        if(departamento != null && !departamento.equals("")){
            usuario.setDepartamento(departamento);
        }
        return usuario;
    }
    
    public List<Ejemplar> consultarEjemplares(Usuario usuario){
        if (usuario.getId() != null){
            Long uid = usuario.getId();
            EjemplaresList ejemplares = new EjemplaresList();
            ejemplares.getEjemplares();
            List<Ejemplar> uEjemplares = new ArrayList<>();
            for(int i=0 ; i < ejemplares.getEjemplares().size() ; i++ ){
                if(ejemplares.getEjemplares().get(i).getUsuarioId().getId() == uid){
                    uEjemplares.add(ejemplares.getEjemplares().get(i));
                }
            }
            
            return uEjemplares;
        }else {
            return Collections.emptyList();
        }
    }
 
}
