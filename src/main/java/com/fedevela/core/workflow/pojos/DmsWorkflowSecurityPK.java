package com.fedevela.core.workflow.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Deprecated
public class DmsWorkflowSecurityPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ID_WORKFLOW")
    private Long idWorkflow;
    @Basic(optional = false)
    @Column(name = "ID_WORKFLOW_STATE")
    private String idWorkflowState;
    @Basic(optional = false)
    @Column(name = "ID_WORKFLOW_EVENT")
    private String idWorkflowEvent;
    @Basic(optional = false)
    @Column(name = "ID_WORKFLOW_NEXT_STATE")
    private String idWorkflowNextState;
    @Basic(optional = false)
    @Column(name = "ID_ROL")
    private BigInteger idRol;

    public DmsWorkflowSecurityPK() {
    }

    public DmsWorkflowSecurityPK(Long idWorkflow, String idWorkflowState, String idWorkflowEvent, String idWorkflowNextState, BigInteger idRol) {
        this.idWorkflow = idWorkflow;
        this.idWorkflowState = idWorkflowState;
        this.idWorkflowEvent = idWorkflowEvent;
        this.idWorkflowNextState = idWorkflowNextState;
        this.idRol = idRol;
    }

    public Long getIdWorkflow() {
        return idWorkflow;
    }

    public void setIdWorkflow(Long idWorkflow) {
        this.idWorkflow = idWorkflow;
    }

    public String getIdWorkflowState() {
        return idWorkflowState;
    }

    public void setIdWorkflowState(String idWorkflowState) {
        this.idWorkflowState = idWorkflowState;
    }

    public String getIdWorkflowEvent() {
        return idWorkflowEvent;
    }

    public void setIdWorkflowEvent(String idWorkflowEvent) {
        this.idWorkflowEvent = idWorkflowEvent;
    }

    public String getIdWorkflowNextState() {
        return idWorkflowNextState;
    }

    public void setIdWorkflowNextState(String idWorkflowNextState) {
        this.idWorkflowNextState = idWorkflowNextState;
    }

    public BigInteger getIdRol() {
        return idRol;
    }

    public void setIdRol(BigInteger idRol) {
        this.idRol = idRol;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idWorkflow != null ? idWorkflow.hashCode() : 0);
        hash += (idWorkflowState != null ? idWorkflowState.hashCode() : 0);
        hash += (idWorkflowEvent != null ? idWorkflowEvent.hashCode() : 0);
        hash += (idWorkflowNextState != null ? idWorkflowNextState.hashCode() : 0);
        hash += (idRol != null ? idRol.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DmsWorkflowSecurityPK)) {
            return false;
        }
        DmsWorkflowSecurityPK other = (DmsWorkflowSecurityPK) object;
        if ((this.idWorkflow == null && other.idWorkflow != null) || (this.idWorkflow != null && !this.idWorkflow.equals(other.idWorkflow))) {
            return false;
        }
        if ((this.idWorkflowState == null && other.idWorkflowState != null) || (this.idWorkflowState != null && !this.idWorkflowState.equals(other.idWorkflowState))) {
            return false;
        }
        if ((this.idWorkflowEvent == null && other.idWorkflowEvent != null) || (this.idWorkflowEvent != null && !this.idWorkflowEvent.equals(other.idWorkflowEvent))) {
            return false;
        }
        if ((this.idWorkflowNextState == null && other.idWorkflowNextState != null) || (this.idWorkflowNextState != null && !this.idWorkflowNextState.equals(other.idWorkflowNextState))) {
            return false;
        }
        if ((this.idRol == null && other.idRol != null) || (this.idRol != null && !this.idRol.equals(other.idRol))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.workflow.pojos.DmsWorkflowSecurityPK[idWorkflow=" + idWorkflow + ", idWorkflowState=" + idWorkflowState + ", idWorkflowEvent=" + idWorkflowEvent + ", idWorkflowNextState=" + idWorkflowNextState + ", idRol=" + idRol + "]";
    }

}
