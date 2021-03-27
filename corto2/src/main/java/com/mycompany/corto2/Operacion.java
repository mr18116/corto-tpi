/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.corto2;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author marti
 */
@Entity
@Table(name = "operacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Operacion.findAll", query = "SELECT o FROM Operacion o"),
    @NamedQuery(name = "Operacion.findByIdOperacion", query = "SELECT o FROM Operacion o WHERE o.idOperacion = :idOperacion"),
    @NamedQuery(name = "Operacion.findByTipoOperacion", query = "SELECT o FROM Operacion o WHERE o.tipoOperacion = :tipoOperacion"),
    @NamedQuery(name = "Operacion.findByEstadoOperacion", query = "SELECT o FROM Operacion o WHERE o.estadoOperacion = :estadoOperacion"),
    @NamedQuery(name = "Operacion.findByFechaInicio", query = "SELECT o FROM Operacion o WHERE o.fechaInicio = :fechaInicio"),
    @NamedQuery(name = "Operacion.findByFechaFin", query = "SELECT o FROM Operacion o WHERE o.fechaFin = :fechaFin"),
    @NamedQuery(name = "Operacion.findByFechaFinReal", query = "SELECT o FROM Operacion o WHERE o.fechaFinReal = :fechaFinReal")})
public class Operacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_operacion")
    private Integer idOperacion;
    @Basic(optional = false)
    @Column(name = "tipo_operacion")
    private String tipoOperacion;
    @Basic(optional = false)
    @Column(name = "estado_operacion")
    private String estadoOperacion;
    @Basic(optional = false)
    @Column(name = "fecha_inicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
    @Basic(optional = false)
    @Column(name = "fecha_fin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFin;
    @Basic(optional = false)
    @Column(name = "fecha_fin_real")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFinReal;
    @JoinColumn(name = "isbn", referencedColumnName = "isbn")
    @ManyToOne(optional = false)
    private Libro isbn;
    @JoinColumn(name = "login", referencedColumnName = "login")
    @ManyToOne(optional = false)
    private Usuario login;

    public Operacion() {
    }

    public Operacion(Integer idOperacion) {
        this.idOperacion = idOperacion;
    }

    public Operacion(Integer idOperacion, String tipoOperacion, String estadoOperacion, Date fechaInicio, Date fechaFin, Date fechaFinReal) {
        this.idOperacion = idOperacion;
        this.tipoOperacion = tipoOperacion;
        this.estadoOperacion = estadoOperacion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.fechaFinReal = fechaFinReal;
    }

    public Integer getIdOperacion() {
        return idOperacion;
    }

    public void setIdOperacion(Integer idOperacion) {
        this.idOperacion = idOperacion;
    }

    public String getTipoOperacion() {
        return tipoOperacion;
    }

    public void setTipoOperacion(String tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }

    public String getEstadoOperacion() {
        return estadoOperacion;
    }

    public void setEstadoOperacion(String estadoOperacion) {
        this.estadoOperacion = estadoOperacion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Date getFechaFinReal() {
        return fechaFinReal;
    }

    public void setFechaFinReal(Date fechaFinReal) {
        this.fechaFinReal = fechaFinReal;
    }

    public Libro getIsbn() {
        return isbn;
    }

    public void setIsbn(Libro isbn) {
        this.isbn = isbn;
    }

    public Usuario getLogin() {
        return login;
    }

    public void setLogin(Usuario login) {
        this.login = login;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOperacion != null ? idOperacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Operacion)) {
            return false;
        }
        Operacion other = (Operacion) object;
        if ((this.idOperacion == null && other.idOperacion != null) || (this.idOperacion != null && !this.idOperacion.equals(other.idOperacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.corto2.Operacion[ idOperacion=" + idOperacion + " ]";
    }
    
}
