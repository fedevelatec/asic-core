package com.fedevela.core.sc.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class ScObservacionesRetornoPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ID_RETORNO")
    private BigInteger idRetorno;
    @Basic(optional = false)
    @Column(name = "FOLIO")
    private BigInteger folio;
    @Basic(optional = false)
    @Column(name = "ETIQUETA")
    private BigInteger etiqueta;
    @Basic(optional = false)
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;

    public ScObservacionesRetornoPK() {
    }

    public ScObservacionesRetornoPK(BigInteger idRetorno, BigInteger folio, BigInteger etiqueta, Date fecha) {
        this.idRetorno = idRetorno;
        this.folio = folio;
        this.etiqueta = etiqueta;
        this.fecha = fecha;
    }

    public BigInteger getIdRetorno() {
        return idRetorno;
    }

    public void setIdRetorno(BigInteger idRetorno) {
        this.idRetorno = idRetorno;
    }

    public BigInteger getFolio() {
        return folio;
    }

    public void setFolio(BigInteger folio) {
        this.folio = folio;
    }

    public BigInteger getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(BigInteger etiqueta) {
        this.etiqueta = etiqueta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRetorno != null ? idRetorno.hashCode() : 0);
        hash += (folio != null ? folio.hashCode() : 0);
        hash += (etiqueta != null ? etiqueta.hashCode() : 0);
        hash += (fecha != null ? fecha.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ScObservacionesRetornoPK)) {
            return false;
        }
        ScObservacionesRetornoPK other = (ScObservacionesRetornoPK) object;
        if ((this.idRetorno == null && other.idRetorno != null) || (this.idRetorno != null && !this.idRetorno.equals(other.idRetorno))) {
            return false;
        }
        if ((this.folio == null && other.folio != null) || (this.folio != null && !this.folio.equals(other.folio))) {
            return false;
        }
        if ((this.etiqueta == null && other.etiqueta != null) || (this.etiqueta != null && !this.etiqueta.equals(other.etiqueta))) {
            return false;
        }
        if ((this.fecha == null && other.fecha != null) || (this.fecha != null && !this.fecha.equals(other.fecha))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.sc.pojos.ScObservacionesRetornoPK[ idRetorno=" + idRetorno + ", folio=" + folio + ", etiqueta=" + etiqueta + ", fecha=" + fecha + " ]";
    }

}
