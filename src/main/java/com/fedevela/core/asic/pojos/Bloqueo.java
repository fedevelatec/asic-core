package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BLOQUEOS", schema = "PROD")
public class Bloqueo implements java.io.Serializable {

    /**
     * Etiqueta a bloquear
     */
    private Long etiqueta;
    private String usuario;
    private String maquina;
    private String ip;
    private Timestamp fechaBloqueo;
    private String aplicacion;

    public Bloqueo() {
    }

    @Id
    @Column(name = "ETIQUETA", unique = true, nullable = false, precision = 22, scale = 0)
    public Long getEtiqueta() {
        return etiqueta;
    }

    @Column(name = "APLICACION", nullable = false, length = 100)
    public String getAplicacion() {
        return aplicacion;
    }

    @Column(name = "FECHA_BLOQUEO", nullable = false, length = 7, insertable = false)
    public Timestamp getFechaBloqueo() {
        return fechaBloqueo;
    }

    @Column(name = "IP", nullable = false, length = 20)
    public String getIp() {
        return ip;
    }

    @Column(name = "MAQUINA", nullable = false, length = 50)
    public String getMaquina() {
        return maquina;
    }

    @Column(name = "USUARIO", nullable = false, length = 50)
    public String getUsuario() {
        return usuario;
    }

    public void setFechaBloqueo(Timestamp fechaBloqueo) {
        this.fechaBloqueo = fechaBloqueo;
    }

    public void setAplicacion(String aplicacion) {
        this.aplicacion = aplicacion;
    }

    public void setEtiqueta(Long etiqueta) {
        this.etiqueta = etiqueta;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setMaquina(String maquina) {
        this.maquina = maquina;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + (this.etiqueta != null ? this.etiqueta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Bloqueo other = (Bloqueo) obj;
        if (this.etiqueta != other.etiqueta && (this.etiqueta == null || !this.etiqueta.equals(other.etiqueta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Bloqueo{" + "etiqueta=" + etiqueta + ", usuario=" + usuario + ", maquina=" + maquina + ", ip=" + ip + ", fechaBloqueo=" + fechaBloqueo + ", aplicacion=" + aplicacion + '}';
    }
}
