package com.fedevela.core.security.beans;

/**
 * Created by fvelazquez on 31/03/14.
 */
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;
import org.codehaus.jackson.annotate.JsonIgnore;

@Deprecated
@Entity
@XmlRootElement
public class UsuarioWebmxBean implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LOGIN")
    private String login;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "SCLTCOD")
    private Long scltcod;
    @Column(name = "EMAIL")
    private String email;
    @Basic(optional = false)
    @Column(name = "FECHAALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaalta;
    @Column(name = "FECHABAJA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechabaja;
    @Basic(optional = false)
    @Column(name = "STATUS")
    private Character status;
    @Basic(optional = false)
    @Column(name = "INTENTOS")
    private Short intentos;
    @Column(name = "FECHAREVOCADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecharevocado;
    @Column(name = "CLIENTE")
    private String cliente;
    @Transient
    private List<String> authorities;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getScltcod() {
        return scltcod;
    }

    public void setScltcod(Long scltcod) {
        this.scltcod = scltcod;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaalta() {
        return fechaalta;
    }

    public void setFechaalta(Date fechaalta) {
        this.fechaalta = fechaalta;
    }

    public Date getFechabaja() {
        return fechabaja;
    }

    public void setFechabaja(Date fechabaja) {
        this.fechabaja = fechabaja;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public Short getIntentos() {
        return intentos;
    }

    public void setIntentos(Short intentos) {
        this.intentos = intentos;
    }

    public Date getFecharevocado() {
        return fecharevocado;
    }

    public void setFecharevocado(Date fecharevocado) {
        this.fecharevocado = fecharevocado;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    @JsonIgnore
    public List<String> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<String> authorities) {
        this.authorities = authorities;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + (this.login != null ? this.login.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UsuarioWebmxBean other = (UsuarioWebmxBean) obj;
        if ((this.login == null) ? (other.login != null) : !this.login.equals(other.login)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "UsuarioWebmxBean{" + "login=" + login + ", nombre=" + nombre + ", scltcod=" + scltcod + ", email=" + email + ", fechaalta=" + fechaalta + ", fechabaja=" + fechabaja + ", status=" + status + ", intentos=" + intentos + ", fecharevocado=" + fecharevocado + ", cliente=" + cliente + '}';
    }

}
