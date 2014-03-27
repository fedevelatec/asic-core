package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import java.util.Date;

public class DocumentoSolicitadoWeb implements Serializable {
    private long folio;
    private long nunicodoc;
    private int tipoDocumento;
    private int cajaId;
    private int cajaAdea;
    private String idDocto;
    private String titular;
    private String nss;
    private String consecutivo;
    private String capturista;
    private String producto;
    private Date fechaCaptura;
    private Date fechaEmision;
    private Date fechaPublicacion;
    private Date fechaCaducidad;
    private String status;
    private String path;
    private String observaciones;
    private int noImagenes;
    private String pathLocal;

    public DocumentoSolicitadoWeb() {
    }

    public long getFolio() {
        return folio;
    }

    public void setFolio(long folio) {
        this.folio = folio;
    }

    public Long getNunicodoc() {
        return nunicodoc;
    }

    public void setNunicodoc(Long nunicodoc) {
        this.nunicodoc = nunicodoc;
    }

    public int getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(int tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public int getCajaId() {
        return cajaId;
    }

    public void setCajaId(int cajaId) {
        this.cajaId = cajaId;
    }

    public int getCajaAdea() {
        return cajaAdea;
    }

    public void setCajaAdea(int cajaAdea) {
        this.cajaAdea = cajaAdea;
    }

    public String getIdDocto() {
        return idDocto;
    }

    public void setIdDocto(String idDocto) {
        this.idDocto = idDocto;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    public String getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(String consecutivo) {
        this.consecutivo = consecutivo;
    }

    public String getCapturista() {
        return capturista;
    }

    public void setCapturista(String capturista) {
        this.capturista = capturista;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Date getFechaCaptura() {
        return fechaCaptura;
    }

    public void setFechaCaptura(Date fechaCaptura) {
        this.fechaCaptura = fechaCaptura;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int getNoImagenes() {
        return noImagenes;
    }

    public void setNoImagenes(int noImagenes) {
        this.noImagenes = noImagenes;
    }

    public String getPathLocal() {
        return pathLocal;
    }

    public void setPathLocal(String pathLocal) {
        this.pathLocal = pathLocal;
    }

}
