package com.fedevela.core.hn.pojos;

/**
 * Created by fvelazquez on 28/03/14.
 */
import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class HnAutorizadoresPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "NUM_AUTORIZ")
    private BigInteger numAutoriz;
    @Basic(optional = false)
    @Column(name = "STATUS")
    private short status;
    @Basic(optional = false)
    @Column(name = "IDOPERADOR")
    private BigInteger idoperador;

    public HnAutorizadoresPK() {
    }

    public HnAutorizadoresPK(BigInteger numAutoriz, short status, BigInteger idoperador) {
        this.numAutoriz = numAutoriz;
        this.status = status;
        this.idoperador = idoperador;
    }

    public BigInteger getNumAutoriz() {
        return numAutoriz;
    }

    public void setNumAutoriz(BigInteger numAutoriz) {
        this.numAutoriz = numAutoriz;
    }

    public short getStatus() {
        return status;
    }

    public void setStatus(short status) {
        this.status = status;
    }

    public BigInteger getIdoperador() {
        return idoperador;
    }

    public void setIdoperador(BigInteger idoperador) {
        this.idoperador = idoperador;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numAutoriz != null ? numAutoriz.hashCode() : 0);
        hash += (int) status;
        hash += (idoperador != null ? idoperador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HnAutorizadoresPK)) {
            return false;
        }
        HnAutorizadoresPK other = (HnAutorizadoresPK) object;
        if ((this.numAutoriz == null && other.numAutoriz != null) || (this.numAutoriz != null && !this.numAutoriz.equals(other.numAutoriz))) {
            return false;
        }
        if (this.status != other.status) {
            return false;
        }
        if ((this.idoperador == null && other.idoperador != null) || (this.idoperador != null && !this.idoperador.equals(other.idoperador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeamx.adeadms.fovissste.pojos.so.HnAutorizadoresPK[numAutoriz=" + numAutoriz + ", status=" + status + ", idoperador=" + idoperador + "]";
    }

}
