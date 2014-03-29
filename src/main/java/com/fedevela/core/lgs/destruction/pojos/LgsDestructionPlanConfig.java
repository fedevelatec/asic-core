package com.fedevela.core.lgs.destruction.pojos;

/**
 * Created by fvelazquez on 28/03/14.
 */
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "LGS_DESTRUCTION_PLAN_CONFIG", catalog = "", schema = "PROD")
@NamedQueries({
        @NamedQuery(name = "LgsDestructionPlanConfig.findAll", query = "SELECT l FROM LgsDestructionPlanConfig l"),
        @NamedQuery(name = "LgsDestructionPlanConfig.findByIdPlan", query = "SELECT l FROM LgsDestructionPlanConfig l WHERE l.lgsDestructionPlanConfigPK.idPlan = :idPlan"),
        @NamedQuery(name = "LgsDestructionPlanConfig.findByIdCustomer", query = "SELECT l FROM LgsDestructionPlanConfig l WHERE l.lgsDestructionPlanConfigPK.idCustomer = :idCustomer"),
        @NamedQuery(name = "LgsDestructionPlanConfig.findByIdPeriod", query = "SELECT l FROM LgsDestructionPlanConfig l WHERE l.lgsDestructionPlanConfigPK.idPeriod = :idPeriod"),
        @NamedQuery(name = "LgsDestructionPlanConfig.findByStartDate", query = "SELECT l FROM LgsDestructionPlanConfig l WHERE l.startDate = :startDate"),
        @NamedQuery(name = "LgsDestructionPlanConfig.findByEndDate", query = "SELECT l FROM LgsDestructionPlanConfig l WHERE l.endDate = :endDate"),
        @NamedQuery(name = "LgsDestructionPlanConfig.findByAuthorizedStartDate", query = "SELECT l FROM LgsDestructionPlanConfig l WHERE l.authorizedStartDate = :authorizedStartDate"),
        @NamedQuery(name = "LgsDestructionPlanConfig.findByAuthorizedEndDate", query = "SELECT l FROM LgsDestructionPlanConfig l WHERE l.authorizedEndDate = :authorizedEndDate"),
        @NamedQuery(name = "LgsDestructionPlanConfig.findByCustAuthorizedStartDate", query = "SELECT l FROM LgsDestructionPlanConfig l WHERE l.custAuthorizedStartDate = :custAuthorizedStartDate"),
        @NamedQuery(name = "LgsDestructionPlanConfig.findByCustAuthorizedEndDate", query = "SELECT l FROM LgsDestructionPlanConfig l WHERE l.custAuthorizedEndDate = :custAuthorizedEndDate")})
