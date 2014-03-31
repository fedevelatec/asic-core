package com.fedevela.core.security.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ClaveWebmxPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "IDTARJETA")
    private Long idtarjeta;
    @Basic(optional = false)
    @Column(name = "POSICION")
    private Short posicion;

    public ClaveWebmxPK() {
    }

    public ClaveWebmxPK(Long idtarjeta, Short posicion) {
        this.idtarjeta = idtarjeta;
        this.posicion = posicion;
    }

    public Long getIdtarjeta() {
        return idtarjeta;
    }

    public void setIdtarjeta(Long idtarjeta) {
        this.idtarjeta = idtarjeta;
    }

    public Short getPosicion() {
        return posicion;
    }

    public void setPosicion(Short posicion) {
        this.posicion = posicion;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (this.idtarjeta != null ? this.idtarjeta.hashCode() : 0);
        hash = 97 * hash + (this.posicion != null ? this.posicion.hashCode() : 0);
        return hash;
    }



    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClaveWebmxPK)) {
            return false;
        }
        ClaveWebmxPK other = (ClaveWebmxPK) object;
        if (this.idtarjeta != other.idtarjeta) {
            return false;
        }
        if (this.posicion != other.posicion) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.security.pojos.ClaveWebmxPK[idtarjeta=" + idtarjeta + ", posicion=" + posicion + "]";
    }

}
