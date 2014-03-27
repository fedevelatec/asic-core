package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "VW_DIGITALIZACION", catalog = "", schema = "PROD")
@XmlRootElement
public class VwDigitalizacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected VwDigitalizacionPK vwDigitalizacionPK;
    @Column(name = "SCLTCOD")
    private Long scltcod;
    @Column(name = "DOCCOD")
    private Short doccod;
    @Column(name = "IMAGENES_DIG")
    private Integer imagenesDig;
    @Column(name = "IMAGENES_TRANS")
    private Integer imagenesTrans;
    @Column(name = "MAQUINA")
    private String maquina;
    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "FECHA_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;
    @Column(name = "FECHA_TRANS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaTrans;
    @Column(name = "STATUS")
    private Short status;
    @Column(name = "RUTA_ORIGEN")
    private String rutaOrigen;
    @Column(name = "RUTA_PROCESADO")
    private String rutaProcesado;
    @Column(name = "STATUS_DESC")
    private String statusDesc;

    public VwDigitalizacion() {
    }

    public Short getDoccod() {
        return doccod;
    }

    public void setDoccod(Short doccod) {
        this.doccod = doccod;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Date getFechaTrans() {
        return fechaTrans;
    }

    public void setFechaTrans(Date fechaTrans) {
        this.fechaTrans = fechaTrans;
    }

    public Integer getImagenesDig() {
        return imagenesDig;
    }

    public void setImagenesDig(Integer imagenesDig) {
        this.imagenesDig = imagenesDig;
    }

    public Integer getImagenesTrans() {
        return imagenesTrans;
    }

    public void setImagenesTrans(Integer imagenesTrans) {
        this.imagenesTrans = imagenesTrans;
    }

    public String getMaquina() {
        return maquina;
    }

    public void setMaquina(String maquina) {
        this.maquina = maquina;
    }

    public String getRutaOrigen() {
        return rutaOrigen;
    }

    public void setRutaOrigen(String rutaOrigen) {
        this.rutaOrigen = rutaOrigen;
    }

    public String getRutaProcesado() {
        return rutaProcesado;
    }

    public void setRutaProcesado(String rutaProcesado) {
        this.rutaProcesado = rutaProcesado;
    }

    public Long getScltcod() {
        return scltcod;
    }

    public void setScltcod(Long scltcod) {
        this.scltcod = scltcod;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public VwDigitalizacionPK getVwDigitalizacionPK() {
        return vwDigitalizacionPK;
    }

    public void setVwDigitalizacionPK(VwDigitalizacionPK vwDigitalizacionPK) {
        this.vwDigitalizacionPK = vwDigitalizacionPK;
    }

    public String getStatusDesc() {
        return statusDesc;
    }

    public void setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final VwDigitalizacion other = (VwDigitalizacion) obj;
        if (this.vwDigitalizacionPK != other.vwDigitalizacionPK && (this.vwDigitalizacionPK == null || !this.vwDigitalizacionPK.equals(other.vwDigitalizacionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + (this.vwDigitalizacionPK != null ? this.vwDigitalizacionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "VwDigitalizacion{" + "vwDigitalizacionPK=" + vwDigitalizacionPK + ", scltcod=" + scltcod + ", doccod=" + doccod + ", imagenesDig=" + imagenesDig + ", imagenesTrans=" + imagenesTrans + ", maquina=" + maquina + ", usuario=" + usuario + ", fechaAlta=" + fechaAlta + ", fechaTrans=" + fechaTrans + ", status=" + status + ", rutaOrigen=" + rutaOrigen + ", rutaProcesado=" + rutaProcesado + ", statusDesc=" + statusDesc + '}';
    }
}
