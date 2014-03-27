package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ETIQ_DOCUM", schema = "PROD")
public class EtiqDocum implements Serializable {

    /**
     * Numero Unico de documento
     */
    @Id
    @Basic(optional = false)
    @Column(name = "NUNICODOC")
    private Long nUnicoDoc;
    /**
     * Numero de cliente.
     */
    @Basic(optional = false)
    @Column(name = "SCLTCOD")
    private Short sclTCod;
    @Basic(optional = false)
    @Column(name = "DOCADEACLT")
    private Long docAdeaclt;
    @Column(name = "ESTADO_UBICACION")
    private String estadoUbicacion;
    @Column(name = "REFERENCIADA")
    private String referenciada;
    @Column(name = "OBSERVACIONES")
    private String observaciones;

    public EtiqDocum() {}

    public EtiqDocum(Long nUnicoDoc) {
        this.nUnicoDoc = nUnicoDoc;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final EtiqDocum other = (EtiqDocum) obj;
        if (this.nUnicoDoc != other.nUnicoDoc && (this.nUnicoDoc == null || !this.nUnicoDoc.equals(other.nUnicoDoc))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (this.nUnicoDoc != null ? this.nUnicoDoc.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "EtiqDocum{" + "nUnicoDoc=" + nUnicoDoc + "sclTCod=" + sclTCod + "docAdeaclt=" + docAdeaclt + "estadoUbicacion=" + estadoUbicacion + "referenciada=" + referenciada + "observaciones=" + observaciones + '}';
    }

    public Long getDocAdeaclt() {
        return docAdeaclt;
    }

    public void setDocAdeaclt(Long docAdeaclt) {
        this.docAdeaclt = docAdeaclt;
    }

    public String getEstadoUbicacion() {
        return estadoUbicacion;
    }

    public void setEstadoUbicacion(String estadoUbicacion) {
        this.estadoUbicacion = estadoUbicacion;
    }

    public Long getnUnicoDoc() {
        return nUnicoDoc;
    }

    public void setnUnicoDoc(Long nUnicoDoc) {
        this.nUnicoDoc = nUnicoDoc;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getReferenciada() {
        return referenciada;
    }

    public void setReferenciada(String referenciada) {
        this.referenciada = referenciada;
    }

    public Short getSclTCod() {
        return sclTCod;
    }

    public void setSclTCod(Short sclTCod) {
        this.sclTCod = sclTCod;
    }
}

