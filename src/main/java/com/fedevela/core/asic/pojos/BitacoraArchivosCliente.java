package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @user fvilla
 *
 * <b>SVN REPORT</b><br>
 * <ul>
 * <li>$Revision: 15494 $</li>
 * <li>$Date: 2013-11-05 04:48:30 -0600 (mar, 05 nov 2013) $</li>
 * <li>$Author: avillalobos $</li>
 * <li>$HeadURL:
 * http://developer.adea.com.mx/repo/adeadms-core/trunk/src/main/java/com/adeadms/core/adea/pojos/BitacoraArchivosCliente.java
 * $</li>
 * </ul>
 */
@Entity
@Table(name = "BITACORA_ARCHIVOS_CLIENTE", schema = "PROD")
public class BitacoraArchivosCliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SeqBitacoraArchivosCliente")
    @SequenceGenerator(name = "SeqBitacoraArchivosCliente", sequenceName = "PROD.SEQ_PK_BITACORA_ARCH_CLT", allocationSize = 1)
    @Basic(optional = false)
    @Column(name = "ID_ARCHIVO")
    private Long idArchivo;
    @Column(name = "SCLTCOD")
    private Short scltcod;
    @Basic(optional = false)
    @Column(name = "ARCHIVO")
    private String archivo;
    @Column(name = "FECHA_CARGA_DESCARGA", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCargaDescarga;
    @Column(name = "FECHA_PROCESAMIENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaProcesamiento;
    @Basic(optional = false)
    @Column(name = "USUARIO")
    private String usuario;
    @Basic(optional = false)
    @Column(name = "TIPO")
    private String tipo;
    @Column(name = "TOTAL_REGISTROS")
    private Long totalRegistros;
    @Column(name = "REGISTROS_CORRECTOS")
    private Long registrosCorrectos;
    @Column(name = "STATUS")
    private Short status;
    @Column(name = "ARCHIVO_DEPOSITADO")
    private String archivoDepositado;

    public BitacoraArchivosCliente() {
    }

    public BitacoraArchivosCliente(Long idArchivo) {
        this.idArchivo = idArchivo;
    }

    public BitacoraArchivosCliente(Long idArchivo, String archivo, Date fechaCargaDescarga, String usuario, String tipo) {
        this.idArchivo = idArchivo;
        this.archivo = archivo;
        this.fechaCargaDescarga = fechaCargaDescarga;
        this.usuario = usuario;
        this.tipo = tipo;
    }

    public Long getIdArchivo() {
        return idArchivo;
    }

    public void setIdArchivo(Long idArchivo) {
        this.idArchivo = idArchivo;
    }

    public Short getScltcod() {
        return scltcod;
    }

    public void setScltcod(Short scltcod) {
        this.scltcod = scltcod;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
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

    public Long getRegistrosCorrectos() {
        return registrosCorrectos;
    }

    public void setRegistrosCorrectos(Long registrosCorrectos) {
        this.registrosCorrectos = registrosCorrectos;
    }

    public Short getStatus() {
        return status;
    }

    /**
     * 1 - DEPOSITADO; 2 - GENERADO; 3 - DUPLICADO; 4 - PROCESADO; 5 -
     * DESCARGADO; 6 - CADUCADO;
     *
     * @param status
     */
    public void setStatus(Short status) {
        this.status = status;
    }

    public String getArchivoDepositado() {
        return archivoDepositado;
    }

    public void setArchivoDepositado(String archivoDepositado) {
        this.archivoDepositado = archivoDepositado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.idArchivo != null ? this.idArchivo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final BitacoraArchivosCliente other = (BitacoraArchivosCliente) obj;
        if (this.idArchivo != other.idArchivo && (this.idArchivo == null || !this.idArchivo.equals(other.idArchivo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BitacoraArchivosCliente{" + "idArchivo=" + idArchivo + ", scltcod=" + scltcod + ", archivo=" + archivo + ", fechaCargaDescarga=" + fechaCargaDescarga + ", fechaProcesamiento=" + fechaProcesamiento + ", usuario=" + usuario + ", tipo=" + tipo + ", totalRegistros=" + totalRegistros + ", registrosCorrectos=" + registrosCorrectos + ", status=" + status + ", archivoDepositado=" + archivoDepositado + '}';
    }
}
