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
public class DmsIncidentRulesPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ID_OPERATION")
    private BigInteger idOperation;
    @Basic(optional = false)
    @Column(name = "ID_PRODUCT")
    private BigInteger idProduct;
    @Basic(optional = false)
    @Column(name = "ID_DOCUMENT")
    private BigInteger idDocument;
    @Basic(optional = false)
    @Column(name = "ID_GROUP_CHECKLIST")
    private BigInteger idGroupChecklist;
    @Basic(optional = false)
    @Column(name = "ID_INCIDENT_TYPE")
    private BigInteger idIncidentType;
    @Basic(optional = false)
    @Column(name = "ID_GROUP")
    private BigInteger idGroup;
    @Basic(optional = false)
    @Column(name = "ID_RULE")
    private String idRule;

    public DmsIncidentRulesPK() {
    }

    public DmsIncidentRulesPK(BigInteger idOperation, BigInteger idProduct, BigInteger idDocument, BigInteger idGroupChecklist, BigInteger idIncidentType, BigInteger idGroup, String idRule) {
        this.idOperation = idOperation;
        this.idProduct = idProduct;
        this.idDocument = idDocument;
        this.idGroupChecklist = idGroupChecklist;
        this.idIncidentType = idIncidentType;
        this.idGroup = idGroup;
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

    public BigInteger getIdDocument() {
        return idDocument;
    }

    public void setIdDocument(BigInteger idDocument) {
        this.idDocument = idDocument;
    }

    public BigInteger getIdGroupChecklist() {
        return idGroupChecklist;
    }

    public void setIdGroupChecklist(BigInteger idGroupChecklist) {
        this.idGroupChecklist = idGroupChecklist;
    }

    public BigInteger getIdIncidentType() {
        return idIncidentType;
    }

    public void setIdIncidentType(BigInteger idIncidentType) {
        this.idIncidentType = idIncidentType;
    }

    public BigInteger getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(BigInteger idGroup) {
        this.idGroup = idGroup;
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
        hash += (idDocument != null ? idDocument.hashCode() : 0);
        hash += (idGroupChecklist != null ? idGroupChecklist.hashCode() : 0);
        hash += (idIncidentType != null ? idIncidentType.hashCode() : 0);
        hash += (idGroup != null ? idGroup.hashCode() : 0);
        hash += (idRule != null ? idRule.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DmsIncidentRulesPK)) {
            return false;
        }
        DmsIncidentRulesPK other = (DmsIncidentRulesPK) object;
        if ((this.idOperation == null && other.idOperation != null) || (this.idOperation != null && !this.idOperation.equals(other.idOperation))) {
            return false;
        }
        if ((this.idProduct == null && other.idProduct != null) || (this.idProduct != null && !this.idProduct.equals(other.idProduct))) {
            return false;
        }
        if ((this.idDocument == null && other.idDocument != null) || (this.idDocument != null && !this.idDocument.equals(other.idDocument))) {
            return false;
        }
        if ((this.idGroupChecklist == null && other.idGroupChecklist != null) || (this.idGroupChecklist != null && !this.idGroupChecklist.equals(other.idGroupChecklist))) {
            return false;
        }
        if ((this.idIncidentType == null && other.idIncidentType != null) || (this.idIncidentType != null && !this.idIncidentType.equals(other.idIncidentType))) {
            return false;
        }
        if ((this.idGroup == null && other.idGroup != null) || (this.idGroup != null && !this.idGroup.equals(other.idGroup))) {
            return false;
        }
        if ((this.idRule == null && other.idRule != null) || (this.idRule != null && !this.idRule.equals(other.idRule))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.adea.cpanel.pojos.DmsIncidentRulesPK[idOperation=" + idOperation + ", idProduct=" + idProduct + ", idDocument=" + idDocument + ", idGroupChecklist=" + idGroupChecklist + ", idIncidentType=" + idIncidentType + ", idGroup=" + idGroup + ", idRule=" + idRule + "]";
    }

}
