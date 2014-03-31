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
@Table(name = "WORKFLOW_EVENT", catalog = "", schema = "PROD")
@XmlRootElement
public class WorkflowEvent implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_WORKFLOW_EVENT")
    private String idWorkflowEvent;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "event")
    private Set<WorkflowConfig> configSet;

    public WorkflowEvent() {
    }

    public WorkflowEvent(String idWorkflowEvent) {
        this.idWorkflowEvent = idWorkflowEvent;
    }

    public WorkflowEvent(String idWorkflowEvent, String description, String username, Date now) {
        this.idWorkflowEvent = idWorkflowEvent;
        this.description = description;
        this.username = username;
        this.now = now;
    }

    public String getIdWorkflowEvent() {
        return idWorkflowEvent;
    }

    public void setIdWorkflowEvent(String idWorkflowEvent) {
        this.idWorkflowEvent = idWorkflowEvent;
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

    @JsonIgnore
    @XmlTransient
    public Set<WorkflowConfig> getConfigSet() {
        return configSet;
    }

    public void setConfigSet(Set<WorkflowConfig> configSet) {
        this.configSet = configSet;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + (this.idWorkflowEvent != null ? this.idWorkflowEvent.hashCode() : 0);
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
        final WorkflowEvent other = (WorkflowEvent) obj;
        if ((this.idWorkflowEvent == null) ? (other.idWorkflowEvent != null) : !this.idWorkflowEvent.equals(other.idWorkflowEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "WorkflowEvent{" + "idWorkflowEvent=" + idWorkflowEvent + ", description=" + description + ", icon=" + icon + ", username=" + username + ", now=" + now + ", configSet=" + configSet + '}';
    }
}
