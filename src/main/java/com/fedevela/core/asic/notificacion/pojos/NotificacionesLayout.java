package com.fedevela.core.asic.notificacion.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "NOTIFICACIONES_LAYOUT", catalog = "", schema = "PROD")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "NotificacionesLayout.findAll", query = "SELECT n FROM NotificacionesLayout n")})
public class NotificacionesLayout implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected NotificacionesLayoutPK notificacionesLayoutPK;
    @Column(name = "DOCCOD")
    private Long doccod;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "CHK_OBS")
    private Long chkObs;
    @Lob
    @Column(name = "DATO")
    private String dato;

    public NotificacionesLayout() {
    }

    public NotificacionesLayout(NotificacionesLayoutPK notificacionesLayoutPK) {
        this.notificacionesLayoutPK = notificacionesLayoutPK;
    }

    public NotificacionesLayout(Long id, Long orden) {
        this.notificacionesLayoutPK = new NotificacionesLayoutPK(id, orden);
    }

    public NotificacionesLayoutPK getNotificacionesLayoutPK() {
        return notificacionesLayoutPK;
    }

    public void setNotificacionesLayoutPK(NotificacionesLayoutPK notificacionesLayoutPK) {
        this.notificacionesLayoutPK = notificacionesLayoutPK;
    }

    public Long getDoccod() {
        return doccod;
    }

    public void setDoccod(Long doccod) {
        this.doccod = doccod;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getChkObs() {
        return chkObs;
    }

    public void setChkObs(Long chkObs) {
        this.chkObs = chkObs;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (notificacionesLayoutPK != null ? notificacionesLayoutPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NotificacionesLayout)) {
            return false;
        }
        NotificacionesLayout other = (NotificacionesLayout) object;
        if ((this.notificacionesLayoutPK == null && other.notificacionesLayoutPK != null) || (this.notificacionesLayoutPK != null && !this.notificacionesLayoutPK.equals(other.notificacionesLayoutPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeamx.dms.bbva.expunico.lib.pojos.NotificacionesLayout[ notificacionesLayoutPK=" + notificacionesLayoutPK + " ]";
    }

}
