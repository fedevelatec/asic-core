package com.fedevela.core.movil.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="PROD", name="MV_PAQUETE_FOV_SINC")
public class MvPaqueteFovSinc implements Serializable {
    @Id
    @Basic(optional = false)
    @Column(name="PAQUETE", length=100)
    String paquete;
    @Id
    @Basic(optional = false)
    @Column(name="ID_MOVIL", length=100)
    String idMovil;

    public MvPaqueteFovSinc() {
    }

    public MvPaqueteFovSinc(String paquete, String idMovil) {
        this.paquete = paquete;
        this.idMovil = idMovil;
    }

    public String getPaquete() {
        return paquete;
    }

    public void setPaquete(String paquete) {
        this.paquete = paquete;
    }

    public String getIdMovil() {
        return idMovil;
    }

    public void setIdMovil(String idMovil) {
        this.idMovil = idMovil;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MvPaqueteFovSinc other = (MvPaqueteFovSinc) obj;
        if ((this.paquete == null) ? (other.paquete != null) : !this.paquete.equals(other.paquete)) {
            return false;
        }
        if ((this.idMovil == null) ? (other.idMovil != null) : !this.idMovil.equals(other.idMovil)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (this.paquete != null ? this.paquete.hashCode() : 0);
        hash = 59 * hash + (this.idMovil != null ? this.idMovil.hashCode() : 0);
        return hash;
    }
}
