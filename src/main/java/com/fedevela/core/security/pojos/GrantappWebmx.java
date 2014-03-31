package com.fedevela.core.security.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "GRANTAPP_WEBMX", catalog = "", schema = "MEXWEB")
public class GrantappWebmx implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GrantappWebmxPK grantappWebmxPK;

    public GrantappWebmx() {
    }

    public GrantappWebmx(GrantappWebmxPK grantappWebmxPK) {
        this.grantappWebmxPK = grantappWebmxPK;
    }

    public GrantappWebmx(Long idaplicacion, String login) {
        grantappWebmxPK = new GrantappWebmxPK(idaplicacion, login);
    }

    public GrantappWebmxPK getGrantappWebmxPK() {
        return grantappWebmxPK;
    }

    public void setGrantappWebmxPK(GrantappWebmxPK grantappWebmxPK) {
        this.grantappWebmxPK = grantappWebmxPK;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + (this.grantappWebmxPK != null ? this.grantappWebmxPK.hashCode() : 0);
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
        final GrantappWebmx other = (GrantappWebmx) obj;
        if (this.grantappWebmxPK != other.grantappWebmxPK && (this.grantappWebmxPK == null || !this.grantappWebmxPK.equals(other.grantappWebmxPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "GrantappWebmx{" + "grantappWebmxPK=" + grantappWebmxPK + '}';
    }
}
