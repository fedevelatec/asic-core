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
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.codehaus.jackson.annotate.JsonIgnore;

@Entity
@Table(name = "WORKFLOW", catalog = "", schema = "PROD")
@SequenceGenerator(name = "PK_AUTOGEN", sequenceName = "PROD.SEQ_WORKFLOW_ID_WORKFLOW", allocationSize = 1)
@XmlRootElement
public class Workflow implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_WORKFLOW")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PK_AUTOGEN")
    private Long idWorkflow;
    @Basic(optional = false)
    @Column(name = "NAME")
    private String name;
    @Column(name = "DESCRIPTION")
    private String description;
    @Basic(optional = false)
    @Column(name = "USERNAME")
    private String username;
    @Basic(optional = false)
    @Column(name = "NOW")
    @Temporal(TemporalType.TIMESTAMP)
    private Date now;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "workflow")
    private Set<WorkflowConfig> configSet;

    public Workflow() {
    }

    public Workflow(Long idWorkflow) {
        this.idWorkflow = idWorkflow;
    }

    public Workflow(Long idWorkflow, String name, String username, Date now) {
        this.idWorkflow = idWorkflow;
        this.name = name;
        this.username = username;
        this.now = now;
    }

    public Long getIdWorkflow() {
        return idWorkflow;
    }

    public void setIdWorkflow(Long idWorkflow) {
        this.idWorkflow = idWorkflow;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        hash = 97 * hash + (this.idWorkflow != null ? this.idWorkflow.hashCode() : 0);
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
        final Workflow other = (Workflow) obj;
        if (this.idWorkflow != other.idWorkflow && (this.idWorkflow == null || !this.idWorkflow.equals(other.idWorkflow))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Workflow{" + "idWorkflow=" + idWorkflow + ", name=" + name + ", description=" + description + ", username=" + username + ", now=" + now + ", configSet=" + configSet + '}';
    }
}
