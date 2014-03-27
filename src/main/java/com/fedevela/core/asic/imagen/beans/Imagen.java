package com.fedevela.core.asic.imagen.beans;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Imagen implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ImagenPK id;
    @Basic(optional = false)
    @Column(name = "SCLTCOD")
    private Long scltcod;
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
    // private String rutaBase;
//    @Basic(optional = false)
//    @Column(name = "MAQUINA")
//    private String maquina;
    @Basic(optional = false)
    @Column(name = "USUARIO")
    private String usuario;
    //    @Basic(optional = false)
//    @Column(name = "FECHA_DIR")
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date fechaDir;
//    @Basic(optional = false)
//    @Column(name = "FECHA_ALTA")
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date fechaAlta;
//    @Column(name = "FECHA_TRANS")
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date fechaTrans;
    @Basic(optional = false)
    @Column(name = "STATUS")
    private Short status;
    //    @Basic(optional = false)
//    @Column(name = "ID_CHECKLIST")
//    private Long idChecklist;
    @Column(name = "LOTE")
    private String lote;
    //    @Column(name = "RUTA_PROCESADO")
//    private String rutaProcesado;
//    @Column(name = "FECHA_PROCESADO")
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date fechaProcesado;
//    @Column(name = "RUTA_OCR")
//    private String rutaOcr;
//    @Column(name = "FECHA_OCR")
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date fechaOcr;
    @Basic(optional = false)
    @Column(name = "DOCCOD")
    private Short doccod;
    @Column(name = "DOCDESC")
    private String docdesc;
    @Transient
    private List<Pagina> paginas;

    public Imagen() {
    }

    public Imagen(ImagenPK id) {
        this.id = id;
    }

    public ImagenPK getId() {
        return id;
    }

    public void setId(ImagenPK id) {
        this.id = id;
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

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
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

    public List<Pagina> getPaginas() {
        return paginas;
    }

    public void setPaginas(List<Pagina> paginas) {
        this.paginas = paginas;
    }

    public Short getDoccod() {
        return doccod;
    }

    public void setDoccod(Short doccod) {
        this.doccod = doccod;
    }

    public String getDocdesc() {
        return docdesc;
    }

    public void setDocdesc(String docdesc) {
        this.docdesc = docdesc;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Imagen other = (Imagen) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "Imagen{" + "id=" + id + ", scltcod=" + scltcod + ", rutaOrigen=" + rutaOrigen + ", rutaDestino=" + rutaDestino + ", imagenesDig=" + imagenesDig + ", imagenesTrans=" + imagenesTrans + ", usuario=" + usuario + ", status=" + status + ", lote=" + lote + ", doccod=" + doccod + ", docdesc=" + docdesc + ", paginas=" + paginas + '}';
    }
}
