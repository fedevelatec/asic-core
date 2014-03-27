package com.fedevela.core.avaluo.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "AV_PAGINA_DOCUM", catalog = "", schema = "PROD")
@NamedQueries({
        @NamedQuery(name = "AvPaginaDocum.findAll", query = "SELECT a FROM AvPaginaDocum a"),
        @NamedQuery(name = "AvPaginaDocum.findByNunicodoc", query = "SELECT a FROM AvPaginaDocum a WHERE a.avPaginaDocumPK.nunicodoc = :nunicodoc"),
        @NamedQuery(name = "AvPaginaDocum.findByNunicodoct", query = "SELECT a FROM AvPaginaDocum a WHERE a.avPaginaDocumPK.nunicodoct = :nunicodoct"),
        @NamedQuery(name = "AvPaginaDocum.findByPagina", query = "SELECT a FROM AvPaginaDocum a WHERE a.avPaginaDocumPK.pagina = :pagina"),
        @NamedQuery(name = "AvPaginaDocum.findByNombreImagen", query = "SELECT a FROM AvPaginaDocum a WHERE a.nombreImagen = :nombreImagen")})
public class AvPaginaDocum implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AvPaginaDocumPK avPaginaDocumPK;
    @Basic(optional = false)
    @Column(name = "NOMBRE_IMAGEN")
    private String nombreImagen;
    @JoinColumns({
            @JoinColumn(name = "NUNICODOC", referencedColumnName = "NUNICODOC", insertable = false, updatable = false),
            @JoinColumn(name = "NUNICODOCT", referencedColumnName = "NUNICODOCT", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private AvDocumentoAvaluo avDocumentoAvaluo;

    public AvPaginaDocum() {
    }

    public AvPaginaDocum(AvPaginaDocumPK avPaginaDocumPK) {
        this.avPaginaDocumPK = avPaginaDocumPK;
    }

    public AvPaginaDocum(AvPaginaDocumPK avPaginaDocumPK, String nombreImagen) {
        this.avPaginaDocumPK = avPaginaDocumPK;
        this.nombreImagen = nombreImagen;
    }

    public AvPaginaDocum(int nunicodoc, long nunicodoct, short pagina) {
        this.avPaginaDocumPK = new AvPaginaDocumPK(nunicodoc, nunicodoct, pagina);
    }

    public AvPaginaDocumPK getAvPaginaDocumPK() {
        return avPaginaDocumPK;
    }

    public void setAvPaginaDocumPK(AvPaginaDocumPK avPaginaDocumPK) {
        this.avPaginaDocumPK = avPaginaDocumPK;
    }

    public String getNombreImagen() {
        return nombreImagen;
    }

    public void setNombreImagen(String nombreImagen) {
        this.nombreImagen = nombreImagen;
    }

    public AvDocumentoAvaluo getAvDocumentoAvaluo() {
        return avDocumentoAvaluo;
    }

    public void setAvDocumentoAvaluo(AvDocumentoAvaluo avDocumentoAvaluo) {
        this.avDocumentoAvaluo = avDocumentoAvaluo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (avPaginaDocumPK != null ? avPaginaDocumPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AvPaginaDocum)) {
            return false;
        }
        AvPaginaDocum other = (AvPaginaDocum) object;
        if ((this.avPaginaDocumPK == null && other.avPaginaDocumPK != null) || (this.avPaginaDocumPK != null && !this.avPaginaDocumPK.equals(other.avPaginaDocumPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.transfer.pojos.AvPaginaDocum[avPaginaDocumPK=" + avPaginaDocumPK + "]";
    }

}
