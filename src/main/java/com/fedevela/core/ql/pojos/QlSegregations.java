package com.fedevela.core.ql.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "QL_SEGREGATIONS", catalog = "", schema = "PROD")
@NamedQueries({
        @NamedQuery(name = "QlSegregations.findAll", query = "SELECT q FROM QlSegregations q"),
        @NamedQuery(name = "QlSegregations.findByIdSegregation", query = "SELECT q FROM QlSegregations q WHERE q.idSegregation = :idSegregation"),
        @NamedQuery(name = "QlSegregations.findByStreeFromScratch", query = "SELECT q FROM QlSegregations q WHERE q.streeFromScratch = :streeFromScratch"),
        @NamedQuery(name = "QlSegregations.findByStree", query = "SELECT q FROM QlSegregations q WHERE q.stree = :stree"),
        @NamedQuery(name = "QlSegregations.findByExternalNumber", query = "SELECT q FROM QlSegregations q WHERE q.externalNumber = :externalNumber"),
        @NamedQuery(name = "QlSegregations.findByInternalNumber", query = "SELECT q FROM QlSegregations q WHERE q.internalNumber = :internalNumber"),
        @NamedQuery(name = "QlSegregations.findByBetweenStreeRight", query = "SELECT q FROM QlSegregations q WHERE q.betweenStreeRight = :betweenStreeRight"),
        @NamedQuery(name = "QlSegregations.findByBetweenStreeLeft", query = "SELECT q FROM QlSegregations q WHERE q.betweenStreeLeft = :betweenStreeLeft"),
        @NamedQuery(name = "QlSegregations.findByReferencesStree", query = "SELECT q FROM QlSegregations q WHERE q.referencesStree = :referencesStree"),
        @NamedQuery(name = "QlSegregations.findByWaste", query = "SELECT q FROM QlSegregations q WHERE q.waste = :waste"),
        @NamedQuery(name = "QlSegregations.findByLogin", query = "SELECT q FROM QlSegregations q WHERE q.login = :login"),
        @NamedQuery(name = "QlSegregations.findByNow", query = "SELECT q FROM QlSegregations q WHERE q.now = :now")})
public class QlSegregations implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_SEGREGATION")
    private BigDecimal idSegregation;
    @Column(name = "STREE_FROM_SCRATCH")
    private String streeFromScratch;
    @Column(name = "STREE")
    private String stree;
    @Column(name = "EXTERNAL_NUMBER")
    private String externalNumber;
    @Column(name = "INTERNAL_NUMBER")
    private String internalNumber;
    @Column(name = "BETWEEN_STREE_RIGHT")
    private String betweenStreeRight;
    @Column(name = "BETWEEN_STREE_LEFT")
    private String betweenStreeLeft;
    @Column(name = "REFERENCES_STREE")
    private String referencesStree;
    @Column(name = "WASTE")
    private String waste;
    @Column(name = "LOGIN")
    private String login;
    @Column(name = "NOW")
    @Temporal(TemporalType.DATE)
    private Date now;
    @JoinColumn(name = "ID_SEGREGATION", referencedColumnName = "ID_SEGREGATION", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private QlSegregationsData qlSegregationsData;

    public QlSegregations() {
    }

    public QlSegregations(BigDecimal idSegregation) {
        this.idSegregation = idSegregation;
    }

    public BigDecimal getIdSegregation() {
        return idSegregation;
    }

    public void setIdSegregation(BigDecimal idSegregation) {
        this.idSegregation = idSegregation;
    }

    public String getStreeFromScratch() {
        return streeFromScratch;
    }

    public void setStreeFromScratch(String streeFromScratch) {
        this.streeFromScratch = streeFromScratch;
    }

    public String getStree() {
        return stree;
    }

    public void setStree(String stree) {
        this.stree = stree;
    }

    public String getExternalNumber() {
        return externalNumber;
    }

    public void setExternalNumber(String externalNumber) {
        this.externalNumber = externalNumber;
    }

    public String getInternalNumber() {
        return internalNumber;
    }

    public void setInternalNumber(String internalNumber) {
        this.internalNumber = internalNumber;
    }

    public String getBetweenStreeRight() {
        return betweenStreeRight;
    }

    public void setBetweenStreeRight(String betweenStreeRight) {
        this.betweenStreeRight = betweenStreeRight;
    }

    public String getBetweenStreeLeft() {
        return betweenStreeLeft;
    }

    public void setBetweenStreeLeft(String betweenStreeLeft) {
        this.betweenStreeLeft = betweenStreeLeft;
    }

    public String getReferencesStree() {
        return referencesStree;
    }

    public void setReferencesStree(String referencesStree) {
        this.referencesStree = referencesStree;
    }

    public String getWaste() {
        return waste;
    }

    public void setWaste(String waste) {
        this.waste = waste;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Date getNow() {
        return now;
    }

    public void setNow(Date now) {
        this.now = now;
    }

    public QlSegregationsData getQlSegregationsData() {
        return qlSegregationsData;
    }

    public void setQlSegregationsData(QlSegregationsData qlSegregationsData) {
        this.qlSegregationsData = qlSegregationsData;
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
        if (!(object instanceof QlSegregations)) {
            return false;
        }
        QlSegregations other = (QlSegregations) object;
        if ((this.idSegregation == null && other.idSegregation != null) || (this.idSegregation != null && !this.idSegregation.equals(other.idSegregation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeamx.adeadms.ql.pojos.QlSegregations[idSegregation=" + idSegregation + "]";
    }
}
