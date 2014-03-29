package com.fedevela.core.hn.originacion.pojos;

/**
 * Created by fvelazquez on 28/03/14.
 */
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "HN_ORIGINACION", catalog = "", schema = "PROD")
@NamedQueries({
        @NamedQuery(name = "HnOriginacion.findAll", query = "SELECT h FROM HnOriginacion h"),
        @NamedQuery(name = "HnOriginacion.findByNunicodoc", query = "SELECT h FROM HnOriginacion h WHERE h.hnOriginacionPK.nunicodoc = :nunicodoc"),
        @NamedQuery(name = "HnOriginacion.findByPeriodo", query = "SELECT h FROM HnOriginacion h WHERE h.hnOriginacionPK.periodo = :periodo"),
        @NamedQuery(name = "HnOriginacion.findByFechaOriginacion", query = "SELECT h FROM HnOriginacion h WHERE h.fechaOriginacion = :fechaOriginacion"),
        @NamedQuery(name = "HnOriginacion.findByLogin", query = "SELECT h FROM HnOriginacion h WHERE h.login = :login"),
        @NamedQuery(name = "HnOriginacion.findByNow", query = "SELECT h FROM HnOriginacion h WHERE h.now = :now")})
public class HnOriginacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected HnOriginacionPK hnOriginacionPK;
    @Column(name = "FECHA_ORIGINACION")
    @Temporal(TemporalType.DATE)
    private Date fechaOriginacion;
    @Basic(optional = false)
    @Column(name = "LOGIN")
    private String login;
    @Basic(optional = false)
    @Column(name = "NOW")
    @Temporal(TemporalType.TIMESTAMP)
    private Date now;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hnOriginacion")
    private List<HnOriginacionCaptura> hnOriginacionCapturaList;

    public HnOriginacion() {
    }

    public HnOriginacion(HnOriginacionPK hnOriginacionPK) {
        this.hnOriginacionPK = hnOriginacionPK;
    }

    public HnOriginacion(HnOriginacionPK hnOriginacionPK, String login, Date now) {
        this.hnOriginacionPK = hnOriginacionPK;
        this.login = login;
        this.now = now;
    }

    public HnOriginacion(BigInteger nunicodoc, String periodo) {
        this.hnOriginacionPK = new HnOriginacionPK(nunicodoc, periodo);
    }

    public HnOriginacionPK getHnOriginacionPK() {
        return hnOriginacionPK;
    }

    public void setHnOriginacionPK(HnOriginacionPK hnOriginacionPK) {
        this.hnOriginacionPK = hnOriginacionPK;
    }

    public Date getFechaOriginacion() {
        return fechaOriginacion;
    }

    public void setFechaOriginacion(Date fechaOriginacion) {
        this.fechaOriginacion = fechaOriginacion;
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

    public List<HnOriginacionCaptura> getHnOriginacionCapturaList() {
        return hnOriginacionCapturaList;
    }

    public void setHnOriginacionCapturaList(List<HnOriginacionCaptura> hnOriginacionCapturaList) {
        this.hnOriginacionCapturaList = hnOriginacionCapturaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hnOriginacionPK != null ? hnOriginacionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HnOriginacion)) {
            return false;
        }
        HnOriginacion other = (HnOriginacion) object;
        if ((this.hnOriginacionPK == null && other.hnOriginacionPK != null) || (this.hnOriginacionPK != null && !this.hnOriginacionPK.equals(other.hnOriginacionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeamx.adeadms.hn.pojos.HnOriginacion[hnOriginacionPK=" + hnOriginacionPK + "]";
    }
}
