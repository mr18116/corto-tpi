/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.corto2.list;

import com.mycompany.corto2.Historico;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author fernando
 */
public class HistoricosList {
    
    public List<Historico> getHistoricos(){
       List<Historico> historicos = new ArrayList<>();
       
       Historico historico1 = new Historico();
       historico1.setId(new Long(1));
       historico1.setEjemplarId(new EjemplaresList().getEjemplares().get(0));
       historico1.setUsuarioId(new UsuariosList().getUsuarios().get(0));
       historico1.setFechaPrestamo(new Date(1, 10, 2020));
       historico1.setFechaDevolucion(new Date(1, 10, 2021));
       historico1.setFechaDevolucionReal(new Date(1, 10, 2021));
       historicos.add(historico1);
       
       return historicos;
    }
    
}
