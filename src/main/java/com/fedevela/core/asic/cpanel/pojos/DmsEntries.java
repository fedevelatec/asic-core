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
@Table(name = "DMS_ENTRIES", catalog = "", schema = "PROD")
@NamedQueries({
        @NamedQuery(name = "DmsEntries.findAll", query = "SELECT d FROM DmsEntries d"),
        @NamedQuery(name = "DmsEntries.findByIdOperation", query = "SELECT d FROM DmsEntries d WHERE d.dmsEntriesPK.idOperation = :idOperation"),
        @NamedQuery(name = "DmsEntries.findByIdProduct", query = "SELECT d FROM DmsEntries d WHERE d.dmsEntriesPK.idProduct = :idProduct"),
        @NamedQuery(name = "DmsEntries.findByIdEntryType", query = "SELECT d FROM DmsEntries d WHERE d.dmsEntriesPK.idEntryType = :idEntryType"),
        @NamedQuery(name = "DmsEntries.findByIdGroup", query = "SELECT d FROM DmsEntries d WHERE d.dmsEntriesPK.idGroup = :idGroup"),
        @NamedQuery(name = "DmsEntries.findByRowstatus", query = "SELECT d FROM DmsEntries d WHERE d.rowstatus = :rowstatus")})
public class DmsEntries implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DmsEntriesPK dmsEntriesPK;
    @Column(name = "E_INDEX")
    private BigInteger eIndex;
    @Basic(optional = false)
    @Column(name = "ROWSTATUS")
    private String rowstatus;
    @JoinColumns({
            @JoinColumn(name = "ID_OPERATION", referencedColumnName = "ID_OPERATION", insertable = false, updatable = false),
            @JoinColumn(name = "ID_PRODUCT", referencedColumnName = "ID_PRODUCT", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private DmsOperationProduct dmsOperationProduct;
    @JoinColumn(name = "ID_GROUP", referencedColumnName = "ID_GROUP", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private DmsGroups dmsGroups;
    @JoinColumn(name = "ID_ENTRY_TYPE", referencedColumnName = "ID_ENTRY_TYPE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private DmsEntryTypes dmsEntryTypes;
    @JoinColumn(name = "ID_CATEGORY", referencedColumnName = "ID_CATEGORY")
    @ManyToOne(optional = false)
    private DmsCategories dmsCategories;

    public DmsEntries() {
    }

    public DmsEntries(DmsEntriesPK dmsEntriesPK) {
        this.dmsEntriesPK = dmsEntriesPK;
    }

    public DmsEntries(DmsEntriesPK dmsEntriesPK, String rowstatus) {
        this.dmsEntriesPK = dmsEntriesPK;
        this.rowstatus = rowstatus;
    }

    public DmsEntries(BigInteger idOperation, BigInteger idProduct, BigInteger idEntryType, BigInteger idGroup) {
        this.dmsEntriesPK = new DmsEntriesPK(idOperation, idProduct, idEntryType, idGroup);
    }

    public DmsEntriesPK getDmsEntriesPK() {
        return dmsEntriesPK;
    }

    public void setDmsEntriesPK(DmsEntriesPK dmsEntriesPK) {
        this.dmsEntriesPK = dmsEntriesPK;
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

    public DmsEntryTypes getDmsEntryTypes() {
        return dmsEntryTypes;
    }

    public void setDmsEntryTypes(DmsEntryTypes dmsEntryTypes) {
        this.dmsEntryTypes = dmsEntryTypes;
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
        hash += (dmsEntriesPK != null ? dmsEntriesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DmsEntries)) {
            return false;
        }
        DmsEntries other = (DmsEntries) object;
        if ((this.dmsEntriesPK == null && other.dmsEntriesPK != null) || (this.dmsEntriesPK != null && !this.dmsEntriesPK.equals(other.dmsEntriesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.adea.cpanel.pojos.DmsEntries[dmsEntriesPK=" + dmsEntriesPK + "]";
    }
}
