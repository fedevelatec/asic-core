package com.fedevela.core.avaluo.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AvDocumentoAvaluoPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "NUNICODOC")
    private int nunicodoc;
    @Basic(optional = false)
    @Column(name = "NUNICODOCT")
    private long nunicodoct;

    public AvDocumentoAvaluoPK() {
    }

    public AvDocumentoAvaluoPK(int nunicodoc, long nunicodoct) {
        this.nunicodoc = nunicodoc;
        this.nunicodoct = nunicodoct;
    }

    public int getNunicodoc() {
        return nunicodoc;
    }

    public void setNunicodoc(int nunicodoc) {
        this.nunicodoc = nunicodoc;
    }

    public long getNunicodoct() {
        return nunicodoct;
    }

    public void setNunicodoct(long nunicodoct) {
        this.nunicodoct = nunicodoct;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) nunicodoc;
        hash += (int) nunicodoct;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AvDocumentoAvaluoPK)) {
            return false;
        }
        AvDocumentoAvaluoPK other = (AvDocumentoAvaluoPK) object;
        if (this.nunicodoc != other.nunicodoc) {
            return false;
        }
        if (this.nunicodoct != other.nunicodoct) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.avaluo.pojos.AvDocumentoAvaluoPK[nunicodoc=" + nunicodoc + ", nunicodoct=" + nunicodoct + "]";
    }

}
