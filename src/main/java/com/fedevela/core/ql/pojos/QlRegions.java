package com.fedevela.core.ql.pojos;

/**
 * Created by fvelazquez on 31/03/14.
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
@Table(name = "QL_REGIONS", catalog = "", schema = "PROD")
@NamedQueries({
        @NamedQuery(name = "QlRegions.findAll", query = "SELECT q FROM QlRegions q"),
        @NamedQuery(name = "QlRegions.findByIdRegion", query = "SELECT q FROM QlRegions q WHERE q.idRegion = :idRegion"),
        @NamedQuery(name = "QlRegions.findByName", query = "SELECT q FROM QlRegions q WHERE q.name = :name")})
public class QlRegions implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_REGION")
    private BigDecimal idRegion;
    @Column(name = "NAME")
    private String name;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "qlRegions")
    private List<QlZones> qlZonesList;

    public QlRegions() {
    }

    public QlRegions(BigDecimal idRegion) {
        this.idRegion = idRegion;
    }

    public BigDecimal getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(BigDecimal idRegion) {
        this.idRegion = idRegion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<QlZones> getQlZonesList() {
        return qlZonesList;
    }

    public void setQlZonesList(List<QlZones> qlZonesList) {
        this.qlZonesList = qlZonesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRegion != null ? idRegion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof QlRegions)) {
            return false;
        }
        QlRegions other = (QlRegions) object;
        if ((this.idRegion == null && other.idRegion != null) || (this.idRegion != null && !this.idRegion.equals(other.idRegion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeamx.adeadms.ql.pojos.QlRegions[idRegion=" + idRegion + "]";
    }

}
