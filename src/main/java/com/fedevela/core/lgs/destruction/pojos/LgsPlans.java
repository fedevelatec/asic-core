package com.fedevela.core.lgs.destruction.pojos;

/**
 * Created by fvelazquez on 28/03/14.
 */
import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "LGS_PLANS", catalog = "", schema = "PROD")
@NamedQueries({
        @NamedQuery(name = "LgsPlans.findAll", query = "SELECT l FROM LgsPlans l"),
        @NamedQuery(name = "LgsPlans.findByIdPlan", query = "SELECT l FROM LgsPlans l WHERE l.idPlan = :idPlan"),
        @NamedQuery(name = "LgsPlans.findByDescription", query = "SELECT l FROM LgsPlans l WHERE l.description = :description")})
public class LgsPlans implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_PLAN")
    private BigInteger idPlan;
    @Column(name = "DESCRIPTION")
    private String description;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lgsPlans")
    private List<LgsDestructionsPlan> lgsDestructionsPlanList;

    public LgsPlans() {
    }

    public LgsPlans(BigInteger idPlan) {
        this.idPlan = idPlan;
    }

    public BigInteger getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(BigInteger idPlan) {
        this.idPlan = idPlan;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<LgsDestructionsPlan> getLgsDestructionsPlanList() {
        return lgsDestructionsPlanList;
    }

    public void setLgsDestructionsPlanList(List<LgsDestructionsPlan> lgsDestructionsPlanList) {
        this.lgsDestructionsPlanList = lgsDestructionsPlanList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPlan != null ? idPlan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LgsPlans)) {
            return false;
        }
        LgsPlans other = (LgsPlans) object;
        if ((this.idPlan == null && other.idPlan != null) || (this.idPlan != null && !this.idPlan.equals(other.idPlan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.lgs.destruction.pojos.LgsPlans[idPlan=" + idPlan + "]";
    }

}
