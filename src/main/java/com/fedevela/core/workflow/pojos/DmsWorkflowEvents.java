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
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "DMS_WORKFLOW_EVENTS", catalog = "", schema = "PROD")
@Deprecated
public class DmsWorkflowEvents implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_WORKFLOW_EVENT")
    private String idWorkflowEvent;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "ICON")
    private String icon;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dmsWorkflowEvents")
    private List<DmsWorkflowConfig> dmsWorkflowConfigList;

    public DmsWorkflowEvents() {
    }

    public DmsWorkflowEvents(String idWorkflowEvent) {
        this.idWorkflowEvent = idWorkflowEvent;
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

    public List<DmsWorkflowConfig> getDmsWorkflowConfigList() {
        return dmsWorkflowConfigList;
    }

    public void setDmsWorkflowConfigList(List<DmsWorkflowConfig> dmsWorkflowConfigList) {
        this.dmsWorkflowConfigList = dmsWorkflowConfigList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idWorkflowEvent != null ? idWorkflowEvent.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DmsWorkflowEvents)) {
            return false;
        }
        DmsWorkflowEvents other = (DmsWorkflowEvents) object;
        if ((this.idWorkflowEvent == null && other.idWorkflowEvent != null) || (this.idWorkflowEvent != null && !this.idWorkflowEvent.equals(other.idWorkflowEvent))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.workflow.pojos.DmsWorkflowEvents[idWorkflowEvent=" + idWorkflowEvent + "]";
    }

}
