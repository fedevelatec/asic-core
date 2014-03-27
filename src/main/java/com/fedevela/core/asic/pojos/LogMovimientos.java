package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "LOG_MOVIMIENTOS", catalog = "", schema = "PROD")
public class LogMovimientos implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LogMovimientosPK logMovimientosPK;
    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "MAQUINA")
    private String maquina;
    @Column(name = "IP_MAQUINA")
    private String ipMaquina;
    @Basic(optional = false)
    @Column(name = "APLICACION")
    private String aplicacion;
    @Basic(optional = false)
    @Column(name = "MODULO")
    private String modulo;
    @Basic(optional = false)
    @Column(name = "MOVIMIENTO")
    private String movimiento;

    public LogMovimientos() {

    }

    public LogMovimientos(LogMovimientosPK logMovimientosPK) {
        this.logMovimientosPK = logMovimientosPK;
    }

    public LogMovimientos(LogMovimientosPK logMovimientosPK, String aplicacion, String modulo, String movimiento) {
        this.logMovimientosPK = logMovimientosPK;
        this.aplicacion = aplicacion;
        this.modulo = modulo;
        this.movimiento = movimiento;
    }

    public LogMovimientosPK getLogMovimientosPK() {
        return logMovimientosPK;
    }

    public void setLogMovimientosPK(LogMovimientosPK logMovimientosPK) {
        this.logMovimientosPK = logMovimientosPK;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getMaquina() {
        return maquina;
    }

    public void setMaquina(String maquina) {
        this.maquina = maquina;
    }

    public String getIpMaquina() {
        return ipMaquina;
    }

    public void setIpMaquina(String ipMaquina) {
        this.ipMaquina = ipMaquina;
    }

    public String getAplicacion() {
        return aplicacion;
    }

    public void setAplicacion(String aplicacion) {
        this.aplicacion = aplicacion;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public String getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(String movimiento) {
        this.movimiento = movimiento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (logMovimientosPK != null ? logMovimientosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LogMovimientos)) {
            return false;
        }
        LogMovimientos other = (LogMovimientos) object;
        if ((this.logMovimientosPK == null && other.logMovimientosPK != null) || (this.logMovimientosPK != null && !this.logMovimientosPK.equals(other.logMovimientosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.adea.pojos.LogMovimientos[logMovimientosPK=" + logMovimientosPK + "]";
    }
}
