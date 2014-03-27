package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class SucursalPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "SCLTCOD")
    private Long scltcod;
    @Basic(optional = false)
    @Column(name = "SSCCOD")
    private Long ssccod;

    public SucursalPK() {
    }

    public SucursalPK(Long scltcod, Long ssccod) {
        this.scltcod = scltcod;
        this.ssccod = ssccod;
    }

    public Long getScltcod() {
        return scltcod;
    }

    public void setScltcod(Long scltcod) {
        this.scltcod = scltcod;
    }

    public Long getSsccod() {
        return ssccod;
    }

    public void setSsccod(Long ssccod) {
        this.ssccod = ssccod;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SucursalPK other = (SucursalPK) obj;
        if (this.scltcod != other.scltcod && (this.scltcod == null || !this.scltcod.equals(other.scltcod))) {
            return false;
        }
        if (this.ssccod != other.ssccod && (this.ssccod == null || !this.ssccod.equals(other.ssccod))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + (this.scltcod != null ? this.scltcod.hashCode() : 0);
        hash = 53 * hash + (this.ssccod != null ? this.ssccod.hashCode() : 0);
        return hash;
    }



    @Override
    public String toString() {
        return "com.adeamx.adeadms.pojos.SucursalPK[scltcod=" + scltcod + ", ssccod=" + ssccod + "]";
    }

}
