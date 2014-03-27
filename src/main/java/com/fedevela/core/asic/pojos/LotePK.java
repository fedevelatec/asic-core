package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class LotePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ID_LOTE")
    private BigInteger idLote;
    @Basic(optional = false)
    @Column(name = "SCLTCOD")
    private short scltcod;

    public LotePK() {
    }

    public LotePK(BigInteger idLote, short scltcod) {
        this.idLote = idLote;
        this.scltcod = scltcod;
    }

    public BigInteger getIdLote() {
        return idLote;
    }

    public void setIdLote(BigInteger idLote) {
        this.idLote = idLote;
    }

    public short getScltcod() {
        return scltcod;
    }

    public void setScltcod(short scltcod) {
        this.scltcod = scltcod;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLote != null ? idLote.hashCode() : 0);
        hash += (int) scltcod;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LotePK)) {
            return false;
        }
        LotePK other = (LotePK) object;
        if ((this.idLote == null && other.idLote != null) || (this.idLote != null && !this.idLote.equals(other.idLote))) {
            return false;
        }
        if (this.scltcod != other.scltcod) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.adea.pojos.LotePK[idLote=" + idLote + ", scltcod=" + scltcod + "]";
    }

}
