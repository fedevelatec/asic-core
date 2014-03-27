package com.fedevela.core.asic.cpanel.pojos;

/**
 * Created by fvelazquez on 26/03/14.
 */
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "DMS_LABEL_TYPES", catalog = "", schema = "PROD")
@NamedQueries({
        @NamedQuery(name = "DmsLabelTypes.findAll", query = "SELECT d FROM DmsLabelTypes d"),
        @NamedQuery(name = "DmsLabelTypes.findByIdLabelType", query = "SELECT d FROM DmsLabelTypes d WHERE d.idLabelType = :idLabelType"),
        @NamedQuery(name = "DmsLabelTypes.findByDescription", query = "SELECT d FROM DmsLabelTypes d WHERE d.description = :description")})
public class DmsLabelTypes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_LABEL_TYPE")
    private BigDecimal idLabelType;
    @Column(name = "DESCRIPTION")
    private String description;

    public DmsLabelTypes() {
    }

    public DmsLabelTypes(BigDecimal idLabelType) {
        this.idLabelType = idLabelType;
    }

    public BigDecimal getIdLabelType() {
        return idLabelType;
    }

    public void setIdLabelType(BigDecimal idLabelType) {
        this.idLabelType = idLabelType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLabelType != null ? idLabelType.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DmsLabelTypes)) {
            return false;
        }
        DmsLabelTypes other = (DmsLabelTypes) object;
        if ((this.idLabelType == null && other.idLabelType != null) || (this.idLabelType != null && !this.idLabelType.equals(other.idLabelType))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.adea.cpanel.pojos.DmsLabelTypes[idLabelType=" + idLabelType + "]";
    }

}
