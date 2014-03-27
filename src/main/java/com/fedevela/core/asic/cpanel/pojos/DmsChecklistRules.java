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
@Table(name = "DMS_CHECKLIST_RULES", catalog = "", schema = "PROD")
@NamedQueries({
        @NamedQuery(name = "DmsChecklistRules.findAll", query = "SELECT d FROM DmsChecklistRules d"),
        @NamedQuery(name = "DmsChecklistRules.findByIdOperation", query = "SELECT d FROM DmsChecklistRules d WHERE d.dmsChecklistRulesPK.idOperation = :idOperation"),
        @NamedQuery(name = "DmsChecklistRules.findByIdProduct", query = "SELECT d FROM DmsChecklistRules d WHERE d.dmsChecklistRulesPK.idProduct = :idProduct"),
        @NamedQuery(name = "DmsChecklistRules.findByIdDocument", query = "SELECT d FROM DmsChecklistRules d WHERE d.dmsChecklistRulesPK.idDocument = :idDocument"),
        @NamedQuery(name = "DmsChecklistRules.findByIdGroup", query = "SELECT d FROM DmsChecklistRules d WHERE d.dmsChecklistRulesPK.idGroup = :idGroup"),
        @NamedQuery(name = "DmsChecklistRules.findByIdRule", query = "SELECT d FROM DmsChecklistRules d WHERE d.dmsChecklistRulesPK.idRule = :idRule"),
        @NamedQuery(name = "DmsChecklistRules.findByEIndex", query = "SELECT d FROM DmsChecklistRules d WHERE d.eIndex = :eIndex"),
        @NamedQuery(name = "DmsChecklistRules.findByEValue", query = "SELECT d FROM DmsChecklistRules d WHERE d.eValue = :eValue"),
        @NamedQuery(name = "DmsChecklistRules.findByRowstatus", query = "SELECT d FROM DmsChecklistRules d WHERE d.rowstatus = :rowstatus")})
public class DmsChecklistRules implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DmsChecklistRulesPK dmsChecklistRulesPK;
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
            @JoinColumn(name = "ID_GROUP", referencedColumnName = "ID_GROUP", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private DmsChecklist dmsChecklist;

    public DmsChecklistRules() {
        rowstatus = "A";
    }

    public DmsChecklistRules(DmsChecklistRulesPK dmsChecklistRulesPK) {
        this();
        this.dmsChecklistRulesPK = dmsChecklistRulesPK;
    }

    public DmsChecklistRules(DmsChecklistRulesPK dmsChecklistRulesPK, String rowstatus) {
        this.dmsChecklistRulesPK = dmsChecklistRulesPK;
        this.rowstatus = rowstatus;
    }

    public DmsChecklistRules(BigInteger idOperation, BigInteger idProduct, BigInteger idDocument, BigInteger idGroup, String idRule) {
        this();
        this.dmsChecklistRulesPK = new DmsChecklistRulesPK(idOperation, idProduct, idDocument, idGroup, idRule);
    }

    public DmsChecklistRulesPK getDmsChecklistRulesPK() {
        return dmsChecklistRulesPK;
    }

    public void setDmsChecklistRulesPK(DmsChecklistRulesPK dmsChecklistRulesPK) {
        this.dmsChecklistRulesPK = dmsChecklistRulesPK;
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

    public DmsChecklist getDmsChecklist() {
        return dmsChecklist;
    }

    public void setDmsChecklist(DmsChecklist dmsChecklist) {
        this.dmsChecklist = dmsChecklist;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dmsChecklistRulesPK != null ? dmsChecklistRulesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DmsChecklistRules)) {
            return false;
        }
        DmsChecklistRules other = (DmsChecklistRules) object;
        if ((this.dmsChecklistRulesPK == null && other.dmsChecklistRulesPK != null) || (this.dmsChecklistRulesPK != null && !this.dmsChecklistRulesPK.equals(other.dmsChecklistRulesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.adea.cpanel.pojos.DmsChecklistRules[dmsChecklistRulesPK=" + dmsChecklistRulesPK + "]";
    }

}
