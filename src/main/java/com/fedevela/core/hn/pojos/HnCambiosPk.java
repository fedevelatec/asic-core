package com.fedevela.core.hn.pojos;

/**
 * Created by fvelazquez on 28/03/14.
 */
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;


@Embeddable
public class HnCambiosPk implements Serializable {

    @Basic(optional = false)
    @Column(name = "FECHA_ULT")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date fechaUlt;
    @Basic(optional = false)
    @Column(name = "NUNICODOC")
    private Long nunicodoc;
    @Basic(optional = false)
    @Column(name = "TIPO_CAMBIO")
    private Integer tipoCambio;

    public HnCambiosPk() {
    }

    public HnCambiosPk(Date fechaUlt, Long nunicodoc, Integer tipoCambio) {
        this.fechaUlt = fechaUlt;
        this.nunicodoc = nunicodoc;
        this.tipoCambio = tipoCambio;
    }

    public Date getFechaUlt() {
        return fechaUlt;
    }

    public void setFechaUlt(Date fechaUlt) {
        this.fechaUlt = fechaUlt;
    }

    public Long getNunicodoc() {
        return nunicodoc;
    }

    public void setNunicodoc(Long nunicodoc) {
        this.nunicodoc = nunicodoc;
    }

    public Integer getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(Integer tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HnCambiosPk other = (HnCambiosPk) obj;
        if (this.fechaUlt != other.fechaUlt && (this.fechaUlt == null || !this.fechaUlt.equals(other.fechaUlt))) {
            return false;
        }
        if (this.nunicodoc != other.nunicodoc && (this.nunicodoc == null || !this.nunicodoc.equals(other.nunicodoc))) {
            return false;
        }
        if (this.tipoCambio != other.tipoCambio && (this.tipoCambio == null || !this.tipoCambio.equals(other.tipoCambio))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + (this.fechaUlt != null ? this.fechaUlt.hashCode() : 0);
        hash = 11 * hash + (this.nunicodoc != null ? this.nunicodoc.hashCode() : 0);
        hash = 11 * hash + (this.tipoCambio != null ? this.tipoCambio.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "HnCambiosPk{" + "fechaUlt=" + fechaUlt + ", nunicodoc=" + nunicodoc + ", tipoCambio=" + tipoCambio + '}';
    }

}
