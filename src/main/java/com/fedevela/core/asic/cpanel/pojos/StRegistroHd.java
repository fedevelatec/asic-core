package com.fedevela.core.asic.cpanel.pojos;

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
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "ST_REGISTRO_HD", catalog = "", schema = "PROD")
@SequenceGenerator(name = "PK_AUTOGEN", sequenceName = "PROD.SEQ_ST_REGISTRO_HD_ID_REGISTRO", allocationSize = 1)
@XmlRootElement
public class StRegistroHd implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_REGISTRO")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PK_AUTOGEN")
    private Long idRegistro;
    @Basic(optional = false)
    @Column(name = "HD")
    private Long hd;
    @Basic(optional = false)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "DESARROLLADOR")
    private String desarrollador;
    @Basic(optional = false)
    @Column(name = "FECHA_REGISTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @Basic(optional = false)
    @Column(name = "FECHA_INICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
    @Basic(optional = false)
    @Column(name = "FECHA_FIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFin;
    @Basic(optional = false)
    @Column(name = "SOLICITANTE")
    private String solicitante;
    @Basic(optional = false)
    @Column(name = "DEPTOSOL")
    private String deptosol;
    @Basic(optional = false)
    @Column(name = "CARGOSOL")
    private String cargosol;
    @Basic(optional = false)
    @Column(name = "TELEFONOSOL")
    private String telefonosol;

    public StRegistroHd() {
    }

    public StRegistroHd(Long idRegistro) {
        this.idRegistro = idRegistro;
    }

    public Long getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(Long idRegistro) {
        this.idRegistro = idRegistro;
    }

    public Long getHd() {
        return hd;
    }

    public void setHd(Long hd) {
        this.hd = hd;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    public String getDeptosol() {
        return deptosol;
    }

    public void setDeptosol(String deptosol) {
        this.deptosol = deptosol;
    }

    public String getCargosol() {
        return cargosol;
    }

    public void setCargosol(String cargosol) {
        this.cargosol = cargosol;
    }

    public String getTelefonosol() {
        return telefonosol;
    }

    public void setTelefonosol(String telefonosol) {
        this.telefonosol = telefonosol;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (this.idRegistro != null ? this.idRegistro.hashCode() : 0);
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
        final StRegistroHd other = (StRegistroHd) obj;
        if (this.idRegistro != other.idRegistro && (this.idRegistro == null || !this.idRegistro.equals(other.idRegistro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "StRegistroHd{" + "idRegistro=" + idRegistro + ", hd=" + hd + ", descripcion=" + descripcion + ", desarrollador=" + desarrollador + ", fechaRegistro=" + fechaRegistro + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", solicitante=" + solicitante + ", deptosol=" + deptosol + ", cargosol=" + cargosol + ", telefonosol=" + telefonosol + '}';
    }
}
