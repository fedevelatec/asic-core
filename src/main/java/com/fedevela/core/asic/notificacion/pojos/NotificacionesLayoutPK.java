package com.fedevela.core.asic.notificacion.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class NotificacionesLayoutPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "ORDEN")
    private Long orden;

    public NotificacionesLayoutPK() {
    }

    public NotificacionesLayoutPK(Long id, Long orden) {
        this.id = id;
        this.orden = orden;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrden() {
        return orden;
    }

    public void setOrden(Long orden) {
        this.orden = orden;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += id;
        hash += orden;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NotificacionesLayoutPK)) {
            return false;
        }
        NotificacionesLayoutPK other = (NotificacionesLayoutPK) object;
        if (this.id != other.id) {
            return false;
        }
        if (this.orden != other.orden) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeamx.dms.bbva.expunico.lib.pojos.NotificacionesLayoutPK[ id=" + id + ", orden=" + orden + " ]";
    }

}

