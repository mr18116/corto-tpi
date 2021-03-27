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
@Table(name = "multa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Multa.findAll", query = "SELECT m FROM Multa m"),
    @NamedQuery(name = "Multa.findByIdMulta", query = "SELECT m FROM Multa m WHERE m.idMulta = :idMulta"),
    @NamedQuery(name = "Multa.findByFechaInicio", query = "SELECT m FROM Multa m WHERE m.fechaInicio = :fechaInicio"),
    @NamedQuery(name = "Multa.findByFechaFin", query = "SELECT m FROM Multa m WHERE m.fechaFin = :fechaFin"),
    @NamedQuery(name = "Multa.findByEstadoMulta", query = "SELECT m FROM Multa m WHERE m.estadoMulta = :estadoMulta")})
public class Multa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_multa")
    private Integer idMulta;
    @Basic(optional = false)
    @Column(name = "fecha_inicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
    @Basic(optional = false)
    @Column(name = "fecha_fin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFin;
    @Basic(optional = false)
    @Column(name = "estado_multa")
    private String estadoMulta;
    @JoinColumn(name = "login", referencedColumnName = "login")
    @ManyToOne(optional = false)
    private Usuario login;

    public Multa() {
    }

    public Multa(Integer idMulta) {
        this.idMulta = idMulta;
    }

    public Multa(Integer idMulta, Date fechaInicio, Date fechaFin, String estadoMulta) {
        this.idMulta = idMulta;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estadoMulta = estadoMulta;
    }

    public Integer getIdMulta() {
        return idMulta;
    }

    public void setIdMulta(Integer idMulta) {
        this.idMulta = idMulta;
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

    public String getEstadoMulta() {
        return estadoMulta;
    }

    public void setEstadoMulta(String estadoMulta) {
        this.estadoMulta = estadoMulta;
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
        hash += (idMulta != null ? idMulta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Multa)) {
            return false;
        }
        Multa other = (Multa) object;
        if ((this.idMulta == null && other.idMulta != null) || (this.idMulta != null && !this.idMulta.equals(other.idMulta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.corto2.Multa[ idMulta=" + idMulta + " ]";
    }
    
}
