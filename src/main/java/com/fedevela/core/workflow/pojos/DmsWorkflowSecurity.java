package com.fedevela.core.workflow.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DMS_WORKFLOW_SECURITY", catalog = "", schema = "PROD")
@Deprecated
public class DmsWorkflowSecurity implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DmsWorkflowSecurityPK dmsWorkflowSecurityPK;
    @Basic(optional = false)
    @Column(name = "VIEW_STATE")
    private char viewState;
    @Basic(optional = false)
    @Column(name = "PERMIT_TRANSITION")
    private char permitTransition;
    @JoinColumns({
            @JoinColumn(name = "ID_WORKFLOW", referencedColumnName = "ID_WORKFLOW", insertable = false, updatable = false),
            @JoinColumn(name = "ID_WORKFLOW_STATE", referencedColumnName = "ID_WORKFLOW_STATE", insertable = false, updatable = false),
            @JoinColumn(name = "ID_WORKFLOW_NEXT_STATE", referencedColumnName = "ID_WORKFLOW_NEXT_STATE", insertable = false, updatable = false),
            @JoinColumn(name = "ID_WORKFLOW_EVENT", referencedColumnName = "ID_WORKFLOW_EVENT", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private DmsWorkflowConfig dmsWorkflowConfig;

    public DmsWorkflowSecurity() {
        viewState = 'f';
        permitTransition = 'f';
    }

    public DmsWorkflowSecurity(DmsWorkflowSecurityPK dmsWorkflowSecurityPK) {
        this();
        this.dmsWorkflowSecurityPK = dmsWorkflowSecurityPK;
    }

    public DmsWorkflowSecurity(DmsWorkflowSecurityPK dmsWorkflowSecurityPK, char viewState, char permitTransition) {
        this.dmsWorkflowSecurityPK = dmsWorkflowSecurityPK;
        this.viewState = viewState;
        this.permitTransition = permitTransition;
    }

    public DmsWorkflowSecurity(Long idWorkflow, String idWorkflowState, String idWorkflowEvent, String idWorkflowNextState, BigInteger idRol) {
        this();
        this.dmsWorkflowSecurityPK = new DmsWorkflowSecurityPK(idWorkflow, idWorkflowState, idWorkflowEvent, idWorkflowNextState, idRol);
    }

    public DmsWorkflowSecurityPK getDmsWorkflowSecurityPK() {
        return dmsWorkflowSecurityPK;
    }

    public void setDmsWorkflowSecurityPK(DmsWorkflowSecurityPK dmsWorkflowSecurityPK) {
        this.dmsWorkflowSecurityPK = dmsWorkflowSecurityPK;
    }

    public char getViewState() {
        return viewState;
    }

    public void setViewState(char viewState) {
        this.viewState = viewState;
    }

    public char getPermitTransition() {
        return permitTransition;
    }

    public void setPermitTransition(char permitTransition) {
        this.permitTransition = permitTransition;
    }

    public DmsWorkflowConfig getDmsWorkflowConfig() {
        return dmsWorkflowConfig;
    }

    public void setDmsWorkflowConfig(DmsWorkflowConfig dmsWorkflowConfig) {
        this.dmsWorkflowConfig = dmsWorkflowConfig;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dmsWorkflowSecurityPK != null ? dmsWorkflowSecurityPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DmsWorkflowSecurity)) {
            return false;
        }
        DmsWorkflowSecurity other = (DmsWorkflowSecurity) object;
        if ((this.dmsWorkflowSecurityPK == null && other.dmsWorkflowSecurityPK != null) || (this.dmsWorkflowSecurityPK != null && !this.dmsWorkflowSecurityPK.equals(other.dmsWorkflowSecurityPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.workflow.pojos.DmsWorkflowSecurity[dmsWorkflowSecurityPK=" + dmsWorkflowSecurityPK + "]";
    }
}
