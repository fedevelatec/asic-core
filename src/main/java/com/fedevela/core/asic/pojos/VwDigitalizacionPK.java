package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class VwDigitalizacionPK implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "NUNICODOC")
    private Long nunicodoc;
    @Column(name = "NUNICODOCT")
    private Long nunicodoct;

    public VwDigitalizacionPK() {
    }

    public VwDigitalizacionPK(Long nunicodoc, Long nunicodoct) {
        this.nunicodoc = nunicodoc;
        this.nunicodoct = nunicodoct;
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

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final VwDigitalizacionPK other = (VwDigitalizacionPK) obj;
        if (this.nunicodoc != other.nunicodoc && (this.nunicodoc == null || !this.nunicodoc.equals(other.nunicodoc))) {
            return false;
        }
        if (this.nunicodoct != other.nunicodoct && (this.nunicodoct == null || !this.nunicodoct.equals(other.nunicodoct))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + (this.nunicodoc != null ? this.nunicodoc.hashCode() : 0);
        hash = 41 * hash + (this.nunicodoct != null ? this.nunicodoct.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "VwDigitalizacionPK{" + "nunicodoc=" + nunicodoc + ", nunicodoct=" + nunicodoct + '}';
    }
}
