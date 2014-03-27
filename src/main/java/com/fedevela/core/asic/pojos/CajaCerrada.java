package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="CAJA_CERRADA", schema="PROD")
public class CajaCerrada implements Serializable {
    @Id
    @Column(name="CAJA_ID")
    private Long cajaId;
    @Column(name="IP_CIERRE")
    private String ipCierre;
    @Column(name="USUARIO")
    private String usuario;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="FECHA")
    private Date fecha;
    @Column(name="MAQUINA")
    private String maquina;
    @Column(name="APLICACION")
    private String aplicacion;

    public CajaCerrada() {
    }

    public CajaCerrada(Long cajaId) {
        this.cajaId = cajaId;
    }

    @Override
    public String toString() {
        return "CajaCerrada{" + "cajaId=" + cajaId + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CajaCerrada other = (CajaCerrada) obj;
        if (this.cajaId != other.cajaId && (this.cajaId == null || !this.cajaId.equals(other.cajaId))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + (this.cajaId != null ? this.cajaId.hashCode() : 0);
        return hash;
    }

    public Long getCajaId() {
        return cajaId;
    }

    public void setCajaId(Long cajaId) {
        this.cajaId = cajaId;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getIpCierre() {
        return ipCierre;
    }

    public void setIpCierre(String ipCierre) {
        this.ipCierre = ipCierre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getAplicacion() {
        return aplicacion;
    }

    public void setAplicacion(String aplicacion) {
        this.aplicacion = aplicacion;
    }

    public String getMaquina() {
        return maquina;
    }

    public void setMaquina(String maquina) {
        this.maquina = maquina;
    }
}
