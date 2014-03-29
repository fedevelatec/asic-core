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
public class HnCambiosCheckListPk implements Serializable {

    @Basic(optional = false)
    @Column(name = "NUNICODOC")
    private Long nunicodoc;
    @Basic(optional = false)
    @Column(name = "DOCCOD")
    private Integer doccod;
    @Basic(optional = false)
    @Column(name = "NUNICODOCT")
    private Long nunicodoct;
    @Basic(optional = false)
    @Column(name = "TIPO_CAMBIO")
    private Integer tipo_cambio;
    @Basic(optional = false)
    @Column(name = "FECHA_ULT")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date fechaUlt;

    public HnCambiosCheckListPk() {
    }

    public HnCambiosCheckListPk(Long nunicodoc, Integer doccod, Long nunicodoct, Integer tipo_cambio, Date fechaUlt) {
        this.nunicodoc = nunicodoc;
        this.doccod = doccod;
        this.nunicodoct = nunicodoct;
        this.tipo_cambio = tipo_cambio;
        this.fechaUlt = fechaUlt;
    }

    public Integer getDoccod() {
        return doccod;
    }

    public void setDoccod(Integer doccod) {
        this.doccod = doccod;
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

    public Long getNunicodoct() {
        return nunicodoct;
    }

    public void setNunicodoct(Long nunicodoct) {
        this.nunicodoct = nunicodoct;
    }

    public Integer getTipo_cambio() {
        return tipo_cambio;
    }

    public void setTipo_cambio(Integer tipo_cambio) {
        this.tipo_cambio = tipo_cambio;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HnCambiosCheckListPk other = (HnCambiosCheckListPk) obj;
        if (this.nunicodoc != other.nunicodoc && (this.nunicodoc == null || !this.nunicodoc.equals(other.nunicodoc))) {
            return false;
        }
        if (this.doccod != other.doccod && (this.doccod == null || !this.doccod.equals(other.doccod))) {
            return false;
        }
        if (this.nunicodoct != other.nunicodoct && (this.nunicodoct == null || !this.nunicodoct.equals(other.nunicodoct))) {
            return false;
        }
        if (this.tipo_cambio != other.tipo_cambio && (this.tipo_cambio == null || !this.tipo_cambio.equals(other.tipo_cambio))) {
            return false;
        }
        if (this.fechaUlt != other.fechaUlt && (this.fechaUlt == null || !this.fechaUlt.equals(other.fechaUlt))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + (this.nunicodoc != null ? this.nunicodoc.hashCode() : 0);
        hash = 83 * hash + (this.doccod != null ? this.doccod.hashCode() : 0);
        hash = 83 * hash + (this.nunicodoct != null ? this.nunicodoct.hashCode() : 0);
        hash = 83 * hash + (this.tipo_cambio != null ? this.tipo_cambio.hashCode() : 0);
        hash = 83 * hash + (this.fechaUlt != null ? this.fechaUlt.hashCode() : 0);
        return hash;
    }

}
