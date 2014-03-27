package com.fedevela.core.asic.cpanel.pojos;

/**
 * Created by fvelazquez on 26/03/14.
 */
import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "DMS_INCIDENT_RULES", catalog = "", schema = "PROD")
@NamedQueries({
        @NamedQuery(name = "DmsIncidentRules.findAll", query = "SELECT d FROM DmsIncidentRules d"),
        @NamedQuery(name = "DmsIncidentRules.findByIdOperation", query = "SELECT d FROM DmsIncidentRules d WHERE d.dmsIncidentRulesPK.idOperation = :idOperation"),
        @NamedQuery(name = "DmsIncidentRules.findByIdProduct", query = "SELECT d FROM DmsIncidentRules d WHERE d.dmsIncidentRulesPK.idProduct = :idProduct"),
        @NamedQuery(name = "DmsIncidentRules.findByIdDocument", query = "SELECT d FROM DmsIncidentRules d WHERE d.dmsIncidentRulesPK.idDocument = :idDocument"),
        @NamedQuery(name = "DmsIncidentRules.findByIdGroupChecklist", query = "SELECT d FROM DmsIncidentRules d WHERE d.dmsIncidentRulesPK.idGroupChecklist = :idGroupChecklist"),
        @NamedQuery(name = "DmsIncidentRules.findByIdIncidentType", query = "SELECT d FROM DmsIncidentRules d WHERE d.dmsIncidentRulesPK.idIncidentType = :idIncidentType"),
        @NamedQuery(name = "DmsIncidentRules.findByIdGroup", query = "SELECT d FROM DmsIncidentRules d WHERE d.dmsIncidentRulesPK.idGroup = :idGroup"),
        @NamedQuery(name = "DmsIncidentRules.findByIdRule", query = "SELECT d FROM DmsIncidentRules d WHERE d.dmsIncidentRulesPK.idRule = :idRule"),
        @NamedQuery(name = "DmsIncidentRules.findByEIndex", query = "SELECT d FROM DmsIncidentRules d WHERE d.eIndex = :eIndex"),
        @NamedQuery(name = "DmsIncidentRules.findByEValue", query = "SELECT d FROM DmsIncidentRules d WHERE d.eValue = :eValue"),
        @NamedQuery(name = "DmsIncidentRules.findByRowstatus", query = "SELECT d FROM DmsIncidentRules d WHERE d.rowstatus = :rowstatus")})
public class DmsIncidentRules implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DmsIncidentRulesPK dmsIncidentRulesPK;
    @Column(name = "E_INDEX")
    private BigInteger eIndex;
    @Column(name = "E_VALUE")
    private String eValue;
    @Basic(optional = false)
    @Column(name = "ROWSTATUS")
    private String rowstatus;
    @JoinColumn(name = "ID_RULE", referencedColumnName = "ID_RULE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private DmsRules dmsRules;
    @JoinColumns({
            @JoinColumn(name = "ID_OPERATION", referencedColumnName = "ID_OPERATION", insertable = false, updatable = false),
            @JoinColumn(name = "ID_PRODUCT", referencedColumnName = "ID_PRODUCT", insertable = false, updatable = false),
            @JoinColumn(name = "ID_DOCUMENT", referencedColumnName = "ID_DOCUMENT", insertable = false, updatable = false),
            @JoinColumn(name = "ID_INCIDENT_TYPE", referencedColumnName = "ID_INCIDENT_TYPE", insertable = false, updatable = false),
            @JoinColumn(name = "ID_GROUP", referencedColumnName = "ID_GROUP", insertable = false, updatable = false),
            @JoinColumn(name = "ID_GROUP_CHECKLIST", referencedColumnName = "ID_GROUP_CHECKLIST", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private DmsIncidents dmsIncidents;

    public DmsIncidentRules() {
        rowstatus = "A";
    }

    public DmsIncidentRules(DmsIncidentRulesPK dmsIncidentRulesPK) {
        this();
        this.dmsIncidentRulesPK = dmsIncidentRulesPK;
    }

    public DmsIncidentRules(DmsIncidentRulesPK dmsIncidentRulesPK, String rowstatus) {
        this.dmsIncidentRulesPK = dmsIncidentRulesPK;
        this.rowstatus = rowstatus;
    }

    public DmsIncidentRules(BigInteger idOperation, BigInteger idProduct, BigInteger idDocument, BigInteger idGroupChecklist, BigInteger idIncidentType, BigInteger idGroup, String idRule) {
        this();
        this.dmsIncidentRulesPK = new DmsIncidentRulesPK(idOperation, idProduct, idDocument, idGroupChecklist, idIncidentType, idGroup, idRule);
    }

    public DmsIncidentRulesPK getDmsIncidentRulesPK() {
        return dmsIncidentRulesPK;
    }

    public void setDmsIncidentRulesPK(DmsIncidentRulesPK dmsIncidentRulesPK) {
        this.dmsIncidentRulesPK = dmsIncidentRulesPK;
    }

    public BigInteger getEIndex() {
        return eIndex;
    }

    public void setEIndex(BigInteger eIndex) {
        this.eIndex = eIndex;
    }

    public String getEValue() {
        return eValue;
    }

    public void setEValue(String eValue) {
        this.eValue = eValue;
    }

    public String getRowstatus() {
        return rowstatus;
    }

    public void setRowstatus(String rowstatus) {
        this.rowstatus = rowstatus;
    }

    public DmsRules getDmsRules() {
        return dmsRules;
    }

    public void setDmsRules(DmsRules dmsRules) {
        this.dmsRules = dmsRules;
    }

    public DmsIncidents getDmsIncidents() {
        return dmsIncidents;
    }

    public void setDmsIncidents(DmsIncidents dmsIncidents) {
        this.dmsIncidents = dmsIncidents;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dmsIncidentRulesPK != null ? dmsIncidentRulesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DmsIncidentRules)) {
            return false;
        }
        DmsIncidentRules other = (DmsIncidentRules) object;
        if ((this.dmsIncidentRulesPK == null && other.dmsIncidentRulesPK != null) || (this.dmsIncidentRulesPK != null && !this.dmsIncidentRulesPK.equals(other.dmsIncidentRulesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.adea.cpanel.pojos.DmsIncidentRules[dmsIncidentRulesPK=" + dmsIncidentRulesPK + "]";
    }

}
