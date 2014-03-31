package com.fedevela.core.movil.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author admin
 */
@Entity
@Table(name = "MV_RETIRO_CANCELADO_GRAL", schema="PROD")
@XmlRootElement
public class MvRetiroCanceladoGral implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_RETIRO")
    private Long idRetiro;
    @Basic(optional = false)
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @Basic(optional = false)
    @Column(name = "TIPO")
    private Long tipo;
    @JoinColumn(name = "ID_RETIRO", referencedColumnName = "ID_RETIRO", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private MvRetiroGral mvRetiroGral;

    public MvRetiroCanceladoGral() {
    }

    public MvRetiroCanceladoGral(Long idRetiro) {
        this.idRetiro = idRetiro;
    }

    public MvRetiroCanceladoGral(Long idRetiro, String observaciones, Long tipo) {
        this.idRetiro = idRetiro;
        this.observaciones = observaciones;
        this.tipo = tipo;
    }

    public Long getIdRetiro() {
        return idRetiro;
    }

    public void setIdRetiro(Long idRetiro) {
        this.idRetiro = idRetiro;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Long getTipo() {
        return tipo;
    }

    public void setTipo(Long tipo) {
        this.tipo = tipo;
    }

    /*
    public MvRetiroGral getMvRetiroGral() {
        return mvRetiroGral;
    }

    public void setMvRetiroGral(MvRetiroGral mvRetiroGral) {
        this.mvRetiroGral = mvRetiroGral;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRetiro != null ? idRetiro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MvRetiroCanceladoGral)) {
            return false;
        }
        MvRetiroCanceladoGral other = (MvRetiroCanceladoGral) object;
        if ((this.idRetiro == null && other.idRetiro != null) || (this.idRetiro != null && !this.idRetiro.equals(other.idRetiro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.adea.ws.bbvaAdquis.MvRetiroCanceladoGral[ idRetiro=" + idRetiro + " ]";
    }

}
