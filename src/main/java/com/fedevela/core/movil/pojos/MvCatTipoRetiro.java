package com.fedevela.core.movil.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "MV_CAT_TIPO_RETIRO", catalog = "", schema = "PROD")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "MvCatTipoRetiro.findAll", query = "SELECT m FROM MvCatTipoRetiro m"),
        @NamedQuery(name = "MvCatTipoRetiro.findByIdTipoRetiro", query = "SELECT m FROM MvCatTipoRetiro m WHERE m.idTipoRetiro = :idTipoRetiro"),
        @NamedQuery(name = "MvCatTipoRetiro.findByDescripcion", query = "SELECT m FROM MvCatTipoRetiro m WHERE m.descripcion = :descripcion"),
        @NamedQuery(name = "MvCatTipoRetiro.findByFechaAlta", query = "SELECT m FROM MvCatTipoRetiro m WHERE m.fechaAlta = :fechaAlta"),
        @NamedQuery(name = "MvCatTipoRetiro.findByFechaCambio", query = "SELECT m FROM MvCatTipoRetiro m WHERE m.fechaCambio = :fechaCambio"),
        @NamedQuery(name = "MvCatTipoRetiro.findByUsuario", query = "SELECT m FROM MvCatTipoRetiro m WHERE m.usuario = :usuario")})
public class MvCatTipoRetiro implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_TIPO_RETIRO")
    private Long idTipoRetiro;
    @Basic(optional = false)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "FECHA_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;
    @Column(name = "FECHA_CAMBIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCambio;
    @Column(name = "USUARIO")
    private String usuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoRetiro")
    private List<MvRetiroCabServicio> mvRetiroCabServicioList;

    public MvCatTipoRetiro() {
    }

    public MvCatTipoRetiro(Long idTipoRetiro) {
        this.idTipoRetiro = idTipoRetiro;
    }

    public MvCatTipoRetiro(Long idTipoRetiro, String descripcion, Date fechaAlta) {
        this.idTipoRetiro = idTipoRetiro;
        this.descripcion = descripcion;
        this.fechaAlta = fechaAlta;
    }

    public Long getIdTipoRetiro() {
        return idTipoRetiro;
    }

    public void setIdTipoRetiro(Long idTipoRetiro) {
        this.idTipoRetiro = idTipoRetiro;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Date getFechaCambio() {
        return fechaCambio;
    }

    public void setFechaCambio(Date fechaCambio) {
        this.fechaCambio = fechaCambio;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @XmlTransient
    public List<MvRetiroCabServicio> getMvRetiroCabServicioList() {
        return mvRetiroCabServicioList;
    }

    public void setMvRetiroCabServicioList(List<MvRetiroCabServicio> mvRetiroCabServicioList) {
        this.mvRetiroCabServicioList = mvRetiroCabServicioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoRetiro != null ? idTipoRetiro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MvCatTipoRetiro)) {
            return false;
        }
        MvCatTipoRetiro other = (MvCatTipoRetiro) object;
        if ((this.idTipoRetiro == null && other.idTipoRetiro != null) || (this.idTipoRetiro != null && !this.idTipoRetiro.equals(other.idTipoRetiro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.movil.pojos.MvCatTipoRetiro[ idTipoRetiro=" + idTipoRetiro + " ]";
    }

}
