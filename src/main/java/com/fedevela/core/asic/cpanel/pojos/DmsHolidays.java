package com.fedevela.core.asic.cpanel.pojos;

/**
 * Created by fvelazquez on 26/03/14.
 */
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "DMS_HOLIDAYS", catalog = "", schema = "PROD")
@NamedQueries({
        @NamedQuery(name = "DmsHolidays.findAll", query = "SELECT d FROM DmsHolidays d"),
        @NamedQuery(name = "DmsHolidays.findByIdCustomer", query = "SELECT d FROM DmsHolidays d WHERE d.dmsHolidaysPK.idCustomer = :idCustomer"),
        @NamedQuery(name = "DmsHolidays.findByHoliday", query = "SELECT d FROM DmsHolidays d WHERE d.dmsHolidaysPK.holiday = :holiday"),
        @NamedQuery(name = "DmsHolidays.findByDescription", query = "SELECT d FROM DmsHolidays d WHERE d.description = :description")})
public class DmsHolidays implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DmsHolidaysPK dmsHolidaysPK;
    @Column(name = "DESCRIPTION")
    private String description;

    public DmsHolidays() {
    }

    public DmsHolidays(DmsHolidaysPK dmsHolidaysPK) {
        this.dmsHolidaysPK = dmsHolidaysPK;
    }

    public DmsHolidays(short idCustomer, Date holiday) {
        this.dmsHolidaysPK = new DmsHolidaysPK(idCustomer, holiday);
    }

    public DmsHolidaysPK getDmsHolidaysPK() {
        return dmsHolidaysPK;
    }

    public void setDmsHolidaysPK(DmsHolidaysPK dmsHolidaysPK) {
        this.dmsHolidaysPK = dmsHolidaysPK;
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
        hash += (dmsHolidaysPK != null ? dmsHolidaysPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DmsHolidays)) {
            return false;
        }
        DmsHolidays other = (DmsHolidays) object;
        if ((this.dmsHolidaysPK == null && other.dmsHolidaysPK != null) || (this.dmsHolidaysPK != null && !this.dmsHolidaysPK.equals(other.dmsHolidaysPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.adea.cpanel.pojos.DmsHolidays[dmsHolidaysPK=" + dmsHolidaysPK + "]";
    }

}
