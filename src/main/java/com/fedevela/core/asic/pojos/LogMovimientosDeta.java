package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="LOG_MOVIMIENTOS_DETA" ,schema="PROD")
public class LogMovimientosDeta  implements java.io.Serializable {

    @EmbeddedId
    private LogMovimientosDetaId id;

    @JoinColumn(name = "ID_MOVIMIENTO", referencedColumnName = "ID_MOVIMIENTO", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private LogMovimientosCab logMovimientosCab;

    @Column(name = "OBSERVACION", length = 50)
    private String observacion;

    public LogMovimientosDeta() {
    }

    public LogMovimientosDeta(LogMovimientosDetaId id, LogMovimientosCab logMovimientosCab) {
        this.id = id;
        this.logMovimientosCab = logMovimientosCab;
    }
    public LogMovimientosDeta(LogMovimientosDetaId id, LogMovimientosCab logMovimientosCab, String observacion) {
        this.id = id;
        this.logMovimientosCab = logMovimientosCab;
        this.observacion = observacion;
    }

    public LogMovimientosDetaId getId() {
        return this.id;
    }

    public void setId(LogMovimientosDetaId id) {
        this.id = id;
    }

    public LogMovimientosCab getLogMovimientosCab() {
        return this.logMovimientosCab;
    }

    public void setLogMovimientosCab(LogMovimientosCab logMovimientosCab) {
        this.logMovimientosCab = logMovimientosCab;
    }

    public String getObservacion() {
        return this.observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }




}


