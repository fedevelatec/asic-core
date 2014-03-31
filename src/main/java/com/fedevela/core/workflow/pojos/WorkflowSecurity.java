package com.fedevela.core.workflow.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.codehaus.jackson.annotate.JsonIgnore;

@Entity
@Table(name = "WORKFLOW_SECURITY", catalog = "", schema = "PROD")
@XmlRootElement
public class WorkflowSecurity implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected WorkflowSecurityPK workflowSecurityPK;
    @Basic(optional = false)
    @Column(name = "ALLOW_STATE")
    private Character allowState;
    @Basic(optional = false)
    @Column(name = "ALLOW_EVENT")
    private Character allowEvent;
    @Basic(optional = false)
    @Column(name = "USERNAME")
    private String username;
    @Basic(optional = false)
    @Column(name = "NOW")
    @Temporal(TemporalType.TIMESTAMP)
    private Date now;
    @JoinColumn(name = "ID_WORKFLOW_CONFIG", referencedColumnName = "ID_WORKFLOW_CONFIG", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private WorkflowConfig config;

    public WorkflowSecurity() {
    }

    public WorkflowSecurity(WorkflowSecurityPK workflowSecurityPK) {
        this.workflowSecurityPK = workflowSecurityPK;
    }

    public WorkflowSecurity(WorkflowSecurityPK workflowSecurityPK, Character allowState, Character allowEvent, String username, Date now) {
        this.workflowSecurityPK = workflowSecurityPK;
        this.allowState = allowState;
        this.allowEvent = allowEvent;
        this.username = username;
        this.now = now;
    }

    public WorkflowSecurity(Long idWorkflowConfig, String idAuthority) {
        this.workflowSecurityPK = new WorkflowSecurityPK(idWorkflowConfig, idAuthority);
    }

    public WorkflowSecurityPK getWorkflowSecurityPK() {
        return workflowSecurityPK;
    }

    public void setWorkflowSecurityPK(WorkflowSecurityPK workflowSecurityPK) {
        this.workflowSecurityPK = workflowSecurityPK;
    }

    public Character getAllowState() {
        return allowState;
    }

    public void setAllowState(Character allowState) {
        this.allowState = allowState;
    }

    public Character getAllowEvent() {
        return allowEvent;
    }

    public void setAllowEvent(Character allowEvent) {
        this.allowEvent = allowEvent;
    }

    @JsonIgnore
    @XmlTransient
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @JsonIgnore
    @XmlTransient
    public Date getNow() {
        return now;
    }

    public void setNow(Date now) {
        this.now = now;
    }

    public WorkflowConfig getConfig() {
        return config;
    }

    public void setConfig(WorkflowConfig config) {
        this.config = config;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + (this.workflowSecurityPK != null ? this.workflowSecurityPK.hashCode() : 0);
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
        final WorkflowSecurity other = (WorkflowSecurity) obj;
        if (this.workflowSecurityPK != other.workflowSecurityPK && (this.workflowSecurityPK == null || !this.workflowSecurityPK.equals(other.workflowSecurityPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "WorkflowSecurity{" + "workflowSecurityPK=" + workflowSecurityPK + ", allowState=" + allowState + ", allowEvent=" + allowEvent + ", username=" + username + ", now=" + now + ", config=" + config + '}';
    }
}
