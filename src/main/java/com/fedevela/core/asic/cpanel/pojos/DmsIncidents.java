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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "DMS_INCIDENTS", catalog = "", schema = "PROD")
@NamedQueries({
        @NamedQuery(name = "DmsIncidents.findAll", query = "SELECT d FROM DmsIncidents d"),
        @NamedQuery(name = "DmsIncidents.findByIdOperation", query = "SELECT d FROM DmsIncidents d WHERE d.dmsIncidentsPK.idOperation = :idOperation"),
        @NamedQuery(name = "DmsIncidents.findByIdProduct", query = "SELECT d FROM DmsIncidents d WHERE d.dmsIncidentsPK.idProduct = :idProduct"),
        @NamedQuery(name = "DmsIncidents.findByIdDocument", query = "SELECT d FROM DmsIncidents d WHERE d.dmsIncidentsPK.idDocument = :idDocument"),
        @NamedQuery(name = "DmsIncidents.findByIdGroupChecklist", query = "SELECT d FROM DmsIncidents d WHERE d.dmsIncidentsPK.idGroupChecklist = :idGroupChecklist"),
        @NamedQuery(name = "DmsIncidents.findByIdIncidentType", query = "SELECT d FROM DmsIncidents d WHERE d.dmsIncidentsPK.idIncidentType = :idIncidentType"),
        @NamedQuery(name = "DmsIncidents.findByIdGroup", query = "SELECT d FROM DmsIncidents d WHERE d.dmsIncidentsPK.idGroup = :idGroup"),
        @NamedQuery(name = "DmsIncidents.findByRowstatus", query = "SELECT d FROM DmsIncidents d WHERE d.rowstatus = :rowstatus")})
public class DmsIncidents implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DmsIncidentsPK dmsIncidentsPK;
    @Column(name = "E_INDEX")
    private BigInteger eIndex;
    @Basic(optional = false)
    @Column(name = "ROWSTATUS")
    private String rowstatus;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dmsIncidents")
    private List<DmsIncidentRules> dmsIncidentRulesList;
    @JoinColumn(name = "ID_INCIDENT_TYPE", referencedColumnName = "ID_INCIDENT_TYPE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private DmsIncidentTypes dmsIncidentTypes;
    @JoinColumn(name = "ID_GROUP", referencedColumnName = "ID_GROUP", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private DmsGroups dmsGroups;
    @JoinColumns({
            @JoinColumn(name = "ID_OPERATION", referencedColumnName = "ID_OPERATION", insertable = false, updatable = false),
            @JoinColumn(name = "ID_PRODUCT", referencedColumnName = "ID_PRODUCT", insertable = false, updatable = false),
            @JoinColumn(name = "ID_DOCUMENT", referencedColumnName = "ID_DOCUMENT", insertable = false, updatable = false),
            @JoinColumn(name = "ID_GROUP_CHECKLIST", referencedColumnName = "ID_GROUP", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private DmsChecklist dmsChecklist;
    @JoinColumn(name = "ID_CATEGORY", referencedColumnName = "ID_CATEGORY")
    @ManyToOne(optional = false)
    private DmsCategories dmsCategories;

    public DmsIncidents() {
        rowstatus = "A";
    }

    public DmsIncidents(DmsIncidentsPK dmsIncidentsPK) {
        this();
        this.dmsIncidentsPK = dmsIncidentsPK;
    }

    public DmsIncidents(DmsIncidentsPK dmsIncidentsPK, String rowstatus) {
        this.dmsIncidentsPK = dmsIncidentsPK;
        this.rowstatus = rowstatus;
    }

    public DmsIncidents(BigInteger idOperation, BigInteger idProduct, BigInteger idDocument, BigInteger idGroupChecklist, BigInteger idIncidentType, BigInteger idGroup) {
        this();
        this.dmsIncidentsPK = new DmsIncidentsPK(idOperation, idProduct, idDocument, idGroupChecklist, idIncidentType, idGroup);
    }

    public DmsIncidentsPK getDmsIncidentsPK() {
        return dmsIncidentsPK;
    }

    public void setDmsIncidentsPK(DmsIncidentsPK dmsIncidentsPK) {
        this.dmsIncidentsPK = dmsIncidentsPK;
    }

    public BigInteger getEIndex() {
        return eIndex;
    }

    public void setEIndex(BigInteger eIndex) {
        this.eIndex = eIndex;
    }

    public String getRowstatus() {
        return rowstatus;
    }

    public void setRowstatus(String rowstatus) {
        this.rowstatus = rowstatus;
    }

    public List<DmsIncidentRules> getDmsIncidentRulesList() {
        return dmsIncidentRulesList;
    }

    public void setDmsIncidentRulesList(List<DmsIncidentRules> dmsIncidentRulesList) {
        this.dmsIncidentRulesList = dmsIncidentRulesList;
    }

    public DmsIncidentTypes getDmsIncidentTypes() {
        return dmsIncidentTypes;
    }

    public void setDmsIncidentTypes(DmsIncidentTypes dmsIncidentTypes) {
        this.dmsIncidentTypes = dmsIncidentTypes;
    }

    public DmsGroups getDmsGroups() {
        return dmsGroups;
    }

    public void setDmsGroups(DmsGroups dmsGroups) {
        this.dmsGroups = dmsGroups;
    }

    public DmsChecklist getDmsChecklist() {
        return dmsChecklist;
    }

    public void setDmsChecklist(DmsChecklist dmsChecklist) {
        this.dmsChecklist = dmsChecklist;
    }

    public DmsCategories getDmsCategories() {
        return dmsCategories;
    }

    public void setDmsCategories(DmsCategories dmsCategories) {
        this.dmsCategories = dmsCategories;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dmsIncidentsPK != null ? dmsIncidentsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DmsIncidents)) {
            return false;
        }
        DmsIncidents other = (DmsIncidents) object;
        if ((this.dmsIncidentsPK == null && other.dmsIncidentsPK != null) || (this.dmsIncidentsPK != null && !this.dmsIncidentsPK.equals(other.dmsIncidentsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.adea.cpanel.pojos.DmsIncidents[dmsIncidentsPK=" + dmsIncidentsPK + "]";
    }
}
