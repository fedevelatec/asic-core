package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "FLOW_TRASVASES", schema="PROD")
@NamedQueries({
        @NamedQuery(name = "FlowTrasvases.findAll", query = "SELECT f FROM FlowTrasvases f"),
        @NamedQuery(name = "FlowTrasvases.findByScltcod", query = "SELECT f FROM FlowTrasvases f WHERE f.flowTrasvasesPK.scltcod = :scltcod"),
        @NamedQuery(name = "FlowTrasvases.findByCajaIdOrigen", query = "SELECT f FROM FlowTrasvases f WHERE f.flowTrasvasesPK.cajaIdOrigen = :cajaIdOrigen"),
        @NamedQuery(name = "FlowTrasvases.findByCajaIdDestino", query = "SELECT f FROM FlowTrasvases f WHERE f.flowTrasvasesPK.cajaIdDestino = :cajaIdDestino"),
        @NamedQuery(name = "FlowTrasvases.findByFecha", query = "SELECT f FROM FlowTrasvases f WHERE f.fecha = :fecha"),
        @NamedQuery(name = "FlowTrasvases.findByUsuario", query = "SELECT f FROM FlowTrasvases f WHERE f.usuario = :usuario")})
public class FlowTrasvases implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FlowTrasvasesPK flowTrasvasesPK;
    @Column(name = "FECHA")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "USUARIO")
    private String usuario;

    public FlowTrasvases() {
    }

    public FlowTrasvases(FlowTrasvasesPK flowTrasvasesPK) {
        this.flowTrasvasesPK = flowTrasvasesPK;
    }

    public FlowTrasvases(short scltcod, Long cajaIdOrigen, Long cajaIdDestino) {
        this.flowTrasvasesPK = new FlowTrasvasesPK(scltcod, cajaIdOrigen, cajaIdDestino);
    }

    public FlowTrasvasesPK getFlowTrasvasesPK() {
        return flowTrasvasesPK;
    }

    public void setFlowTrasvasesPK(FlowTrasvasesPK flowTrasvasesPK) {
        this.flowTrasvasesPK = flowTrasvasesPK;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (flowTrasvasesPK != null ? flowTrasvasesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FlowTrasvases)) {
            return false;
        }
        FlowTrasvases other = (FlowTrasvases) object;
        if ((this.flowTrasvasesPK == null && other.flowTrasvasesPK != null) || (this.flowTrasvasesPK != null && !this.flowTrasvasesPK.equals(other.flowTrasvasesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.adea.pojos.FlowTrasvases[flowTrasvasesPK=" + flowTrasvasesPK + "]";
    }

}
