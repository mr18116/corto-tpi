/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.corto2.controller;

import com.mycompany.corto2.Multa;
import com.mycompany.corto2.Usuario;
import java.util.Date;

/**
 *
 * @author noe
 */
public class MultaController {
    
    public Multa MultaController(String estado, Date fechaFin, Date fechaInicio, Usuario uID){
        Multa mul = new Multa();
        mul.setEstado(estado);
        mul.setFechaFin(fechaFin);
        mul.setFechaInicio(fechaInicio);
        mul.setUsuarioId(uID);
        return mul;
    }
    
}
