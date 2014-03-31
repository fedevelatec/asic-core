package com.fedevela.core.workflow.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "DMS_WORKFLOW_STATES", catalog = "", schema = "PROD")
@Deprecated
public class DmsWorkflowStates implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_WORKFLOW_STATE")
    private String idWorkflowState;
    @Column(name = "DESCRIPTION")
    private String description;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dmsWorkflowStates")
    private List<DmsWorkflowConfig> dmsWorkflowConfigList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dmsWorkflowStates1")
    private List<DmsWorkflowConfig> dmsWorkflowConfigList1;

    public DmsWorkflowStates() {
    }

    public DmsWorkflowStates(String idWorkflowState) {
        this.idWorkflowState = idWorkflowState;
    }

    public String getIdWorkflowState() {
        return idWorkflowState;
    }

    public void setIdWorkflowState(String idWorkflowState) {
        this.idWorkflowState = idWorkflowState;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<DmsWorkflowConfig> getDmsWorkflowConfigList() {
        return dmsWorkflowConfigList;
    }

    public void setDmsWorkflowConfigList(List<DmsWorkflowConfig> dmsWorkflowConfigList) {
        this.dmsWorkflowConfigList = dmsWorkflowConfigList;
    }

    public List<DmsWorkflowConfig> getDmsWorkflowConfigList1() {
        return dmsWorkflowConfigList1;
    }

    public void setDmsWorkflowConfigList1(List<DmsWorkflowConfig> dmsWorkflowConfigList1) {
        this.dmsWorkflowConfigList1 = dmsWorkflowConfigList1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idWorkflowState != null ? idWorkflowState.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DmsWorkflowStates)) {
            return false;
        }
        DmsWorkflowStates other = (DmsWorkflowStates) object;
        if ((this.idWorkflowState == null && other.idWorkflowState != null) || (this.idWorkflowState != null && !this.idWorkflowState.equals(other.idWorkflowState))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.workflow.pojos.DmsWorkflowStates[idWorkflowState=" + idWorkflowState + "]";
    }

}
