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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "DMS_WORKFLOWS", catalog = "", schema = "PROD")
@Deprecated
public class DmsWorkflows implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PK_AUTOGEN")
    @SequenceGenerator(name = "PK_AUTOGEN", sequenceName = "PROD.SEQ_DMS_ID_WORKFLOW", allocationSize = 1)
    @Column(name = "ID_WORKFLOW")
    private Long idWorkflow;
    @Column(name = "DESCRIPTION")
    private String description;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dmsWorkflows")
    private List<DmsWorkflowConfig> dmsWorkflowConfigList;

    public DmsWorkflows() {
    }

    public DmsWorkflows(Long idWorkflow) {
        this.idWorkflow = idWorkflow;
    }

    public Long getIdWorkflow() {
        return idWorkflow;
    }

    public void setIdWorkflow(Long idWorkflow) {
        this.idWorkflow = idWorkflow;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idWorkflow != null ? idWorkflow.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DmsWorkflows)) {
            return false;
        }
        DmsWorkflows other = (DmsWorkflows) object;
        if ((this.idWorkflow == null && other.idWorkflow != null) || (this.idWorkflow != null && !this.idWorkflow.equals(other.idWorkflow))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.workflow.pojos.DmsWorkflows[idWorkflow=" + idWorkflow + "]";
    }
}
