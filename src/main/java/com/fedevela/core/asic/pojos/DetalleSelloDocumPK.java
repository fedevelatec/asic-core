package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class DetalleSelloDocumPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "NUNICOSELLO")
    private Long nunicosello;
    @Basic(optional = false)
    @Column(name = "NUNICODOC")
    private Long nunicodoc;
    @Basic(optional = false)
    @Column(name = "NUNICODOCT")
    private Long nunicodoct;

    public DetalleSelloDocumPK() {
    }

    public DetalleSelloDocumPK(Long nunicosello, Long nunicodoc, Long nunicodoct) {
        this.nunicosello = nunicosello;
        this.nunicodoc = nunicodoc;
        this.nunicodoct = nunicodoct;
    }

    public Long getNunicosello() {
        return nunicosello;
    }

    public void setNunicosello(Long nunicosello) {
        this.nunicosello = nunicosello;
    }

    public Long getNunicodoc() {
        return nunicodoc;
    }

    public void setNunicodoc(Long nunicodoc) {
        this.nunicodoc = nunicodoc;
    }

    public Long getNunicodoct() {
        return nunicodoct;
    }

    public void setNunicodoct(Long nunicodoct) {
        this.nunicodoct = nunicodoct;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nunicosello != null ? nunicosello.hashCode() : 0);
        hash += (nunicodoc != null ? nunicodoc.hashCode() : 0);
        hash += (nunicodoct != null ? nunicodoct.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleSelloDocumPK)) {
            return false;
        }
        DetalleSelloDocumPK other = (DetalleSelloDocumPK) object;
        if (this.nunicosello != other.nunicosello) {
            return false;
        }
        if (this.nunicodoc != other.nunicodoc) {
            return false;
        }
        if ((this.nunicodoct == null && other.nunicodoct != null) || (this.nunicodoct != null && !this.nunicodoct.equals(other.nunicodoct))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeamx.adeadms.pojos.DetalleSelloDocumPK[nunicosello=" + nunicosello + ", nunicodoc=" + nunicodoc + ", nunicodoct=" + nunicodoct + "]";
    }

}
