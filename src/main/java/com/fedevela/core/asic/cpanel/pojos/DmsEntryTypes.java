package com.fedevela.core.asic.cpanel.pojos;

/**
 * Created by fvelazquez on 26/03/14.
 */
import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "DMS_ENTRY_TYPES", catalog = "", schema = "PROD")
@NamedQueries({
        @NamedQuery(name = "DmsEntryTypes.findAll", query = "SELECT d FROM DmsEntryTypes d"),
        @NamedQuery(name = "DmsEntryTypes.findByIdEntryType", query = "SELECT d FROM DmsEntryTypes d WHERE d.idEntryType = :idEntryType"),
        @NamedQuery(name = "DmsEntryTypes.findByDescription", query = "SELECT d FROM DmsEntryTypes d WHERE d.description = :description"),
        @NamedQuery(name = "DmsEntryTypes.findByRowstatus", query = "SELECT d FROM DmsEntryTypes d WHERE d.rowstatus = :rowstatus")})
public class DmsEntryTypes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_ENTRY_TYPE")
    private BigDecimal idEntryType;
    @Column(name = "DESCRIPTION")
    private String description;
    @Basic(optional = false)
    @Column(name = "ROWSTATUS")
    private String rowstatus;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dmsEntryTypes")
    private List<DmsEntries> dmsEntriesList;

    public DmsEntryTypes() {
    }

    public DmsEntryTypes(BigDecimal idEntryType) {
        this.idEntryType = idEntryType;
    }

    public DmsEntryTypes(BigDecimal idEntryType, String rowstatus) {
        this.idEntryType = idEntryType;
        this.rowstatus = rowstatus;
    }

    public BigDecimal getIdEntryType() {
        return idEntryType;
    }

    public void setIdEntryType(BigDecimal idEntryType) {
        this.idEntryType = idEntryType;
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

    public List<DmsEntries> getDmsEntriesList() {
        return dmsEntriesList;
    }

    public void setDmsEntriesList(List<DmsEntries> dmsEntriesList) {
        this.dmsEntriesList = dmsEntriesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEntryType != null ? idEntryType.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DmsEntryTypes)) {
            return false;
        }
        DmsEntryTypes other = (DmsEntryTypes) object;
        if ((this.idEntryType == null && other.idEntryType != null) || (this.idEntryType != null && !this.idEntryType.equals(other.idEntryType))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.adea.cpanel.pojos.DmsEntryTypes[idEntryType=" + idEntryType + "]";
    }

}
