/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.corto2.controller;

import com.mycompany.corto2.Ejemplar;
import com.mycompany.corto2.Historico;
import com.mycompany.corto2.Usuario;
import java.util.Date;

/**
 *
 * @author noe
 */
public class HistoricoController {
    public Historico HistoricoConHistorico(Date fechaDevolucion, Date fechaDevolucionReal, Date fechaPrestamo,
            Usuario usuario_id, Ejemplar ejemplar_id){
        Historico his = new Historico();
        his.setFechaDevolucion(fechaDevolucion);
        his.setFechaDevolucionReal(fechaDevolucionReal);
        his.setFechaPrestamo(fechaPrestamo);
        his.setUsuarioId(usuario_id);
        his.setEjemplarId(ejemplar_id);
        return his;
    }
    
}
