package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class LogCajaPrecintoPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CAJA_ID")
    private BigInteger cajaId;
    @Basic(optional = false)
    @Column(name = "MOVIMIENTO")
    private char movimiento;
    @Basic(optional = false)
    @Column(name = "NOW")
    @Temporal(TemporalType.DATE)
    private Date now;

    public LogCajaPrecintoPK() {
    }

    public LogCajaPrecintoPK(BigInteger cajaId, char movimiento, Date now) {
        this.cajaId = cajaId;
        this.movimiento = movimiento;
        this.now = now;
    }

    public BigInteger getCajaId() {
        return cajaId;
    }

    public void setCajaId(BigInteger cajaId) {
        this.cajaId = cajaId;
    }

    public char getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(char movimiento) {
        this.movimiento = movimiento;
    }

    public Date getNow() {
        return now;
    }

    public void setNow(Date now) {
        this.now = now;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cajaId != null ? cajaId.hashCode() : 0);
        hash += (int) movimiento;
        hash += (now != null ? now.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LogCajaPrecintoPK)) {
            return false;
        }
        LogCajaPrecintoPK other = (LogCajaPrecintoPK) object;
        if ((this.cajaId == null && other.cajaId != null) || (this.cajaId != null && !this.cajaId.equals(other.cajaId))) {
            return false;
        }
        if (this.movimiento != other.movimiento) {
            return false;
        }
        if ((this.now == null && other.now != null) || (this.now != null && !this.now.equals(other.now))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adea.entity.log.LogCajaPrecintoPK[ cajaId=" + cajaId + ", movimiento=" + movimiento + ", now=" + now + " ]";
    }

}
