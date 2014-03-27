package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TipoDocumPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "SCLTCOD")
    private Long scltcod;
    @Basic(optional = false)
    @Column(name = "DOCCOD")
    private Short doccod;

    public TipoDocumPK() {
    }

    public TipoDocumPK(Long scltcod, Short doccod) {
        this.scltcod = scltcod;
        this.doccod = doccod;
    }

    public Short getDoccod() {
        return doccod;
    }

    public void setDoccod(Short doccod) {
        this.doccod = doccod;
    }

    public Long getScltcod() {
        return scltcod;
    }

    public void setScltcod(Long scltcod) {
        this.scltcod = scltcod;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TipoDocumPK other = (TipoDocumPK) obj;
        if (this.scltcod != other.scltcod && (this.scltcod == null || !this.scltcod.equals(other.scltcod))) {
            return false;
        }
        if (this.doccod != other.doccod && (this.doccod == null || !this.doccod.equals(other.doccod))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + (this.scltcod != null ? this.scltcod.hashCode() : 0);
        hash = 83 * hash + (this.doccod != null ? this.doccod.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "TipoDocumPK{" + "scltcod=" + scltcod + ", doccod=" + doccod + '}';
    }
}
