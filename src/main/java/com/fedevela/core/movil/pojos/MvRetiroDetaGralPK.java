package com.fedevela.core.movil.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class MvRetiroDetaGralPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ID_RETIRO")
    private long idRetiro;
    @Basic(optional = false)
    @Column(name = "ETIQUETA")
    private long etiqueta;

    public MvRetiroDetaGralPK() {
    }

    public MvRetiroDetaGralPK(long idRetiro, long etiqueta) {
        this.idRetiro = idRetiro;
        this.etiqueta = etiqueta;
    }

    public long getIdRetiro() {
        return idRetiro;
    }

    public void setIdRetiro(long idRetiro) {
        this.idRetiro = idRetiro;
    }

    public long getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(long etiqueta) {
        this.etiqueta = etiqueta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idRetiro;
        hash += (int) etiqueta;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MvRetiroDetaGralPK)) {
            return false;
        }
        MvRetiroDetaGralPK other = (MvRetiroDetaGralPK) object;
        if (this.idRetiro != other.idRetiro) {
            return false;
        }
        if (this.etiqueta != other.etiqueta) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.adea.ws.bbvaAdquis.MvRetiroDetaGralPK[ idRetiro=" + idRetiro + ", etiqueta=" + etiqueta + " ]";
    }

}
