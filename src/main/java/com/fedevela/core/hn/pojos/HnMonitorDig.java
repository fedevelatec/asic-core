package com.fedevela.core.hn.pojos;

/**
 * Created by fvelazquez on 28/03/14.
 */
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "HN_MONITOR_DIG", catalog = "", schema = "PROD")
public class HnMonitorDig implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected HnMonitorDigPK hnMonitorDigPK;

    @Column(name = "MAQUINA")
    private String maquina;
    @Column(name = "RUTA")
    private String ruta;
    @Column(name = "CONSECUTIVO")
    private Long consecutivo;
    @Column(name = "FECHA_DIR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDir;
    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "FECHA_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;
    @Column(name = "STATUS")
    private int status;
    @Column(name = "NO_IMAGENES")
    private int noImagenes;
    @Column(name = "NO_IMAG_TRANS")
    private int noImagTrans;
    @Column(name = "LOTE")
    private String lote;
    @Column(name = "RUTA_IMAGEN")
    private String rutaImagen;
    @Column(name = "RUTA_LOCAL")
    private String rutaLocal;

    public HnMonitorDig() {
    }

    public HnMonitorDig(HnMonitorDigPK hnMonitorDigPK) {
        this.hnMonitorDigPK = hnMonitorDigPK;
    }

    public HnMonitorDigPK getHnMonitorDigPK() {
        return hnMonitorDigPK;
    }

    public Long getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(Long consecutivo) {
        this.consecutivo = consecutivo;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Date getFechaDir() {
        return fechaDir;
    }

    public void setFechaDir(Date fechaDir) {
        this.fechaDir = fechaDir;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getMaquina() {
        return maquina;
    }

    public void setMaquina(String maquina) {
        this.maquina = maquina;
    }

    public int getNoImagTrans() {
        return noImagTrans;
    }

    public void setNoImagTrans(int noImagTrans) {
        this.noImagTrans = noImagTrans;
    }

    public int getNoImagenes() {
        return noImagenes;
    }

    public void setNoImagenes(int noImagenes) {
        this.noImagenes = noImagenes;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    public String getRutaLocal() {
        return rutaLocal;
    }

    public void setRutaLocal(String rutaLocal) {
        this.rutaLocal = rutaLocal;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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
        hash += (hnMonitorDigPK != null ? hnMonitorDigPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HnMonitorDigPK)) {
            return false;
        }
        HnMonitorDig other = (HnMonitorDig) object;
        if ((this.hnMonitorDigPK == null && other.hnMonitorDigPK != null) || (this.hnMonitorDigPK != null && !this.hnMonitorDigPK.equals(other.hnMonitorDigPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeamx.adeadms.pojos.HnMonitorDig[hnMonitorDigPK=" + hnMonitorDigPK + "]";
    }

}
