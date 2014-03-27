package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "VW_ULTIMO_ESTATUS_DOCUMENTO", catalog = "", schema = "PROD")
@NamedQueries({
        @NamedQuery(name = "VwUltimoEstatusDocumento.findAll", query = "SELECT v FROM VwUltimoEstatusDocumento v"),
        @NamedQuery(name = "VwUltimoEstatusDocumento.findByNunicodoct", query = "SELECT v FROM VwUltimoEstatusDocumento v WHERE v.nunicodoct = :nunicodoct"),
        @NamedQuery(name = "VwUltimoEstatusDocumento.findByStatus", query = "SELECT v FROM VwUltimoEstatusDocumento v WHERE v.status = :status"),
        @NamedQuery(name = "VwUltimoEstatusDocumento.findByIp", query = "SELECT v FROM VwUltimoEstatusDocumento v WHERE v.ip = :ip"),
        @NamedQuery(name = "VwUltimoEstatusDocumento.findByFecha", query = "SELECT v FROM VwUltimoEstatusDocumento v WHERE v.fecha = :fecha"),
        @NamedQuery(name = "VwUltimoEstatusDocumento.findByUsuario", query = "SELECT v FROM VwUltimoEstatusDocumento v WHERE v.usuario = :usuario")})
public class VwUltimoEstatusDocumento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUNICODOCT")
    private long nunicodoct;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "IP")
    private String ip;
    @Column(name = "FECHA")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "USUARIO")
    private String usuario;

    public VwUltimoEstatusDocumento() {
    }

    public long getNunicodoct() {
        return nunicodoct;
    }

    public void setNunicodoct(long nunicodoct) {
        this.nunicodoct = nunicodoct;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

}
