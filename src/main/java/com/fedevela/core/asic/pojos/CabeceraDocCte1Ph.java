package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.util.Date;
import javax.persistence.*;
import org.hibernate.annotations.Formula;

@Entity
@Table(name = "CABECERA_DOC_CTE1_PH", catalog = "", schema = "PROD")
public class CabeceraDocCte1Ph implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CabeceraDocCte1PhId id;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @Column(name = "ATESTIMONIO_TIPO")
    private String atestimonioTipo;
    @Column(name = "ATESTIMONIO_PROYECTO")
    private String atestimonioProyecto;
    @Column(name = "EAVALUO_FECHA")
    @Temporal(TemporalType.DATE)
    private Date eavaluoFecha;
    @Column(name = "JCERTIFICADO_NUM_CERT")
    private String jcertificadoNumCert;
    @Column(name = "NCOMPROBANTE_NUM_COMPROBANTE")
    private String ncomprobanteNumComprobante;
    @Column(name = "PCONVENIO_NUM_ACTA")
    private String pconvenioNumActa;
    @Column(name = "WLIQUIDACION_NUM_LIQUIDACION")
    private String wliquidacionNumLiquidacion;
    @Column(name = "ZSOLICITUD_NUM_SOLICITUD")
    private String zsolicitudNumSolicitud;
    @Column(name = "PATH_IMGS")
    private String pathImgs;
    @Column(name = "NUNICODOCT")
    private Long nunicodoct;
    @Column(name = "PRESENTE")
    private Boolean presente;
    @Column(name = "CKH_RBT_OPTIONS")
    private String ckhRbtOptions;
    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "FECHA_ALTA")
    @Temporal(TemporalType.DATE)
    private Date fechaAlta;
    @Column(name = "TEST_SIN_FIRMA")
    private Character testSinFirma;
    @Column(name = "IDCARTERA")
    private Short idcartera;

    @JoinColumn(name = "NUNICODOC", referencedColumnName = "NUNICODOC", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private CabeceraDoc cabeceraDoc;

    @Formula("(select count(a.status) from prod.checklist_dig a where a.status = 3 and a.nunicodoc = nunicodoc and a.nunicodoct = nunicodoct)")
    private Long estatusDig;

    public Long getEstatusDig() {
        return estatusDig;
    }

    public void setEstatusDig(Long estatusDig) {
        this.estatusDig = estatusDig;
    }

    public CabeceraDoc getCabeceraDoc() {
        return cabeceraDoc;
    }

    public void setCabeceraDoc(CabeceraDoc cabeceraDoc) {
        this.cabeceraDoc = cabeceraDoc;
    }

    public Short getIdcartera() {
        return idcartera;
    }

    public void setIdcartera(Short idcartera) {
        this.idcartera = idcartera;
    }

    public CabeceraDocCte1Ph() {
    }

    public CabeceraDocCte1Ph(long nunicodoc, short doccod) {
        this.id = new CabeceraDocCte1PhId(doccod, nunicodoc);
    }

    public CabeceraDocCte1Ph(CabeceraDocCte1PhId id, short idcartera) {
        this.id = id;
        this.idcartera = idcartera;
    }

    public CabeceraDocCte1Ph(CabeceraDocCte1PhId id, String status,
                             String observaciones, String atestimonioTipo,
                             String atestimonioProyecto, Date eavaluoFecha,
                             String jcertificadoNumCert, String ncomprobanteNumComprobante,
                             String pconvenioNumActa, String wliquidacionNumLiquidacion,
                             String zsolicitudNumSolicitud, String pathImgs, short idcartera,
                             Long nunicodoct, Boolean presente, String ckhRbtOptions,
                             String usuario, Date fechaAlta, Character testSinFirma) {
        this.id = id;
        this.status = status;
        this.observaciones = observaciones;
        this.atestimonioTipo = atestimonioTipo;
        this.atestimonioProyecto = atestimonioProyecto;
        this.eavaluoFecha = eavaluoFecha;
        this.jcertificadoNumCert = jcertificadoNumCert;
        this.ncomprobanteNumComprobante = ncomprobanteNumComprobante;
        this.pconvenioNumActa = pconvenioNumActa;
        this.wliquidacionNumLiquidacion = wliquidacionNumLiquidacion;
        this.zsolicitudNumSolicitud = zsolicitudNumSolicitud;
        this.pathImgs = pathImgs;
        this.idcartera = idcartera;
        this.nunicodoct = nunicodoct;
        this.presente = presente;
        this.ckhRbtOptions = ckhRbtOptions;
        this.usuario = usuario;
        this.fechaAlta = fechaAlta;
        this.testSinFirma = testSinFirma;
    }

    public CabeceraDocCte1PhId getId() {
        return this.id;
    }

    public void setId(CabeceraDocCte1PhId id) {
        this.id = id;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getObservaciones() {
        return this.observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getAtestimonioTipo() {
        return this.atestimonioTipo;
    }

    public void setAtestimonioTipo(String atestimonioTipo) {
        this.atestimonioTipo = atestimonioTipo;
    }

    public String getAtestimonioProyecto() {
        return this.atestimonioProyecto;
    }

    public void setAtestimonioProyecto(String atestimonioProyecto) {
        this.atestimonioProyecto = atestimonioProyecto;
    }

    public Date getEavaluoFecha() {
        return this.eavaluoFecha;
    }

    public void setEavaluoFecha(Date eavaluoFecha) {
        this.eavaluoFecha = eavaluoFecha;
    }

    public String getJcertificadoNumCert() {
        return this.jcertificadoNumCert;
    }

    public void setJcertificadoNumCert(String jcertificadoNumCert) {
        this.jcertificadoNumCert = jcertificadoNumCert;
    }

    public String getNcomprobanteNumComprobante() {
        return this.ncomprobanteNumComprobante;
    }

    public void setNcomprobanteNumComprobante(String ncomprobanteNumComprobante) {
        this.ncomprobanteNumComprobante = ncomprobanteNumComprobante;
    }

    public String getPconvenioNumActa() {
        return this.pconvenioNumActa;
    }

    public void setPconvenioNumActa(String pconvenioNumActa) {
        this.pconvenioNumActa = pconvenioNumActa;
    }

    public String getWliquidacionNumLiquidacion() {
        return this.wliquidacionNumLiquidacion;
    }

    public void setWliquidacionNumLiquidacion(String wliquidacionNumLiquidacion) {
        this.wliquidacionNumLiquidacion = wliquidacionNumLiquidacion;
    }

    public String getZsolicitudNumSolicitud() {
        return this.zsolicitudNumSolicitud;
    }

    public void setZsolicitudNumSolicitud(String zsolicitudNumSolicitud) {
        this.zsolicitudNumSolicitud = zsolicitudNumSolicitud;
    }

    public String getPathImgs() {
        return this.pathImgs;
    }

    public void setPathImgs(String pathImgs) {
        this.pathImgs = pathImgs;
    }

    public void setIdcartera(short idcartera) {
        this.idcartera = idcartera;
    }

    public Long getNunicodoct() {
        return this.nunicodoct;
    }

    public void setNunicodoct(Long nunicodoct) {
        this.nunicodoct = nunicodoct;
    }

    public Boolean getPresente() {
        return this.presente;
    }

    public void setPresente(Boolean presente) {
        this.presente = presente;
    }

    public String getCkhRbtOptions() {
        return this.ckhRbtOptions;
    }

    public void setCkhRbtOptions(String ckhRbtOptions) {
        this.ckhRbtOptions = ckhRbtOptions;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Date getFechaAlta() {
        return this.fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Character getTestSinFirma() {
        return this.testSinFirma;
    }

    public void setTestSinFirma(Character testSinFirma) {
        this.testSinFirma = testSinFirma;
    }

    @Formula("(select max(a.status) from prod.checklist_dig a where a.nunicodoc = nunicodoc and a.nunicodoct = nunicodoct)")
    private Long estatusChecklistDig;
    public Long getEstatusChecklistDig() {
        return estatusChecklistDig;
    }
    public void setEstatusChecklistDig(Long estatusChecklistDig) {
        this.estatusChecklistDig = estatusChecklistDig;
    }




    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CabeceraDocCte1Ph)) {
            return false;
        }
        CabeceraDocCte1Ph other = (CabeceraDocCte1Ph) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeamx.adeadms.pojos.CabeceraDocCte1Ph[cabeceraDocCte1PhPK=" + id + "]";
    }
}
