package com.fedevela.core.movil.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.PrimaryKeyJoinColumns;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jmejia
 */
@Entity
@Table(name = "MV_RETIRO_DETA_PRECINTO", schema = "PROD")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "MvRetiroDetaPrecinto.findAll", query = "SELECT m FROM MvRetiroDetaPrecinto m"),
        @NamedQuery(name = "MvRetiroDetaPrecinto.findByIdRetiro", query = "SELECT m FROM MvRetiroDetaPrecinto m WHERE m.mvRetiroDetaPrecintoPK.idRetiro = :idRetiro"),
        @NamedQuery(name = "MvRetiroDetaPrecinto.findByCajaId", query = "SELECT m FROM MvRetiroDetaPrecinto m WHERE m.mvRetiroDetaPrecintoPK.cajaId = :cajaId"),
        @NamedQuery(name = "MvRetiroDetaPrecinto.findByPrecinto1", query = "SELECT m FROM MvRetiroDetaPrecinto m WHERE m.precinto1 = :precinto1"),
        @NamedQuery(name = "MvRetiroDetaPrecinto.findByPrecinto2", query = "SELECT m FROM MvRetiroDetaPrecinto m WHERE m.precinto2 = :precinto2")})
public class MvRetiroDetaPrecinto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    protected MvRetiroDetaPrecintoPK mvRetiroDetaPrecintoPK;
    @Basic(optional = false)
    @Column(name = "PRECINTO1", nullable = false, length = 10)
    private String precinto1;
    @Basic(optional = false)
    @Column(name = "PRECINTO2", nullable = false, length = 10)
    private String precinto2;
    //@OneToOne

    @JoinColumns({
            @JoinColumn(name = "ID_RETIRO", referencedColumnName = "ID_RETIRO", insertable = false, updatable = false),
            @JoinColumn(name = "CAJA_ID", referencedColumnName = "ETIQUETA", insertable = false, updatable = false)})
    @ManyToOne
    private MvRetiroDeta mvRetiroDeta;
//    @PrimaryKeyJoinColumns({
//        @PrimaryKeyJoinColumn(name = "ID_RETIRO", referencedColumnName = "ID_RETIRO"),
//        @PrimaryKeyJoinColumn(name = "CAJA_ID", referencedColumnName = "ETIQUETA")
//    })

    public MvRetiroDetaPrecinto() {
    }

    public MvRetiroDetaPrecinto(MvRetiroDetaPrecintoPK mvRetiroDetaPrecintoPK) {
        this.mvRetiroDetaPrecintoPK = mvRetiroDetaPrecintoPK;
    }

    public MvRetiroDetaPrecinto(MvRetiroDetaPrecintoPK mvRetiroDetaPrecintoPK, String precinto1, String precinto2) {
        this.mvRetiroDetaPrecintoPK = mvRetiroDetaPrecintoPK;
        this.precinto1 = precinto1;
        this.precinto2 = precinto2;
    }

    public MvRetiroDetaPrecinto(long idRetiro, long cajaId) {
        this.mvRetiroDetaPrecintoPK = new MvRetiroDetaPrecintoPK(idRetiro, cajaId);
    }

    public MvRetiroDetaPrecintoPK getMvRetiroDetaPrecintoPK() {
        return mvRetiroDetaPrecintoPK;
    }

    public void setMvRetiroDetaPrecintoPK(MvRetiroDetaPrecintoPK mvRetiroDetaPrecintoPK) {
        this.mvRetiroDetaPrecintoPK = mvRetiroDetaPrecintoPK;
    }

    public String getPrecinto1() {
        return precinto1;
    }

    public void setPrecinto1(String precinto1) {
        this.precinto1 = precinto1;
    }

    public String getPrecinto2() {
        return precinto2;
    }

    public void setPrecinto2(String precinto2) {
        this.precinto2 = precinto2;
    }

    public MvRetiroDeta getMvRetiroDeta() {
        return mvRetiroDeta;
    }

    public void setMvRetiroDeta(MvRetiroDeta mvRetiroDeta) {
        this.mvRetiroDeta = mvRetiroDeta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mvRetiroDetaPrecintoPK != null ? mvRetiroDetaPrecintoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MvRetiroDetaPrecinto)) {
            return false;
        }
        MvRetiroDetaPrecinto other = (MvRetiroDetaPrecinto) object;
        if ((this.mvRetiroDetaPrecintoPK == null && other.mvRetiroDetaPrecintoPK != null) || (this.mvRetiroDetaPrecintoPK != null && !this.mvRetiroDetaPrecintoPK.equals(other.mvRetiroDetaPrecintoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adea.entity.pojos.MvRetiroDetaPrecinto[ mvRetiroDetaPrecintoPK=" + mvRetiroDetaPrecintoPK + " ]";
    }

}
