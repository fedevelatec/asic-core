package com.fedevela.core.asic.notificacion.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "NOTIFICACIONES_CHKLST", catalog = "", schema = "PROD")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "NotificacionesChklst.findAll", query = "SELECT n FROM NotificacionesChklst n")})
public class NotificacionesChklst implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDENTIFICADOR")
    private String identificador;
    @Basic(optional = false)
    @Column(name = "TIPO_PROCESO")
    private Long tipoProceso;
    @Basic(optional = false)
    @Column(name = "NUNICODOC")
    private Long nunicodoc;
    @Column(name = "ETIQ_REPORTADO")
    private String etiqReportado;
    @Column(name = "CABECERA")
    private String cabecera;
    @Column(name = "CHKLST_REPORTADO")
    private String chklstReportado;
    @Column(name = "CHKLST_COMPLETO")
    private String chklstCompleto;
    @Basic(optional = false)
    @Column(name = "FECHA_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;
    @Basic(optional = false)
    @Column(name = "FECHA_CAMBIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCambio;
    @Basic(optional = false)
    @Column(name = "CORRIDA")
    private Long corrida;
    @Column(name = "REPORTADO_CAB_CHK")
    private String reportadoCabChk;

    public NotificacionesChklst() {
    }

    public NotificacionesChklst(String identificador) {
        this.identificador = identificador;
    }

    public NotificacionesChklst(String identificador, Long tipoProceso, Long nunicodoc, Date fechaAlta, Date fechaCambio, Long corrida) {
        this.identificador = identificador;
        this.tipoProceso = tipoProceso;
        this.nunicodoc = nunicodoc;
        this.fechaAlta = fechaAlta;
        this.fechaCambio = fechaCambio;
        this.corrida = corrida;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public Long getTipoProceso() {
        return tipoProceso;
    }

    public void setTipoProceso(Long tipoProceso) {
        this.tipoProceso = tipoProceso;
    }

    public Long getNunicodoc() {
        return nunicodoc;
    }

    public void setNunicodoc(Long nunicodoc) {
        this.nunicodoc = nunicodoc;
    }

    public String getEtiqReportado() {
        return etiqReportado;
    }

    public void setEtiqReportado(String etiqReportado) {
        this.etiqReportado = etiqReportado;
    }

    public String getCabecera() {
        return cabecera;
    }

    public void setCabecera(String cabecera) {
        this.cabecera = cabecera;
    }

    public String getChklstReportado() {
        return chklstReportado;
    }

    public void setChklstReportado(String chklstReportado) {
        this.chklstReportado = chklstReportado;
    }

    public String getChklstCompleto() {
        return chklstCompleto;
    }

    public void setChklstCompleto(String chklstCompleto) {
        this.chklstCompleto = chklstCompleto;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Date getFechaCambio() {
        return fechaCambio;
    }

    public void setFechaCambio(Date fechaCambio) {
        this.fechaCambio = fechaCambio;
    }

    public Long getCorrida() {
        return corrida;
    }

    public void setCorrida(Long corrida) {
        this.corrida = corrida;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (identificador != null ? identificador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NotificacionesChklst)) {
            return false;
        }
        NotificacionesChklst other = (NotificacionesChklst) object;
        if ((this.identificador == null && other.identificador != null) || (this.identificador != null && !this.identificador.equals(other.identificador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeamx.dms.bbva.expunico.lib.pojos.NotificacionesChklst[ identificador=" + identificador + " ]";
    }

    /**
     * @return the reportadoCabChk
     */
    public String getReportadoCabChk() {
        return reportadoCabChk;
    }

    /**
     * @param reportadoCabChk the reportadoCabChk to set
     */
    public void setReportadoCabChk(String reportadoCabChk) {
        this.reportadoCabChk = reportadoCabChk;
    }

}
