package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "FLOW_INGRESO_SUCURSALES", catalog = "", schema = "PROD")
@XmlRootElement
public class FlowIngresoSucursales implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FlowIngresoSucursalesPK flowIngresoSucursalesPK;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "CENTRO_COSTO")
    private String centroCosto;
    @Column(name = "DOMICILIO")
    private String domicilio;
    @Column(name = "TELEFONO")
    private String telefono;
    @Column(name = "STATUS")
    private Character status;

    public FlowIngresoSucursales() {
    }

    public FlowIngresoSucursales(FlowIngresoSucursalesPK flowIngresoSucursalesPK) {
        this.flowIngresoSucursalesPK = flowIngresoSucursalesPK;
    }

    public FlowIngresoSucursales(Long scltcod, Long ssccod) {
        this.flowIngresoSucursalesPK = new FlowIngresoSucursalesPK(scltcod, ssccod);
    }

    public FlowIngresoSucursalesPK getFlowIngresoSucursalesPK() {
        return flowIngresoSucursalesPK;
    }

    public void setFlowIngresoSucursalesPK(FlowIngresoSucursalesPK flowIngresoSucursalesPK) {
        this.flowIngresoSucursalesPK = flowIngresoSucursalesPK;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCentroCosto() {
        return centroCosto;
    }

    public void setCentroCosto(String centroCosto) {
        this.centroCosto = centroCosto;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }


    /**
     *
     * @return
     */
    public String getDisplayField() {
        return centroCosto + " - " + descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (flowIngresoSucursalesPK != null ? flowIngresoSucursalesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FlowIngresoSucursales)) {
            return false;
        }
        FlowIngresoSucursales other = (FlowIngresoSucursales) object;
        if ((this.flowIngresoSucursalesPK == null && other.flowIngresoSucursalesPK != null) || (this.flowIngresoSucursalesPK != null && !this.flowIngresoSucursalesPK.equals(other.flowIngresoSucursalesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.adea.pojos.FlowIngresoSucursales[ flowIngresoSucursalesPK=" + flowIngresoSucursalesPK + " ]";
    }
}
