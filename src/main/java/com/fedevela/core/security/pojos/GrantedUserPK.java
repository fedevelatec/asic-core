package com.fedevela.core.security.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;

public class GrantedUserPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ID_AUTHORITY")
    private String idAuthority;
    @Basic(optional = false)
    @Column(name = "USERNAME")
    private String username;

    public GrantedUserPK() {
    }

    public GrantedUserPK(String idAuthority, String username) {
        this.idAuthority = idAuthority;
        this.username = username;
    }

    public String getIdAuthority() {
        return idAuthority;
    }

    public void setIdAuthority(String idAuthority) {
        this.idAuthority = idAuthority;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (this.idAuthority != null ? this.idAuthority.hashCode() : 0);
        hash = 59 * hash + (this.username != null ? this.username.hashCode() : 0);
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
        final GrantedUserPK other = (GrantedUserPK) obj;
        if ((this.idAuthority == null) ? (other.idAuthority != null) : !this.idAuthority.equals(other.idAuthority)) {
            return false;
        }
        if ((this.username == null) ? (other.username != null) : !this.username.equals(other.username)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "GrantedUserPK{" + "idAuthority=" + idAuthority + ", username=" + username + '}';
    }
}
