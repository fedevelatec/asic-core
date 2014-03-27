package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "IMG_AVALUOS", catalog = "", schema = "PROD")
public class ImgAvaluos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ImgAvaluosPK imgAvaluosPK;
    @Column(name = "DOCCOD")
    private int doccod;
    @Column(name = "CLIENTE")
    private int cliente;
    @Basic(optional = false)
    @Column(name = "RUTA_ORIGEN")
    private String rutaOrigen;
    @Column(name = "RUTA_DESTINO")
    private String rutaDestino;
    @Column(name = "IMAGENES_DIG")
    private int imagenesDig;
    @Column(name = "IMAGENES_TRANS")
    private int imagenesTrans;
    @Column(name = "CAJA")
    private Long caja;
    @Column(name = "NUNICOSELLO")
    private Long nunicosello;
    @Column(name = "MAQUINA")
    private String maquina;
    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "FECHA_DIR")
    @Temporal(TemporalType.DATE)
    private Date fechaDir;
    @Column(name = "FECHA_ALTA")
    @Temporal(TemporalType.DATE)
    private Date fechaAlta;
    @Column(name = "LOTE")
    private String lote;
    @Column(name = "FECHA_TRANS")
    @Temporal(TemporalType.DATE)
    private Date fechaTrans;
    @Basic(optional = false)
    @Column(name = "STATUS")
    private int status;
    @Column(name = "ORIGEN")
    private String origen;

    public ImgAvaluos() {
    }

    public ImgAvaluos(ImgAvaluosPK imgAvaluosPK) {
        this.imgAvaluosPK = imgAvaluosPK;
    }

    public ImgAvaluos(Long nunicodoc, Long nunicodoct) {
        this.imgAvaluosPK = new ImgAvaluosPK(nunicodoc, nunicodoct);
    }

    public ImgAvaluosPK getImgAvaluosPK() {
        return imgAvaluosPK;
    }

    public void setImgAvaluosPK(ImgAvaluosPK imgAvaluosPK) {
        this.imgAvaluosPK = imgAvaluosPK;
    }

    public Long getCaja() {
        return caja;
    }

    public void setCaja(Long caja) {
        this.caja = caja;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public int getDoccod() {
        return doccod;
    }

    public void setDoccod(int doccod) {
        this.doccod = doccod;
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

    public Date getFechaTrans() {
        return fechaTrans;
    }

    public void setFechaTrans(Date fechaTrans) {
        this.fechaTrans = fechaTrans;
    }

    public int getImagenesDig() {
        return imagenesDig;
    }

    public void setImagenesDig(int imagenesDig) {
        this.imagenesDig = imagenesDig;
    }

    public int getImagenesTrans() {
        return imagenesTrans;
    }

    public void setImagenesTrans(int imagenesTrans) {
        this.imagenesTrans = imagenesTrans;
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

    public String getRutaDestino() {
        return rutaDestino;
    }

    public void setRutaDestino(String rutaDestino) {
        this.rutaDestino = rutaDestino;
    }

    public String getRutaOrigen() {
        return rutaOrigen;
    }

    public void setRutaOrigen(String rutaOrigen) {
        this.rutaOrigen = rutaOrigen;
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

    public Long getNunicosello() {
        return nunicosello;
    }

    public void setNunicosello(Long nunicosello) {
        this.nunicosello = nunicosello;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (imgAvaluosPK != null ? imgAvaluosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImgAvaluos)) {
            return false;
        }
        ImgAvaluos other = (ImgAvaluos) object;
        if ((this.imgAvaluosPK == null && other.imgAvaluosPK != null) || (this.imgAvaluosPK != null && !this.imgAvaluosPK.equals(other.imgAvaluosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeamx.adeadms.pojos.ImgAvaluos[imgAvaluosPK=" + imgAvaluosPK + "]";
    }

}
