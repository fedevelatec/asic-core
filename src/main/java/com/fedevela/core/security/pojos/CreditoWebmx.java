package com.fedevela.core.security.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "CREDITO_WEBMX", catalog = "", schema = "MEXWEB")
public class CreditoWebmx implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDCREDITO")
    private Long idcredito;
    @Basic(optional = false)
    @Column(name = "NOACCESOS")
    private Integer noaccesos;
    @Basic(optional = false)
    @Column(name = "FECHAINICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechainicio;
    @Basic(optional = false)
    @Column(name = "FECHAFIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechafin;
    @Basic(optional = false)
    @Column(name = "STATUS")
    private Character status;
    @JoinColumn(name = "LOGIN", referencedColumnName = "LOGIN")
    @ManyToOne(optional = false)
    private UsuarioWebmx usuarioWebmx;

    public CreditoWebmx() {
    }

    public CreditoWebmx(Long idcredito) {
        this.idcredito = idcredito;
    }

    public CreditoWebmx(Long idcredito, Integer noaccesos, Date fechainicio, Date fechafin, Character status) {
        this.idcredito = idcredito;
        this.noaccesos = noaccesos;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.status = status;
    }

    public Date getFechafin() {
        return fechafin;
    }

    public void setFechafin(Date fechafin) {
        this.fechafin = fechafin;
    }

    public Date getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    public Long getIdcredito() {
        return idcredito;
    }

    public void setIdcredito(Long idcredito) {
        this.idcredito = idcredito;
    }

    public Integer getNoaccesos() {
        return noaccesos;
    }

    public void setNoaccesos(Integer noaccesos) {
        this.noaccesos = noaccesos;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public UsuarioWebmx getUsuarioWebmx() {
        return usuarioWebmx;
    }

    public void setUsuarioWebmx(UsuarioWebmx usuarioWebmx) {
        this.usuarioWebmx = usuarioWebmx;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CreditoWebmx other = (CreditoWebmx) obj;
        if (this.idcredito != other.idcredito && (this.idcredito == null || !this.idcredito.equals(other.idcredito))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (this.idcredito != null ? this.idcredito.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "CreditoWebmx{" + "idcredito=" + idcredito + ", noaccesos=" + noaccesos + ", fechainicio=" + fechainicio + ", fechafin=" + fechafin + ", status=" + status + ", usuarioWebmx=" + usuarioWebmx + '}';
    }
}
