package com.fedevela.core.hn.pojos;

/**
 * Created by fvelazquez on 28/03/14.
 */
import com.fedevela.core.asic.pojos.*;
import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author egutierrez
 */
@Embeddable
public class HnMonitorDigPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CAJA_ID")
    private Long cajaId;
    @Basic(optional = false)
    @Column(name = "NUNICODOCT")
    private Long nunicodoct;

    public HnMonitorDigPK() {
    }

    public HnMonitorDigPK(Long cajaId, Long nunicodoct) {
        this.cajaId = cajaId;
        this.nunicodoct = nunicodoct;
    }

    public Long getCajaId() {
        return cajaId;
    }

    public void setCajaId(Long cajaId) {
        this.cajaId = cajaId;
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
        hash += (cajaId != null ? cajaId.hashCode() : 0);
        hash += (nunicodoct != null ? nunicodoct.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HnMonitorDigPK)) {
            return false;
        }
        HnMonitorDigPK other = (HnMonitorDigPK) object;
        if ((this.cajaId == null && other.cajaId != null) || (this.cajaId != null && !this.cajaId.equals(other.cajaId))) {
            return false;
        }
        if ((this.nunicodoct == null && other.nunicodoct != null) || (this.nunicodoct != null && !this.nunicodoct.equals(other.nunicodoct))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeamx.adeadms.pojos.HnMonitorDigPK[cajaId=" + cajaId + ", nunicodoct=" + nunicodoct + "]";
    }
}
