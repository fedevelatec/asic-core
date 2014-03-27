package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "FLOW_INGRESOS_CAJA_MP", catalog = "", schema = "PROD")
@XmlRootElement
public class FlowIngresosCajaMp implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FlowIngresosCajaMpPK flowIngresosCajaMpPK;
    @Basic(optional = false)
    @Column(name = "STATUS")
    private Short status;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @JoinColumn(name = "IDRECIBO", referencedColumnName = "IDRECIBO", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private FlowIngresosCabMp flowIngresosCabMp;
    @JoinColumn(name = "CAJA_ID", referencedColumnName = "CAJA_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Caja caja;

    public FlowIngresosCajaMp() {
    }

    public FlowIngresosCajaMp(FlowIngresosCajaMpPK flowIngresosCajaMpPK) {
        this.flowIngresosCajaMpPK = flowIngresosCajaMpPK;
    }

    public FlowIngresosCajaMp(FlowIngresosCajaMpPK flowIngresosCajaMpPK, Short status) {
        this.flowIngresosCajaMpPK = flowIngresosCajaMpPK;
        this.status = status;
    }

    public FlowIngresosCajaMp(Long idrecibo, Long cajaId) {
        this.flowIngresosCajaMpPK = new FlowIngresosCajaMpPK(idrecibo, cajaId);
    }

    public FlowIngresosCajaMpPK getFlowIngresosCajaMpPK() {
        return flowIngresosCajaMpPK;
    }

    public void setFlowIngresosCajaMpPK(FlowIngresosCajaMpPK flowIngresosCajaMpPK) {
        this.flowIngresosCajaMpPK = flowIngresosCajaMpPK;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public FlowIngresosCabMp getFlowIngresosCabMp() {
        return flowIngresosCabMp;
    }

    public void setFlowIngresosCabMp(FlowIngresosCabMp flowIngresosCabMp) {
        this.flowIngresosCabMp = flowIngresosCabMp;
    }

    public Caja getCaja() {
        return caja;
    }

    public void setCaja(Caja caja) {
        this.caja = caja;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (flowIngresosCajaMpPK != null ? flowIngresosCajaMpPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FlowIngresosCajaMp)) {
            return false;
        }
        FlowIngresosCajaMp other = (FlowIngresosCajaMp) object;
        if ((this.flowIngresosCajaMpPK == null && other.flowIngresosCajaMpPK != null) || (this.flowIngresosCajaMpPK != null && !this.flowIngresosCajaMpPK.equals(other.flowIngresosCajaMpPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.adea.pojos.FlowIngresosCajaMp[ flowIngresosCajaMpPK=" + flowIngresosCajaMpPK + " ]";
    }

}
