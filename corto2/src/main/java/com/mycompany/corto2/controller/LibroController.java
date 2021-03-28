/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.corto2.controller;

import com.mycompany.corto2.Libro;
import java.util.Date;

/**
 *
 * @author zarco
 */
public class LibroController {
    
    public Libro LibroController(Long id, String isbn, String titulo, String autor, Integer numPaginas, Date fechaAlta, Integer numDisponibles){
        Libro libro = new Libro();
        libro.setId(id);
        libro.setIsbn(isbn);
        libro.setTitulo(titulo);
        libro.setAutor(autor);
        libro.setNumPaginas(numPaginas);
        libro.setFechaAlta(fechaAlta);
        libro.setNumDisponibles(numDisponibles);
        
        return libro;
    }
    
}
