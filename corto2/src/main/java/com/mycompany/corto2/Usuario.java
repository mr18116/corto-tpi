/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.corto2;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author marti
 */
@Entity
@Table(name = "usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findByLogin", query = "SELECT u FROM Usuario u WHERE u.login = :login"),
    @NamedQuery(name = "Usuario.findByPassword", query = "SELECT u FROM Usuario u WHERE u.password = :password"),
    @NamedQuery(name = "Usuario.findByEmail", query = "SELECT u FROM Usuario u WHERE u.email = :email"),
    @NamedQuery(name = "Usuario.findByNombre", query = "SELECT u FROM Usuario u WHERE u.nombre = :nombre"),
    @NamedQuery(name = "Usuario.findByApellido1", query = "SELECT u FROM Usuario u WHERE u.apellido1 = :apellido1"),
    @NamedQuery(name = "Usuario.findByApellido2", query = "SELECT u FROM Usuario u WHERE u.apellido2 = :apellido2"),
    @NamedQuery(name = "Usuario.findByTipoUsuario", query = "SELECT u FROM Usuario u WHERE u.tipoUsuario = :tipoUsuario"),
    @NamedQuery(name = "Usuario.findByEstadoUsuario", query = "SELECT u FROM Usuario u WHERE u.estadoUsuario = :estadoUsuario"),
    @NamedQuery(name = "Usuario.findByCalle", query = "SELECT u FROM Usuario u WHERE u.calle = :calle"),
    @NamedQuery(name = "Usuario.findByNumero", query = "SELECT u FROM Usuario u WHERE u.numero = :numero"),
    @NamedQuery(name = "Usuario.findByPiso", query = "SELECT u FROM Usuario u WHERE u.piso = :piso"),
    @NamedQuery(name = "Usuario.findByCiudad", query = "SELECT u FROM Usuario u WHERE u.ciudad = :ciudad"),
    @NamedQuery(name = "Usuario.findByCodigoPostal", query = "SELECT u FROM Usuario u WHERE u.codigoPostal = :codigoPostal")})
public class Usuario implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "login")
    private Collection<Multa> multaCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "login")
    private String login;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "apellido1")
    private String apellido1;
    @Basic(optional = false)
    @Column(name = "apellido2")
    private String apellido2;
    @Basic(optional = false)
    @Column(name = "tipo_usuario")
    private String tipoUsuario;
    @Basic(optional = false)
    @Column(name = "estado_usuario")
    private String estadoUsuario;
    @Basic(optional = false)
    @Column(name = "calle")
    private String calle;
    @Basic(optional = false)
    @Column(name = "numero")
    private int numero;
    @Basic(optional = false)
    @Column(name = "piso")
    private String piso;
    @Basic(optional = false)
    @Column(name = "ciudad")
    private String ciudad;
    @Basic(optional = false)
    @Column(name = "codigo_postal")
    private String codigoPostal;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "login")
    private List<Operacion> operacionList;

    public Usuario() {
    }

    public Usuario(String login) {
        this.login = login;
    }

    public Usuario(String login, String password, String email, String nombre, String apellido1, String apellido2, String tipoUsuario, String estadoUsuario, String calle, int numero, String piso, String ciudad, String codigoPostal) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.tipoUsuario = tipoUsuario;
        this.estadoUsuario = estadoUsuario;
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getEstadoUsuario() {
        return estadoUsuario;
    }

    public void setEstadoUsuario(String estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @XmlTransient
    public List<Operacion> getOperacionList() {
        return operacionList;
    }

    public void setOperacionList(List<Operacion> operacionList) {
        this.operacionList = operacionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (login != null ? login.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.login == null && other.login != null) || (this.login != null && !this.login.equals(other.login))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.corto2.Usuario[ login=" + login + " ]";
    }

    @XmlTransient
    public Collection<Multa> getMultaCollection() {
        return multaCollection;
    }

    public void setMultaCollection(Collection<Multa> multaCollection) {
        this.multaCollection = multaCollection;
    }
    
}
