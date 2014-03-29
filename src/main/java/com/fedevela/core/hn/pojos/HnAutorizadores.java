package com.fedevela.core.hn.pojos;

/**
 * Created by fvelazquez on 28/03/14.
 */
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "HN_AUTORIZADORES", catalog = "", schema = "PROD")
public class HnAutorizadores implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected HnAutorizadoresPK hnAutorizadoresPK;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "INGRESOS")
    private Character ingresos;
    @Column(name = "LOGIN")
    private String login;
    @JoinColumn(name = "IDOPERADOR", referencedColumnName = "IDOPERADOR", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private HnAutorizadoresDeta hnAutorizadoresDeta;

    public HnAutorizadores() {
    }

    public HnAutorizadores(HnAutorizadoresPK hnAutorizadoresPK) {
        this.hnAutorizadoresPK = hnAutorizadoresPK;
    }

    public HnAutorizadores(BigInteger numAutoriz, short status, BigInteger idoperador) {
        this.hnAutorizadoresPK = new HnAutorizadoresPK(numAutoriz, status, idoperador);
    }

    public HnAutorizadoresPK getHnAutorizadoresPK() {
        return hnAutorizadoresPK;
    }

    public void setHnAutorizadoresPK(HnAutorizadoresPK hnAutorizadoresPK) {
        this.hnAutorizadoresPK = hnAutorizadoresPK;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Character getIngresos() {
        return ingresos;
    }

    public void setIngresos(Character ingresos) {
        this.ingresos = ingresos;
    }

    public HnAutorizadoresDeta getHnAutorizadoresDeta() {
        return hnAutorizadoresDeta;
    }

    public void setHnAutorizadoresDeta(HnAutorizadoresDeta hnAutorizadoresDeta) {
        this.hnAutorizadoresDeta = hnAutorizadoresDeta;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hnAutorizadoresPK != null ? hnAutorizadoresPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HnAutorizadores)) {
            return false;
        }
        HnAutorizadores other = (HnAutorizadores) object;
        if ((this.hnAutorizadoresPK == null && other.hnAutorizadoresPK != null) || (this.hnAutorizadoresPK != null && !this.hnAutorizadoresPK.equals(other.hnAutorizadoresPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeamx.adeadms.fovissste.pojos.so.HnAutorizadores[hnAutorizadoresPK=" + hnAutorizadoresPK + "]";
    }
}
