package com.fedevela.core.lgs.destruction.pojos;

/**
 * Created by fvelazquez on 28/03/14.
 */
import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class LgsDestructionsPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ID_LABEL")
    private BigInteger idLabel;
    @Basic(optional = false)
    @Column(name = "ID_LABEL_TYPE")
    private BigInteger idLabelType;

    public LgsDestructionsPK() {
    }

    public LgsDestructionsPK(BigInteger idLabel, BigInteger idLabelType) {
        this.idLabel = idLabel;
        this.idLabelType = idLabelType;
    }

    public BigInteger getIdLabel() {
        return idLabel;
    }

    public void setIdLabel(BigInteger idLabel) {
        this.idLabel = idLabel;
    }

    public BigInteger getIdLabelType() {
        return idLabelType;
    }

    public void setIdLabelType(BigInteger idLabelType) {
        this.idLabelType = idLabelType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLabel != null ? idLabel.hashCode() : 0);
        hash += (idLabelType != null ? idLabelType.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LgsDestructionsPK)) {
            return false;
        }
        LgsDestructionsPK other = (LgsDestructionsPK) object;
        if ((this.idLabel == null && other.idLabel != null) || (this.idLabel != null && !this.idLabel.equals(other.idLabel))) {
            return false;
        }
        if ((this.idLabelType == null && other.idLabelType != null) || (this.idLabelType != null && !this.idLabelType.equals(other.idLabelType))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.lgs.destruction.pojos.LgsDestructionsPK[idLabel=" + idLabel + ", idLabelType=" + idLabelType + "]";
    }

}
