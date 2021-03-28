/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.corto2.controller;

import com.mycompany.corto2.Ejemplar;
import java.util.Date;

/**
 *
 * @author dany
 */
public class EjemplaresController {
    public Ejemplar EjemplaresController(Date fechaAdquisicion,Date fechaDevolucion,Date fechaPrestamo,String idEjemplar,String localizacion,String observaciones){
        Ejemplar ejem=new Ejemplar();
        ejem.setFechaAdquisicion(fechaAdquisicion);
        ejem.setFechaDevolucion(fechaDevolucion);
        ejem.setFechaPrestamo(fechaPrestamo);
        ejem.setIdEjemplar(idEjemplar);
        ejem.setLocalizacion(localizacion);
        ejem.setObservaciones(observaciones);
        return ejem;
    }
    
}
