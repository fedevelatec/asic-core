package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class FlowIngresosDetaMpPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "NUNICODOC")
    private Long nunicodoc;
    @Basic(optional = false)
    @Column(name = "CAJA_ID")
    private Long cajaId;

    public FlowIngresosDetaMpPK() {
    }

    public FlowIngresosDetaMpPK(Long nunicodoc, Long cajaId) {
        this.nunicodoc = nunicodoc;
        this.cajaId = cajaId;
    }

    public Long getNunicodoc() {
        return nunicodoc;
    }

    public void setNunicodoc(Long nunicodoc) {
        this.nunicodoc = nunicodoc;
    }

    public Long getCajaId() {
        return cajaId;
    }

    public void setCajaId(Long cajaId) {
        this.cajaId = cajaId;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + (this.nunicodoc != null ? this.nunicodoc.hashCode() : 0);
        hash = 23 * hash + (this.cajaId != null ? this.cajaId.hashCode() : 0);
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
        final FlowIngresosDetaMpPK other = (FlowIngresosDetaMpPK) obj;
        if (this.nunicodoc != other.nunicodoc && (this.nunicodoc == null || !this.nunicodoc.equals(other.nunicodoc))) {
            return false;
        }
        if (this.cajaId != other.cajaId && (this.cajaId == null || !this.cajaId.equals(other.cajaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FlowIngresosDetaMpPK{" + "nunicodoc=" + nunicodoc + ", cajaId=" + cajaId + '}';
    }
}
