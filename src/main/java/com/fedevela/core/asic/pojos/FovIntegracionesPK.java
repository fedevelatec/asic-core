package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class FovIntegracionesPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "EXPEDIENTE_ORIGEN")
    private Long expedienteOrigen;

    @Basic(optional = false)
    @Column(name = "EXPEDIENTE_DESTINO")
    private Long expedienteDestino;

    @Basic(optional = false)
    @Column(name = "FASE")
    private Integer fase;

    public FovIntegracionesPK() {
    }

    public FovIntegracionesPK(Long expedienteOrigen, Long expedienteDestino, Integer fase) {
        this.expedienteOrigen = expedienteOrigen;
        this.expedienteDestino = expedienteDestino;
        this.fase = fase;
    }

    public Long getExpedienteDestino() {
        return expedienteDestino;
    }

    public void setExpedienteDestino(Long expedienteDestino) {
        this.expedienteDestino = expedienteDestino;
    }

    public Long getExpedienteOrigen() {
        return expedienteOrigen;
    }

    public void setExpedienteOrigen(Long expedienteOrigen) {
        this.expedienteOrigen = expedienteOrigen;
    }

    public Integer getFase() {
        return fase;
    }

    public void setFase(Integer fase) {
        this.fase = fase;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final FovIntegracionesPK other = (FovIntegracionesPK) obj;
        if (this.expedienteOrigen != other.expedienteOrigen && (this.expedienteOrigen == null || !this.expedienteOrigen.equals(other.expedienteOrigen))) {
            return false;
        }
        if (this.expedienteDestino != other.expedienteDestino && (this.expedienteDestino == null || !this.expedienteDestino.equals(other.expedienteDestino))) {
            return false;
        }
        if (this.fase != other.fase && (this.fase == null || !this.fase.equals(other.fase))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + (this.expedienteOrigen != null ? this.expedienteOrigen.hashCode() : 0);
        hash = 17 * hash + (this.expedienteDestino != null ? this.expedienteDestino.hashCode() : 0);
        hash = 17 * hash + (this.fase != null ? this.fase.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "FovIntegracionesPK{" + "expedienteOrigen=" + expedienteOrigen + ", expedienteDestino=" + expedienteDestino + ", fase=" + fase + '}';
    }

}
