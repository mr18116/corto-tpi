package com.mycompany.corto2;

import com.mycompany.corto2.Ejemplar;
import com.mycompany.corto2.Historico;
import com.mycompany.corto2.Multa;
import com.mycompany.corto2.Reserva;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-27T18:31:59")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-27T17:19:10")
>>>>>>> 4a3235cc37d86b51805ea1da2459df98b153f5f1
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> apellido2;
    public static volatile SingularAttribute<Usuario, String> piso;
    public static volatile SingularAttribute<Usuario, String> tipo;
    public static volatile SingularAttribute<Usuario, String> estado;
    public static volatile ListAttribute<Usuario, Ejemplar> ejemplarList;
    public static volatile SingularAttribute<Usuario, String> codigoPostal;
    public static volatile SingularAttribute<Usuario, Integer> numero;
    public static volatile ListAttribute<Usuario, Historico> historicoList;
    public static volatile SingularAttribute<Usuario, String> apellido1;
    public static volatile SingularAttribute<Usuario, String> calle;
    public static volatile SingularAttribute<Usuario, String> login;
    public static volatile SingularAttribute<Usuario, String> nombre;
    public static volatile SingularAttribute<Usuario, String> tutor;
    public static volatile SingularAttribute<Usuario, String> password;
    public static volatile ListAttribute<Usuario, Multa> multaList;
    public static volatile ListAttribute<Usuario, Reserva> reservaList;
    public static volatile SingularAttribute<Usuario, String> ciudad;
    public static volatile SingularAttribute<Usuario, String> departamento;
    public static volatile SingularAttribute<Usuario, Long> id;
    public static volatile SingularAttribute<Usuario, String> email;

}