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
public class HnOriginacionPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "NUNICODOC")
    private BigInteger nunicodoc;
    @Basic(optional = false)
    @Column(name = "PERIODO")
    private String periodo;

    public HnOriginacionPK() {
    }

    public HnOriginacionPK(BigInteger nunicodoc, String periodo) {
        this.nunicodoc = nunicodoc;
        this.periodo = periodo;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nunicodoc != null ? nunicodoc.hashCode() : 0);
        hash += (periodo != null ? periodo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HnOriginacionPK)) {
            return false;
        }
        HnOriginacionPK other = (HnOriginacionPK) object;
        if ((this.nunicodoc == null && other.nunicodoc != null) || (this.nunicodoc != null && !this.nunicodoc.equals(other.nunicodoc))) {
            return false;
        }
        if ((this.periodo == null && other.periodo != null) || (this.periodo != null && !this.periodo.equals(other.periodo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeamx.adeadms.hn.pojos.HnOriginacionPK[nunicodoc=" + nunicodoc + ", periodo=" + periodo + "]";
    }

}
