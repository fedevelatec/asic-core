package com.fedevela.core.asic.cpanel.pojos;

/**
 * Created by fvelazquez on 26/03/14.
 */
import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "DMS_CHECKLIST_PRODUCT_VW", catalog = "", schema = "PROD")
@NamedQueries({
        @NamedQuery(name = "DmsChecklistProductVw.findAll", query = "SELECT d FROM DmsChecklistProductVw d"),
        @NamedQuery(name = "DmsChecklistProductVw.findByDescription", query = "SELECT d FROM DmsChecklistProductVw d WHERE d.description = :description"),
        @NamedQuery(name = "DmsChecklistProductVw.findByDocumentCount", query = "SELECT d FROM DmsChecklistProductVw d WHERE d.documentCount = :documentCount")})
public class DmsChecklistProductVw implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DmsChecklistProductVwPK dmsChecklistProductVwPK;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "DOCUMENT_COUNT")
    private BigInteger documentCount;

    public DmsChecklistProductVw() {

    }

    public DmsChecklistProductVw(DmsChecklistProductVwPK dmsChecklistProductVwPK) {
        this.dmsChecklistProductVwPK = dmsChecklistProductVwPK;
    }

    public DmsChecklistProductVw(BigInteger idOperation, BigInteger idProduct) {
        dmsChecklistProductVwPK = new DmsChecklistProductVwPK(idOperation, idProduct);
    }

    public DmsChecklistProductVwPK getDmsChecklistProductVwPK() {
        return dmsChecklistProductVwPK;
    }

    public void setDmsChecklistProductVwPK(DmsChecklistProductVwPK dmsChecklistProductVwPK) {
        this.dmsChecklistProductVwPK = dmsChecklistProductVwPK;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigInteger getDocumentCount() {
        return documentCount;
    }

    public void setDocumentCount(BigInteger documentCount) {
        this.documentCount = documentCount;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dmsChecklistProductVwPK != null ? dmsChecklistProductVwPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DmsChecklistProductVw)) {
            return false;
        }
        DmsChecklistProductVw other = (DmsChecklistProductVw) object;
        if ((this.dmsChecklistProductVwPK == null && other.dmsChecklistProductVwPK != null) || (this.dmsChecklistProductVwPK != null && !this.dmsChecklistProductVwPK.equals(other.dmsChecklistProductVwPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.adea.cpanel.pojos.DmsChecklistProductVw[dmsChecklistProductVwPK=" + dmsChecklistProductVwPK + "]";
    }
}
