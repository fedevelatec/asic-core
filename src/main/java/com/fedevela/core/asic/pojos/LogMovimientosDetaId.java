package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class LogMovimientosDetaId  implements java.io.Serializable {

    @Basic(optional = false)
    @Column(name = "ID_MOVIMIENTO", nullable = false, precision = 11, scale = 0)
    private long idMovimiento;
    @Basic(optional = false)
    @Column(name = "NUNICODOCT", nullable = false, precision = 12, scale = 0)
    private long nunicodoct;
    @Basic(optional = false)
    @Column(name = "DOCCOD", nullable = false, precision = 5, scale = 0)
    private int  doccod;
    @Basic(optional = false)
    @Column(name = "ESTADO", nullable = false, precision = 1, scale = 0)
    private int  estado;

    public LogMovimientosDetaId() {
    }

    public LogMovimientosDetaId(long idMovimiento, long nunicodoct, int doccod, int estado) {
        this.idMovimiento = idMovimiento;
        this.nunicodoct = nunicodoct;
        this.doccod = doccod;
        this.estado = estado;
    }

    public long getIdMovimiento() {
        return this.idMovimiento;
    }

    public void setIdMovimiento(long idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

    public long getNunicodoct() {
        return this.nunicodoct;
    }

    public void setNunicodoct(long nunicodoct) {
        this.nunicodoct = nunicodoct;
    }

    public int getDoccod() {
        return this.doccod;
    }

    public void setDoccod(int doccod) {
        this.doccod = doccod;
    }

    public int getEstado() {
        return this.estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }


    @Override
    public boolean equals(Object other) {
        if ( (this == other ) ) return true;
        if ( (other == null ) ) return false;
        if ( !(other instanceof LogMovimientosDetaId) ) return false;
        LogMovimientosDetaId castOther = ( LogMovimientosDetaId ) other;

        return (this.getIdMovimiento()==castOther.getIdMovimiento())
                && (this.getNunicodoct()==castOther.getNunicodoct())
                && (this.getDoccod()==castOther.getDoccod())
                && (this.getEstado()==castOther.getEstado());
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (int) this.getIdMovimiento();
        result = 37 * result + (int) this.getNunicodoct();
        result = 37 * result + this.getDoccod();
        result = 37 * result + (int) this.getEstado();
        return result;
    }


}


