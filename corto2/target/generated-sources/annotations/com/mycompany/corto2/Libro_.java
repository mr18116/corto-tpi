package com.mycompany.corto2;

import com.mycompany.corto2.Ejemplar;
import com.mycompany.corto2.Reserva;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-28T16:54:53")
@StaticMetamodel(Libro.class)
public class Libro_ { 

    public static volatile ListAttribute<Libro, Ejemplar> ejemplarList;
    public static volatile SingularAttribute<Libro, Date> fechaAlta;
    public static volatile ListAttribute<Libro, Reserva> reservaList;
    public static volatile SingularAttribute<Libro, String> isbn;
    public static volatile SingularAttribute<Libro, String> titulo;
    public static volatile SingularAttribute<Libro, Integer> numDisponibles;
    public static volatile SingularAttribute<Libro, Long> id;
    public static volatile SingularAttribute<Libro, Integer> numPaginas;
    public static volatile SingularAttribute<Libro, String> autor;

}