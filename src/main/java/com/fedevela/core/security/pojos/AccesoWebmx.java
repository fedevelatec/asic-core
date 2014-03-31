package com.fedevela.core.security.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import org.codehaus.jackson.annotate.JsonIgnore;

@Entity
@Table(name = "ACCESO_WEBMX", catalog = "", schema = "MEXWEB")
public class AccesoWebmx implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AccesoWebmxPK accesoWebmxPK;
    @Column(name = "FECHALOGOUT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechalogout;
    @Basic(optional = false)
    @Column(name = "IP")
    private String ip;
    @JoinColumn(name = "LOGIN", referencedColumnName = "LOGIN", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private UsuarioWebmx usuarioWebmx;
    @OneToMany(cascade = CascadeType.ALL)
    private List<TransaccionWebmx> transaccionWebmxList;

    public AccesoWebmx() {
    }

    public AccesoWebmx(AccesoWebmxPK accesoWebmxPK) {
        this.accesoWebmxPK = accesoWebmxPK;
    }

    public AccesoWebmx(AccesoWebmxPK accesoWebmxPK, String ip) {
        this.accesoWebmxPK = accesoWebmxPK;
        this.ip = ip;
    }

    public AccesoWebmx(String login, Date fechalogin) {
        this.accesoWebmxPK = new AccesoWebmxPK(login, fechalogin);
    }

    public AccesoWebmxPK getAccesoWebmxPK() {
        return accesoWebmxPK;
    }

    public void setAccesoWebmxPK(AccesoWebmxPK accesoWebmxPK) {
        this.accesoWebmxPK = accesoWebmxPK;
    }

    public Date getFechalogout() {
        return fechalogout;
    }

    public void setFechalogout(Date fechalogout) {
        this.fechalogout = fechalogout;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public UsuarioWebmx getUsuarioWebmx() {
        return usuarioWebmx;
    }

    public void setUsuarioWebmx(UsuarioWebmx usuarioWebmx) {
        this.usuarioWebmx = usuarioWebmx;
    }

    @JsonIgnore
    public List<TransaccionWebmx> getTransaccionWebmxList() {
        return transaccionWebmxList;
    }

    public void setTransaccionWebmxList(List<TransaccionWebmx> transaccionWebmxList) {
        this.transaccionWebmxList = transaccionWebmxList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accesoWebmxPK != null ? accesoWebmxPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AccesoWebmx)) {
            return false;
        }
        AccesoWebmx other = (AccesoWebmx) object;
        if ((this.accesoWebmxPK == null && other.accesoWebmxPK != null) || (this.accesoWebmxPK != null && !this.accesoWebmxPK.equals(other.accesoWebmxPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.security.pojos.AccesoWebmx[accesoWebmxPK=" + accesoWebmxPK + "]";
    }
}
