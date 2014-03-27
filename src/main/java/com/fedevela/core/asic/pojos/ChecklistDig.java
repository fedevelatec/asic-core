package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "CHECKLIST_DIG", catalog = "", schema = "PROD")
public class ChecklistDig implements Serializable, Comparable<ChecklistDig> {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ChecklistDigPK checklistDigPK;
    @Basic(optional = false)
    @Column(name = "RUTA_ORIGEN")
    private String rutaOrigen;
    @Column(name = "RUTA_DESTINO")
    private String rutaDestino;
    @Basic(optional = false)
    @Column(name = "IMAGENES_DIG")
    private Integer imagenesDig;
    @Basic(optional = false)
    @Column(name = "IMAGENES_TRANS")
    private Integer imagenesTrans;
    @Basic(optional = false)
    @Column(name = "MAQUINA")
    private String maquina;
    @Basic(optional = false)
    @Column(name = "USUARIO")
    private String usuario;
    @Basic(optional = false)
    @Column(name = "FECHA_DIR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDir;
    @Basic(optional = false)
    @Column(name = "FECHA_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;
    @Column(name = "FECHA_TRANS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaTrans;
    @Basic(optional = false)
    @Column(name = "STATUS")
    private Short status;
    @Basic(optional = false)
    @Column(name = "ID_CHECKLIST")
    private BigInteger idChecklist;
    @Column(name = "LOTE")
    private String lote;
    @Column(name = "RUTA_PROCESADO")
    private String rutaProcesado;
    @Column(name = "FECHA_PROCESADO")
    @Temporal(TemporalType.DATE)
    private Date fechaProcesado;
    @Column(name = "RUTA_OCR")
    private String rutaOcr;
    @Column(name = "FECHA_OCR")
    @Temporal(TemporalType.DATE)
    private Date fechaOcr;
    @JoinColumns({
            @JoinColumn(name = "SCLTCOD", referencedColumnName = "SCLTCOD"),
            @JoinColumn(name = "DOCCOD", referencedColumnName = "DOCCOD")})
    @ManyToOne(optional = false)
    private TipoDocumCte1Ph tipoDocumCte1Ph;

    public ChecklistDig() {
    }

    public ChecklistDig(ChecklistDigPK checklistDigPK) {
        this.checklistDigPK = checklistDigPK;
    }

    public ChecklistDig(ChecklistDigPK checklistDigPK, String rutaOrigen, Integer imagenesDig, Integer imagenesTrans, String maquina, String usuario, Date fechaDir, Date fechaAlta, Short status, BigInteger idChecklist) {
        this.checklistDigPK = checklistDigPK;
        this.rutaOrigen = rutaOrigen;
        this.imagenesDig = imagenesDig;
        this.imagenesTrans = imagenesTrans;
        this.maquina = maquina;
        this.usuario = usuario;
        this.fechaDir = fechaDir;
        this.fechaAlta = fechaAlta;
        this.status = status;
        this.idChecklist = idChecklist;
    }

    public ChecklistDig(Long nunicodoc, Long nunicodoct) {
        this.checklistDigPK = new ChecklistDigPK(nunicodoc, nunicodoct);
    }

    public ChecklistDigPK getChecklistDigPK() {
        return checklistDigPK;
    }

    public void setChecklistDigPK(ChecklistDigPK checklistDigPK) {
        this.checklistDigPK = checklistDigPK;
    }

    public String getRutaOrigen() {
        return rutaOrigen;
    }

    public void setRutaOrigen(String rutaOrigen) {
        this.rutaOrigen = rutaOrigen;
    }

    public String getRutaDestino() {
        return rutaDestino;
    }

    public void setRutaDestino(String rutaDestino) {
        this.rutaDestino = rutaDestino;
    }

    public int getImagenesDig() {
        return imagenesDig;
    }

    public void setImagenesDig(Integer imagenesDig) {
        this.imagenesDig = imagenesDig;
    }

    public int getImagenesTrans() {
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Date getFechaDir() {
        return fechaDir;
    }

    public void setFechaDir(Date fechaDir) {
        this.fechaDir = fechaDir;
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

    public short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public BigInteger getIdChecklist() {
        return idChecklist;
    }

    public void setIdChecklist(BigInteger idChecklist) {
        this.idChecklist = idChecklist;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getRutaProcesado() {
        return rutaProcesado;
    }

    public void setRutaProcesado(String rutaProcesado) {
        this.rutaProcesado = rutaProcesado;
    }

    public Date getFechaProcesado() {
        return fechaProcesado;
    }

    public void setFechaProcesado(Date fechaProcesado) {
        this.fechaProcesado = fechaProcesado;
    }

    public String getRutaOcr() {
        return rutaOcr;
    }

    public void setRutaOcr(String rutaOcr) {
        this.rutaOcr = rutaOcr;
    }

    public Date getFechaOcr() {
        return fechaOcr;
    }

    public void setFechaOcr(Date fechaOcr) {
        this.fechaOcr = fechaOcr;
    }

    public TipoDocumCte1Ph getTipoDocumCte1Ph() {
        return tipoDocumCte1Ph;
    }

    public void setTipoDocumCte1Ph(TipoDocumCte1Ph tipoDocumCte1Ph) {
        this.tipoDocumCte1Ph = tipoDocumCte1Ph;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (checklistDigPK != null ? checklistDigPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ChecklistDig)) {
            return false;
        }
        ChecklistDig other = (ChecklistDig) object;
        if ((this.checklistDigPK == null && other.checklistDigPK != null) || (this.checklistDigPK != null && !this.checklistDigPK.equals(other.checklistDigPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeamx.adeadms.pojos.ChecklistDig[checklistDigPK=" + checklistDigPK + "]";
    }

    @Override
    public int compareTo(ChecklistDig o) {
        return (int) (this.tipoDocumCte1Ph.getTipoDocumCte1PhPK().getDoccod() - o.getTipoDocumCte1Ph().getTipoDocumCte1PhPK().getDoccod());

    }

}
