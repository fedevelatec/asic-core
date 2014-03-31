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
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.codehaus.jackson.annotate.JsonIgnore;

@Entity
@Table(name = "WORKFLOW_STATE", catalog = "", schema = "PROD")
@XmlRootElement
public class WorkflowState implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_WORKFLOW_STATE")
    private String idWorkflowState;
    @Basic(optional = false)
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "ICON")
    private String icon;
    @Basic(optional = false)
    @Column(name = "USERNAME")
    private String username;
    @Basic(optional = false)
    @Column(name = "NOW")
    @Temporal(TemporalType.TIMESTAMP)
    private Date now;
    @Basic(optional = false)
    @Column(name = "STAGE")
    private Short stage;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "currentState")
    private Set<WorkflowConfig> currentStateConfigSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nextState")
    private Set<WorkflowConfig> nextStateConfigSet;

    public WorkflowState() {
    }

    public WorkflowState(String idWorkflowState) {
        this.idWorkflowState = idWorkflowState;
    }

    public WorkflowState(String idWorkflowState, String description, String username, Date now) {
        this.idWorkflowState = idWorkflowState;
        this.description = description;
        this.username = username;
        this.now = now;
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

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @JsonIgnore
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @JsonIgnore
    public Date getNow() {
        return now;
    }

    public void setNow(Date now) {
        this.now = now;
    }

    @JsonIgnore
    @XmlTransient
    public Set<WorkflowConfig> getCurrentStateConfigSet() {
        return currentStateConfigSet;
    }

    public void setCurrentStateConfigSet(Set<WorkflowConfig> currentStateConfigSet) {
        this.currentStateConfigSet = currentStateConfigSet;
    }

    @JsonIgnore
    @XmlTransient
    public Set<WorkflowConfig> getNextStateConfigSet() {
        return nextStateConfigSet;
    }

    public void setNextStateConfigSet(Set<WorkflowConfig> nextStateConfigSet) {
        this.nextStateConfigSet = nextStateConfigSet;
    }

    public Short getStage() {
        return stage;
    }

    public void setStage(Short stage) {
        this.stage = stage;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + (this.idWorkflowState != null ? this.idWorkflowState.hashCode() : 0);
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
        final WorkflowState other = (WorkflowState) obj;
        if ((this.idWorkflowState == null) ? (other.idWorkflowState != null) : !this.idWorkflowState.equals(other.idWorkflowState)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "WorkflowState{" + "idWorkflowState=" + idWorkflowState + ", description=" + description + ", icon=" + icon + ", username=" + username + ", now=" + now + ", currentStateConfigSet=" + currentStateConfigSet + ", nextStateConfigSet=" + nextStateConfigSet + '}';
    }
}
