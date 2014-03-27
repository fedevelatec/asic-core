package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "TIPO_DOCUM", catalog = "", schema = "PROD")
@XmlRootElement
public class TipoDocum implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TipoDocumPK tipoDocumPK;
    @Basic(optional = false)
    @Column(name = "DOCDESC")
    private String docdesc;
    @Column(name = "NGUARDA")
    private Short nguarda;
    @Column(name = "COD_COMPORTAMIENTO")
    private Short codComportamiento;
    @Column(name = "MASCARA")
    private String mascara;
    @Column(name = "FORMULARIO")
    private Short formulario;

    public TipoDocum() {
    }

    public TipoDocum(TipoDocumPK tipoDocumPK) {
        this.tipoDocumPK = tipoDocumPK;
    }

    public TipoDocum(TipoDocumPK tipoDocumPK, String docdesc) {
        this.tipoDocumPK = tipoDocumPK;
        this.docdesc = docdesc;
    }

    public TipoDocum(Long scltcod, Short doccod) {
        this.tipoDocumPK = new TipoDocumPK(scltcod, doccod);
    }

    public TipoDocumPK getTipoDocumPK() {
        return tipoDocumPK;
    }

    public void setTipoDocumPK(TipoDocumPK tipoDocumPK) {
        this.tipoDocumPK = tipoDocumPK;
    }

    public String getDocdesc() {
        return docdesc;
    }

    public void setDocdesc(String docdesc) {
        this.docdesc = docdesc;
    }

    public Short getNguarda() {
        return nguarda;
    }

    public void setNguarda(Short nguarda) {
        this.nguarda = nguarda;
    }

    public Short getCodComportamiento() {
        return codComportamiento;
    }

    public void setCodComportamiento(Short codComportamiento) {
        this.codComportamiento = codComportamiento;
    }

    public String getMascara() {
        return mascara;
    }

    public void setMascara(String mascara) {
        this.mascara = mascara;
    }

    public Short getFormulario() {
        return formulario;
    }

    public void setFormulario(Short formulario) {
        this.formulario = formulario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tipoDocumPK != null ? tipoDocumPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoDocum)) {
            return false;
        }
        TipoDocum other = (TipoDocum) object;
        if ((this.tipoDocumPK == null && other.tipoDocumPK != null) || (this.tipoDocumPK != null && !this.tipoDocumPK.equals(other.tipoDocumPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return docdesc;
    }
}
