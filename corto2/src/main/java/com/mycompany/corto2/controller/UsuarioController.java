/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.corto2.controller;

import com.mycompany.corto2.Ejemplar;
import com.mycompany.corto2.Libro;
import com.mycompany.corto2.Reserva;
import com.mycompany.corto2.Usuario;
import com.mycompany.corto2.list.EjemplaresList;
import com.mycompany.corto2.list.HistoricosList;
import com.mycompany.corto2.list.LibrosList;
import com.mycompany.corto2.list.ReservasList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author fernando
 */
public class UsuarioController {

    public Usuario crearUsuario(String nombre, String apellido1, String apellido2, String email, String login, String password,
            String tipo, String estado, String calle, String ciudad, String piso, Integer numero, String codigoPostal, String tutor, String departamento) {
        Usuario usuario = new Usuario();
        usuario.setNombre(nombre);
        usuario.setApellido1(apellido1);
        usuario.setApellido2(apellido2);
        usuario.setEmail(email);
        usuario.setLogin(login);
        usuario.setPassword(password);
        usuario.setTipo(tipo);
        usuario.setEstado(estado);
        usuario.setCalle(calle);
        usuario.setCiudad(ciudad);
        usuario.setPiso(piso);
        usuario.setNumero(numero);
        usuario.setCodigoPostal(codigoPostal);
        if (tutor != null && !tutor.equals("")) {
            usuario.setTutor(tutor);
        }
        if (departamento != null && !departamento.equals("")) {
            usuario.setDepartamento(departamento);
        }
        return usuario;
    }

    public List<Ejemplar> consultarEjemplares(Usuario usuario) {
        if (usuario.getId() != null) {
            Long uid = usuario.getId();
            EjemplaresList ejemplares = new EjemplaresList();
            ejemplares.getEjemplares();
            List<Ejemplar> uEjemplares = new ArrayList<>();

            new EjemplaresList().getEjemplares().stream().filter((e) -> (e.getUsuarioId() != null && e.getUsuarioId().getId().equals(uid)))
                    .forEachOrdered((e) -> uEjemplares.add(e));
            return uEjemplares;
        } else {
            return Collections.emptyList();
        }
    }

    public Map<Libro, List<Ejemplar>> consultarLibros(Usuario usuario) {
        Map<Libro, List<Ejemplar>> libros = new HashMap<>();
        new EjemplaresList().getEjemplares().stream().filter((e) -> (e.getUsuarioId() != null && e.getUsuarioId().equals(usuario)))
                .forEachOrdered((e) -> {
                    if (!libros.isEmpty()) {
                        libros.keySet().forEach((l) -> {
                            if (l.equals(e.getLibroId())) {
                                libros.get(l).add(e);
                            } else {
                                libros.put(e.getLibroId(), new ArrayList<>());
                                libros.get(e.getLibroId()).add(e);
                            }
                        });
                    } else {
                        libros.put(e.getLibroId(), new ArrayList<>());
                        libros.get(e.getLibroId()).add(e);
                    }
                });

        return libros;
    }

    public List<Ejemplar> consultarTodosEjemplares() {
        EjemplaresList ejemplares = new EjemplaresList();
        return ejemplares.getEjemplares();
    }

    public List<Libro> consultarTodosLibros() {
        LibrosList libros = new LibrosList();
        return libros.getLibros();
    }

    public List<Ejemplar> historicoPrestamosEjemplar(Usuario user) {
        HistoricosList historico = new HistoricosList();
        List<Ejemplar> ejemplaresUsuario = new ArrayList<>();

        new HistoricosList().getHistoricos().stream().filter((h) -> (h.getUsuarioId().equals(user)))
                .forEachOrdered((h) -> ejemplaresUsuario.add(h.getEjemplarId()));
        return ejemplaresUsuario;
    }

    public List<Libro> reservasLibros(Usuario user) {
        HistoricosList historico = new HistoricosList();
        List<Libro> librosUsuario = new ArrayList<>();

        new ReservasList().getReservas().stream().filter((r) -> (r.getUsuarioId().equals(user)))
                .forEachOrdered((r) -> librosUsuario.add(r.getLibroId()));
        return librosUsuario;
    }

    public Reserva anularReserva(Reserva reserva) {
        reserva.setUsuarioId(null);
        return reserva;
    }

    public Ejemplar prestarLibro(Libro libro, Usuario usuario) {
        Ejemplar ejemplarUsuario = new Ejemplar();
        if (libro.getNumDisponibles() > 0 && usuario.getEstado() != "MULTADO") {
            ejemplarUsuario = new EjemplaresList().getEjemplares().get(0);
        }
        return ejemplarUsuario;
    }
}
