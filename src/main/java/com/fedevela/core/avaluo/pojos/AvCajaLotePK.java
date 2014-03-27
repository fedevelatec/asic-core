package com.fedevela.core.avaluo.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AvCajaLotePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "LOTE")
    private int lote;
    @Basic(optional = false)
    @Column(name = "CAJA")
    private BigInteger caja;
    @Basic(optional = false)
    @Column(name = "CLIENTE")
    private short cliente;

    public AvCajaLotePK() {
    }

    public AvCajaLotePK(int lote, BigInteger caja, short cliente) {
        this.lote = lote;
        this.caja = caja;
        this.cliente = cliente;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public BigInteger getCaja() {
        return caja;
    }

    public void setCaja(BigInteger caja) {
        this.caja = caja;
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
        hash += (caja != null ? caja.hashCode() : 0);
        hash += (int) cliente;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AvCajaLotePK)) {
            return false;
        }
        AvCajaLotePK other = (AvCajaLotePK) object;
        if (this.lote != other.lote) {
            return false;
        }
        if ((this.caja == null && other.caja != null) || (this.caja != null && !this.caja.equals(other.caja))) {
            return false;
        }
        if (this.cliente != other.cliente) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.transfer.pojos.AvCajaLotePK[lote=" + lote + ", caja=" + caja + ", cliente=" + cliente + "]";
    }

}
