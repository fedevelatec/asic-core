package com.fedevela.core.avaluo.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "AV_STATUS_DIG", catalog = "", schema = "PROD")
@NamedQueries({
        @NamedQuery(name = "AvStatusDig.findAll", query = "SELECT a FROM AvStatusDig a"),
        @NamedQuery(name = "AvStatusDig.findByNunicodoc", query = "SELECT a FROM AvStatusDig a WHERE a.avStatusDigPK.nunicodoc = :nunicodoc"),
        @NamedQuery(name = "AvStatusDig.findByNunicodoct", query = "SELECT a FROM AvStatusDig a WHERE a.avStatusDigPK.nunicodoct = :nunicodoct"),
        @NamedQuery(name = "AvStatusDig.findByFecha", query = "SELECT a FROM AvStatusDig a WHERE a.avStatusDigPK.fecha = :fecha"),
        @NamedQuery(name = "AvStatusDig.findByStatus", query = "SELECT a FROM AvStatusDig a WHERE a.status = :status"),
        @NamedQuery(name = "AvStatusDig.findByUsuario", query = "SELECT a FROM AvStatusDig a WHERE a.usuario = :usuario")})
public class AvStatusDig implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AvStatusDigPK avStatusDigPK;
    @Basic(optional = false)
    @Column(name = "STATUS")
    private BigInteger status;
    @Basic(optional = false)
    @Column(name = "USUARIO")
    private String usuario;
    @JoinColumns({
            @JoinColumn(name = "NUNICODOC", referencedColumnName = "NUNICODOC", insertable = false, updatable = false),
            @JoinColumn(name = "NUNICODOCT", referencedColumnName = "NUNICODOCT", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private AvDocumentoAvaluo avDocumentoAvaluo;

    public AvStatusDig() {
    }

    public AvStatusDig(AvStatusDigPK avStatusDigPK) {
        this.avStatusDigPK = avStatusDigPK;
    }

    public AvStatusDig(AvStatusDigPK avStatusDigPK, BigInteger status, String usuario) {
        this.avStatusDigPK = avStatusDigPK;
        this.status = status;
        this.usuario = usuario;
    }

    public AvStatusDig(int nunicodoc, long nunicodoct, Date fecha) {
        this.avStatusDigPK = new AvStatusDigPK(nunicodoc, nunicodoct, fecha);
    }

    public AvStatusDigPK getAvStatusDigPK() {
        return avStatusDigPK;
    }

    public void setAvStatusDigPK(AvStatusDigPK avStatusDigPK) {
        this.avStatusDigPK = avStatusDigPK;
    }

    public BigInteger getStatus() {
        return status;
    }

    public void setStatus(BigInteger status) {
        this.status = status;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public AvDocumentoAvaluo getAvDocumentoAvaluo() {
        return avDocumentoAvaluo;
    }

    public void setAvDocumentoAvaluo(AvDocumentoAvaluo avDocumentoAvaluo) {
        this.avDocumentoAvaluo = avDocumentoAvaluo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (avStatusDigPK != null ? avStatusDigPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AvStatusDig)) {
            return false;
        }
        AvStatusDig other = (AvStatusDig) object;
        if ((this.avStatusDigPK == null && other.avStatusDigPK != null) || (this.avStatusDigPK != null && !this.avStatusDigPK.equals(other.avStatusDigPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.avaluo.pojos.AvStatusDig[avStatusDigPK=" + avStatusDigPK + "]";
    }

}
