package com.fedevela.core.asic.cpanel.pojos;

/**
 * Created by fvelazquez on 26/03/14.
 */
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class DmsHolidaysPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ID_CUSTOMER")
    private short idCustomer;
    @Basic(optional = false)
    @Column(name = "HOLIDAY")
    @Temporal(TemporalType.DATE)
    private Date holiday;

    public DmsHolidaysPK() {
    }

    public DmsHolidaysPK(short idCustomer, Date holiday) {
        this.idCustomer = idCustomer;
        this.holiday = holiday;
    }

    public short getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(short idCustomer) {
        this.idCustomer = idCustomer;
    }

    public Date getHoliday() {
        return holiday;
    }

    public void setHoliday(Date holiday) {
        this.holiday = holiday;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idCustomer;
        hash += (holiday != null ? holiday.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DmsHolidaysPK)) {
            return false;
        }
        DmsHolidaysPK other = (DmsHolidaysPK) object;
        if (this.idCustomer != other.idCustomer) {
            return false;
        }
        if ((this.holiday == null && other.holiday != null) || (this.holiday != null && !this.holiday.equals(other.holiday))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.adea.cpanel.pojos.DmsHolidaysPK[idCustomer=" + idCustomer + ", holiday=" + holiday + "]";
    }

}
