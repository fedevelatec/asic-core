package com.fedevela.core.parser.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CARGA", catalog = "", schema = "PROD")
public class Carga implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    protected CargaPK cargaPK;

    @Column(name = "LINEA")
    private String linea;

    public Carga() {
    }

    public Carga(CargaPK cargaPK) {
        this.cargaPK = cargaPK;
    }

    public Carga(String id, int orden) {
        cargaPK = new CargaPK(id,orden);
    }

    public Carga(String id, int orden, String linea) {
        cargaPK = new CargaPK(id,orden);
        this.linea = linea;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cargaPK != null ? cargaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Carga)) {
            return false;
        }
        Carga other = (Carga) object;
        if ((this.cargaPK == null && other.cargaPK != null) || (this.cargaPK != null && !this.cargaPK.equals(other.cargaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.cldocumentos.pojos.CargaPK[cargaPK=" + cargaPK + "]";
    }

}
