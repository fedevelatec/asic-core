package com.fedevela.core.asic.cpanel.pojos;

/**
 * Created by fvelazquez on 27/03/14.
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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "DMS_OPERATION_PRODUCT", catalog = "", schema = "PROD")
@NamedQueries({
        @NamedQuery(name = "DmsOperationProduct.findAll", query = "SELECT d FROM DmsOperationProduct d"),
        @NamedQuery(name = "DmsOperationProduct.findByIdOperation", query = "SELECT d FROM DmsOperationProduct d WHERE d.dmsOperationProductPK.idOperation = :idOperation"),
        @NamedQuery(name = "DmsOperationProduct.findByIdProduct", query = "SELECT d FROM DmsOperationProduct d WHERE d.dmsOperationProductPK.idProduct = :idProduct"),
        @NamedQuery(name = "DmsOperationProduct.findByRowstatus", query = "SELECT d FROM DmsOperationProduct d WHERE d.rowstatus = :rowstatus")})
public class DmsOperationProduct implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DmsOperationProductPK dmsOperationProductPK;
    @Basic(optional = false)
    @Column(name = "ROWSTATUS")
    private String rowstatus;
    @JoinColumn(name = "ID_PRODUCT", referencedColumnName = "ID_PRODUCT", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private DmsProducts dmsProducts;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dmsOperationProduct")
    private List<DmsChecklist> dmsChecklistList;

    public DmsOperationProduct() {
        rowstatus = "A";
    }

    public DmsOperationProduct(DmsOperationProductPK dmsOperationProductPK) {
        this();
        this.dmsOperationProductPK = dmsOperationProductPK;
    }

    public DmsOperationProduct(DmsOperationProductPK dmsOperationProductPK, String rowstatus) {
        this.dmsOperationProductPK = dmsOperationProductPK;
        this.rowstatus = rowstatus;
    }

    public DmsOperationProduct(BigInteger idOperation, BigInteger idProduct) {
        this();
        this.dmsOperationProductPK = new DmsOperationProductPK(idOperation, idProduct);
    }

    public DmsOperationProductPK getDmsOperationProductPK() {
        return dmsOperationProductPK;
    }

    public void setDmsOperationProductPK(DmsOperationProductPK dmsOperationProductPK) {
        this.dmsOperationProductPK = dmsOperationProductPK;
    }

    public String getRowstatus() {
        return rowstatus;
    }

    public void setRowstatus(String rowstatus) {
        this.rowstatus = rowstatus;
    }

    public DmsProducts getDmsProducts() {
        return dmsProducts;
    }

    public void setDmsProducts(DmsProducts dmsProducts) {
        this.dmsProducts = dmsProducts;
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
        hash += (dmsOperationProductPK != null ? dmsOperationProductPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DmsOperationProduct)) {
            return false;
        }
        DmsOperationProduct other = (DmsOperationProduct) object;
        if ((this.dmsOperationProductPK == null && other.dmsOperationProductPK != null) || (this.dmsOperationProductPK != null && !this.dmsOperationProductPK.equals(other.dmsOperationProductPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.adea.cpanel.pojos.DmsOperationProduct[dmsOperationProductPK=" + dmsOperationProductPK + "]";
    }

}
