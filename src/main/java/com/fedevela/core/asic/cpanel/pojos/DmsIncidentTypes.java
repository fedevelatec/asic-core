package com.fedevela.core.asic.cpanel.pojos;

/**
 * Created by fvelazquez on 26/03/14.
 */
import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "DMS_INCIDENT_TYPES", catalog = "", schema = "PROD")
@NamedQueries({
        @NamedQuery(name = "DmsIncidentTypes.findAll", query = "SELECT d FROM DmsIncidentTypes d"),
        @NamedQuery(name = "DmsIncidentTypes.findByIdIncidentType", query = "SELECT d FROM DmsIncidentTypes d WHERE d.idIncidentType = :idIncidentType"),
        @NamedQuery(name = "DmsIncidentTypes.findByDescription", query = "SELECT d FROM DmsIncidentTypes d WHERE d.description = :description"),
        @NamedQuery(name = "DmsIncidentTypes.findByRowstatus", query = "SELECT d FROM DmsIncidentTypes d WHERE d.rowstatus = :rowstatus")})
public class DmsIncidentTypes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_INCIDENT_TYPE")
    private BigInteger idIncidentType;
    @Column(name = "DESCRIPTION")
    private String description;
    @Basic(optional = false)
    @Column(name = "ROWSTATUS")
    private String rowstatus;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dmsIncidentTypes")
    private List<DmsIncidents> dmsIncidentsList;

    public DmsIncidentTypes() {
        rowstatus = "A";
    }

    public DmsIncidentTypes(BigInteger idIncidentType) {
        this();
        this.idIncidentType = idIncidentType;
    }

    public DmsIncidentTypes(BigInteger idIncidentType, String rowstatus) {
        this.idIncidentType = idIncidentType;
        this.rowstatus = rowstatus;
    }

    public BigInteger getIdIncidentType() {
        return idIncidentType;
    }

    public void setIdIncidentType(BigInteger idIncidentType) {
        this.idIncidentType = idIncidentType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRowstatus() {
        return rowstatus;
    }

    public void setRowstatus(String rowstatus) {
        this.rowstatus = rowstatus;
    }

    public List<DmsIncidents> getDmsIncidentsList() {
        return dmsIncidentsList;
    }

    public void setDmsIncidentsList(List<DmsIncidents> dmsIncidentsList) {
        this.dmsIncidentsList = dmsIncidentsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idIncidentType != null ? idIncidentType.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DmsIncidentTypes)) {
            return false;
        }
        DmsIncidentTypes other = (DmsIncidentTypes) object;
        if ((this.idIncidentType == null && other.idIncidentType != null) || (this.idIncidentType != null && !this.idIncidentType.equals(other.idIncidentType))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.adea.cpanel.pojos.DmsIncidentTypes[idIncidentType=" + idIncidentType + "]";
    }

}
