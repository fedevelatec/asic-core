package com.fedevela.core.security.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;

public class GrantappWebmxPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "IDAPLICACION")
    private Long idaplicacion;
    @Basic(optional = false)
    @Column(name = "LOGIN")
    private String login;

    public GrantappWebmxPK() {
    }

    public GrantappWebmxPK(Long idaplicacion, String login) {
        this.idaplicacion = idaplicacion;
        this.login = login;
    }

    public Long getIdaplicacion() {
        return idaplicacion;
    }

    public void setIdaplicacion(Long idaplicacion) {
        this.idaplicacion = idaplicacion;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (this.idaplicacion != null ? this.idaplicacion.hashCode() : 0);
        hash = 47 * hash + (this.login != null ? this.login.hashCode() : 0);
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
        final GrantappWebmxPK other = (GrantappWebmxPK) obj;
        if (this.idaplicacion != other.idaplicacion && (this.idaplicacion == null || !this.idaplicacion.equals(other.idaplicacion))) {
            return false;
        }
        if ((this.login == null) ? (other.login != null) : !this.login.equals(other.login)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "GrantappWebmxPK{" + "idaplicacion=" + idaplicacion + ", login=" + login + '}';
    }
}
