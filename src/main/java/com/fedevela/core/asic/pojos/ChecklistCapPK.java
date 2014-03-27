package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ChecklistCapPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "NUNICODOC")
    private Long nunicodoc;
    @Basic(optional = false)
    @Column(name = "NUNICODOCT")
    private Long nunicodoct;
    @Basic(optional = false)
    @Column(name = "DOCCOD")
    private Short doccod;

    public ChecklistCapPK() {
    }

    public ChecklistCapPK(Long nunicodoc, Long nunicodoct, Short doccod) {
        this.nunicodoc = nunicodoc;
        this.nunicodoct = nunicodoct;
        this.doccod = doccod;
    }

    public Long getNunicodoc() {
        return nunicodoc;
    }

    public void setNunicodoc(Long nunicodoc) {
        this.nunicodoc = nunicodoc;
    }

    public Long getNunicodoct() {
        return nunicodoct;
    }

    public void setNunicodoct(Long nunicodoct) {
        this.nunicodoct = nunicodoct;
    }

    public Short getDoccod() {
        return doccod;
    }

    public void setDoccod(Short doccod) {
        this.doccod = doccod;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + (this.nunicodoc != null ? this.nunicodoc.hashCode() : 0);
        hash = 31 * hash + (this.nunicodoct != null ? this.nunicodoct.hashCode() : 0);
        hash = 31 * hash + (this.doccod != null ? this.doccod.hashCode() : 0);
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
        final ChecklistCapPK other = (ChecklistCapPK) obj;
        if (this.nunicodoc != other.nunicodoc && (this.nunicodoc == null || !this.nunicodoc.equals(other.nunicodoc))) {
            return false;
        }
        if (this.nunicodoct != other.nunicodoct && (this.nunicodoct == null || !this.nunicodoct.equals(other.nunicodoct))) {
            return false;
        }
        if (this.doccod != other.doccod && (this.doccod == null || !this.doccod.equals(other.doccod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.adea.pojos.ChecklistCapPK[ nunicodoc=" + nunicodoc + ", nunicodoct=" + nunicodoct + ", doccod=" + doccod + " ]";
    }
}
