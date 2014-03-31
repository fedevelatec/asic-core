package com.fedevela.core.movil.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class MvRetiroDetaPrecintoPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ID_RETIRO", nullable = false)
    private long idRetiro;
    @Basic(optional = false)
    @Column(name = "CAJA_ID", nullable = false)
    private long cajaId;

    public MvRetiroDetaPrecintoPK() {
    }

    public MvRetiroDetaPrecintoPK(long idRetiro, long cajaId) {
        this.idRetiro = idRetiro;
        this.cajaId = cajaId;
    }

    public long getIdRetiro() {
        return idRetiro;
    }

    public void setIdRetiro(long idRetiro) {
        this.idRetiro = idRetiro;
    }

    public long getCajaId() {
        return cajaId;
    }

    public void setCajaId(long cajaId) {
        this.cajaId = cajaId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idRetiro;
        hash += (int) cajaId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MvRetiroDetaPrecintoPK)) {
            return false;
        }
        MvRetiroDetaPrecintoPK other = (MvRetiroDetaPrecintoPK) object;
        if (this.idRetiro != other.idRetiro) {
            return false;
        }
        if (this.cajaId != other.cajaId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adea.entity.pojos.MvRetiroDetaPrecintoPK[ idRetiro=" + idRetiro + ", cajaId=" + cajaId + " ]";
    }

}
