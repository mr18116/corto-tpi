package com.mycompany.corto2C;

import com.mycompany.corto2C.DomainObject;
import com.mycompany.corto2C.EjemplarDomain;
import com.mycompany.corto2C.ReservaDomain;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
 
public class LibroDomain extends DomainObject {
    private static final long serialVersionUID = 1L;
    private Log logger = LogFactory.getLog(LibroDomain.class);
    
    private String isbn;
    private String titulo;
    private String autor;
    private Integer numPaginas;
    private Date fechaAlta;
    private Integer numDisponibles;
    
    private Set<EjemplarDomain> ejemplares =new HashSet<EjemplarDomain>();
    private Set<ReservaDomain> reservas =new HashSet<ReservaDomain>();
    public LibroDomain(String isbn) {
        super();
        this.isbn = isbn;
        logger.debug("Creada una instancia de " + LibroDomain.class.getName());
    }

    public LibroDomain(String isbn, String titulo, String autor, Integer numPaginas, Date fechaAlta, Integer numDisponibles) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.fechaAlta = fechaAlta;
        this.numDisponibles = numDisponibles;
    }

    public String getIsbn() {
    return isbn;
    }
    
    public void setIsbn(String isbn) {
    this.isbn = isbn;
    }
    
    public String getTitulo() {
        return titulo;
    }
 
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public Integer getNumPaginas() {
        return numPaginas;
    }
    public void setNumPaginas(Integer numPaginas) {this.numPaginas = numPaginas;}
    public Date getFechaAlta() {return fechaAlta;}
    public void setFechaAlta(Date fechaAlta) {this.fechaAlta = fechaAlta;}
    public Set<EjemplarDomain> getEjemplares() {return ejemplares;}
    public void setEjemplares(Set<EjemplarDomain> ejemplares) {this.ejemplares = ejemplares;}
    public Set<ReservaDomain> getReservas() {return reservas;}
    public void setReservas(Set<ReservaDomain> reservas) {this.reservas = reservas;}
    public Integer getNumDisponibles() {return numDisponibles;}
    public void setNumDisponibles(Integer numDisponibles) {this.numDisponibles = numDisponibles;}
    
    @Override
    public int hashCode() {
         final int prime = 31;
         int result = 1;result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
         return result;
    }
    @Override
         public boolean equals(Object obj) {
         if (this == obj)
            return true;
         if (obj == null)return false;
         if (getClass() != obj.getClass())
             return false;
             LibroDomain other = (LibroDomain) obj;
             if (isbn == null) {
                 if (other.isbn != null)
                     return false;
             } else if (!isbn.equals(other.isbn))
                 return false;
             return true;
         }
}