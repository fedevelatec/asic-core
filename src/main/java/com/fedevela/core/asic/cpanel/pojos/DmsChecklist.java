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
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "DMS_CHECKLIST", catalog = "", schema = "PROD")
@NamedQueries({
        @NamedQuery(name = "DmsChecklist.findAll", query = "SELECT d FROM DmsChecklist d"),
        @NamedQuery(name = "DmsChecklist.findByIdOperation", query = "SELECT d FROM DmsChecklist d WHERE d.dmsChecklistPK.idOperation = :idOperation"),
        @NamedQuery(name = "DmsChecklist.findByIdProduct", query = "SELECT d FROM DmsChecklist d WHERE d.dmsChecklistPK.idProduct = :idProduct"),
        @NamedQuery(name = "DmsChecklist.findByIdDocument", query = "SELECT d FROM DmsChecklist d WHERE d.dmsChecklistPK.idDocument = :idDocument"),
        @NamedQuery(name = "DmsChecklist.findByIdGroup", query = "SELECT d FROM DmsChecklist d WHERE d.dmsChecklistPK.idGroup = :idGroup"),
        @NamedQuery(name = "DmsChecklist.findByRowstatus", query = "SELECT d FROM DmsChecklist d WHERE d.rowstatus = :rowstatus")})
public class DmsChecklist implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DmsChecklistPK dmsChecklistPK;
    @Column(name = "E_INDEX")
    private BigInteger eIndex;
    @Basic(optional = false)
    @Column(name = "ROWSTATUS")
    private String rowstatus;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dmsChecklist", fetch = FetchType.EAGER)
    private List<DmsChecklistRules> dmsChecklistRulesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dmsChecklist")
    private List<DmsIncidents> dmsIncidentsList;
    @JoinColumns({
            @JoinColumn(name = "ID_OPERATION", referencedColumnName = "ID_OPERATION", insertable = false, updatable = false),
            @JoinColumn(name = "ID_PRODUCT", referencedColumnName = "ID_PRODUCT", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private DmsOperationProduct dmsOperationProduct;
    @JoinColumn(name = "ID_GROUP", referencedColumnName = "ID_GROUP", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private DmsGroups dmsGroups;
    @JoinColumn(name = "ID_DOCUMENT", referencedColumnName = "ID_DOCUMENT", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private DmsDocuments dmsDocuments;
    @JoinColumn(name = "ID_CATEGORY", referencedColumnName = "ID_CATEGORY")
    @ManyToOne(optional = false)
    private DmsCategories dmsCategories;

    public DmsChecklist() {
        rowstatus = "A";
    }

    public DmsChecklist(DmsChecklistPK dmsChecklistPK) {
        this();
        this.dmsChecklistPK = dmsChecklistPK;
    }

    public DmsChecklist(DmsChecklistPK dmsChecklistPK, String rowstatus) {
        this.dmsChecklistPK = dmsChecklistPK;
        this.rowstatus = rowstatus;
    }

    public DmsChecklist(BigInteger idOperation, BigInteger idProduct, BigInteger idDocument, BigInteger idGroup) {
        this();
        this.dmsChecklistPK = new DmsChecklistPK(idOperation, idProduct, idDocument, idGroup);
    }

    public DmsChecklistPK getDmsChecklistPK() {
        return dmsChecklistPK;
    }

    public void setDmsChecklistPK(DmsChecklistPK dmsChecklistPK) {
        this.dmsChecklistPK = dmsChecklistPK;
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

    public List<DmsChecklistRules> getDmsChecklistRulesList() {
        return dmsChecklistRulesList;
    }

    public void setDmsChecklistRulesList(List<DmsChecklistRules> dmsChecklistRulesList) {
        this.dmsChecklistRulesList = dmsChecklistRulesList;
    }

    public List<DmsIncidents> getDmsIncidentsList() {
        return dmsIncidentsList;
    }

    public void setDmsIncidentsList(List<DmsIncidents> dmsIncidentsList) {
        this.dmsIncidentsList = dmsIncidentsList;
    }

    public DmsOperationProduct getDmsOperationProduct() {
        return dmsOperationProduct;
    }

    public void setDmsOperationProduct(DmsOperationProduct dmsOperationProduct) {
        this.dmsOperationProduct = dmsOperationProduct;
    }

    public DmsGroups getDmsGroups() {
        return dmsGroups;
    }

    public void setDmsGroups(DmsGroups dmsGroups) {
        this.dmsGroups = dmsGroups;
    }

    public DmsDocuments getDmsDocuments() {
        return dmsDocuments;
    }

    public void setDmsDocuments(DmsDocuments dmsDocuments) {
        this.dmsDocuments = dmsDocuments;
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
        hash += (dmsChecklistPK != null ? dmsChecklistPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DmsChecklist)) {
            return false;
        }
        DmsChecklist other = (DmsChecklist) object;
        if ((this.dmsChecklistPK == null && other.dmsChecklistPK != null) || (this.dmsChecklistPK != null && !this.dmsChecklistPK.equals(other.dmsChecklistPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.adea.cpanel.pojos.DmsChecklist[dmsChecklistPK=" + dmsChecklistPK + "]";
    }
}
