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
@Table(name = "DMS_GROUPS", catalog = "", schema = "PROD")
@NamedQueries({
        @NamedQuery(name = "DmsGroups.findAll", query = "SELECT d FROM DmsGroups d"),
        @NamedQuery(name = "DmsGroups.findByIdGroup", query = "SELECT d FROM DmsGroups d WHERE d.idGroup = :idGroup"),
        @NamedQuery(name = "DmsGroups.findByDescription", query = "SELECT d FROM DmsGroups d WHERE d.description = :description"),
        @NamedQuery(name = "DmsGroups.findByRowstatus", query = "SELECT d FROM DmsGroups d WHERE d.rowstatus = :rowstatus")})
public class DmsGroups implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_GROUP")
    private BigInteger idGroup;
    @Column(name = "DESCRIPTION")
    private String description;
    @Basic(optional = false)
    @Column(name = "ROWSTATUS")
    private String rowstatus;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dmsGroups")
    private List<DmsIncidents> dmsIncidentsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dmsGroups")
    private List<DmsChecklist> dmsChecklistList;

    public DmsGroups() {
        rowstatus = "A";
    }

    public DmsGroups(BigInteger idGroup) {
        this();
        this.idGroup = idGroup;
    }

    public DmsGroups(BigInteger idGroup, String rowstatus) {
        this.idGroup = idGroup;
        this.rowstatus = rowstatus;
    }

    public BigInteger getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(BigInteger idGroup) {
        this.idGroup = idGroup;
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

    public List<DmsChecklist> getDmsChecklistList() {
        return dmsChecklistList;
    }

    public void setDmsChecklistList(List<DmsChecklist> dmsChecklistList) {
        this.dmsChecklistList = dmsChecklistList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idGroup != null ? idGroup.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DmsGroups)) {
            return false;
        }
        DmsGroups other = (DmsGroups) object;
        if ((this.idGroup == null && other.idGroup != null) || (this.idGroup != null && !this.idGroup.equals(other.idGroup))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.adea.cpanel.pojos.DmsGroups[idGroup=" + idGroup + "]";
    }

}
