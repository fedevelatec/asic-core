package com.fedevela.core.asic.cpanel.pojos;

/**
 * Created by fvelazquez on 26/03/14.
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
@Table(name = "DMS_DOCUMENTS", catalog = "", schema = "PROD")
@NamedQueries({
        @NamedQuery(name = "DmsDocuments.findAll", query = "SELECT d FROM DmsDocuments d"),
        @NamedQuery(name = "DmsDocuments.findByIdDocument", query = "SELECT d FROM DmsDocuments d WHERE d.idDocument = :idDocument"),
        @NamedQuery(name = "DmsDocuments.findByDescription", query = "SELECT d FROM DmsDocuments d WHERE d.description = :description"),
        @NamedQuery(name = "DmsDocuments.findByRowstatus", query = "SELECT d FROM DmsDocuments d WHERE d.rowstatus = :rowstatus")})
public class DmsDocuments implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_DOCUMENT")
    private BigInteger idDocument;
    @Column(name = "DESCRIPTION")
    private String description;
    @Basic(optional = false)
    @Column(name = "ROWSTATUS")
    private String rowstatus;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dmsDocuments")
    private List<DmsChecklist> dmsChecklistList;

    public DmsDocuments() {
        rowstatus = "A";
    }

    public DmsDocuments(BigInteger idDocument) {
        this();
        this.idDocument = idDocument;
    }

    public DmsDocuments(BigInteger idDocument, String rowstatus) {
        this.idDocument = idDocument;
        this.rowstatus = rowstatus;
    }

    public BigInteger getIdDocument() {
        return idDocument;
    }

    public void setIdDocument(BigInteger idDocument) {
        this.idDocument = idDocument;
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

    public List<DmsChecklist> getDmsChecklistList() {
        return dmsChecklistList;
    }

    public void setDmsChecklistList(List<DmsChecklist> dmsChecklistList) {
        this.dmsChecklistList = dmsChecklistList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDocument != null ? idDocument.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DmsDocuments)) {
            return false;
        }
        DmsDocuments other = (DmsDocuments) object;
        if ((this.idDocument == null && other.idDocument != null) || (this.idDocument != null && !this.idDocument.equals(other.idDocument))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.adea.cpanel.pojos.DmsDocuments[idDocument=" + idDocument + "]";
    }

}
