package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CabeceraDocCte1PhId implements java.io.Serializable {

    @Basic(optional = false)
    @Column(name = "NUNICODOC")
    private long nunicodoc;
    @Basic(optional = false)
    @Column(name = "DOCCOD")
    private short doccod;

    public CabeceraDocCte1PhId() {
    }

    public CabeceraDocCte1PhId(short doccod, long nunicodoc) {
        this.doccod = doccod;
        this.nunicodoc = nunicodoc;
    }

    public short getDoccod() {
        return this.doccod;
    }

    public void setDoccod(short doccod) {
        this.doccod = doccod;
    }

    public long getNunicodoc() {
        return this.nunicodoc;
    }

    public void setNunicodoc(long nunicodoc) {
        this.nunicodoc = nunicodoc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) nunicodoc;
        hash += (int) doccod;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof CabeceraDocCte1PhId)) {
            return false;
        }
        CabeceraDocCte1PhId other = (CabeceraDocCte1PhId) object;
        if (this.nunicodoc != other.nunicodoc) {
            return false;
        }
        if (this.doccod != other.doccod) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeamx.adeadms.pojos.CabeceraDocCte1PhPK[nunicodoc=" + nunicodoc + ", doccod=" + doccod + "]";
    }
}
