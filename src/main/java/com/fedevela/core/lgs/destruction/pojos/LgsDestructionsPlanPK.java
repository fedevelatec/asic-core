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
public class LgsDestructionsPlanPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ID_PLAN")
    private BigInteger idPlan;
    @Basic(optional = false)
    @Column(name = "ID_CUSTOMER")
    private short idCustomer;

    public LgsDestructionsPlanPK() {
    }

    public LgsDestructionsPlanPK(BigInteger idPlan, short idCustomer) {
        this.idPlan = idPlan;
        this.idCustomer = idCustomer;
    }

    public BigInteger getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(BigInteger idPlan) {
        this.idPlan = idPlan;
    }

    public short getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(short idCustomer) {
        this.idCustomer = idCustomer;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPlan != null ? idPlan.hashCode() : 0);
        hash += (int) idCustomer;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LgsDestructionsPlanPK)) {
            return false;
        }
        LgsDestructionsPlanPK other = (LgsDestructionsPlanPK) object;
        if ((this.idPlan == null && other.idPlan != null) || (this.idPlan != null && !this.idPlan.equals(other.idPlan))) {
            return false;
        }
        if (this.idCustomer != other.idCustomer) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.lgs.destruction.pojos.LgsDestructionsPlanPK[idPlan=" + idPlan + ", idCustomer=" + idCustomer + "]";
    }

}
