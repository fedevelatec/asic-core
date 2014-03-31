package com.fedevela.core.security.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "TRANSACCION_WEBMX", catalog = "", schema = "MEXWEB")
public class TransaccionWebmx implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PK_AUTOGEN")
    @SequenceGenerator(name = "PK_AUTOGEN", sequenceName = "MEXWEB.FOLIOTRANSACCION", allocationSize = 1)
    @Column(name = "FOLIO")
    private Long folio;
    @Column(name = "FECHATRANSACCION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechatransaccion;
    @Basic(optional = false)
    @Column(name = "TRANSACCION")
    private String transaccion;
    @Column(name = "DETALLE")
    private String detalle;
    @Basic(optional = false)
    @Column(name = "IDAPLICACION")
    private double idaplicacion;
    @Basic(optional = false)
    @Column(name = "LOGIN")
    private String login;
    @Basic(optional = false)
    @Column(name = "FECHALOGIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechalogin;

    public TransaccionWebmx() {
    }

    public TransaccionWebmx(Long folio) {
        this.folio = folio;
    }

    public TransaccionWebmx(Long folio, String transaccion, double idaplicacion) {
        this.folio = folio;
        this.transaccion = transaccion;
        this.idaplicacion = idaplicacion;
    }

    public Long getFolio() {
        return folio;
    }

    public void setFolio(Long folio) {
        this.folio = folio;
    }

    public Date getFechatransaccion() {
        return fechatransaccion;
    }

    public void setFechatransaccion(Date fechatransaccion) {
        this.fechatransaccion = fechatransaccion;
    }

    public String getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(String transaccion) {
        this.transaccion = transaccion;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public double getIdaplicacion() {
        return idaplicacion;
    }

    public void setIdaplicacion(double idaplicacion) {
        this.idaplicacion = idaplicacion;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Date getFechalogin() {
        return fechalogin;
    }

    public void setFechalogin(Date fechalogin) {
        this.fechalogin = fechalogin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (folio != null ? folio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TransaccionWebmx)) {
            return false;
        }
        TransaccionWebmx other = (TransaccionWebmx) object;
        if ((this.folio == null && other.folio != null) || (this.folio != null && !this.folio.equals(other.folio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.security.pojos.TransaccionWebmx[folio=" + folio + "]";
    }
}
