package com.fedevela.core.asic.imagen.beans;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ImagenPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "NUNICODOC")
    private Long nunicodoc;
    @Basic(optional = false)
    @Column(name = "NUNICODOCT")
    private Long nunicodoct;

    public ImagenPK() {
    }

    public ImagenPK(Long nunicodoc, Long nunicodoct) {
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
        final ImagenPK other = (ImagenPK) obj;
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
        int hash = 7;
        hash = 97 * hash + (this.nunicodoc != null ? this.nunicodoc.hashCode() : 0);
        hash = 97 * hash + (this.nunicodoct != null ? this.nunicodoct.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "ImagenPK{" + "nunicodoc=" + nunicodoc + ", nunicodoct=" + nunicodoct + '}';
    }
}
