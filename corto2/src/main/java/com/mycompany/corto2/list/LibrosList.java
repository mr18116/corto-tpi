/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.corto2.list;

import com.mycompany.corto2.Libro;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author fernando
 */
public class LibrosList {
    
    public List<Libro> getLibros(){
        List<Libro> libros = new ArrayList<>();
        
        Libro libro1 = new Libro();
        libro1.setId(Long.parseLong("1"));
        libro1.setIsbn("345");
        libro1.setTitulo("Libro1");
        libro1.setAutor("Marshall");
        libro1.setNumPaginas(130);
        libro1.setFechaAlta(new Date(1,02,2021));
        libro1.setNumDisponibles(5);
        libros.add(libro1);
        
        return libros;
    }
    
}
