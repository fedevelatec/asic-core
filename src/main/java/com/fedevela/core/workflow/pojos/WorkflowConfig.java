package com.fedevela.core.workflow.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.codehaus.jackson.annotate.JsonIgnore;

@Entity
@Table(name = "WORKFLOW_CONFIG", catalog = "", schema = "PROD")
@SequenceGenerator(name = "PK_AUTOGEN", sequenceName = "PROD.SEQ_WORKFLOW_ID_WORKFLOW_CFG", allocationSize = 1)
@XmlRootElement
public class WorkflowConfig implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_WORKFLOW_CONFIG")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PK_AUTOGEN")
    private Long idWorkflowConfig;
    @Basic(optional = false)
    @Column(name = "USERNAME")
    private String username;
    @Basic(optional = false)
    @Column(name = "NOW")
    @Temporal(TemporalType.TIMESTAMP)
    private Date now;
    @Column(name = "EVENT_ALIAS")
    private String eventAlias;
    @JoinColumn(name = "ID_CURRENT_STATE", referencedColumnName = "ID_WORKFLOW_STATE")
    @ManyToOne(optional = false)
    private WorkflowState currentState;
    @JoinColumn(name = "ID_NEXT_STATE", referencedColumnName = "ID_WORKFLOW_STATE")
    @ManyToOne(optional = false)
    private WorkflowState nextState;
    @JoinColumn(name = "ID_WORKFLOW_EVENT", referencedColumnName = "ID_WORKFLOW_EVENT")
    @ManyToOne(optional = false)
    private WorkflowEvent event;
    @JoinColumn(name = "ID_WORKFLOW", referencedColumnName = "ID_WORKFLOW")
    @ManyToOne(optional = false)
    private Workflow workflow;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "config")
    private Set<WorkflowSecurity> securitySet;

    public WorkflowConfig() {
    }

    public WorkflowConfig(Long idWorkflowConfig) {
        this.idWorkflowConfig = idWorkflowConfig;
    }

    public WorkflowConfig(Long idWorkflowConfig, String username, Date now) {
        this.idWorkflowConfig = idWorkflowConfig;
        this.username = username;
        this.now = now;
    }

    public Long getIdWorkflowConfig() {
        return idWorkflowConfig;
    }

    public void setIdWorkflowConfig(Long idWorkflowConfig) {
        this.idWorkflowConfig = idWorkflowConfig;
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

    public String getEventAlias() {
        return eventAlias;
    }

    public void setEventAlias(String eventAlias) {
        this.eventAlias = eventAlias;
    }

    public WorkflowState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(WorkflowState currentState) {
        this.currentState = currentState;
    }

    public WorkflowState getNextState() {
        return nextState;
    }

    public void setNextState(WorkflowState nextState) {
        this.nextState = nextState;
    }

    public Workflow getWorkflow() {
        return workflow;
    }

    public void setWorkflow(Workflow workflow) {
        this.workflow = workflow;
    }

    public WorkflowEvent getEvent() {
        return event;
    }

    public void setEvent(WorkflowEvent event) {
        this.event = event;
    }

    @JsonIgnore
    @XmlTransient
    public Set<WorkflowSecurity> getSecuritySet() {
        return securitySet;
    }

    public void setSecuritySet(Set<WorkflowSecurity> securitySet) {
        this.securitySet = securitySet;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + (this.idWorkflowConfig != null ? this.idWorkflowConfig.hashCode() : 0);
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
        final WorkflowConfig other = (WorkflowConfig) obj;
        if (this.idWorkflowConfig != other.idWorkflowConfig && (this.idWorkflowConfig == null || !this.idWorkflowConfig.equals(other.idWorkflowConfig))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "WorkflowConfig{" + "idWorkflowConfig=" + idWorkflowConfig + ", username=" + username + ", now=" + now + ", eventAlias=" + eventAlias + ", currentState=" + currentState + ", nextState=" + nextState + ", event=" + event + ", workflow=" + workflow + ", securitySet=" + securitySet + '}';
    }
}
