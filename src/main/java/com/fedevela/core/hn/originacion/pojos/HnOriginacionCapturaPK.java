package com.fedevela.core.hn.originacion.pojos;

/**
 * Created by fvelazquez on 28/03/14.
 */
import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class HnOriginacionCapturaPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "NUNICODOC")
    private BigInteger nunicodoc;
    @Basic(optional = false)
    @Column(name = "PERIODO")
    private String periodo;
    @Basic(optional = false)
    @Column(name = "DOCCOD")
    private short doccod;

    public HnOriginacionCapturaPK() {
    }

    public HnOriginacionCapturaPK(BigInteger nunicodoc, String periodo, short doccod) {
        this.nunicodoc = nunicodoc;
        this.periodo = periodo;
        this.doccod = doccod;
    }

    public BigInteger getNunicodoc() {
        return nunicodoc;
    }

    public void setNunicodoc(BigInteger nunicodoc) {
        this.nunicodoc = nunicodoc;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public short getDoccod() {
        return doccod;
    }

    public void setDoccod(short doccod) {
        this.doccod = doccod;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nunicodoc != null ? nunicodoc.hashCode() : 0);
        hash += (periodo != null ? periodo.hashCode() : 0);
        hash += (int) doccod;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HnOriginacionCapturaPK)) {
            return false;
        }
        HnOriginacionCapturaPK other = (HnOriginacionCapturaPK) object;
        if ((this.nunicodoc == null && other.nunicodoc != null) || (this.nunicodoc != null && !this.nunicodoc.equals(other.nunicodoc))) {
            return false;
        }
        if ((this.periodo == null && other.periodo != null) || (this.periodo != null && !this.periodo.equals(other.periodo))) {
            return false;
        }
        if (this.doccod != other.doccod) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeamx.adeadms.hn.pojos.HnOriginacionCapturaPK[nunicodoc=" + nunicodoc + ", periodo=" + periodo + ", doccod=" + doccod + "]";
    }

}
