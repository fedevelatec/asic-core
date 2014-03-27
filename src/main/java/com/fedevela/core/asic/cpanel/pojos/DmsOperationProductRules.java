package com.fedevela.core.asic.cpanel.pojos;

/**
 * Created by fvelazquez on 27/03/14.
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
@Table(name = "DMS_OPERATION_PRODUCT_RULES", catalog = "", schema = "PROD")
@NamedQueries({
        @NamedQuery(name = "DmsOperationProductRules.findAll", query = "SELECT d FROM DmsOperationProductRules d"),
        @NamedQuery(name = "DmsOperationProductRules.findByIdOperation", query = "SELECT d FROM DmsOperationProductRules d WHERE d.dmsOperationProductRulesPK.idOperation = :idOperation"),
        @NamedQuery(name = "DmsOperationProductRules.findByIdProduct", query = "SELECT d FROM DmsOperationProductRules d WHERE d.dmsOperationProductRulesPK.idProduct = :idProduct"),
        @NamedQuery(name = "DmsOperationProductRules.findByIdRule", query = "SELECT d FROM DmsOperationProductRules d WHERE d.dmsOperationProductRulesPK.idRule = :idRule"),
        @NamedQuery(name = "DmsOperationProductRules.findByEIndex", query = "SELECT d FROM DmsOperationProductRules d WHERE d.eIndex = :eIndex"),
        @NamedQuery(name = "DmsOperationProductRules.findByEValue", query = "SELECT d FROM DmsOperationProductRules d WHERE d.eValue = :eValue"),
        @NamedQuery(name = "DmsOperationProductRules.findByRowstatus", query = "SELECT d FROM DmsOperationProductRules d WHERE d.rowstatus = :rowstatus")})
public class DmsOperationProductRules implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DmsOperationProductRulesPK dmsOperationProductRulesPK;
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
            @JoinColumn(name = "ID_PRODUCT", referencedColumnName = "ID_PRODUCT", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private DmsOperationProduct dmsOperationProduct;

    public DmsOperationProductRules() {
    }

    public DmsOperationProductRules(DmsOperationProductRulesPK dmsOperationProductRulesPK) {
        this.dmsOperationProductRulesPK = dmsOperationProductRulesPK;
    }

    public DmsOperationProductRules(DmsOperationProductRulesPK dmsOperationProductRulesPK, String rowstatus) {
        this.dmsOperationProductRulesPK = dmsOperationProductRulesPK;
        this.rowstatus = rowstatus;
    }

    public DmsOperationProductRules(BigInteger idOperation, BigInteger idProduct, String idRule) {
        this.dmsOperationProductRulesPK = new DmsOperationProductRulesPK(idOperation, idProduct, idRule);
    }

    public DmsOperationProductRulesPK getDmsOperationProductRulesPK() {
        return dmsOperationProductRulesPK;
    }

    public void setDmsOperationProductRulesPK(DmsOperationProductRulesPK dmsOperationProductRulesPK) {
        this.dmsOperationProductRulesPK = dmsOperationProductRulesPK;
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

    public DmsOperationProduct getDmsOperationProduct() {
        return dmsOperationProduct;
    }

    public void setDmsOperationProduct(DmsOperationProduct dmsOperationProduct) {
        this.dmsOperationProduct = dmsOperationProduct;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dmsOperationProductRulesPK != null ? dmsOperationProductRulesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DmsOperationProductRules)) {
            return false;
        }
        DmsOperationProductRules other = (DmsOperationProductRules) object;
        if ((this.dmsOperationProductRulesPK == null && other.dmsOperationProductRulesPK != null) || (this.dmsOperationProductRulesPK != null && !this.dmsOperationProductRulesPK.equals(other.dmsOperationProductRulesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.adea.cpanel.pojos.DmsOperationProductRules[dmsOperationProductRulesPK=" + dmsOperationProductRulesPK + "]";
    }

}
