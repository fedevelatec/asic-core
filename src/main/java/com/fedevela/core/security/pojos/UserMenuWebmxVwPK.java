package com.fedevela.core.security.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class UserMenuWebmxVwPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "IDMENU")
    private double idmenu;
    @Basic(optional = false)
    @Column(name = "ID_PARENT")
    private double idParent;
    @Basic(optional = false)
    @Column(name = "LOGIN")
    private String login;
    @Basic(optional = false)
    @Column(name = "IDAPLICACION")
    private double idaplicacion;

    public UserMenuWebmxVwPK() {
    }

    public UserMenuWebmxVwPK(double idmenu, double idParent, String login, double idaplicacion) {
        this.idmenu = idmenu;
        this.idParent = idParent;
        this.login = login;
        this.idaplicacion = idaplicacion;
    }

    public double getIdmenu() {
        return idmenu;
    }

    public void setIdmenu(double idmenu) {
        this.idmenu = idmenu;
    }

    public double getIdParent() {
        return idParent;
    }

    public void setIdParent(double idParent) {
        this.idParent = idParent;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public double getIdaplicacion() {
        return idaplicacion;
    }

    public void setIdaplicacion(double idaplicacion) {
        this.idaplicacion = idaplicacion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.idmenu) ^ (Double.doubleToLongBits(this.idmenu) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.idParent) ^ (Double.doubleToLongBits(this.idParent) >>> 32));
        hash = 89 * hash + (this.login != null ? this.login.hashCode() : 0);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.idaplicacion) ^ (Double.doubleToLongBits(this.idaplicacion) >>> 32));
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
        final UserMenuWebmxVwPK other = (UserMenuWebmxVwPK) obj;
        if (Double.doubleToLongBits(this.idmenu) != Double.doubleToLongBits(other.idmenu)) {
            return false;
        }
        if (Double.doubleToLongBits(this.idParent) != Double.doubleToLongBits(other.idParent)) {
            return false;
        }
        if ((this.login == null) ? (other.login != null) : !this.login.equals(other.login)) {
            return false;
        }
        if (Double.doubleToLongBits(this.idaplicacion) != Double.doubleToLongBits(other.idaplicacion)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "UserMenuWebmxVwPK{" + "idmenu=" + idmenu + ", idParent=" + idParent + ", login=" + login + ", idaplicacion=" + idaplicacion + '}';
    }
}
