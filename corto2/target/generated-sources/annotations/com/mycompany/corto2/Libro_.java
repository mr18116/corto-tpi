package com.mycompany.corto2;

import com.mycompany.corto2.Operacion;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-26T20:47:59")
@StaticMetamodel(Libro.class)
public class Libro_ { 

    public static volatile SingularAttribute<Libro, Date> fechaAlta;
    public static volatile ListAttribute<Libro, Operacion> operacionList;
    public static volatile SingularAttribute<Libro, String> isbn;
    public static volatile SingularAttribute<Libro, Integer> numPag;
    public static volatile SingularAttribute<Libro, String> titulo;
    public static volatile SingularAttribute<Libro, String> autor;

}