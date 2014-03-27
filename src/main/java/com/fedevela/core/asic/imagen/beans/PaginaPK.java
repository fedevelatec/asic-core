package com.fedevela.core.asic.imagen.beans;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PaginaPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "NUNICODOC")
    private Long nunicodoc;
    @Basic(optional = false)
    @Column(name = "NUNICODOCT")
    private Long nunicodoct;
    @Basic(optional = false)
    @Column(name = "PAGINA")
    private Integer pagina;

    public PaginaPK() {
    }

    public PaginaPK(Long nunicodoc, Long nunicodoct, Integer pagina) {
        this.nunicodoc = nunicodoc;
        this.nunicodoct = nunicodoct;
        this.pagina = pagina;
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

    public Integer getPagina() {
        return pagina;
    }

    public void setPagina(Integer pagina) {
        this.pagina = pagina;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PaginaPK other = (PaginaPK) obj;
        if (this.nunicodoc != other.nunicodoc && (this.nunicodoc == null || !this.nunicodoc.equals(other.nunicodoc))) {
            return false;
        }
        if (this.nunicodoct != other.nunicodoct && (this.nunicodoct == null || !this.nunicodoct.equals(other.nunicodoct))) {
            return false;
        }
        if (this.pagina != other.pagina && (this.pagina == null || !this.pagina.equals(other.pagina))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + (this.nunicodoc != null ? this.nunicodoc.hashCode() : 0);
        hash = 37 * hash + (this.nunicodoct != null ? this.nunicodoct.hashCode() : 0);
        hash = 37 * hash + (this.pagina != null ? this.pagina.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "PaginaPK{" + "nunicodoc=" + nunicodoc + ", nunicodoct=" + nunicodoct + ", pagina=" + pagina + '}';
    }
}