public class LgsDestructionPlanConfig implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LgsDestructionPlanConfigPK lgsDestructionPlanConfigPK;
    @Basic(optional = false)
    @Column(name = "START_DATE")
    @Temporal(TemporalType.DATE)
    private Date startDate;
    @Basic(optional = false)
    @Column(name = "END_DATE")
    @Temporal(TemporalType.DATE)
    private Date endDate;
    @Basic(optional = false)
    @Column(name = "AUTHORIZED_START_DATE")
    @Temporal(TemporalType.DATE)
    private Date authorizedStartDate;
    @Basic(optional = false)
    @Column(name = "AUTHORIZED_END_DATE")
    @Temporal(TemporalType.DATE)
    private Date authorizedEndDate;
    @Basic(optional = false)
    @Column(name = "CUST_AUTHORIZED_START_DATE")
    @Temporal(TemporalType.DATE)
    private Date custAuthorizedStartDate;
    @Basic(optional = false)
    @Column(name = "CUST_AUTHORIZED_END_DATE")
    @Temporal(TemporalType.DATE)
    private Date custAuthorizedEndDate;
    @JoinColumn(name = "ID_PERIOD", referencedColumnName = "ID_PERIOD", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private LgsPeriods lgsPeriods;
    @JoinColumns({
            @JoinColumn(name = "ID_PLAN", referencedColumnName = "ID_PLAN", insertable = false, updatable = false),
            @JoinColumn(name = "ID_CUSTOMER", referencedColumnName = "ID_CUSTOMER", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private LgsDestructionsPlan lgsDestructionsPlan;

    public LgsDestructionPlanConfig() {
    }

    public LgsDestructionPlanConfig(LgsDestructionPlanConfigPK lgsDestructionPlanConfigPK) {
        this.lgsDestructionPlanConfigPK = lgsDestructionPlanConfigPK;
    }

    public LgsDestructionPlanConfig(LgsDestructionPlanConfigPK lgsDestructionPlanConfigPK, Date startDate, Date endDate, Date authorizedStartDate, Date authorizedEndDate, Date custAuthorizedStartDate, Date custAuthorizedEndDate) {
        this.lgsDestructionPlanConfigPK = lgsDestructionPlanConfigPK;
        this.startDate = startDate;
        this.endDate = endDate;
        this.authorizedStartDate = authorizedStartDate;
        this.authorizedEndDate = authorizedEndDate;
        this.custAuthorizedStartDate = custAuthorizedStartDate;
        this.custAuthorizedEndDate = custAuthorizedEndDate;
    }

    public LgsDestructionPlanConfig(BigInteger idPlan, short idCustomer, BigInteger idPeriod) {
        this.lgsDestructionPlanConfigPK = new LgsDestructionPlanConfigPK(idPlan, idCustomer, idPeriod);
    }

    public LgsDestructionPlanConfigPK getLgsDestructionPlanConfigPK() {
        return lgsDestructionPlanConfigPK;
    }

    public void setLgsDestructionPlanConfigPK(LgsDestructionPlanConfigPK lgsDestructionPlanConfigPK) {
        this.lgsDestructionPlanConfigPK = lgsDestructionPlanConfigPK;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getAuthorizedStartDate() {
        return authorizedStartDate;
    }

    public void setAuthorizedStartDate(Date authorizedStartDate) {
        this.authorizedStartDate = authorizedStartDate;
    }

    public Date getAuthorizedEndDate() {
        return authorizedEndDate;
    }

    public void setAuthorizedEndDate(Date authorizedEndDate) {
        this.authorizedEndDate = authorizedEndDate;
    }

    public Date getCustAuthorizedStartDate() {
        return custAuthorizedStartDate;
    }

    public void setCustAuthorizedStartDate(Date custAuthorizedStartDate) {
        this.custAuthorizedStartDate = custAuthorizedStartDate;
    }

    public Date getCustAuthorizedEndDate() {
        return custAuthorizedEndDate;
    }

    public void setCustAuthorizedEndDate(Date custAuthorizedEndDate) {
        this.custAuthorizedEndDate = custAuthorizedEndDate;
    }

    public LgsPeriods getLgsPeriods() {
        return lgsPeriods;
    }

    public void setLgsPeriods(LgsPeriods lgsPeriods) {
        this.lgsPeriods = lgsPeriods;
    }

    public LgsDestructionsPlan getLgsDestructionsPlan() {
        return lgsDestructionsPlan;
    }

    public void setLgsDestructionsPlan(LgsDestructionsPlan lgsDestructionsPlan) {
        this.lgsDestructionsPlan = lgsDestructionsPlan;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lgsDestructionPlanConfigPK != null ? lgsDestructionPlanConfigPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LgsDestructionPlanConfig)) {
            return false;
        }
        LgsDestructionPlanConfig other = (LgsDestructionPlanConfig) object;
        if ((this.lgsDestructionPlanConfigPK == null && other.lgsDestructionPlanConfigPK != null) || (this.lgsDestructionPlanConfigPK != null && !this.lgsDestructionPlanConfigPK.equals(other.lgsDestructionPlanConfigPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.lgs.destruction.pojos.LgsDestructionPlanConfig[lgsDestructionPlanConfigPK=" + lgsDestructionPlanConfigPK + "]";
    }

}
