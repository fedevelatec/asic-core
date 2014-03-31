package com.fedevela.core.movil.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import com.fedevela.core.asic.pojos.ScPersonalAutorizado;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author hrodriguez
 */
@Entity
@Table(name = "MV_SERVICIO", catalog = "", schema = "PROD")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "MvServicio.findAll", query = "SELECT m FROM MvServicio m"),
        @NamedQuery(name = "MvServicio.findByIdServicio", query = "SELECT m FROM MvServicio m WHERE m.idServicio = :idServicio"),
        @NamedQuery(name = "MvServicio.findByIdCliente", query = "SELECT m FROM MvServicio m WHERE m.idCliente = :idCliente"),
        @NamedQuery(name = "MvServicio.findByCr", query = "SELECT m FROM MvServicio m WHERE m.cr = :cr"),
        @NamedQuery(name = "MvServicio.findByCantidadOperadores", query = "SELECT m FROM MvServicio m WHERE m.cantidadOperadores = :cantidadOperadores"),
        @NamedQuery(name = "MvServicio.findByFechaInicio", query = "SELECT m FROM MvServicio m WHERE m.fechaInicio = :fechaInicio"),
        @NamedQuery(name = "MvServicio.findByFechaFin", query = "SELECT m FROM MvServicio m WHERE m.fechaFin = :fechaFin")})
public class MvServicio implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_SERVICIO")
    private String idServicio;
    @Basic(optional = false)
    @Column(name = "ID_CLIENTE")
    private short idCliente;
    @Column(name = "CR")
    private String cr;
    @Column(name = "CANTIDAD_OPERADORES")
    private Short cantidadOperadores;
    @Column(name = "FECHA_INICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
    @Column(name = "FECHA_FIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFin;
    @ManyToMany(mappedBy = "mvServicioList")
    private List<CatVehiculo> catVehiculoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idServicio")
    private List<MvRetiroCabServicio> mvRetiroCabServicioList;

    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @Column(name = "ENTREGA")
    private String entrega;

    @JoinColumns({
            @JoinColumn(name = "ID_PERSONAL_RECIBE", referencedColumnName = "ID_PERSONAL"),
            @JoinColumn(name = "ID_CLIENTE_RECIBE", referencedColumnName = "CLIENTE")})
    @ManyToOne
    private ScPersonalAutorizado scPersonalAutorizado;
    @Column(name = "ID_SUCURSAL")
    private Long idSucursal;

    public MvServicio() {
    }

    public MvServicio(String idServicio) {
        this.idServicio = idServicio;
    }

    public MvServicio(String idServicio, short idCliente) {
        this.idServicio = idServicio;
        this.idCliente = idCliente;
    }

    public String getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(String idServicio) {
        this.idServicio = idServicio;
    }

    public short getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(short idCliente) {
        this.idCliente = idCliente;
    }

    public String getCr() {
        return cr;
    }

    public void setCr(String cr) {
        this.cr = cr;
    }

    public Short getCantidadOperadores() {
        return cantidadOperadores;
    }

    public void setCantidadOperadores(Short cantidadOperadores) {
        this.cantidadOperadores = cantidadOperadores;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    @XmlTransient
    public List<CatVehiculo> getCatVehiculoList() {
        return catVehiculoList;
    }

    public void setCatVehiculoList(List<CatVehiculo> catVehiculoList) {
        this.catVehiculoList = catVehiculoList;
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
        hash += (idServicio != null ? idServicio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MvServicio)) {
            return false;
        }
        MvServicio other = (MvServicio) object;
        if ((this.idServicio == null && other.idServicio != null) || (this.idServicio != null && !this.idServicio.equals(other.idServicio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.movil.pojos.MvServicio[ idServicio=" + idServicio + " ]";
    }

    /**
     * @return the observaciones
     */
    public String getObservaciones() {
        return observaciones;
    }

    /**
     * @param observaciones the observaciones to set
     */
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    /**
     * @return the entrega
     */
    public String getEntrega() {
        return entrega;
    }

    /**
     * @param entrega the entrega to set
     */
    public void setEntrega(String entrega) {
        this.entrega = entrega;
    }

    /**
     * @return the scPersonalAutorizado
     */
    public ScPersonalAutorizado getScPersonalAutorizado() {
        return scPersonalAutorizado;
    }

    /**
     * @param scPersonalAutorizado the scPersonalAutorizado to set
     */
    public void setScPersonalAutorizado(ScPersonalAutorizado scPersonalAutorizado) {
        this.scPersonalAutorizado = scPersonalAutorizado;
    }

    public Long getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(Long idSucursal) {
        this.idSucursal = idSucursal;
    }
}
