package com.fedevela.core.security.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "BLOQUEO_USUARIO_WEBMX", catalog = "", schema = "MEXWEB")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "BloqueoUsuarioWebmx.findAll", query = "SELECT b FROM BloqueoUsuarioWebmx b") })
public class BloqueoUsuarioWebmx implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "USUARIO")
    private String usuario;
    @Basic(optional = false)
    @Column(name = "MAQUINA")
    private String maquina;
    @Basic(optional = false)
    @Column(name = "IP")
    private String ip;
    @Basic(optional = false)
    @Column(name = "FECHA_BLOQUEO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaBloqueo;
    @Basic(optional = false)
    @Column(name = "APLICACION")
    private String aplicacion;

    public BloqueoUsuarioWebmx() {
    }

    public BloqueoUsuarioWebmx(String usuario) {
        this.usuario = usuario;
    }

    public BloqueoUsuarioWebmx(String usuario, String maquina, String ip, Date fechaBloqueo, String aplicacion) {
        this.usuario = usuario;
        this.maquina = maquina;
        this.ip = ip;
        this.fechaBloqueo = fechaBloqueo;
        this.aplicacion = aplicacion;
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

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getFechaBloqueo() {
        return fechaBloqueo;
    }

    public void setFechaBloqueo(Date fechaBloqueo) {
        this.fechaBloqueo = fechaBloqueo;
    }

    public String getAplicacion() {
        return aplicacion;
    }

    public void setAplicacion(String aplicacion) {
        this.aplicacion = aplicacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usuario != null ? usuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BloqueoUsuarioWebmx)) {
            return false;
        }
        BloqueoUsuarioWebmx other = (BloqueoUsuarioWebmx) object;
        if ((this.usuario == null && other.usuario != null) || (this.usuario != null && !this.usuario.equals(other.usuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.adea.webmx.pojos.BloqueoUsuarioWebmx[ usuario=" + usuario + " ]";
    }

}
