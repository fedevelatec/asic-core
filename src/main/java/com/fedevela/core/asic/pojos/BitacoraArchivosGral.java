package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import java.util.Date;

/**
 * BitacoraArchivosGralBean is a mapping of BITACORA_ARCHIVOS_GRAL Table.
 * <ul>
 * <li>comments: ALMACENA DATOS LOS ARCHIVOS CARGADOS Y DESCARGADOS </li>
 * </ul>
 * <b>SVN REPORT</b><br>
 * <ul>
 * <li>$Revision: 12436 $</li>
 * <li>$Date: 2013-06-27 12:21:27 -0500 (jue, 27 jun 2013) $</li>
 * <li>$Author: avillalobos $</li>
 * <li>$HeadURL:
 * http://developer.adea.com.mx/repo/adeadms-core/trunk/src/main/java/com/adeadms/core/adea/pojos/BitacoraArchivosGral.java
 * $</li>
 * </ul>
 */
public class BitacoraArchivosGral implements Serializable {

    private String archivoDepositado;
    private Long status;
    private Long registrosCorrectos;
    private Long totalRegistros;
    private String tipo;
    private String usuario;
    private java.util.Date fechaProcesamiento;
    private java.util.Date fechaCargaDescarga;
    private String archivo;
    private Long scltcod;

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public String getArchivoDepositado() {
        return archivoDepositado;
    }

    public void setArchivoDepositado(String archivoDepositado) {
        this.archivoDepositado = archivoDepositado;
    }

    public Date getFechaCargaDescarga() {
        return fechaCargaDescarga;
    }

    public void setFechaCargaDescarga(Date fechaCargaDescarga) {
        this.fechaCargaDescarga = fechaCargaDescarga;
    }

    public Date getFechaProcesamiento() {
        return fechaProcesamiento;
    }

    public void setFechaProcesamiento(Date fechaProcesamiento) {
        this.fechaProcesamiento = fechaProcesamiento;
    }

    public Long getRegistrosCorrectos() {
        return registrosCorrectos;
    }

    public void setRegistrosCorrectos(Long registrosCorrectos) {
        this.registrosCorrectos = registrosCorrectos;
    }

    public Long getScltcod() {
        return scltcod;
    }

    public void setScltcod(Long scltcod) {
        this.scltcod = scltcod;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Long getTotalRegistros() {
        return totalRegistros;
    }

    public void setTotalRegistros(Long totalRegistros) {
        this.totalRegistros = totalRegistros;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }



    @Override
    public String toString() {
        return "BitacoraArchivosGral{" + "archivoDepositado=" + archivoDepositado + ", status=" + status + ", registrosCorrectos=" + registrosCorrectos + ", totalRegistros=" + totalRegistros + ", tipo=" + tipo + ", usuario=" + usuario + ", fechaProcesamiento=" + fechaProcesamiento + ", fechaCargaDescarga=" + fechaCargaDescarga + ", archivo=" + archivo + ", scltcod=" + scltcod + '}';
    }


}
