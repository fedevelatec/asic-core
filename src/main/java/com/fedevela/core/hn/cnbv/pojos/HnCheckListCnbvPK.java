package com.fedevela.core.hn.cnbv.pojos;

/**
 * Created by fvelazquez on 28/03/14.
 */
import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class HnCheckListCnbvPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "NUNICODOC")
    private BigInteger nunicodoc;
    @Basic(optional = false)
    @Column(name = "ID_DOCUMENT")
    private BigInteger idDocument;
    @Basic(optional = false)
    @Column(name = "ID_CATEGORY")
    private BigInteger idCategory;
    @Basic(optional = false)
    @Column(name = "ID_RULE")
    private String idRule;

    public HnCheckListCnbvPK() {
    }

    public HnCheckListCnbvPK(BigInteger nunicodoc, BigInteger idDocument, BigInteger idCategory, String idRule) {
        this.nunicodoc = nunicodoc;
        this.idDocument = idDocument;
        this.idCategory = idCategory;
        this.idRule = idRule;
    }

    public BigInteger getNunicodoc() {
        return nunicodoc;
    }

    public void setNunicodoc(BigInteger nunicodoc) {
        this.nunicodoc = nunicodoc;
    }

    public BigInteger getIdDocument() {
        return idDocument;
    }

    public void setIdDocument(BigInteger idDocument) {
        this.idDocument = idDocument;
    }

    public BigInteger getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(BigInteger idCategory) {
        this.idCategory = idCategory;
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
        hash += (nunicodoc != null ? nunicodoc.hashCode() : 0);
        hash += (idDocument != null ? idDocument.hashCode() : 0);
        hash += (idCategory != null ? idCategory.hashCode() : 0);
        hash += (idRule != null ? idRule.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HnCheckListCnbvPK)) {
            return false;
        }
        HnCheckListCnbvPK other = (HnCheckListCnbvPK) object;
        if ((this.nunicodoc == null && other.nunicodoc != null) || (this.nunicodoc != null && !this.nunicodoc.equals(other.nunicodoc))) {
            return false;
        }
        if ((this.idDocument == null && other.idDocument != null) || (this.idDocument != null && !this.idDocument.equals(other.idDocument))) {
            return false;
        }
        if ((this.idCategory == null && other.idCategory != null) || (this.idCategory != null && !this.idCategory.equals(other.idCategory))) {
            return false;
        }
        if ((this.idRule == null && other.idRule != null) || (this.idRule != null && !this.idRule.equals(other.idRule))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeamx.adeadms.hn.cnbv.pojos.HnCheckListCnbvPK[nunicodoc=" + nunicodoc + ", idDocument=" + idDocument + ", idCategory=" + idCategory + ", idRule=" + idRule + "]";
    }

}
