package com.mycompany.corto2;

import com.mycompany.corto2.Ejemplar;
import com.mycompany.corto2.Reserva;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-27T18:31:59")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-27T17:19:10")
>>>>>>> 4a3235cc37d86b51805ea1da2459df98b153f5f1
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-27T17:25:02")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-27T18:34:11")
>>>>>>> 5799fa7629b27d0531afb8fcae20e72272b0c0ed
>>>>>>> 1eb13053b9dafb2e9082a0dec3e64a8831e4070f
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