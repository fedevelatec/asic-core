package com.fedevela.core.security.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import net.codicentro.core.TypeCast;
import org.codehaus.jackson.annotate.JsonIgnore;

@Entity
@Table(name = "TARJETA_WEBMX", catalog = "", schema = "MEXWEB")
public class TarjetaWebmx implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDTARJETA")
    private Long idtarjeta;
    @Basic(optional = false)
    @Column(name = "FECHAALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaalta;
    @Column(name = "FECHABAJA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechabaja;
    @Basic(optional = false)
    @Column(name = "STATUS")
    private Character status;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @Column(name = "LOGIN")
    private String login;
    /**
     * * **
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tarjetaWebmx")
    private List<ClaveWebmx> claveWebmxList;

    public TarjetaWebmx() {
    }

    public TarjetaWebmx(Long idtarjeta) {
        this.idtarjeta = idtarjeta;
    }

    public TarjetaWebmx(Long idtarjeta, Date fechaalta, char status) {
        this.idtarjeta = idtarjeta;
        this.fechaalta = fechaalta;
        this.status = status;
    }

    public Long getIdtarjeta() {
        return idtarjeta;
    }

    public void setIdtarjeta(Long idtarjeta) {
        this.idtarjeta = idtarjeta;
    }

    public Date getFechaalta() {
        return fechaalta;
    }

    public void setFechaalta(Date fechaalta) {
        this.fechaalta = fechaalta;
    }

    public Date getFechabaja() {
        return fechabaja;
    }

    public void setFechabaja(Date fechabaja) {
        this.fechabaja = fechabaja;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @JsonIgnore
    public List<ClaveWebmx> getClaveWebmxList() {
        return claveWebmxList;
    }

    public void setClaveWebmxList(List<ClaveWebmx> claveWebmxList) {
        this.claveWebmxList = claveWebmxList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtarjeta != null ? idtarjeta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TarjetaWebmx)) {
            return false;
        }
        TarjetaWebmx other = (TarjetaWebmx) object;
        if ((this.idtarjeta == null && other.idtarjeta != null) || (this.idtarjeta != null && !this.idtarjeta.equals(other.idtarjeta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.security.pojos.TarjetaWebmx[idtarjeta=" + idtarjeta + "]";
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * Este método regresa una descripción de lo que se mostraría en un ComboBox
     * por ejemplo.
     *
     * @return
     */
    public String getDisplay() {
        return TypeCast.CF("", "0", 10, idtarjeta);
    }
}
