package com.mycompany.corto2;

import com.mycompany.corto2.Libro;
import com.mycompany.corto2.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-26T20:47:59")
@StaticMetamodel(Operacion.class)
public class Operacion_ { 

    public static volatile SingularAttribute<Operacion, Date> fechaFinReal;
    public static volatile SingularAttribute<Operacion, String> tipoOperacion;
    public static volatile SingularAttribute<Operacion, Date> fechaInicio;
    public static volatile SingularAttribute<Operacion, String> estadoOperacion;
    public static volatile SingularAttribute<Operacion, Libro> isbn;
    public static volatile SingularAttribute<Operacion, Usuario> login;
    public static volatile SingularAttribute<Operacion, Date> fechaFin;
    public static volatile SingularAttribute<Operacion, Integer> idOperacion;

}