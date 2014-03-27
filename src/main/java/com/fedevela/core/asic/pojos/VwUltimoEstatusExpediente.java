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
@Table(name = "VW_ULTIMO_ESTATUS_EXPEDIENTE", catalog = "", schema = "PROD")
@NamedQueries({
        @NamedQuery(name = "VwUltimoEstatusExpediente.findAll", query = "SELECT v FROM VwUltimoEstatusExpediente v"),
        @NamedQuery(name = "VwUltimoEstatusExpediente.findByNunicodoc", query = "SELECT v FROM VwUltimoEstatusExpediente v WHERE v.nunicodoc = :nunicodoc"),
        @NamedQuery(name = "VwUltimoEstatusExpediente.findByStatus", query = "SELECT v FROM VwUltimoEstatusExpediente v WHERE v.status = :status"),
        @NamedQuery(name = "VwUltimoEstatusExpediente.findByIp", query = "SELECT v FROM VwUltimoEstatusExpediente v WHERE v.ip = :ip"),
        @NamedQuery(name = "VwUltimoEstatusExpediente.findByFecha", query = "SELECT v FROM VwUltimoEstatusExpediente v WHERE v.fecha = :fecha"),
        @NamedQuery(name = "VwUltimoEstatusExpediente.findByUsuario", query = "SELECT v FROM VwUltimoEstatusExpediente v WHERE v.usuario = :usuario")})
public class VwUltimoEstatusExpediente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUNICODOC")
    private Long nunicodoc;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "IP")
    private String ip;
    @Column(name = "FECHA")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "USUARIO")
    private String usuario;

    public VwUltimoEstatusExpediente() {
    }

    public Long getNunicodoc() {
        return nunicodoc;
    }

    public void setNunicodoc(Long nunicodoc) {
        this.nunicodoc = nunicodoc;
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
