package com.fedevela.core.security.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "AUTHORITY", catalog = "", schema = "MEXWEB")
public class Authority implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_AUTHORITY")
    private String idAuthority;
    @Basic(optional = false)
    @Column(name = "DESCRIPTION")
    private String description;
    @Basic(optional = false)
    @Column(name = "ENABLED")
    private char enabled;
//    @Transient
//    private String display;

    public Authority() {
    }

    public Authority(String idAuthority) {
        this.idAuthority = idAuthority;
    }

    public Authority(String idAuthority, String description, char enabled) {
        this.idAuthority = idAuthority;
        this.description = description;
        this.enabled = enabled;
    }

    public String getIdAuthority() {
        return idAuthority;
    }

    public void setIdAuthority(String idAuthority) {
        this.idAuthority = idAuthority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public char getEnabled() {
        return enabled;
    }

    public void setEnabled(char enabled) {
        this.enabled = enabled;
    }

    public String getDisplay() {
        return idAuthority + " - " + description;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAuthority != null ? idAuthority.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Authority)) {
            return false;
        }
        Authority other = (Authority) object;
        if ((this.idAuthority == null && other.idAuthority != null) || (this.idAuthority != null && !this.idAuthority.equals(other.idAuthority))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.security.pojos.Authority[idAuthority=" + idAuthority + "]";
    }
}
