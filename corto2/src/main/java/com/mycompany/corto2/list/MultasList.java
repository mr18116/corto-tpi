/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.corto2.list;

import com.mycompany.corto2.Multa;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author fernando
 */
public class MultasList {
    
    public List<Multa> getMultas(){
        List<Multa> multas = new ArrayList<>();
        
        Multa multa1 = new Multa();
        multa1.setId(new Long(1));
        multa1.setEstado("ACTIVA");
        multa1.setFechaInicio(new Date(1, 1, 2021));
        multa1.setFechaFin(new Date(1, 1, 2022));
        multa1.setUsuarioId(new UsuariosList().getUsuarios().get(1));
        multas.add(multa1);
        
        return multas;
    }
    
}
