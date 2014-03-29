package com.fedevela.core.lgs.destruction.pojos;

/**
 * Created by fvelazquez on 28/03/14.
 */
import com.fedevela.core.asic.pojos.Clientes;
import com.fedevela.core.workflow.pojos.DmsWorkflowStates;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "LGS_DESTRUCTIONS_PLAN", catalog = "", schema = "PROD")
@NamedQueries({
        @NamedQuery(name = "LgsDestructionsPlan.findAll", query = "SELECT l FROM LgsDestructionsPlan l"),
        @NamedQuery(name = "LgsDestructionsPlan.findByIdPlan", query = "SELECT l FROM LgsDestructionsPlan l WHERE l.lgsDestructionsPlanPK.idPlan = :idPlan"),
        @NamedQuery(name = "LgsDestructionsPlan.findByIdCustomer", query = "SELECT l FROM LgsDestructionsPlan l WHERE l.lgsDestructionsPlanPK.idCustomer = :idCustomer")})
public class LgsDestructionsPlan implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LgsDestructionsPlanPK lgsDestructionsPlanPK;
    @JoinColumn(name = "ID_PLAN", referencedColumnName = "ID_PLAN", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private LgsPlans lgsPlans;
    @JoinColumn(name = "ID_CUSTOMER", referencedColumnName = "SCLTCOD", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Clientes clientes;
    @JoinColumn(name = "ID_WORKFLOW_STATE", referencedColumnName = "ID_WORKFLOW_STATE")
    @ManyToOne(optional = false)
    private DmsWorkflowStates dmsWorkflowStates;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lgsDestructionsPlan")
    private List<LgsDestructionPlanConfig> lgsDestructionPlanConfigList;

    public LgsDestructionsPlan() {
    }

    public LgsDestructionsPlan(LgsDestructionsPlanPK lgsDestructionsPlanPK) {
        this.lgsDestructionsPlanPK = lgsDestructionsPlanPK;
    }

    public LgsDestructionsPlan(BigInteger idPlan, short idCustomer) {
        this.lgsDestructionsPlanPK = new LgsDestructionsPlanPK(idPlan, idCustomer);
    }

    public LgsDestructionsPlanPK getLgsDestructionsPlanPK() {
        return lgsDestructionsPlanPK;
    }

    public void setLgsDestructionsPlanPK(LgsDestructionsPlanPK lgsDestructionsPlanPK) {
        this.lgsDestructionsPlanPK = lgsDestructionsPlanPK;
    }

    public LgsPlans getLgsPlans() {
        return lgsPlans;
    }

    public void setLgsPlans(LgsPlans lgsPlans) {
        this.lgsPlans = lgsPlans;
    }

    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

    public DmsWorkflowStates getDmsWorkflowStates() {
        return dmsWorkflowStates;
    }

    public void setDmsWorkflowStates(DmsWorkflowStates dmsWorkflowStates) {
        this.dmsWorkflowStates = dmsWorkflowStates;
    }

    public List<LgsDestructionPlanConfig> getLgsDestructionPlanConfigList() {
        return lgsDestructionPlanConfigList;
    }

    public void setLgsDestructionPlanConfigList(List<LgsDestructionPlanConfig> lgsDestructionPlanConfigList) {
        this.lgsDestructionPlanConfigList = lgsDestructionPlanConfigList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lgsDestructionsPlanPK != null ? lgsDestructionsPlanPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LgsDestructionsPlan)) {
            return false;
        }
        LgsDestructionsPlan other = (LgsDestructionsPlan) object;
        if ((this.lgsDestructionsPlanPK == null && other.lgsDestructionsPlanPK != null) || (this.lgsDestructionsPlanPK != null && !this.lgsDestructionsPlanPK.equals(other.lgsDestructionsPlanPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.lgs.destruction.pojos.LgsDestructionsPlan[lgsDestructionsPlanPK=" + lgsDestructionsPlanPK + "]";
    }
}
