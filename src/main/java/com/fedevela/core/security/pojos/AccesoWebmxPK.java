package com.fedevela.core.security.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Embeddable
public class AccesoWebmxPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "LOGIN")
    private String login;
    @Basic(optional = false)
    @Column(name = "FECHALOGIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechalogin;

    public AccesoWebmxPK() {
    }

    public AccesoWebmxPK(String login, Date fechalogin) {
        this.login = login;
        this.fechalogin = fechalogin;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Date getFechalogin() {
        return fechalogin;
    }

    public void setFechalogin(Date fechalogin) {
        this.fechalogin = fechalogin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (login != null ? login.hashCode() : 0);
        hash += (fechalogin != null ? fechalogin.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AccesoWebmxPK)) {
            return false;
        }
        AccesoWebmxPK other = (AccesoWebmxPK) object;
        if ((this.login == null && other.login != null) || (this.login != null && !this.login.equals(other.login))) {
            return false;
        }
        if ((this.fechalogin == null && other.fechalogin != null) || (this.fechalogin != null && !this.fechalogin.equals(other.fechalogin))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.security.pojos.AccesoWebmxPK[login=" + login + ", fechalogin=" + fechalogin + "]";
    }
}
