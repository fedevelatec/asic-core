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
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "DMS_PRODUCTS", catalog = "", schema = "PROD")
@NamedQueries({
        @NamedQuery(name = "DmsProducts.findAll", query = "SELECT d FROM DmsProducts d"),
        @NamedQuery(name = "DmsProducts.findByIdProduct", query = "SELECT d FROM DmsProducts d WHERE d.idProduct = :idProduct"),
        @NamedQuery(name = "DmsProducts.findByDescription", query = "SELECT d FROM DmsProducts d WHERE d.description = :description"),
        @NamedQuery(name = "DmsProducts.findByRowstatus", query = "SELECT d FROM DmsProducts d WHERE d.rowstatus = :rowstatus")})
public class DmsProducts implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_PRODUCT")
    private BigInteger idProduct;
    @Column(name = "DESCRIPTION")
    private String description;
    @Basic(optional = false)
    @Column(name = "ROWSTATUS")
    private String rowstatus;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dmsProducts")
    private List<DmsOperationProduct> dmsOperationProductList;

    public DmsProducts() {
        rowstatus = "A";
    }

    public DmsProducts(BigInteger idProduct) {
        this();
        this.idProduct = idProduct;
    }

    public DmsProducts(BigInteger idProduct, String rowstatus) {
        this.idProduct = idProduct;
        this.rowstatus = rowstatus;
    }

    public BigInteger getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(BigInteger idProduct) {
        this.idProduct = idProduct;
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

    public List<DmsOperationProduct> getDmsOperationProductList() {
        return dmsOperationProductList;
    }

    public void setDmsOperationProductList(List<DmsOperationProduct> dmsOperationProductList) {
        this.dmsOperationProductList = dmsOperationProductList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProduct != null ? idProduct.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DmsProducts)) {
            return false;
        }
        DmsProducts other = (DmsProducts) object;
        if ((this.idProduct == null && other.idProduct != null) || (this.idProduct != null && !this.idProduct.equals(other.idProduct))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.adea.cpanel.pojos.DmsProducts[idProduct=" + idProduct + "]";
    }

}
