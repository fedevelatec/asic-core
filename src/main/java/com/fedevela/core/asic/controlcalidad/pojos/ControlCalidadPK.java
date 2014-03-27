package com.fedevela.core.asic.controlcalidad.pojos;

/**
 * Created by fvelazquez on 26/03/14.
 */
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Embeddable
public class ControlCalidadPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "NUNICODOC")
    private long nunicodoc;
    @Basic(optional = false)
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;

    public ControlCalidadPK() {
    }

    public ControlCalidadPK(long nunicodoc, Date fecha) {
        this.nunicodoc = nunicodoc;
        this.fecha = fecha;
    }

    public long getNunicodoc() {
        return nunicodoc;
    }

    public void setNunicodoc(long nunicodoc) {
        this.nunicodoc = nunicodoc;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) nunicodoc;
        hash += (fecha != null ? fecha.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ControlCalidadPK)) {
            return false;
        }
        ControlCalidadPK other = (ControlCalidadPK) object;
        if (this.nunicodoc != other.nunicodoc) {
            return false;
        }
        if ((this.fecha == null && other.fecha != null) || (this.fecha != null && !this.fecha.equals(other.fecha))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.adea.controlcalidad.pojos.ControlCalidadPK[ nunicodoc=" + nunicodoc + ", fecha=" + fecha + " ]";
    }

}

