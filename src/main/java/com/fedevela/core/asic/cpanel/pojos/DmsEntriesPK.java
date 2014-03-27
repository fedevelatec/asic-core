package com.fedevela.core.asic.cpanel.pojos;

/**
 * Created by fvelazquez on 26/03/14.
 */
import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class DmsEntriesPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ID_OPERATION")
    private BigInteger idOperation;
    @Basic(optional = false)
    @Column(name = "ID_PRODUCT")
    private BigInteger idProduct;
    @Basic(optional = false)
    @Column(name = "ID_ENTRY_TYPE")
    private BigInteger idEntryType;
    @Basic(optional = false)
    @Column(name = "ID_GROUP")
    private BigInteger idGroup;

    public DmsEntriesPK() {
    }

    public DmsEntriesPK(BigInteger idOperation, BigInteger idProduct, BigInteger idEntryType, BigInteger idGroup) {
        this.idOperation = idOperation;
        this.idProduct = idProduct;
        this.idEntryType = idEntryType;
        this.idGroup = idGroup;
    }

    public BigInteger getIdOperation() {
        return idOperation;
    }

    public void setIdOperation(BigInteger idOperation) {
        this.idOperation = idOperation;
    }

    public BigInteger getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(BigInteger idProduct) {
        this.idProduct = idProduct;
    }

    public BigInteger getIdEntryType() {
        return idEntryType;
    }

    public void setIdEntryType(BigInteger idEntryType) {
        this.idEntryType = idEntryType;
    }

    public BigInteger getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(BigInteger idGroup) {
        this.idGroup = idGroup;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOperation != null ? idOperation.hashCode() : 0);
        hash += (idProduct != null ? idProduct.hashCode() : 0);
        hash += (idEntryType != null ? idEntryType.hashCode() : 0);
        hash += (idGroup != null ? idGroup.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DmsEntriesPK)) {
            return false;
        }
        DmsEntriesPK other = (DmsEntriesPK) object;
        if ((this.idOperation == null && other.idOperation != null) || (this.idOperation != null && !this.idOperation.equals(other.idOperation))) {
            return false;
        }
        if ((this.idProduct == null && other.idProduct != null) || (this.idProduct != null && !this.idProduct.equals(other.idProduct))) {
            return false;
        }
        if ((this.idEntryType == null && other.idEntryType != null) || (this.idEntryType != null && !this.idEntryType.equals(other.idEntryType))) {
            return false;
        }
        if ((this.idGroup == null && other.idGroup != null) || (this.idGroup != null && !this.idGroup.equals(other.idGroup))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.adea.cpanel.pojos.DmsEntriesPK[idOperation=" + idOperation + ", idProduct=" + idProduct + ", idEntryType=" + idEntryType + ", idGroup=" + idGroup + "]";
    }

}
