package com.fedevela.core.movil.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "MV_RETIRO_CAB_SERVICIO", catalog = "", schema = "PROD")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "MvRetiroCabServicio.findAll", query = "SELECT m FROM MvRetiroCabServicio m"),
        @NamedQuery(name = "MvRetiroCabServicio.findByIdRetiro", query = "SELECT m FROM MvRetiroCabServicio m WHERE m.idRetiro = :idRetiro"),
        @NamedQuery(name = "MvRetiroCabServicio.findByEsTrasvase", query = "SELECT m FROM MvRetiroCabServicio m WHERE m.esTrasvase = :esTrasvase")})
public class MvRetiroCabServicio implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_RETIRO")
    private Long idRetiro;
    @Column(name = "ES_TRASVASE")
    private Short esTrasvase;
    @JoinColumn(name = "ID_SERVICIO", referencedColumnName = "ID_SERVICIO")
    @ManyToOne(optional = false)
    private MvServicio idServicio;
    @JoinColumn(name = "ID_RETIRO", referencedColumnName = "ID_RETIRO", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private MvRetiro mvRetiro;
    @JoinColumn(name = "ID_TIPO_RETIRO", referencedColumnName = "ID_TIPO_RETIRO")
    @ManyToOne(optional = false)
    private MvCatTipoRetiro idTipoRetiro;

    @Column(name = "ES_VIGENTE")
    private Short esVigente;

    public MvRetiroCabServicio() {
    }

    public MvRetiroCabServicio(Long idRetiro) {
        this.idRetiro = idRetiro;
    }

    public Long getIdRetiro() {
        return idRetiro;
    }

    public void setIdRetiro(Long idRetiro) {
        this.idRetiro = idRetiro;
    }

    public Short getEsTrasvase() {
        return esTrasvase;
    }

    public void setEsTrasvase(Short esTrasvase) {
        this.esTrasvase = esTrasvase;
    }

    public MvServicio getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(MvServicio idServicio) {
        this.idServicio = idServicio;
    }

    public MvRetiro getMvRetiro() {
        return mvRetiro;
    }

    public void setMvRetiro(MvRetiro mvRetiro) {
        this.mvRetiro = mvRetiro;
    }

    public MvCatTipoRetiro getIdTipoRetiro() {
        return idTipoRetiro;
    }

    public void setIdTipoRetiro(MvCatTipoRetiro idTipoRetiro) {
        this.idTipoRetiro = idTipoRetiro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRetiro != null ? idRetiro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MvRetiroCabServicio)) {
            return false;
        }
        MvRetiroCabServicio other = (MvRetiroCabServicio) object;
        if ((this.idRetiro == null && other.idRetiro != null) || (this.idRetiro != null && !this.idRetiro.equals(other.idRetiro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.movil.pojos.MvRetiroCabServicio[ idRetiro=" + idRetiro + " ]";
    }

    /**
     * @return the esVigente
     */
    public Short getEsVigente() {
        return esVigente;
    }

    /**
     * @param esVigente the esVigente to set
     */
    public void setEsVigente(Short esVigente) {
        this.esVigente = esVigente;
    }

}
