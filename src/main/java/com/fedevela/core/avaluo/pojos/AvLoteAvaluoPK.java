package com.fedevela.core.avaluo.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AvLoteAvaluoPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "LOTE")
    private int lote;
    @Basic(optional = false)
    @Column(name = "CLIENTE")
    private short cliente;

    public AvLoteAvaluoPK() {
    }

    public AvLoteAvaluoPK(int lote, short cliente) {
        this.lote = lote;
        this.cliente = cliente;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public short getCliente() {
        return cliente;
    }

    public void setCliente(short cliente) {
        this.cliente = cliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) lote;
        hash += (int) cliente;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AvLoteAvaluoPK)) {
            return false;
        }
        AvLoteAvaluoPK other = (AvLoteAvaluoPK) object;
        if (this.lote != other.lote) {
            return false;
        }
        if (this.cliente != other.cliente) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.transfer.pojos.AvLoteAvaluoPK[lote=" + lote + ", cliente=" + cliente + "]";
    }

}
