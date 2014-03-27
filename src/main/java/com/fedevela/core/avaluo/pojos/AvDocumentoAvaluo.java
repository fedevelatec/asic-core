package com.fedevela.core.avaluo.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import com.fedevela.core.asic.pojos.TipoDocumCte1Ph;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "AV_DOCUMENTO_AVALUO", catalog = "", schema = "PROD")
@NamedQueries({
        @NamedQuery(name = "AvDocumentoAvaluo.findAll", query = "SELECT a FROM AvDocumentoAvaluo a"),
        @NamedQuery(name = "AvDocumentoAvaluo.findByIdAvaluo", query = "SELECT a FROM AvDocumentoAvaluo a WHERE a.idAvaluo = :idAvaluo"),
        @NamedQuery(name = "AvDocumentoAvaluo.findByNunicodoc", query = "SELECT a FROM AvDocumentoAvaluo a WHERE a.avDocumentoAvaluoPK.nunicodoc = :nunicodoc"),
        @NamedQuery(name = "AvDocumentoAvaluo.findByNunicodoct", query = "SELECT a FROM AvDocumentoAvaluo a WHERE a.avDocumentoAvaluoPK.nunicodoct = :nunicodoct"),
        @NamedQuery(name = "AvDocumentoAvaluo.findByRutaOrigen", query = "SELECT a FROM AvDocumentoAvaluo a WHERE a.rutaOrigen = :rutaOrigen"),
        @NamedQuery(name = "AvDocumentoAvaluo.findByRutaDestino", query = "SELECT a FROM AvDocumentoAvaluo a WHERE a.rutaDestino = :rutaDestino"),
        @NamedQuery(name = "AvDocumentoAvaluo.findByImagenesDig", query = "SELECT a FROM AvDocumentoAvaluo a WHERE a.imagenesDig = :imagenesDig"),
        @NamedQuery(name = "AvDocumentoAvaluo.findByImagenesTrans", query = "SELECT a FROM AvDocumentoAvaluo a WHERE a.imagenesTrans = :imagenesTrans"),
        @NamedQuery(name = "AvDocumentoAvaluo.findByMaquina", query = "SELECT a FROM AvDocumentoAvaluo a WHERE a.maquina = :maquina"),
        @NamedQuery(name = "AvDocumentoAvaluo.findByUsuario", query = "SELECT a FROM AvDocumentoAvaluo a WHERE a.usuario = :usuario"),
        @NamedQuery(name = "AvDocumentoAvaluo.findByFechaDir", query = "SELECT a FROM AvDocumentoAvaluo a WHERE a.fechaDir = :fechaDir"),
        @NamedQuery(name = "AvDocumentoAvaluo.findByFechaAlta", query = "SELECT a FROM AvDocumentoAvaluo a WHERE a.fechaAlta = :fechaAlta"),
        @NamedQuery(name = "AvDocumentoAvaluo.findByLote", query = "SELECT a FROM AvDocumentoAvaluo a WHERE a.lote = :lote"),
        @NamedQuery(name = "AvDocumentoAvaluo.findByFechaTrans", query = "SELECT a FROM AvDocumentoAvaluo a WHERE a.fechaTrans = :fechaTrans"),
        @NamedQuery(name = "AvDocumentoAvaluo.findByStatus", query = "SELECT a FROM AvDocumentoAvaluo a WHERE a.status = :status")})
