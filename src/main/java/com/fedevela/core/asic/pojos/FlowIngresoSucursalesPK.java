package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class FlowIngresoSucursalesPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "SCLTCOD")
    private Long scltcod;
    @Basic(optional = false)
    @Column(name = "SSCCOD")
    private Long ssccod;

    public FlowIngresoSucursalesPK() {
    }

    public FlowIngresoSucursalesPK(Long scltcod, Long ssccod) {
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
    public int hashCode() {
        int hash = 0;
        hash += (scltcod != null ? scltcod.hashCode() : 0);
        hash += (ssccod != null ? ssccod.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FlowIngresoSucursalesPK)) {
            return false;
        }
        FlowIngresoSucursalesPK other = (FlowIngresoSucursalesPK) object;
        if ((this.scltcod == null && other.scltcod != null) || (this.scltcod != null && !this.scltcod.equals(other.scltcod))) {
            return false;
        }
        if ((this.ssccod == null && other.ssccod != null) || (this.ssccod != null && !this.ssccod.equals(other.ssccod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.adea.pojos.FlowIngresoSucursalesPK[ scltcod=" + scltcod + ", ssccod=" + ssccod + " ]";
    }
}
