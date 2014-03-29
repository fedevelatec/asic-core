package com.fedevela.core.hn.originacion.pojos;

/**
 * Created by fvelazquez on 28/03/14.
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author avillalobos
 */
@Entity
@Table(name = "HN_ORIGINACION_CAPTURA", catalog = "", schema = "PROD")
@NamedQueries({
        @NamedQuery(name = "HnOriginacionCaptura.findAll", query = "SELECT h FROM HnOriginacionCaptura h"),
        @NamedQuery(name = "HnOriginacionCaptura.findByNunicodoc", query = "SELECT h FROM HnOriginacionCaptura h WHERE h.hnOriginacionCapturaPK.nunicodoc = :nunicodoc"),
        @NamedQuery(name = "HnOriginacionCaptura.findByPeriodo", query = "SELECT h FROM HnOriginacionCaptura h WHERE h.hnOriginacionCapturaPK.periodo = :periodo"),
        @NamedQuery(name = "HnOriginacionCaptura.findByDoccod", query = "SELECT h FROM HnOriginacionCaptura h WHERE h.hnOriginacionCapturaPK.doccod = :doccod"),
        @NamedQuery(name = "HnOriginacionCaptura.findByValor", query = "SELECT h FROM HnOriginacionCaptura h WHERE h.valor = :valor"),
        @NamedQuery(name = "HnOriginacionCaptura.findByLogin", query = "SELECT h FROM HnOriginacionCaptura h WHERE h.login = :login"),
        @NamedQuery(name = "HnOriginacionCaptura.findByNow", query = "SELECT h FROM HnOriginacionCaptura h WHERE h.now = :now")})
public class HnOriginacionCaptura implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected HnOriginacionCapturaPK hnOriginacionCapturaPK;
    @Column(name = "VALOR")
    private String valor;
    @Basic(optional = false)
    @Column(name = "LOGIN")
    private String login;
    @Basic(optional = false)
    @Column(name = "NOW")
    @Temporal(TemporalType.TIMESTAMP)
    private Date now;
    @JoinColumns({
            @JoinColumn(name = "NUNICODOC", referencedColumnName = "NUNICODOC", insertable = false, updatable = false),
            @JoinColumn(name = "PERIODO", referencedColumnName = "PERIODO", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private HnOriginacion hnOriginacion;
    @JoinColumn(name = "ID_TIPO_VALOR", referencedColumnName = "ID_TIPO_VALOR")
    @ManyToOne(optional = false)
    private HnTiposValores idTipoValor;

    public HnOriginacionCaptura() {
    }

    public HnOriginacionCaptura(HnOriginacionCapturaPK hnOriginacionCapturaPK) {
        this.hnOriginacionCapturaPK = hnOriginacionCapturaPK;
    }

    public HnOriginacionCaptura(HnOriginacionCapturaPK hnOriginacionCapturaPK, String login, Date now) {
        this.hnOriginacionCapturaPK = hnOriginacionCapturaPK;
        this.login = login;
        this.now = now;
    }

    public HnOriginacionCaptura(BigInteger nunicodoc, String periodo, short doccod) {
        this.hnOriginacionCapturaPK = new HnOriginacionCapturaPK(nunicodoc, periodo, doccod);
    }

    public HnOriginacionCapturaPK getHnOriginacionCapturaPK() {
        return hnOriginacionCapturaPK;
    }

    public void setHnOriginacionCapturaPK(HnOriginacionCapturaPK hnOriginacionCapturaPK) {
        this.hnOriginacionCapturaPK = hnOriginacionCapturaPK;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Date getNow() {
        return now;
    }

    public void setNow(Date now) {
        this.now = now;
    }

    public HnOriginacion getHnOriginacion() {
        return hnOriginacion;
    }

    public void setHnOriginacion(HnOriginacion hnOriginacion) {
        this.hnOriginacion = hnOriginacion;
    }

    public HnTiposValores getIdTipoValor() {
        return idTipoValor;
    }

    public void setIdTipoValor(HnTiposValores idTipoValor) {
        this.idTipoValor = idTipoValor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hnOriginacionCapturaPK != null ? hnOriginacionCapturaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HnOriginacionCaptura)) {
            return false;
        }
        HnOriginacionCaptura other = (HnOriginacionCaptura) object;
        if ((this.hnOriginacionCapturaPK == null && other.hnOriginacionCapturaPK != null) || (this.hnOriginacionCapturaPK != null && !this.hnOriginacionCapturaPK.equals(other.hnOriginacionCapturaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeamx.adeadms.hn.pojos.HnOriginacionCaptura[hnOriginacionCapturaPK=" + hnOriginacionCapturaPK + "]";
    }

}
