package com.fedevela.core.asicmx.rf.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;

public class CajaRF implements Serializable {

    private String estatus;
    private String message;
    private String cliente;
    private Long idCliente;
    private Long cajaId;
    private Integer cajaAdea;
    private String tipoCaja;
    private Short planta;
    private Short piso;
    private String area;
    private Short estanteria;
    private Short celda;
    private Short horiz;
    private boolean warn;
    private boolean error;

    public CajaRF() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCajaAdea() {
        return cajaAdea;
    }

    public void setCajaAdea(Integer cajaAdea) {
        this.cajaAdea = cajaAdea;
    }

    public boolean isWarn() {
        return warn;
    }

    public void setWarn(boolean warn) {
        this.warn = warn;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Short getCelda() {
        return celda;
    }

    public void setCelda(Short celda) {
        this.celda = celda;
    }

    public Short getEstanteria() {
        return estanteria;
    }

    public void setEstanteria(Short estanteria) {
        this.estanteria = estanteria;
    }

    public Short getHoriz() {
        return horiz;
    }

    public void setHoriz(Short horiz) {
        this.horiz = horiz;
    }

    public Short getPiso() {
        return piso;
    }

    public void setPiso(Short piso) {
        this.piso = piso;
    }

    public Short getPlanta() {
        return planta;
    }

    public void setPlanta(Short planta) {
        this.planta = planta;
    }

    public String getTipoCaja() {
        return tipoCaja;
    }

    public void setTipoCaja(String tipoCaja) {
        this.tipoCaja = tipoCaja;
    }

    public Long getCajaId() {
        return cajaId;
    }

    public void setCajaId(Long cajaId) {
        this.cajaId = cajaId;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }
}
