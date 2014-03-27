package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PaginaDigPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "NUNICODOC")
    private Long nunicodoc;
    @Basic(optional = false)
    @Column(name = "NUNICODOCT")
    private Long nunicodoct;
    @Basic(optional = false)
    @Column(name = "PAGINA")
    private Long pagina;

    public PaginaDigPK() {
    }

    public PaginaDigPK(Long nunicodoc, Long nunicodoct, Long pagina) {
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

    public Long getPagina() {
        return pagina;
    }

    public void setPagina(Long pagina) {
        this.pagina = pagina;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nunicodoc != null ? nunicodoc.hashCode() : 0);
        hash += (nunicodoct != null ? nunicodoct.hashCode() : 0);
        hash += (pagina != null ? pagina.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PaginaDigPK)) {
            return false;
        }
        PaginaDigPK other = (PaginaDigPK) object;
        if ((this.nunicodoc == null && other.nunicodoc != null) || (this.nunicodoc != null && !this.nunicodoc.equals(other.nunicodoc))) {
            return false;
        }
        if ((this.nunicodoct == null && other.nunicodoct != null) || (this.nunicodoct != null && !this.nunicodoct.equals(other.nunicodoct))) {
            return false;
        }
        if ((this.pagina == null && other.pagina != null) || (this.pagina != null && !this.pagina.equals(other.pagina))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeamx.adeadms.pojos.PaginaDigPK[nunicodoc=" + nunicodoc + ", nunicodoct=" + nunicodoct + ", pagina=" + pagina + "]";
    }

}
