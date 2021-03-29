/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.corto2.controller;

import com.mycompany.corto2.Bibliotecario;
import com.mycompany.corto2.Ejemplar;

import com.mycompany.corto2.Libro;
import com.mycompany.corto2.Usuario;
import com.mycompany.corto2.list.EjemplaresList;
import com.mycompany.corto2.list.HistoricosList;
import java.util.ArrayList;
import com.mycompany.corto2.list.LibrosList;
import com.mycompany.corto2.list.ReservasList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author noe
 */
public class BibliotecarioController {

    public Bibliotecario BibliotecaController(String email, String login, String password, String nif) {
        Bibliotecario bib = new Bibliotecario();
        bib.setEmail(email);
        bib.setLogin(login);
        bib.setPassword(password);
        bib.setNif(nif);

        return bib;
    }

    public List<Libro> ConsultarLibros() {
        return new LibrosList().getLibros();
    }

    public List<Ejemplar> ConsultarEjemplares() {
        return new EjemplaresList().getEjemplares();
    }

    public Libro BajarLibro(Libro libro) {
        return libro;
    }

    public Ejemplar BajarEjemplar(Ejemplar ejemplar) {
        return ejemplar;
    }

    public Libro ModificarLibro(Libro libro) {
        return libro;
    }

    public Ejemplar ModificarEjemplar(Ejemplar ejemplar) {
        return ejemplar;
    }

    public Map<Ejemplar, List<Usuario>> EjemplaresPrestados(Libro libro) {
        Map<Ejemplar, List<Usuario>> prestados = new HashMap<>();

        new HistoricosList().getHistoricos().stream().filter((h) -> (h.getEjemplarId().getLibroId().equals(libro))).forEachOrdered((h) -> {
            if (!prestados.isEmpty()) {
                prestados.keySet().forEach((eu) -> {
                    if (eu.equals(h.getEjemplarId())) {
                        prestados.get(eu).add(h.getUsuarioId());
                    } else {
                        prestados.put(h.getEjemplarId(), new ArrayList<>());
                        prestados.get(h.getEjemplarId()).add(h.getUsuarioId());
                    }
                });
            } else {
                prestados.put(h.getEjemplarId(), new ArrayList<>());
                prestados.get(h.getEjemplarId()).add(h.getUsuarioId());
            }
        });
        
        return prestados;
    }
    
    public Libro AltaLibro(Long id, String isbn, String titulo, String autor, Integer numPaginas, Date fechaAlta, Integer numDisponibles){
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
    
    public Ejemplar AltaEjemplar(Date fechaAdquisicion,Date fechaDevolucion,Date fechaPrestamo,String idEjemplar,String localizacion,String observaciones){
        Ejemplar ejem=new Ejemplar();
        ejem.setFechaAdquisicion(fechaAdquisicion);
        ejem.setFechaDevolucion(fechaDevolucion);
        ejem.setFechaPrestamo(fechaPrestamo);
        ejem.setIdEjemplar(idEjemplar);
        ejem.setLocalizacion(localizacion);
        ejem.setObservaciones(observaciones);
        return ejem;
    }
    
    public Map<Libro, List<Usuario>> LibrosReservados(){
        Map<Libro, List<Usuario>> reservados = new HashMap<>();
        
        new ReservasList().getReservas().forEach((r) -> {
            if (!reservados.isEmpty()) {
               reservados.keySet().forEach((rs) -> {
                   if (r.getLibroId().equals(rs)) {
                       reservados.get(rs).add(r.getUsuarioId());
                   } else {
                       reservados.put(r.getLibroId(), new ArrayList<>());
                       reservados.get(r.getLibroId()).add(r.getUsuarioId());
                   }
               });
            } else {
                reservados.put(r.getLibroId(), new ArrayList<>());
                reservados.get(r.getLibroId()).add(r.getUsuarioId());
            }
        });
        
        return reservados;
    }

}
