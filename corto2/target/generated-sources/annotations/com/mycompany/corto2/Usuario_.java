package com.mycompany.corto2;

import com.mycompany.corto2.Operacion;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-26T20:47:59")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> apellido2;
    public static volatile SingularAttribute<Usuario, String> piso;
    public static volatile SingularAttribute<Usuario, Integer> numero;
    public static volatile SingularAttribute<Usuario, String> codigoPostal;
    public static volatile SingularAttribute<Usuario, String> apellido1;
    public static volatile SingularAttribute<Usuario, String> calle;
    public static volatile SingularAttribute<Usuario, String> login;
    public static volatile SingularAttribute<Usuario, String> nombre;
    public static volatile SingularAttribute<Usuario, String> password;
    public static volatile ListAttribute<Usuario, Operacion> operacionList;
    public static volatile SingularAttribute<Usuario, String> ciudad;
    public static volatile SingularAttribute<Usuario, String> estadoUsuario;
    public static volatile SingularAttribute<Usuario, String> tipoUsuario;
    public static volatile SingularAttribute<Usuario, String> email;

}