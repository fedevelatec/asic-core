package com.fedevela.core.ql.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "QL_ZONES", catalog = "", schema = "PROD")
@NamedQueries({
        @NamedQuery(name = "QlZones.findAll", query = "SELECT q FROM QlZones q"),
        @NamedQuery(name = "QlZones.findByIdRegion", query = "SELECT q FROM QlZones q WHERE q.qlZonesPK.idRegion = :idRegion"),
        @NamedQuery(name = "QlZones.findByIdZone", query = "SELECT q FROM QlZones q WHERE q.qlZonesPK.idZone = :idZone"),
        @NamedQuery(name = "QlZones.findByName", query = "SELECT q FROM QlZones q WHERE q.name = :name")})
public class QlZones implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected QlZonesPK qlZonesPK;
    @Column(name = "NAME")
    private String name;
    @JoinColumn(name = "ID_REGION", referencedColumnName = "ID_REGION", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private QlRegions qlRegions;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "qlZones")
    private List<QlSegregationsData> qlSegregationsDataList;

    public QlZones() {
    }

    public QlZones(QlZonesPK qlZonesPK) {
        this.qlZonesPK = qlZonesPK;
    }

    public QlZones(BigInteger idRegion, BigInteger idZone) {
        this.qlZonesPK = new QlZonesPK(idRegion, idZone);
    }

    public QlZonesPK getQlZonesPK() {
        return qlZonesPK;
    }

    public void setQlZonesPK(QlZonesPK qlZonesPK) {
        this.qlZonesPK = qlZonesPK;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public QlRegions getQlRegions() {
        return qlRegions;
    }

    public void setQlRegions(QlRegions qlRegions) {
        this.qlRegions = qlRegions;
    }

    public List<QlSegregationsData> getQlSegregationsDataList() {
        return qlSegregationsDataList;
    }

    public void setQlSegregationsDataList(List<QlSegregationsData> qlSegregationsDataList) {
        this.qlSegregationsDataList = qlSegregationsDataList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (qlZonesPK != null ? qlZonesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof QlZones)) {
            return false;
        }
        QlZones other = (QlZones) object;
        if ((this.qlZonesPK == null && other.qlZonesPK != null) || (this.qlZonesPK != null && !this.qlZonesPK.equals(other.qlZonesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeamx.adeadms.ql.pojos.QlZones[qlZonesPK=" + qlZonesPK + "]";
    }

}
