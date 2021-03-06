/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.corto2.list;

import com.mycompany.corto2.Ejemplar;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author fernando
 */
public class EjemplaresList {
    
    public List<Ejemplar> getEjemplares(){
        List<Ejemplar> ejemplares = new ArrayList<>();
        
        Ejemplar ejemplar1=new Ejemplar();
        ejemplar1.setFechaAdquisicion(new Date(1, 10, 2223));
        ejemplar1.setFechaDevolucion(new Date(1, 10, 2223));
        ejemplar1.setFechaPrestamo(new Date(1, 10, 2222));
        ejemplar1.setIdEjemplar("123");
        ejemplar1.setLocalizacion("SALA");
        ejemplar1.setObservaciones("nuevo");
        ejemplar1.setLibroId(new LibrosList().getLibros().get(0));
        ejemplar1.setUsuarioId(new UsuariosList().getUsuarios().get(0));
        ejemplar1.setId(new Long(1));
        ejemplares.add(ejemplar1);
        
        Ejemplar ejemplar2 = new Ejemplar();
        ejemplar2.setFechaAdquisicion(new Date(1, 10, 2223));
        ejemplar2.setFechaDevolucion(new Date(1, 10, 2223));
        ejemplar2.setFechaPrestamo(new Date(1, 10, 2222));
        ejemplar2.setIdEjemplar("1234");
        ejemplar2.setLocalizacion("SALA");
        ejemplar2.setObservaciones("nuevo");
        ejemplar2.setLibroId(new LibrosList().getLibros().get(0));
        ejemplar2.setUsuarioId(null);
        ejemplar2.setId(new Long(2));
        ejemplares.add(ejemplar2);
        
        return ejemplares;
    }
        
}
