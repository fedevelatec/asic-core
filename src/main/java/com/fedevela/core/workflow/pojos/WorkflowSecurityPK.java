package com.fedevela.core.workflow.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class WorkflowSecurityPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ID_WORKFLOW_CONFIG")
    private Long idWorkflowConfig;
    @Basic(optional = false)
    @Column(name = "ID_AUTHORITY")
    private String idAuthority;

    public WorkflowSecurityPK() {
    }

    public WorkflowSecurityPK(Long idWorkflowConfig, String idAuthority) {
        this.idWorkflowConfig = idWorkflowConfig;
        this.idAuthority = idAuthority;
    }

    public Long getIdWorkflowConfig() {
        return idWorkflowConfig;
    }

    public void setIdWorkflowConfig(Long idWorkflowConfig) {
        this.idWorkflowConfig = idWorkflowConfig;
    }

    public String getIdAuthority() {
        return idAuthority;
    }

    public void setIdAuthority(String idAuthority) {
        this.idAuthority = idAuthority;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + (this.idWorkflowConfig != null ? this.idWorkflowConfig.hashCode() : 0);
        hash = 89 * hash + (this.idAuthority != null ? this.idAuthority.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final WorkflowSecurityPK other = (WorkflowSecurityPK) obj;
        if (this.idWorkflowConfig != other.idWorkflowConfig && (this.idWorkflowConfig == null || !this.idWorkflowConfig.equals(other.idWorkflowConfig))) {
            return false;
        }
        if ((this.idAuthority == null) ? (other.idAuthority != null) : !this.idAuthority.equals(other.idAuthority)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "WorkflowSecurityPK{" + "idWorkflowConfig=" + idWorkflowConfig + ", idAuthority=" + idAuthority + '}';
    }
}
