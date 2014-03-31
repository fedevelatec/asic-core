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
@Table(name = "CAT_VEHICULO", catalog = "", schema = "PROD")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "CatVehiculo.findAll", query = "SELECT c FROM CatVehiculo c"),
        @NamedQuery(name = "CatVehiculo.findByIdVehiculo", query = "SELECT c FROM CatVehiculo c WHERE c.idVehiculo = :idVehiculo"),
        @NamedQuery(name = "CatVehiculo.findByDescripcion", query = "SELECT c FROM CatVehiculo c WHERE c.descripcion = :descripcion"),
        @NamedQuery(name = "CatVehiculo.findByFechaAlta", query = "SELECT c FROM CatVehiculo c WHERE c.fechaAlta = :fechaAlta"),
        @NamedQuery(name = "CatVehiculo.findByFechaCambio", query = "SELECT c FROM CatVehiculo c WHERE c.fechaCambio = :fechaCambio"),
        @NamedQuery(name = "CatVehiculo.findByUsuario", query = "SELECT c FROM CatVehiculo c WHERE c.usuario = :usuario")})
public class CatVehiculo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_VEHICULO")
    private Short idVehiculo;
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
    @JoinTable(name = "PROD.MV_VEHICULO_SERVICIO", joinColumns = {
            @JoinColumn(name = "ID_VEHICULO", referencedColumnName = "ID_VEHICULO")}, inverseJoinColumns = {
            @JoinColumn(name = "ID_SERVICIO", referencedColumnName = "ID_SERVICIO")})
    @ManyToMany
    private List<MvServicio> mvServicioList;

    public CatVehiculo() {
    }

    public CatVehiculo(Short idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public CatVehiculo(Short idVehiculo, String descripcion, Date fechaAlta) {
        this.idVehiculo = idVehiculo;
        this.descripcion = descripcion;
        this.fechaAlta = fechaAlta;
    }

    public Short getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(Short idVehiculo) {
        this.idVehiculo = idVehiculo;
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
    public List<MvServicio> getMvServicioList() {
        return mvServicioList;
    }

    public void setMvServicioList(List<MvServicio> mvServicioList) {
        this.mvServicioList = mvServicioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVehiculo != null ? idVehiculo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatVehiculo)) {
            return false;
        }
        CatVehiculo other = (CatVehiculo) object;
        if ((this.idVehiculo == null && other.idVehiculo != null) || (this.idVehiculo != null && !this.idVehiculo.equals(other.idVehiculo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.movil.pojos.CatVehiculo[ idVehiculo=" + idVehiculo + " ]";
    }

}
