package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class FlowIngresosCajaMpPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "IDRECIBO")
    private Long idrecibo;
    @Basic(optional = false)
    @Column(name = "CAJA_ID")
    private Long cajaId;

    public FlowIngresosCajaMpPK() {
    }

    public FlowIngresosCajaMpPK(Long idrecibo, Long cajaId) {
        this.idrecibo = idrecibo;
        this.cajaId = cajaId;
    }

    public Long getIdrecibo() {
        return idrecibo;
    }

    public void setIdrecibo(Long idrecibo) {
        this.idrecibo = idrecibo;
    }

    public Long getCajaId() {
        return cajaId;
    }

    public void setCajaId(Long cajaId) {
        this.cajaId = cajaId;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + (this.idrecibo != null ? this.idrecibo.hashCode() : 0);
        hash = 47 * hash + (this.cajaId != null ? this.cajaId.hashCode() : 0);
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
        final FlowIngresosCajaMpPK other = (FlowIngresosCajaMpPK) obj;
        if (this.idrecibo != other.idrecibo && (this.idrecibo == null || !this.idrecibo.equals(other.idrecibo))) {
            return false;
        }
        if (this.cajaId != other.cajaId && (this.cajaId == null || !this.cajaId.equals(other.cajaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FlowIngresosCajaMpPK{" + "idrecibo=" + idrecibo + ", cajaId=" + cajaId + '}';
    }
}
