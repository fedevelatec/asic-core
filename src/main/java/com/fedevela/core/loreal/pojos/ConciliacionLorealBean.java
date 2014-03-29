package com.fedevela.core.loreal.pojos;

/**
 * Created by fvelazquez on 28/03/14.
 */
public class ConciliacionLorealBean {
    Long cajaId;
    Long ingresados;
    Long procesados;
    Long digitalizados;
    Long ubicados;

    public Long getCajaId() {
        return cajaId;
    }

    public void setCajaId(Long cajaId) {
        this.cajaId = cajaId;
    }

    public Long getDigitalizados() {
        return digitalizados;
    }

    public void setDigitalizados(Long digitalizados) {
        this.digitalizados = digitalizados;
    }

    public Long getIngresados() {
        return ingresados;
    }

    public void setIngresados(Long ingresados) {
        this.ingresados = ingresados;
    }

    public Long getProcesados() {
        return procesados;
    }

    public void setProcesados(Long procesados) {
        this.procesados = procesados;
    }

    public Long getUbicados() {
        return ubicados;
    }

    public void setUbicados(Long ubicados) {
        this.ubicados = ubicados;
    }
}
