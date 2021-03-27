package com.mycompany.corto2;

import com.mycompany.corto2.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-26T23:18:24")
@StaticMetamodel(Multa.class)
public class Multa_ { 

    public static volatile SingularAttribute<Multa, Integer> idMulta;
    public static volatile SingularAttribute<Multa, String> estadoMulta;
    public static volatile SingularAttribute<Multa, Date> fechaInicio;
    public static volatile SingularAttribute<Multa, Usuario> login;
    public static volatile SingularAttribute<Multa, Date> fechaFin;

}