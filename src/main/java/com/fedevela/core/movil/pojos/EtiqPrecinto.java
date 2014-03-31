package com.fedevela.core.movil.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name = "ETIQ_PRECINTO", catalog = "", schema = "PROD")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "EtiqPrecinto.findAll", query = "SELECT e FROM EtiqPrecinto e"),
        @NamedQuery(name = "EtiqPrecinto.findByIdPrecinto", query = "SELECT e FROM EtiqPrecinto e WHERE e.idPrecinto = :idPrecinto"),
        @NamedQuery(name = "EtiqPrecinto.findByCodigoPrecinto", query = "SELECT e FROM EtiqPrecinto e WHERE e.codigoPrecinto = :codigoPrecinto"),
        @NamedQuery(name = "EtiqPrecinto.findByEstatus", query = "SELECT e FROM EtiqPrecinto e WHERE e.estatus = :estatus")})
public class EtiqPrecinto implements Serializable {
    private static final long serialVersionUID = 1L;
    public static final short CREATED = 1;
    public static final short USED = 2;
    public static final short DESTROYED = 3;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation

    //@SequenceGenerator(name = "MvRetiro", sequenceName = "PROD.SEQ_PK_MV_RETIRO", allocationSize = 1)
    @Id
    @Basic(optional = false)
    @Column(name = "ID_PRECINTO")
    @GeneratedValue(strategy = SEQUENCE, generator = "EtiqPrecinto")
    @SequenceGenerator(name = "EtiqPrecinto", sequenceName = "PROD.SQ_ETIQ_PRECINTO")
    private BigDecimal idPrecinto;
    @Basic(optional = false)
    @Column(name = "CODIGO_PRECINTO")
    private String codigoPrecinto;
    @Basic(optional = false)
    @Column(name = "ESTATUS")
    private short estatus;

    public EtiqPrecinto() {
    }

    public EtiqPrecinto(BigDecimal idPrecinto) {
        this.idPrecinto = idPrecinto;
    }

    public EtiqPrecinto(BigDecimal idPrecinto, String codigoPrecinto, short estatus) {
        this.idPrecinto = idPrecinto;
        this.codigoPrecinto = codigoPrecinto;
        this.estatus = estatus;
    }

    public BigDecimal getIdPrecinto() {
        return idPrecinto;
    }

    public void setIdPrecinto(BigDecimal idPrecinto) {
        this.idPrecinto = idPrecinto;
    }

    public String getCodigoPrecinto() {
        return codigoPrecinto;
    }

    public void setCodigoPrecinto(String codigoPrecinto) {
        this.codigoPrecinto = codigoPrecinto;
    }

    public short getEstatus() {
        return estatus;
    }

    public void setEstatus(short estatus) {
        this.estatus = estatus;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPrecinto != null ? idPrecinto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EtiqPrecinto)) {
            return false;
        }
        EtiqPrecinto other = (EtiqPrecinto) object;
        if ((this.idPrecinto == null && other.idPrecinto != null) || (this.idPrecinto != null && !this.idPrecinto.equals(other.idPrecinto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adea.entity.precinto.EtiqPrecinto[ idPrecinto=" + idPrecinto + " ]";
    }

}
