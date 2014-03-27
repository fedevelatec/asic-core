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
public class DmsChecklistIncidentVwPK implements Serializable {

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

    public DmsChecklistIncidentVwPK() {
    }

    public DmsChecklistIncidentVwPK(
            BigInteger idOperation,
            BigInteger idProduct,
            BigInteger idDocument,
            BigInteger idGroupChecklist,
            BigInteger idIncidentType,
            BigInteger idGroup) {
        this.idOperation = idOperation;
        this.idProduct = idProduct;
        this.idDocument = idDocument;
        this.idGroupChecklist = idGroupChecklist;
        this.idIncidentType = idIncidentType;
        this.idGroup = idIncidentType;
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
}
