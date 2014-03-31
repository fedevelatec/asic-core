package com.fedevela.core.sc.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "SC_ENTREGA_RETORNO", catalog = "", schema = "PROD")
public class ScEntregaRetorno implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ScEntregaRetornoPK scEntregaRetornoPK;
    @Basic(optional = false)
    @Column(name = "ENTREGA")
    private BigInteger entrega;
    @Basic(optional = false)
    @Column(name = "RECIBE")
    private BigInteger recibe;

    public ScEntregaRetorno() {
    }

    public ScEntregaRetorno(ScEntregaRetornoPK scEntregaRetornoPK) {
        this.scEntregaRetornoPK = scEntregaRetornoPK;
    }

    public ScEntregaRetorno(ScEntregaRetornoPK scEntregaRetornoPK, BigInteger entrega, BigInteger recibe) {
        this.scEntregaRetornoPK = scEntregaRetornoPK;
        this.entrega = entrega;
        this.recibe = recibe;
    }

    public ScEntregaRetorno(BigInteger idRetorno, BigInteger cliente) {
        this.scEntregaRetornoPK = new ScEntregaRetornoPK(idRetorno, cliente);
    }

    public ScEntregaRetornoPK getScEntregaRetornoPK() {
        return scEntregaRetornoPK;
    }

    public void setScEntregaRetornoPK(ScEntregaRetornoPK scEntregaRetornoPK) {
        this.scEntregaRetornoPK = scEntregaRetornoPK;
    }

    public BigInteger getEntrega() {
        return entrega;
    }

    public void setEntrega(BigInteger entrega) {
        this.entrega = entrega;
    }

    public BigInteger getRecibe() {
        return recibe;
    }

    public void setRecibe(BigInteger recibe) {
        this.recibe = recibe;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (scEntregaRetornoPK != null ? scEntregaRetornoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ScEntregaRetorno)) {
            return false;
        }
        ScEntregaRetorno other = (ScEntregaRetorno) object;
        if ((this.scEntregaRetornoPK == null && other.scEntregaRetornoPK != null) || (this.scEntregaRetornoPK != null && !this.scEntregaRetornoPK.equals(other.scEntregaRetornoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.sc.pojos.ScEntregaRetorno[scEntregaRetornoPK=" + scEntregaRetornoPK + "]";
    }

}
