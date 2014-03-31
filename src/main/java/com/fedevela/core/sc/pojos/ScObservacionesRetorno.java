package com.fedevela.core.sc.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "SC_OBSERVACIONES_RETORNO", catalog = "", schema = "PROD")
public class ScObservacionesRetorno implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ScObservacionesRetornoPK scObservacionesRetornoPK;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @Column(name = "ESTATUS")
    private BigInteger estatus;
    @Column(name = "LOGIN")
    private String login;

    public ScObservacionesRetorno() {
        estatus = new BigInteger("2");// Original
    }

    public ScObservacionesRetorno(ScObservacionesRetornoPK scObservacionesRetornoPK) {
        this();
        this.scObservacionesRetornoPK = scObservacionesRetornoPK;
    }

    public ScObservacionesRetorno(BigInteger idRetorno, BigInteger folio, BigInteger etiqueta, Date fecha) {
        this();
        this.scObservacionesRetornoPK = new ScObservacionesRetornoPK(idRetorno, folio, etiqueta, fecha);
    }

    public ScObservacionesRetornoPK getScObservacionesRetornoPK() {
        return scObservacionesRetornoPK;
    }

    public void setScObservacionesRetornoPK(ScObservacionesRetornoPK scObservacionesRetornoPK) {
        this.scObservacionesRetornoPK = scObservacionesRetornoPK;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public BigInteger getEstatus() {
        return estatus;
    }

    public void setEstatus(BigInteger estatus) {
        this.estatus = estatus;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (scObservacionesRetornoPK != null ? scObservacionesRetornoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ScObservacionesRetorno)) {
            return false;
        }
        ScObservacionesRetorno other = (ScObservacionesRetorno) object;
        if ((this.scObservacionesRetornoPK == null && other.scObservacionesRetornoPK != null) || (this.scObservacionesRetornoPK != null && !this.scObservacionesRetornoPK.equals(other.scObservacionesRetornoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.sc.pojos.ScObservacionesRetorno[ scObservacionesRetornoPK=" + scObservacionesRetornoPK + " ]";
    }
}
