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
@Table(name = "QL_ROUTES", catalog = "", schema = "PROD")
@NamedQueries({
        @NamedQuery(name = "QlRoutes.findAll", query = "SELECT q FROM QlRoutes q"),
        @NamedQuery(name = "QlRoutes.findByIdRoute", query = "SELECT q FROM QlRoutes q WHERE q.idRoute = :idRoute"),
        @NamedQuery(name = "QlRoutes.findByName", query = "SELECT q FROM QlRoutes q WHERE q.name = :name")})
public class QlRoutes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_ROUTE")
    private BigDecimal idRoute;
    @Column(name = "NAME")
    private String name;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "qlRoutes")
    private List<QlSegregationsData> qlSegregationsDataList;

    public QlRoutes() {
    }

    public QlRoutes(BigDecimal idRoute) {
        this.idRoute = idRoute;
    }

    public BigDecimal getIdRoute() {
        return idRoute;
    }

    public void setIdRoute(BigDecimal idRoute) {
        this.idRoute = idRoute;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        hash += (idRoute != null ? idRoute.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof QlRoutes)) {
            return false;
        }
        QlRoutes other = (QlRoutes) object;
        if ((this.idRoute == null && other.idRoute != null) || (this.idRoute != null && !this.idRoute.equals(other.idRoute))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeamx.adeadms.ql.pojos.QlRoutes[idRoute=" + idRoute + "]";
    }

}
