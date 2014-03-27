package com.fedevela.core.asic.cpanel.pojos;

/**
 * Created by fvelazquez on 26/03/14.
 */
import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "DMS_CHECKLIST_OPERATION_VW", catalog = "", schema = "PROD")
@NamedQueries({
        @NamedQuery(name = "DmsChecklistOperationVw.findAll", query = "SELECT d FROM DmsChecklistOperationVw d"),
        @NamedQuery(name = "DmsChecklistOperationVw.findByIdOperation", query = "SELECT d FROM DmsChecklistOperationVw d WHERE d.idOperation = :idOperation"),
        @NamedQuery(name = "DmsChecklistOperationVw.findByDescription", query = "SELECT d FROM DmsChecklistOperationVw d WHERE d.description = :description"),
        @NamedQuery(name = "DmsChecklistOperationVw.findByProductCount", query = "SELECT d FROM DmsChecklistOperationVw d WHERE d.productCount = :productCount")})
public class DmsChecklistOperationVw implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_OPERATION")
    private BigInteger idOperation;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "PRODUCT_COUNT")
    private BigInteger productCount;

    public DmsChecklistOperationVw() {

    }

    public BigInteger getIdOperation() {
        return idOperation;
    }

    public void setIdOperation(BigInteger idOperation) {
        this.idOperation = idOperation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigInteger getProductCount() {
        return productCount;
    }

    public void setProductCount(BigInteger productCount) {
        this.productCount = productCount;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.adea.cpanel.pojos.DmsChecklistOperationVw[idOperation=" + idOperation + "]";
    }
}
