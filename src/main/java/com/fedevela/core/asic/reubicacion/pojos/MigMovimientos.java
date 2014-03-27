package com.fedevela.core.asic.reubicacion.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="MIG_B_MOVIMIENTOS", schema="PROD")
public class MigMovimientos implements Serializable {
    @Id
    @Basic(optional=false)
    @Column(name="CAJA_ID")
    private Integer cajaId;
    @Column(name="STATUS")
    private Integer status;
    @Column(name="FECHA")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name="GRUPO")
    private Integer grupo;

    public Integer getCajaId() {
        return cajaId;
    }

    public void setCajaId(Integer cajaId) {
        this.cajaId = cajaId;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getGrupo() {
        return grupo;
    }

    public void setGrupo(Integer grupo) {
        this.grupo = grupo;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
