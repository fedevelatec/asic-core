package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class FlowTrasvasesPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "SCLTCOD")
    private short scltcod;
    @Basic(optional = false)
    @Column(name = "CAJA_ID_ORIGEN")
    private Long cajaIdOrigen;
    @Basic(optional = false)
    @Column(name = "CAJA_ID_DESTINO")
    private Long cajaIdDestino;

    public FlowTrasvasesPK() {
    }

    public FlowTrasvasesPK(short scltcod, Long cajaIdOrigen, Long cajaIdDestino) {
        this.scltcod = scltcod;
        this.cajaIdOrigen = cajaIdOrigen;
        this.cajaIdDestino = cajaIdDestino;
    }

    public short getScltcod() {
        return scltcod;
    }

    public void setScltcod(short scltcod) {
        this.scltcod = scltcod;
    }

    public Long getCajaIdOrigen() {
        return cajaIdOrigen;
    }

    public void setCajaIdOrigen(Long cajaIdOrigen) {
        this.cajaIdOrigen = cajaIdOrigen;
    }

    public Long getCajaIdDestino() {
        return cajaIdDestino;
    }

    public void setCajaIdDestino(Long cajaIdDestino) {
        this.cajaIdDestino = cajaIdDestino;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int)scltcod;
        hash += (cajaIdOrigen != null ? cajaIdOrigen.hashCode() : 0);
        hash += (cajaIdDestino != null ? cajaIdDestino.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FlowTrasvasesPK)) {
            return false;
        }
        FlowTrasvasesPK other = (FlowTrasvasesPK) object;
        if (this.scltcod != other.scltcod) {
            return false;
        }
        if ((this.cajaIdOrigen == null && other.cajaIdOrigen != null) || (this.cajaIdOrigen != null && !this.cajaIdOrigen.equals(other.cajaIdOrigen))) {
            return false;
        }
        if ((this.cajaIdDestino == null && other.cajaIdDestino != null) || (this.cajaIdDestino != null && !this.cajaIdDestino.equals(other.cajaIdDestino))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.adea.pojos.FlowTrasvasesPK[scltcod=" + scltcod + ", cajaIdOrigen=" + cajaIdOrigen + ", cajaIdDestino=" + cajaIdDestino + "]";
    }

}
