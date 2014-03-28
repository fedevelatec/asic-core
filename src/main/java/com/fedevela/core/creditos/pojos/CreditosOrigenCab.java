package com.fedevela.core.creditos.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "CREDITOS_ORIGEN_CAB", schema="PROD")
public class CreditosOrigenCab implements Serializable {
    private static final long serialVersionUID = 1L;
    //@Id
    //@Basic(optional = false)
    //@Column(name = "ID")
    //private Long id;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_SOLICITUD")
    private String idSolicitud;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "TIPO_IDENTIFICACION")
    private String tipoIdentificacion;
    @Basic(optional = false)
    @Column(name = "NO_IDENTIFICACION")
    private String noIdentificacion;
    @Basic(optional = false)
    @Column(name = "MONTO")
    private float monto;
    @Basic(optional = false)
    @Column(name = "PLAZO")
    private String plazo;
    @Column(name = "NO_REFERENCIA")
    private String noReferencia;
    @Basic(optional = false)
    @Column(name = "DEPENDENCIA")
    private String dependencia;
    @Basic(optional = false)
    @Column(name = "STATUS")
    private String status;
    @Column(name = "FECHA_VALIDACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaValidacion;
    @Column(name = "FECHA_ENVIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEnvio;
    @Column(name = "FONDEADOR")
    private int fondeador;
    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "LOG")
    private String log;
    @Column(name = "TIPO_SOLICITUD")
    private int tipoSolicitud;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "creditosOrigenCab", fetch=FetchType.EAGER)
    private Collection<CreditosOrigenDet> creditosOrigenDetCollection;

    public CreditosOrigenCab() {
    }

    public CreditosOrigenCab(String idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public CreditosOrigenCab(String idSolicitud, String nombre, String campo01, String rfc, float monto, String plazo, String noReferencia, String campo04) {
        this.idSolicitud = idSolicitud;
        this.nombre = nombre;
        this.tipoIdentificacion = campo01;
        this.noIdentificacion = rfc;
        this.monto = monto;
        this.plazo = plazo;
        this.noReferencia = noReferencia;
        this.dependencia = campo04;
    }

    public String getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(String idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getNoIdentificacion() {
        return noIdentificacion;
    }

    public void setNoIdentificacion(String noIdentificacion) {
        this.noIdentificacion = noIdentificacion;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public String getPlazo() {
        return plazo;
    }

    public void setPlazo(String plazo) {
        this.plazo = plazo;
    }

    public String getNoReferencia() {
        return noReferencia;
    }

    public void setNoReferencia(String noReferencia) {
        this.noReferencia = noReferencia;
    }

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getFechaValidacion() {
        return fechaValidacion;
    }

    public void setFechaValidacion(Date fechaValidacion) {
        this.fechaValidacion = fechaValidacion;
    }

    public Date getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(Date fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public int getFondeador() {
        return fondeador;
    }

    public void setFondeador(int fondeador) {
        this.fondeador = fondeador;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public int getTipoSolicitud() {
        return tipoSolicitud;
    }

    public void setTipoSolicitud(int tipoSolicitud) {
        this.tipoSolicitud = tipoSolicitud;
    }



    public Collection<CreditosOrigenDet> getCreditosOrigenDetCollection() {
        return creditosOrigenDetCollection;
    }

    public void setCreditosOrigenDetCollection(Collection<CreditosOrigenDet> creditosOrigenDetCollection) {
        this.creditosOrigenDetCollection = creditosOrigenDetCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSolicitud != null ? idSolicitud.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CreditosOrigenCab)) {
            return false;
        }
        CreditosOrigenCab other = (CreditosOrigenCab) object;
        if ((this.idSolicitud == null && other.idSolicitud != null) || (this.idSolicitud != null && !this.idSolicitud.equals(other.idSolicitud))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.creditos.formularios.CreditosOrigenCab[idSolicitud=" + idSolicitud + "]";
    }

}
