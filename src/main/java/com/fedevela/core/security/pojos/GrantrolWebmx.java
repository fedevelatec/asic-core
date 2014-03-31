package com.fedevela.core.security.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "GRANTROL_WEBMX", catalog = "", schema = "MEXWEB")
public class GrantrolWebmx implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GrantrolWebmxPK grantrolWebmxPK;

    public GrantrolWebmx() {
    }

    public GrantrolWebmx(GrantrolWebmxPK grantrolWebmxPK) {
        this.grantrolWebmxPK = grantrolWebmxPK;
    }

    public GrantrolWebmx(Long idrol, String login) {
        this.grantrolWebmxPK = new GrantrolWebmxPK(idrol, login);
    }

    public GrantrolWebmxPK getGrantrolWebmxPK() {
        return grantrolWebmxPK;
    }

    public void setGrantrolWebmxPK(GrantrolWebmxPK grantrolWebmxPK) {
        this.grantrolWebmxPK = grantrolWebmxPK;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + (this.grantrolWebmxPK != null ? this.grantrolWebmxPK.hashCode() : 0);
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
        final GrantrolWebmx other = (GrantrolWebmx) obj;
        if (this.grantrolWebmxPK != other.grantrolWebmxPK && (this.grantrolWebmxPK == null || !this.grantrolWebmxPK.equals(other.grantrolWebmxPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "GrantrolWebmx{" + "grantrolWebmxPK=" + grantrolWebmxPK + '}';
    }
}
