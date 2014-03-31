package com.fedevela.core.workflow.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "DMS_WORKFLOW_CONFIG", catalog = "", schema = "PROD")
@Deprecated
public class DmsWorkflowConfig implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DmsWorkflowConfigPK dmsWorkflowConfigPK;
    @JoinColumn(name = "ID_WORKFLOW_STATE", referencedColumnName = "ID_WORKFLOW_STATE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private DmsWorkflowStates dmsWorkflowStates;
    @JoinColumn(name = "ID_WORKFLOW_NEXT_STATE", referencedColumnName = "ID_WORKFLOW_STATE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private DmsWorkflowStates dmsWorkflowStates1;
    @JoinColumn(name = "ID_WORKFLOW_EVENT", referencedColumnName = "ID_WORKFLOW_EVENT", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private DmsWorkflowEvents dmsWorkflowEvents;
    @JoinColumn(name = "ID_WORKFLOW", referencedColumnName = "ID_WORKFLOW", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private DmsWorkflows dmsWorkflows;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dmsWorkflowConfig")
    private List<DmsWorkflowSecurity> dmsWorkflowSecurityList;

    public DmsWorkflowConfig() {
    }

    public DmsWorkflowConfig(DmsWorkflowConfigPK dmsWorkflowConfigPK) {
        this.dmsWorkflowConfigPK = dmsWorkflowConfigPK;
    }

    public DmsWorkflowConfig(Long idWorkflow, String idWorkflowState, String idWorkflowEvent, String idWorkflowNextState) {
        this.dmsWorkflowConfigPK = new DmsWorkflowConfigPK(idWorkflow, idWorkflowState, idWorkflowEvent, idWorkflowNextState);
    }

    public DmsWorkflowConfigPK getDmsWorkflowConfigPK() {
        return dmsWorkflowConfigPK;
    }

    public void setDmsWorkflowConfigPK(DmsWorkflowConfigPK dmsWorkflowConfigPK) {
        this.dmsWorkflowConfigPK = dmsWorkflowConfigPK;
    }

    public DmsWorkflowStates getDmsWorkflowStates() {
        return dmsWorkflowStates;
    }

    public void setDmsWorkflowStates(DmsWorkflowStates dmsWorkflowStates) {
        this.dmsWorkflowStates = dmsWorkflowStates;
    }

    public DmsWorkflowStates getDmsWorkflowStates1() {
        return dmsWorkflowStates1;
    }

    public void setDmsWorkflowStates1(DmsWorkflowStates dmsWorkflowStates1) {
        this.dmsWorkflowStates1 = dmsWorkflowStates1;
    }

    public DmsWorkflowEvents getDmsWorkflowEvents() {
        return dmsWorkflowEvents;
    }

    public void setDmsWorkflowEvents(DmsWorkflowEvents dmsWorkflowEvents) {
        this.dmsWorkflowEvents = dmsWorkflowEvents;
    }

    public DmsWorkflows getDmsWorkflows() {
        return dmsWorkflows;
    }

    public void setDmsWorkflows(DmsWorkflows dmsWorkflows) {
        this.dmsWorkflows = dmsWorkflows;
    }

    public List<DmsWorkflowSecurity> getDmsWorkflowSecurityList() {
        return dmsWorkflowSecurityList;
    }

    public void setDmsWorkflowSecurityList(List<DmsWorkflowSecurity> dmsWorkflowSecurityList) {
        this.dmsWorkflowSecurityList = dmsWorkflowSecurityList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dmsWorkflowConfigPK != null ? dmsWorkflowConfigPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DmsWorkflowConfig)) {
            return false;
        }
        DmsWorkflowConfig other = (DmsWorkflowConfig) object;
        if ((this.dmsWorkflowConfigPK == null && other.dmsWorkflowConfigPK != null) || (this.dmsWorkflowConfigPK != null && !this.dmsWorkflowConfigPK.equals(other.dmsWorkflowConfigPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.workflow.pojos.DmsWorkflowConfig[dmsWorkflowConfigPK=" + dmsWorkflowConfigPK + "]";
    }

}
