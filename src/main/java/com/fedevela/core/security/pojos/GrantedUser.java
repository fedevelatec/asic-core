package com.fedevela.core.security.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "GRANTED_USER", catalog = "", schema = "MEXWEB")
public class GrantedUser implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GrantedUserPK grantedUserPK;

    public GrantedUser() {
    }

    public GrantedUser(GrantedUserPK grantedUserPK) {
        this.grantedUserPK = grantedUserPK;
    }

    public GrantedUser(String idAuthority, String username) {
        grantedUserPK = new GrantedUserPK(idAuthority, username);
    }

    public GrantedUserPK getGrantedUserPK() {
        return grantedUserPK;
    }

    public void setGrantedUserPK(GrantedUserPK grantedUserPK) {
        this.grantedUserPK = grantedUserPK;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + (this.grantedUserPK != null ? this.grantedUserPK.hashCode() : 0);
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
        final GrantedUser other = (GrantedUser) obj;
        if (this.grantedUserPK != other.grantedUserPK && (this.grantedUserPK == null || !this.grantedUserPK.equals(other.grantedUserPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "GrantedUser{" + "grantedUserPK=" + grantedUserPK + '}';
    }
}