public class AvDocumentoAvaluo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AvDocumentoAvaluoPK avDocumentoAvaluoPK;
    @Basic(optional = false)
    @Column(name = "ID_AVALUO")
    private long idAvaluo;
    @Basic(optional = false)
    @Column(name = "RUTA_ORIGEN")
    private String rutaOrigen;
    @Column(name = "RUTA_DESTINO")
    private String rutaDestino;
    @Column(name = "IMAGENES_DIG")
    private BigInteger imagenesDig;
    @Column(name = "IMAGENES_TRANS")
    private BigInteger imagenesTrans;
    @Column(name = "MAQUINA")
    private String maquina;
    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "FECHA_DIR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDir;
    @Column(name = "FECHA_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;
    @Column(name = "LOTE")
    private String lote;
    @Column(name = "FECHA_TRANS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaTrans;
    @Basic(optional = false)
    @Column(name = "STATUS")
    private BigInteger status;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "avDocumentoAvaluo")
    private List<AvPaginaDocum> avPaginaDocumList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "avDocumentoAvaluo")
    private List<AvStatusDig> avStatusDigList;
    @JoinColumns({
            @JoinColumn(name = "CLIENTE", referencedColumnName = "SCLTCOD"),
            @JoinColumn(name = "DOCCOD", referencedColumnName = "DOCCOD")})
    @ManyToOne
    private TipoDocumCte1Ph tipoDocumCte1Ph;

    public AvDocumentoAvaluo() {
    }

    public AvDocumentoAvaluo(AvDocumentoAvaluoPK avDocumentoAvaluoPK) {
        this.avDocumentoAvaluoPK = avDocumentoAvaluoPK;
    }

    public AvDocumentoAvaluo(AvDocumentoAvaluoPK avDocumentoAvaluoPK, long idAvaluo, String rutaOrigen, BigInteger status) {
        this.avDocumentoAvaluoPK = avDocumentoAvaluoPK;
        this.idAvaluo = idAvaluo;
        this.rutaOrigen = rutaOrigen;
        this.status = status;
    }

    public AvDocumentoAvaluo(int nunicodoc, long nunicodoct) {
        this.avDocumentoAvaluoPK = new AvDocumentoAvaluoPK(nunicodoc, nunicodoct);
    }

    public AvDocumentoAvaluoPK getAvDocumentoAvaluoPK() {
        return avDocumentoAvaluoPK;
    }

    public void setAvDocumentoAvaluoPK(AvDocumentoAvaluoPK avDocumentoAvaluoPK) {
        this.avDocumentoAvaluoPK = avDocumentoAvaluoPK;
    }

    public long getIdAvaluo() {
        return idAvaluo;
    }

    public void setIdAvaluo(long idAvaluo) {
        this.idAvaluo = idAvaluo;
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

    public BigInteger getImagenesDig() {
        return imagenesDig;
    }

    public void setImagenesDig(BigInteger imagenesDig) {
        this.imagenesDig = imagenesDig;
    }

    public BigInteger getImagenesTrans() {
        return imagenesTrans;
    }

    public void setImagenesTrans(BigInteger imagenesTrans) {
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

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public Date getFechaTrans() {
        return fechaTrans;
    }

    public void setFechaTrans(Date fechaTrans) {
        this.fechaTrans = fechaTrans;
    }

    public BigInteger getStatus() {
        return status;
    }

    public void setStatus(BigInteger status) {
        this.status = status;
    }

    public List<AvPaginaDocum> getAvPaginaDocumList() {
        return avPaginaDocumList;
    }

    public void setAvPaginaDocumList(List<AvPaginaDocum> avPaginaDocumList) {
        this.avPaginaDocumList = avPaginaDocumList;
    }

    public List<AvStatusDig> getAvStatusDigList() {
        return avStatusDigList;
    }

    public void setAvStatusDigList(List<AvStatusDig> avStatusDigList) {
        this.avStatusDigList = avStatusDigList;
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
        hash += (avDocumentoAvaluoPK != null ? avDocumentoAvaluoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AvDocumentoAvaluo)) {
            return false;
        }
        AvDocumentoAvaluo other = (AvDocumentoAvaluo) object;
        if ((this.avDocumentoAvaluoPK == null && other.avDocumentoAvaluoPK != null) || (this.avDocumentoAvaluoPK != null && !this.avDocumentoAvaluoPK.equals(other.avDocumentoAvaluoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.avaluo.pojos.AvDocumentoAvaluo[avDocumentoAvaluoPK=" + avDocumentoAvaluoPK + "]";
    }
}
