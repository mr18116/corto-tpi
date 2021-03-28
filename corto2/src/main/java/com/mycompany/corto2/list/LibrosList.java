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
        
        Libro libro2 = new Libro();
        libro2.setId(Long.parseLong("2"));
        libro2.setIsbn("3425");
        libro2.setTitulo("El principito");
        libro2.setAutor("Antoine de Saint-Exupéry");
        libro2.setNumPaginas(124);
        libro2.setFechaAlta(new Date(31,02,2021));
        libro2.setNumDisponibles(3);
        libros.add(libro2);
        
        Libro libro3 = new Libro();
        libro3.setId(Long.parseLong("3"));
        libro3.setIsbn("885");
        libro3.setTitulo("20000 leguas de viaje submarino");
        libro3.setAutor("Julio Verne");
        libro3.setNumPaginas(300);
        libro3.setFechaAlta(new Date(15,02,2021));
        libro3.setNumDisponibles(3);
        libros.add(libro3);
        
        Libro libro4 = new Libro();
        libro4.setId(Long.parseLong("4"));
        libro4.setIsbn("555");
        libro4.setTitulo("La vuelta al mundo en ochenta días");
        libro4.setAutor("Julio Verne");
        libro4.setNumPaginas(250);
        libro4.setFechaAlta(new Date(20,2,2021));
        libro4.setNumDisponibles(6);
        libros.add(libro4);
        
        Libro libro5 = new Libro();
        libro5.setId(Long.parseLong("5"));
        libro5.setIsbn("5532");
        libro5.setTitulo("100 años de soledad");
        libro5.setAutor("Gabriel García Márquez");
        libro5.setNumPaginas(400);
        libro5.setFechaAlta(new Date(25,2,2021));
        libro5.setNumDisponibles(2);
        libros.add(libro5);
        
        return libros;
    }
    
}
