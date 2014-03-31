package com.fedevela.core.ql.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class QlZonesPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ID_REGION")
    private BigInteger idRegion;
    @Basic(optional = false)
    @Column(name = "ID_ZONE")
    private BigInteger idZone;

    public QlZonesPK() {
    }

    public QlZonesPK(BigInteger idRegion, BigInteger idZone) {
        this.idRegion = idRegion;
        this.idZone = idZone;
    }

    public BigInteger getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(BigInteger idRegion) {
        this.idRegion = idRegion;
    }

    public BigInteger getIdZone() {
        return idZone;
    }

    public void setIdZone(BigInteger idZone) {
        this.idZone = idZone;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRegion != null ? idRegion.hashCode() : 0);
        hash += (idZone != null ? idZone.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof QlZonesPK)) {
            return false;
        }
        QlZonesPK other = (QlZonesPK) object;
        if ((this.idRegion == null && other.idRegion != null) || (this.idRegion != null && !this.idRegion.equals(other.idRegion))) {
            return false;
        }
        if ((this.idZone == null && other.idZone != null) || (this.idZone != null && !this.idZone.equals(other.idZone))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeamx.adeadms.ql.pojos.QlZonesPK[idRegion=" + idRegion + ", idZone=" + idZone + "]";
    }

}
