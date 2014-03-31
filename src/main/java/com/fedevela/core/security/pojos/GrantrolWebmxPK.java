package com.fedevela.core.security.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;

public class GrantrolWebmxPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "IDROL")
    private Long idrol;
    @Basic(optional = false)
    @Column(name = "LOGIN")
    private String login;

    public GrantrolWebmxPK() {
    }

    public GrantrolWebmxPK(Long idrol, String login) {
        this.idrol = idrol;
        this.login = login;
    }

    public Long getIdrol() {
        return idrol;
    }

    public void setIdrol(Long idrol) {
        this.idrol = idrol;
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
        hash = 13 * hash + (this.idrol != null ? this.idrol.hashCode() : 0);
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
        final GrantrolWebmxPK other = (GrantrolWebmxPK) obj;
        if (this.idrol != other.idrol && (this.idrol == null || !this.idrol.equals(other.idrol))) {
            return false;
        }
        if ((this.login == null) ? (other.login != null) : !this.login.equals(other.login)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "GrantrolWebmxPK{" + "idrol=" + idrol + ", login=" + login + '}';
    }
}
