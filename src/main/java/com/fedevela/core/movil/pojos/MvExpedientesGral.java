package com.fedevela.core.movil.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "MV_EXPEDIENTES_GRAL", schema="PROD")
@XmlRootElement
public class MvExpedientesGral implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "NUNICODOC")
    private BigDecimal nunicodoc;
    @Basic(optional = false)
    @Column(name = "ID_SOLICITUD")
    private String idSolicitud;
    @Basic(optional = false)
    @Column(name = "ID_TIPO_ENVIO")
    private char idTipoEnvio;
    @Basic(optional = false)
    @Column(name = "PAQUETE")
    private String paquete;
    @Column(name = "FECHA_CARGA")
    @Temporal(TemporalType.DATE)
    private Date fechaCarga;
    @Column(name = "FECHA_CAPTURA")
    @Temporal(TemporalType.DATE)
    private Date fechaCaptura;
    @Basic(optional = false)
    @Column(name = "ESTATUS")
    private short estatus;

    public MvExpedientesGral() {
    }

    public MvExpedientesGral(BigDecimal nunicodoc) {
        this.nunicodoc = nunicodoc;
    }

    public MvExpedientesGral(BigDecimal nunicodoc, String idSolicitud, char idTipoEnvio, String paquete, short estatus) {
        this.nunicodoc = nunicodoc;
        this.idSolicitud = idSolicitud;
        this.idTipoEnvio = idTipoEnvio;
        this.paquete = paquete;
        this.estatus = estatus;
    }

    public BigDecimal getNunicodoc() {
        return nunicodoc;
    }

    public void setNunicodoc(BigDecimal nunicodoc) {
        this.nunicodoc = nunicodoc;
    }

    public String getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(String idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public char getIdTipoEnvio() {
        return idTipoEnvio;
    }

    public void setIdTipoEnvio(char idTipoEnvio) {
        this.idTipoEnvio = idTipoEnvio;
    }

    public String getPaquete() {
        return paquete;
    }

    public void setPaquete(String paquete) {
        this.paquete = paquete;
    }

    public Date getFechaCarga() {
        return fechaCarga;
    }

    public void setFechaCarga(Date fechaCarga) {
        this.fechaCarga = fechaCarga;
    }

    public Date getFechaCaptura() {
        return fechaCaptura;
    }

    public void setFechaCaptura(Date fechaCaptura) {
        this.fechaCaptura = fechaCaptura;
    }

    public short getEstatus() {
        return estatus;
    }

    public void setEstatus(short estatus) {
        this.estatus = estatus;
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
        if (!(object instanceof MvExpedientesGral)) {
            return false;
        }
        MvExpedientesGral other = (MvExpedientesGral) object;
        if ((this.nunicodoc == null && other.nunicodoc != null) || (this.nunicodoc != null && !this.nunicodoc.equals(other.nunicodoc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.adea.ws.bbvaAdquis.MvExpedientesGral[ nunicodoc=" + nunicodoc + " ]";
    }

}
