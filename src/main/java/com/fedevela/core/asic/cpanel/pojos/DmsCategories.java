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
@Table(name = "DMS_CATEGORIES", catalog = "", schema = "PROD")
@NamedQueries({
        @NamedQuery(name = "DmsCategories.findAll", query = "SELECT d FROM DmsCategories d"),
        @NamedQuery(name = "DmsCategories.findByIdCategory", query = "SELECT d FROM DmsCategories d WHERE d.idCategory = :idCategory"),
        @NamedQuery(name = "DmsCategories.findByDescription", query = "SELECT d FROM DmsCategories d WHERE d.description = :description"),
        @NamedQuery(name = "DmsCategories.findByRowstatus", query = "SELECT d FROM DmsCategories d WHERE d.rowstatus = :rowstatus")})
public class DmsCategories implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_CATEGORY")
    private BigInteger idCategory;
    @Column(name = "DESCRIPTION")
    private String description;
    @Basic(optional = false)
    @Column(name = "ROWSTATUS")
    private String rowstatus;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dmsCategories")
    private List<DmsIncidents> dmsIncidentsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dmsCategories")
    private List<DmsChecklist> dmsChecklistList;

    public DmsCategories() {
        rowstatus = "A";
    }

    public DmsCategories(BigInteger idCategory) {
        this.idCategory = idCategory;
    }

    public DmsCategories(BigInteger idCategory, String rowstatus) {
        this.idCategory = idCategory;
        this.rowstatus = rowstatus;
    }

    public BigInteger getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(BigInteger idCategory) {
        this.idCategory = idCategory;
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

    public List<DmsIncidents> getDmsIncidentsList() {
        return dmsIncidentsList;
    }

    public void setDmsIncidentsList(List<DmsIncidents> dmsIncidentsList) {
        this.dmsIncidentsList = dmsIncidentsList;
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
        hash += (idCategory != null ? idCategory.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DmsCategories)) {
            return false;
        }
        DmsCategories other = (DmsCategories) object;
        if ((this.idCategory == null && other.idCategory != null) || (this.idCategory != null && !this.idCategory.equals(other.idCategory))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.adea.cpanel.pojos.DmsCategories[idCategory=" + idCategory + "]";
    }

}

