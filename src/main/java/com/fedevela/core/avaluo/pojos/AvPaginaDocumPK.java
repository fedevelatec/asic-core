package com.fedevela.core.avaluo.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AvPaginaDocumPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "NUNICODOC")
    private int nunicodoc;
    @Basic(optional = false)
    @Column(name = "NUNICODOCT")
    private long nunicodoct;
    @Basic(optional = false)
    @Column(name = "PAGINA")
    private short pagina;

    public AvPaginaDocumPK() {
    }

    public AvPaginaDocumPK(int nunicodoc, long nunicodoct, short pagina) {
        this.nunicodoc = nunicodoc;
        this.nunicodoct = nunicodoct;
        this.pagina = pagina;
    }

    public int getNunicodoc() {
        return nunicodoc;
    }

    public void setNunicodoc(int nunicodoc) {
        this.nunicodoc = nunicodoc;
    }

    public long getNunicodoct() {
        return nunicodoct;
    }

    public void setNunicodoct(long nunicodoct) {
        this.nunicodoct = nunicodoct;
    }

    public short getPagina() {
        return pagina;
    }

    public void setPagina(short pagina) {
        this.pagina = pagina;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) nunicodoc;
        hash += (int) nunicodoct;
        hash += (int) pagina;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AvPaginaDocumPK)) {
            return false;
        }
        AvPaginaDocumPK other = (AvPaginaDocumPK) object;
        if (this.nunicodoc != other.nunicodoc) {
            return false;
        }
        if (this.nunicodoct != other.nunicodoct) {
            return false;
        }
        if (this.pagina != other.pagina) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.transfer.pojos.AvPaginaDocumPK[nunicodoc=" + nunicodoc + ", nunicodoct=" + nunicodoct + ", pagina=" + pagina + "]";
    }

}
