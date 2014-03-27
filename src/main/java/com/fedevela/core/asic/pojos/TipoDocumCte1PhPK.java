package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TipoDocumCte1PhPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "SCLTCOD")
    private Long scltcod;
    @Basic(optional = false)
    @Column(name = "DOCCOD")
    private Long doccod;

    public TipoDocumCte1PhPK() {
    }

    public TipoDocumCte1PhPK(Long scltcod, Long doccod) {
        this.scltcod = scltcod;
        this.doccod = doccod;
    }

    public Long getScltcod() {
        return scltcod;
    }

    public void setScltcod(Long scltcod) {
        this.scltcod = scltcod;
    }

    public Long getDoccod() {
        return doccod;
    }

    public void setDoccod(Long doccod) {
        this.doccod = doccod;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (scltcod != null ? scltcod.hashCode() : 0);
        hash += (doccod != null ? doccod.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoDocumCte1PhPK)) {
            return false;
        }
        TipoDocumCte1PhPK other = (TipoDocumCte1PhPK) object;
        if ((this.scltcod == null && other.scltcod != null) || (this.scltcod != null && !this.scltcod.equals(other.scltcod))) {
            return false;
        }
        if ((this.doccod == null && other.doccod != null) || (this.doccod != null && !this.doccod.equals(other.doccod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeamx.adeadms.pojos.TipoDocumCte1PhPK[scltcod=" + scltcod + ", doccod=" + doccod + "]";
    }

}
