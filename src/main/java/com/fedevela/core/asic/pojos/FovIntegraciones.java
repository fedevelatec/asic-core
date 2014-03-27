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
@Table(name = "FOV_INTEGRACIONES", catalog = "", schema = "PROD")
public class FovIntegraciones implements Serializable{

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FovIntegracionesPK fovIntegracionesPK;
    @Column(name = "NUNICODOCT")
    private Long nunicodoct;
    @Basic(optional = false)
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "FOLIO")
    private Integer folio;
    @Column(name = "FECHA_FASE2")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFase2;
    @Column(name = "SCLTCOD")
    private Integer scltcod;
    @Column(name = "OTROS")
    private String otros;
    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "USUARIO_FASE2")
    private String usuarioFase2;

    public FovIntegraciones() {
    }

    public FovIntegraciones(FovIntegracionesPK fovIntegracionesPK) {
        this.fovIntegracionesPK = fovIntegracionesPK;
    }

    public FovIntegraciones(FovIntegracionesPK fovIntegracionesPK, Date fecha, Integer folio, Date fechaFase2, Integer scltcod, String otros, String usuario, String usuarioFase2) {
        this.fovIntegracionesPK = fovIntegracionesPK;
        this.fecha = fecha;
        this.folio = folio;
        this.fechaFase2 = fechaFase2;
        this.scltcod = scltcod;
        this.otros = otros;
        this.usuario = usuario;
        this.usuarioFase2 = usuarioFase2;
    }

    public long getNunicodoct() {
        return nunicodoct;
    }

    public void setNunicodoct(Long nunicodoct) {
        this.nunicodoct = nunicodoct;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFechaFase2() {
        return fechaFase2;
    }

    public void setFechaFase2(Date fechaFase2) {
        this.fechaFase2 = fechaFase2;
    }

    public Integer getFolio() {
        return folio;
    }

    public void setFolio(Integer folio) {
        this.folio = folio;
    }

    public FovIntegracionesPK getFovIntegracionesPK() {
        return fovIntegracionesPK;
    }

    public void setFovIntegracionesPK(FovIntegracionesPK fovIntegracionesPK) {
        this.fovIntegracionesPK = fovIntegracionesPK;
    }

    public String getOtros() {
        return otros;
    }

    public void setOtros(String otros) {
        this.otros = otros;
    }

    public Integer getScltcod() {
        return scltcod;
    }

    public void setScltcod(Integer scltcod) {
        this.scltcod = scltcod;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuarioFase2() {
        return usuarioFase2;
    }

    public void setUsuarioFase2(String usuarioFase2) {
        this.usuarioFase2 = usuarioFase2;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final FovIntegraciones other = (FovIntegraciones) obj;
        if (this.fovIntegracionesPK != other.fovIntegracionesPK && (this.fovIntegracionesPK == null || !this.fovIntegracionesPK.equals(other.fovIntegracionesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (this.fovIntegracionesPK != null ? this.fovIntegracionesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "FovIntegraciones{" + "fovIntegracionesPK=" + fovIntegracionesPK + ", fecha=" + fecha + ", folio=" + folio + ", fechaFase2=" + fechaFase2 + ", scltcod=" + scltcod + ", otros=" + otros + ", usuario=" + usuario + ", usuarioFase2=" + usuarioFase2 + '}';
    }

}
