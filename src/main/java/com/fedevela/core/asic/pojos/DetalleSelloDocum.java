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

/**
 * DetalleSelloDocumBean is a mapping of DETALLE_SELLO_DOCUM Table.
 * <ul>
 *    <li>comments: Es el detalle de los documentos, proyecto HN.   Verifica que exista nunicodoc y nunicodoct en Cabecera_doc_cte1_ph.   Su fecha original de alta se guarda en Detalle_sello_docum_altas para no tener movimientos en facturacion y otros reportes.   Su log guarda actualizaciones y borrados, log_detalle_sello_docum. </li>
 * </ul>
 */
@Entity
@Table(name = "DETALLE_SELLO_DOCUM", catalog = "", schema = "PROD")
public class DetalleSelloDocum implements Serializable {


    @EmbeddedId
    protected DetalleSelloDocumPK detalleSelloDocumPK;
    @Basic(optional = false)
    @Column(name = "TIPO_UBIC")
    private short tipoUbic;
    @Column(name = "FECHA_ALTA", insertable=false,updatable=false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;
    @Column(name = "USUARIO")
    private String usuario;




    public DetalleSelloDocum() {
    }

    public DetalleSelloDocum(DetalleSelloDocumPK detalleSelloDocumPK) {
        this.detalleSelloDocumPK = detalleSelloDocumPK;
    }

    public DetalleSelloDocum(DetalleSelloDocumPK detalleSelloDocumPK, short tipoUbic) {
        this.detalleSelloDocumPK = detalleSelloDocumPK;
        this.tipoUbic = tipoUbic;
    }

    public DetalleSelloDocum(Long nunicosello, Long nunicodoc, Long nunicodoct) {
        this.detalleSelloDocumPK = new DetalleSelloDocumPK(nunicosello, nunicodoc, nunicodoct);
    }

    public DetalleSelloDocumPK getDetalleSelloDocumPK() {
        return detalleSelloDocumPK;
    }

    public void setDetalleSelloDocumPK(DetalleSelloDocumPK detalleSelloDocumPK) {
        this.detalleSelloDocumPK = detalleSelloDocumPK;
    }

    public short getTipoUbic() {
        return tipoUbic;
    }

    public void setTipoUbic(short tipoUbic) {
        this.tipoUbic = tipoUbic;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detalleSelloDocumPK != null ? detalleSelloDocumPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleSelloDocum)) {
            return false;
        }
        DetalleSelloDocum other = (DetalleSelloDocum) object;
        if ((this.detalleSelloDocumPK == null && other.detalleSelloDocumPK != null) || (this.detalleSelloDocumPK != null && !this.detalleSelloDocumPK.equals(other.detalleSelloDocumPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeamx.adeadms.pojos.DetalleSelloDocum[detalleSelloDocumPK=" + detalleSelloDocumPK + "]";
    }

}
