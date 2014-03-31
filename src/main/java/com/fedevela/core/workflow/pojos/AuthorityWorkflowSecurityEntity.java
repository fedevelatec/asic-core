package com.fedevela.core.workflow.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class AuthorityWorkflowSecurityEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "ID_AUTHORITY")
    private String idAuthority;
    @Basic(optional = false)
    @Column(name = "DESCRIPTION")
    private String description;
    @Basic(optional = false)
    @Column(name = "ENABLED")
    private Character enabled;
    @Column(name = "ID_WORKFLOW_CONFIG")
    private Long idWorkflowConfig;
    @Column(name = "ALLOW_STATE")
    private Character allowState;
    @Column(name = "ALLOW_EVENT")
    private Character allowEvent;

    public AuthorityWorkflowSecurityEntity() {
    }

    public Character getAllowEvent() {
        return allowEvent;
    }

    public void setAllowEvent(Character allowEvent) {
        this.allowEvent = allowEvent;
    }

    public Character getAllowState() {
        return allowState;
    }

    public void setAllowState(Character allowState) {
        this.allowState = allowState;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Character getEnabled() {
        return enabled;
    }

    public void setEnabled(Character enabled) {
        this.enabled = enabled;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdAuthority() {
        return idAuthority;
    }

    public void setIdAuthority(String idAuthority) {
        this.idAuthority = idAuthority;
    }

    public Long getIdWorkflowConfig() {
        return idWorkflowConfig;
    }

    public void setIdWorkflowConfig(Long idWorkflowConfig) {
        this.idWorkflowConfig = idWorkflowConfig;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AuthorityWorkflowSecurityEntity other = (AuthorityWorkflowSecurityEntity) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "AuthorityWorkflowSecurityEntity{" + "id=" + id + ", idAuthority=" + idAuthority + ", description=" + description + ", enabled=" + enabled + ", idWorkflowConfig=" + idWorkflowConfig + ", allowState=" + allowState + ", allowEvent=" + allowEvent + '}';
    }

}
