package com.fedevela.core.ql.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "QL_SEGREGATIONS_DATA", catalog = "", schema = "PROD")
@NamedQueries({
        @NamedQuery(name = "QlSegregationsData.findAll", query = "SELECT q FROM QlSegregationsData q"),
        @NamedQuery(name = "QlSegregationsData.findByIdSegregation", query = "SELECT q FROM QlSegregationsData q WHERE q.idSegregation = :idSegregation"),
        @NamedQuery(name = "QlSegregationsData.findBySec", query = "SELECT q FROM QlSegregationsData q WHERE q.sec = :sec"),
        @NamedQuery(name = "QlSegregationsData.findByPreCode", query = "SELECT q FROM QlSegregationsData q WHERE q.preCode = :preCode"),
        @NamedQuery(name = "QlSegregationsData.findByCustomerCode", query = "SELECT q FROM QlSegregationsData q WHERE q.customerCode = :customerCode"),
        @NamedQuery(name = "QlSegregationsData.findByName", query = "SELECT q FROM QlSegregationsData q WHERE q.name = :name"),
        @NamedQuery(name = "QlSegregationsData.findByCorporateName", query = "SELECT q FROM QlSegregationsData q WHERE q.corporateName = :corporateName"),
        @NamedQuery(name = "QlSegregationsData.findByStree", query = "SELECT q FROM QlSegregationsData q WHERE q.stree = :stree"),
        @NamedQuery(name = "QlSegregationsData.findByDistrict", query = "SELECT q FROM QlSegregationsData q WHERE q.district = :district"),
        @NamedQuery(name = "QlSegregationsData.findByCity", query = "SELECT q FROM QlSegregationsData q WHERE q.city = :city"),
        @NamedQuery(name = "QlSegregationsData.findByItin", query = "SELECT q FROM QlSegregationsData q WHERE q.itin = :itin"),
        @NamedQuery(name = "QlSegregationsData.findByTelephone", query = "SELECT q FROM QlSegregationsData q WHERE q.telephone = :telephone"),
        @NamedQuery(name = "QlSegregationsData.findByLatitude", query = "SELECT q FROM QlSegregationsData q WHERE q.latitude = :latitude"),
        @NamedQuery(name = "QlSegregationsData.findByLongitude", query = "SELECT q FROM QlSegregationsData q WHERE q.longitude = :longitude"),
        @NamedQuery(name = "QlSegregationsData.findByPreference", query = "SELECT q FROM QlSegregationsData q WHERE q.preference = :preference"),
        @NamedQuery(name = "QlSegregationsData.findByLogin", query = "SELECT q FROM QlSegregationsData q WHERE q.login = :login"),
        @NamedQuery(name = "QlSegregationsData.findByStatus", query = "SELECT q FROM QlSegregationsData q WHERE q.status = :status"),
        @NamedQuery(name = "QlSegregationsData.findByNow", query = "SELECT q FROM QlSegregationsData q WHERE q.now = :now")})
public class QlSegregationsData implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_SEGREGATION")
    private BigDecimal idSegregation;
    @Column(name = "SEC")
    private String sec;
    @Column(name = "PRE_CODE")
    private String preCode;
    @Column(name = "CUSTOMER_CODE")
    private String customerCode;
    @Column(name = "NAME")
    private String name;
    @Column(name = "CORPORATE_NAME")
    private String corporateName;
    @Column(name = "STREE")
    private String stree;
    @Column(name = "DISTRICT")
    private String district;
    @Column(name = "CITY")
    private String city;
    @Column(name = "ITIN")
    private String itin;
    @Column(name = "TELEPHONE")
    private String telephone;
    @Column(name = "LATITUDE")
    private String latitude;
    @Column(name = "LONGITUDE")
    private String longitude;
    @Column(name = "PREFERENCE")
    private BigInteger preference;
    @Column(name = "LOGIN")
    private String login;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "NOW")
    @Temporal(TemporalType.DATE)
    private Date now;
    @JoinColumns({
            @JoinColumn(name = "ID_REGION", referencedColumnName = "ID_REGION"),
            @JoinColumn(name = "ID_ZONE", referencedColumnName = "ID_ZONE")})
    @ManyToOne(optional = false)
    private QlZones qlZones;
    @JoinColumn(name = "ID_ROUTE", referencedColumnName = "ID_ROUTE")
    @ManyToOne(optional = false)
    private QlRoutes qlRoutes;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "qlSegregationsData")
    private QlSegregations qlSegregations;

    public QlSegregationsData() {
    }

    public QlSegregationsData(BigDecimal idSegregation) {
        this.idSegregation = idSegregation;
    }

    public BigDecimal getIdSegregation() {
        return idSegregation;
    }

    public void setIdSegregation(BigDecimal idSegregation) {
        this.idSegregation = idSegregation;
    }

    public String getSec() {
        return sec;
    }

    public void setSec(String sec) {
        this.sec = sec;
    }

    public String getPreCode() {
        return preCode;
    }

    public void setPreCode(String preCode) {
        this.preCode = preCode;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCorporateName() {
        return corporateName;
    }

    public void setCorporateName(String corporateName) {
        this.corporateName = corporateName;
    }

    public String getStree() {
        return stree;
    }

    public void setStree(String stree) {
        this.stree = stree;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getItin() {
        return itin;
    }

    public void setItin(String itin) {
        this.itin = itin;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public BigInteger getPreference() {
        return preference;
    }

    public void setPreference(BigInteger preference) {
        this.preference = preference;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getNow() {
        return now;
    }

    public void setNow(Date now) {
        this.now = now;
    }

    public QlZones getQlZones() {
        return qlZones;
    }

    public void setQlZones(QlZones qlZones) {
        this.qlZones = qlZones;
    }

    public QlRoutes getQlRoutes() {
        return qlRoutes;
    }

    public void setQlRoutes(QlRoutes qlRoutes) {
        this.qlRoutes = qlRoutes;
    }

    public QlSegregations getQlSegregations() {
        return qlSegregations;
    }

    public void setQlSegregations(QlSegregations qlSegregations) {
        this.qlSegregations = qlSegregations;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSegregation != null ? idSegregation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof QlSegregationsData)) {
            return false;
        }
        QlSegregationsData other = (QlSegregationsData) object;
        if ((this.idSegregation == null && other.idSegregation != null) || (this.idSegregation != null && !this.idSegregation.equals(other.idSegregation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeamx.adeadms.ql.pojos.QlSegregationsData[idSegregation=" + idSegregation + "]";
    }

}
