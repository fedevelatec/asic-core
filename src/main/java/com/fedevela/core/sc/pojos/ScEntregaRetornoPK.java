package com.fedevela.core.sc.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ScEntregaRetornoPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ID_RETORNO")
    private BigInteger idRetorno;
    @Basic(optional = false)
    @Column(name = "CLIENTE")
    private BigInteger cliente;

    public ScEntregaRetornoPK() {
    }

    public ScEntregaRetornoPK(BigInteger idRetorno, BigInteger cliente) {
        this.idRetorno = idRetorno;
        this.cliente = cliente;
    }

    public BigInteger getIdRetorno() {
        return idRetorno;
    }

    public void setIdRetorno(BigInteger idRetorno) {
        this.idRetorno = idRetorno;
    }

    public BigInteger getCliente() {
        return cliente;
    }

    public void setCliente(BigInteger cliente) {
        this.cliente = cliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRetorno != null ? idRetorno.hashCode() : 0);
        hash += (cliente != null ? cliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ScEntregaRetornoPK)) {
            return false;
        }
        ScEntregaRetornoPK other = (ScEntregaRetornoPK) object;
        if ((this.idRetorno == null && other.idRetorno != null) || (this.idRetorno != null && !this.idRetorno.equals(other.idRetorno))) {
            return false;
        }
        if ((this.cliente == null && other.cliente != null) || (this.cliente != null && !this.cliente.equals(other.cliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.sc.pojos.ScEntregaRetornoPK[idRetorno=" + idRetorno + ", cliente=" + cliente + "]";
    }

}
