package com.mycompany.corto2;

import com.mycompany.corto2.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-29T16:20:44")
@StaticMetamodel(Multa.class)
public class Multa_ { 

    public static volatile SingularAttribute<Multa, String> estado;
    public static volatile SingularAttribute<Multa, Date> fechaInicio;
    public static volatile SingularAttribute<Multa, Long> id;
    public static volatile SingularAttribute<Multa, Date> fechaFin;
    public static volatile SingularAttribute<Multa, Usuario> usuarioId;

}