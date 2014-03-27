package com.fedevela.core.asic.cpanel.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class DmsOperationProductRulesPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ID_OPERATION")
    private BigInteger idOperation;
    @Basic(optional = false)
    @Column(name = "ID_PRODUCT")
    private BigInteger idProduct;
    @Basic(optional = false)
    @Column(name = "ID_RULE")
    private String idRule;

    public DmsOperationProductRulesPK() {
    }

    public DmsOperationProductRulesPK(BigInteger idOperation, BigInteger idProduct, String idRule) {
        this.idOperation = idOperation;
        this.idProduct = idProduct;
        this.idRule = idRule;
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

    public String getIdRule() {
        return idRule;
    }

    public void setIdRule(String idRule) {
        this.idRule = idRule;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOperation != null ? idOperation.hashCode() : 0);
        hash += (idProduct != null ? idProduct.hashCode() : 0);
        hash += (idRule != null ? idRule.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DmsOperationProductRulesPK)) {
            return false;
        }
        DmsOperationProductRulesPK other = (DmsOperationProductRulesPK) object;
        if ((this.idOperation == null && other.idOperation != null) || (this.idOperation != null && !this.idOperation.equals(other.idOperation))) {
            return false;
        }
        if ((this.idProduct == null && other.idProduct != null) || (this.idProduct != null && !this.idProduct.equals(other.idProduct))) {
            return false;
        }
        if ((this.idRule == null && other.idRule != null) || (this.idRule != null && !this.idRule.equals(other.idRule))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.adea.cpanel.pojos.DmsOperationProductRulesPK[idOperation=" + idOperation + ", idProduct=" + idProduct + ", idRule=" + idRule + "]";
    }

}
