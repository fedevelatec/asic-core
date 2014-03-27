package com.fedevela.core.asic.cpanel.pojos;

/**
 * Created by fvelazquez on 26/03/14.
 */
import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "DMS_CUSTOMER_HOLIDAYS_VW", catalog = "", schema = "PROD")
@NamedQueries({
        @NamedQuery(name = "DmsCustomerHolidaysVw.findAll", query = "SELECT d FROM DmsCustomerHolidaysVw d"),
        @NamedQuery(name = "DmsCustomerHolidaysVw.findByIdCustomer", query = "SELECT d FROM DmsCustomerHolidaysVw d WHERE d.idCustomer = :idCustomer"),
        @NamedQuery(name = "DmsCustomerHolidaysVw.findByDescription", query = "SELECT d FROM DmsCustomerHolidaysVw d WHERE d.description = :description"),
        @NamedQuery(name = "DmsCustomerHolidaysVw.findByPeriodCount", query = "SELECT d FROM DmsCustomerHolidaysVw d WHERE d.periodCount = :periodCount")})
public class DmsCustomerHolidaysVw implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_CUSTOMER")
    private short idCustomer;
    @Basic(optional = false)
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "PERIOD_COUNT")
    private BigInteger periodCount;

    public DmsCustomerHolidaysVw() {
    }

    public short getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(short idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigInteger getPeriodCount() {
        return periodCount;
    }

    public void setPeriodCount(BigInteger periodCount) {
        this.periodCount = periodCount;
    }

}
