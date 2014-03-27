package com.fedevela.core.asic.notificacion.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "NOTIFICACIONES_CAB", catalog = "", schema = "PROD")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "NotificacionesCab.findAll", query = "SELECT n FROM NotificacionesCab n")})
public class NotificacionesCab implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_PROCESO")
    private Long idProceso;
    @Basic(optional = false)
    @Column(name = "SCLTCOD")
    private Long scltcod;
    @Basic(optional = false)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "USUARIO")
    private String usuario;
    @Basic(optional = false)
    @Column(name = "FECHA_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;
    @Basic(optional = false)
    @Column(name = "FECHA_CAMBIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCambio;

    public NotificacionesCab() {
    }

    public NotificacionesCab(Long idProceso) {
        this.idProceso = idProceso;
    }

    public NotificacionesCab(Long idProceso, Long scltcod, String descripcion, String usuario, Date fechaAlta, Date fechaCambio) {
        this.idProceso = idProceso;
        this.scltcod = scltcod;
        this.descripcion = descripcion;
        this.usuario = usuario;
        this.fechaAlta = fechaAlta;
        this.fechaCambio = fechaCambio;
    }

    public Long getIdProceso() {
        return idProceso;
    }

    public void setIdProceso(Long idProceso) {
        this.idProceso = idProceso;
    }

    public Long getScltcod() {
        return scltcod;
    }

    public void setScltcod(Long scltcod) {
        this.scltcod = scltcod;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Date getFechaCambio() {
        return fechaCambio;
    }

    public void setFechaCambio(Date fechaCambio) {
        this.fechaCambio = fechaCambio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProceso != null ? idProceso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NotificacionesCab)) {
            return false;
        }
        NotificacionesCab other = (NotificacionesCab) object;
        if ((this.idProceso == null && other.idProceso != null) || (this.idProceso != null && !this.idProceso.equals(other.idProceso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeamx.dms.bbva.expunico.lib.pojos.NotificacionesCab[ idProceso=" + idProceso + " ]";
    }

}
