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
public class LgsDestructionPlanConfigPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ID_PLAN")
    private BigInteger idPlan;
    @Basic(optional = false)
    @Column(name = "ID_CUSTOMER")
    private short idCustomer;
    @Basic(optional = false)
    @Column(name = "ID_PERIOD")
    private BigInteger idPeriod;

    public LgsDestructionPlanConfigPK() {
    }

    public LgsDestructionPlanConfigPK(BigInteger idPlan, short idCustomer, BigInteger idPeriod) {
        this.idPlan = idPlan;
        this.idCustomer = idCustomer;
        this.idPeriod = idPeriod;
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

    public BigInteger getIdPeriod() {
        return idPeriod;
    }

    public void setIdPeriod(BigInteger idPeriod) {
        this.idPeriod = idPeriod;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPlan != null ? idPlan.hashCode() : 0);
        hash += (int) idCustomer;
        hash += (idPeriod != null ? idPeriod.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LgsDestructionPlanConfigPK)) {
            return false;
        }
        LgsDestructionPlanConfigPK other = (LgsDestructionPlanConfigPK) object;
        if ((this.idPlan == null && other.idPlan != null) || (this.idPlan != null && !this.idPlan.equals(other.idPlan))) {
            return false;
        }
        if (this.idCustomer != other.idCustomer) {
            return false;
        }
        if ((this.idPeriod == null && other.idPeriod != null) || (this.idPeriod != null && !this.idPeriod.equals(other.idPeriod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.lgs.destruction.pojos.LgsDestructionPlanConfigPK[idPlan=" + idPlan + ", idCustomer=" + idCustomer + ", idPeriod=" + idPeriod + "]";
    }

}
