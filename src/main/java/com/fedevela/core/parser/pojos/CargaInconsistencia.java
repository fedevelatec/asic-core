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
@Table(name = "CARGA_INCONSISTENCIA", catalog = "", schema = "PROD")
public class CargaInconsistencia implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    protected CargaInconsistenciaPK cargaInconsistenciaPK;

    @Column(name = "VALOR")
    private String valor;

    @Column(name = "LAYOUT")
    private String layout;

    public CargaInconsistencia() {
    }

    public CargaInconsistencia(CargaInconsistenciaPK cargaInconsistenciaPK) {
        this.cargaInconsistenciaPK = cargaInconsistenciaPK;
    }

    public CargaInconsistenciaPK getCargaInconsistenciaPK() {
        return cargaInconsistenciaPK;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cargaInconsistenciaPK != null ? cargaInconsistenciaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CargaInconsistencia)) {
            return false;
        }
        CargaInconsistencia other = (CargaInconsistencia) object;
        if ((this.cargaInconsistenciaPK == null && other.cargaInconsistenciaPK != null) || (this.cargaInconsistenciaPK != null && !this.cargaInconsistenciaPK.equals(other.cargaInconsistenciaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.cldocumentos.pojos.CargaInconsistencia[id=" + cargaInconsistenciaPK + "]";
    }
}
