package com.fedevela.core.avaluo.pojos;

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
public class AvStatusDigPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "NUNICODOC")
    private int nunicodoc;
    @Basic(optional = false)
    @Column(name = "NUNICODOCT")
    private long nunicodoct;
    @Basic(optional = false)
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;

    public AvStatusDigPK() {
    }

    public AvStatusDigPK(int nunicodoc, long nunicodoct, Date fecha) {
        this.nunicodoc = nunicodoc;
        this.nunicodoct = nunicodoct;
        this.fecha = fecha;
    }

    public int getNunicodoc() {
        return nunicodoc;
    }

    public void setNunicodoc(int nunicodoc) {
        this.nunicodoc = nunicodoc;
    }

    public long getNunicodoct() {
        return nunicodoct;
    }

    public void setNunicodoct(long nunicodoct) {
        this.nunicodoct = nunicodoct;
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
        hash += (int) nunicodoct;
        hash += (fecha != null ? fecha.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AvStatusDigPK)) {
            return false;
        }
        AvStatusDigPK other = (AvStatusDigPK) object;
        if (this.nunicodoc != other.nunicodoc) {
            return false;
        }
        if (this.nunicodoct != other.nunicodoct) {
            return false;
        }
        if ((this.fecha == null && other.fecha != null) || (this.fecha != null && !this.fecha.equals(other.fecha))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.avaluo.pojos.AvStatusDigPK[nunicodoc=" + nunicodoc + ", nunicodoct=" + nunicodoct + ", fecha=" + fecha + "]";
    }

}
