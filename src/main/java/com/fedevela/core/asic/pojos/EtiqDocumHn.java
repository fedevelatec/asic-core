package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * EtiqDocumHn generated by hbm2java
 *
 */
@Entity
@Table(name = "ETIQ_DOCUM_HN", schema = "PROD")
public class EtiqDocumHn implements java.io.Serializable {

    private static final Long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUNICODOC")
    private Long nunicodoc;
    @Basic(optional = false)
    @Column(name = "DOCADEACLT")
    private Long docadeaclt;
    @Column(name = "ESTADO_UBICACION")
    private String estadoUbicacion;
    @Column(name = "REFERENCIADA")
    private String referenciada;
    @Column(name = "NUNICODOC_ADEA")
    private Long nunicodocAdea;
    @Column(name = "ID_DOCTO")
    private String idDocto;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @Column(name = "SCLTCOD")
    private Short scltcod;

    public EtiqDocumHn() {
    }

    public EtiqDocumHn(Long nunicodoc) {
        this.nunicodoc = nunicodoc;
    }

    public EtiqDocumHn(Long nunicodoc, Short scltcod, Long docadeaclt) {
        this.nunicodoc = nunicodoc;
        this.scltcod = scltcod;
        this.docadeaclt = docadeaclt;
    }

    public EtiqDocumHn(Long nunicodoc, Short scltcod, Long docadeaclt,
                       String estadoUbicacion, String referenciada,
                       Long nunicodocAdea, String idDocto, String observaciones) {
        this.nunicodoc = nunicodoc;
        this.scltcod = scltcod;
        this.docadeaclt = docadeaclt;
        this.estadoUbicacion = estadoUbicacion;
        this.referenciada = referenciada;
        this.nunicodocAdea = nunicodocAdea;
        this.idDocto = idDocto;
        this.observaciones = observaciones;
    }

    public Long getNunicodoc() {
        return this.nunicodoc;
    }

    public void setNunicodoc(Long nunicodoc) {
        this.nunicodoc = nunicodoc;
    }

    public Short getScltcod() {
        return this.scltcod;
    }

    public void setScltcod(Short scltcod) {
        this.scltcod = scltcod;
    }

    public Long getDocadeaclt() {
        return this.docadeaclt;
    }

    public void setDocadeaclt(Long docadeaclt) {
        this.docadeaclt = docadeaclt;
    }

    public String getEstadoUbicacion() {
        return this.estadoUbicacion;
    }

    public void setEstadoUbicacion(String estadoUbicacion) {
        this.estadoUbicacion = estadoUbicacion;
    }

    public String getReferenciada() {
        return this.referenciada;
    }

    public void setReferenciada(String referenciada) {
        this.referenciada = referenciada;
    }

    public Long getNunicodocAdea() {
        return nunicodocAdea;
    }

    public void setNunicodocAdea(Long nunicodocAdea) {
        this.nunicodocAdea = nunicodocAdea;
    }

    public String getIdDocto() {
        return this.idDocto;
    }

    public void setIdDocto(String idDocto) {
        this.idDocto = idDocto;
    }

    public String getObservaciones() {
        return this.observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nunicodoc != null ? nunicodoc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EtiqDocumHn)) {
            return false;
        }
        EtiqDocumHn other = (EtiqDocumHn) object;
        if ((this.nunicodoc == null && other.nunicodoc != null) || (this.nunicodoc != null && !this.nunicodoc.equals(other.nunicodoc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeamx.adeadms.pojos.EtiqDocumHn[nunicodoc=" + nunicodoc + "]";
    }
}
