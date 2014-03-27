package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class LogMovimientosPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CAJA_ID")
    private Long cajaId;
    @Basic(optional = false)
    @Column(name = "NUNICODOC")
    private Long nunicodoc;
    @Basic(optional = false)
    @Column(name = "NUNICODOCT")
    private Long nunicodoct;
    @Basic(optional = false)
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;

    public LogMovimientosPK() {
    }

    public LogMovimientosPK(Long cajaId, Long nunicodoc, Long nunicodoct, Date fecha) {
        this.cajaId = cajaId;
        this.nunicodoc = nunicodoc;
        this.nunicodoct = nunicodoct;
        this.fecha = fecha;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cajaId != null ? cajaId.hashCode() : 0);
        hash += (nunicodoc != null ? nunicodoc.hashCode() : 0);
        hash += (nunicodoct != null ? nunicodoct.hashCode() : 0);
        hash += (fecha != null ? fecha.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LogMovimientosPK)) {
            return false;
        }
        LogMovimientosPK other = (LogMovimientosPK) object;
        if ((this.cajaId == null && other.cajaId != null) || (this.cajaId != null && !this.cajaId.equals(other.cajaId))) {
            return false;
        }
        if ((this.nunicodoc == null && other.nunicodoc != null) || (this.nunicodoc != null && !this.nunicodoc.equals(other.nunicodoc))) {
            return false;
        }
        if ((this.nunicodoct == null && other.nunicodoct != null) || (this.nunicodoct != null && !this.nunicodoct.equals(other.nunicodoct))) {
            return false;
        }
        if ((this.fecha == null && other.fecha != null) || (this.fecha != null && !this.fecha.equals(other.fecha))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.adea.pojos.LogMovimientosPK[cajaId=" + cajaId + ", nunicodoc=" + nunicodoc + ", nunicodoct=" + nunicodoct + ", fecha=" + fecha + "]";
    }

    public Long getCajaId() {
        return cajaId;
    }

    public void setCajaId(Long cajaId) {
        this.cajaId = cajaId;
    }

    public Long getNunicodoc() {
        return nunicodoc;
    }

    public void setNunicodoc(Long nunicodoc) {
        this.nunicodoc = nunicodoc;
    }

    public Long getNunicodoct() {
        return nunicodoct;
    }

    public void setNunicodoct(Long nunicodoct) {
        this.nunicodoct = nunicodoct;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
