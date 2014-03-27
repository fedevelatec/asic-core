package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlTransient;
import org.codehaus.jackson.annotate.JsonIgnore;

@Entity
@Table(name = "TIPO_DOCUM_CTE1_PH", catalog = "", schema = "PROD")
public class TipoDocumCte1Ph implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TipoDocumCte1PhPK tipoDocumCte1PhPK;
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
    @Column(name = "ID_DOCTO")
    private String idDocto;

    public TipoDocumCte1Ph() {
    }

    public TipoDocumCte1Ph(TipoDocumCte1PhPK tipoDocumCte1PhPK) {
        this.tipoDocumCte1PhPK = tipoDocumCte1PhPK;
    }

    public TipoDocumCte1Ph(TipoDocumCte1PhPK tipoDocumCte1PhPK, String docdesc) {
        this.tipoDocumCte1PhPK = tipoDocumCte1PhPK;
        this.docdesc = docdesc;
    }

    public TipoDocumCte1Ph(Long scltcod, Long doccod) {
        this.tipoDocumCte1PhPK = new TipoDocumCte1PhPK(scltcod, doccod);
    }

    public TipoDocumCte1PhPK getTipoDocumCte1PhPK() {
        return tipoDocumCte1PhPK;
    }

    public void setTipoDocumCte1PhPK(TipoDocumCte1PhPK tipoDocumCte1PhPK) {
        this.tipoDocumCte1PhPK = tipoDocumCte1PhPK;
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

    public String getIdDocto() {
        return idDocto;
    }

    public void setIdDocto(String idDocto) {
        this.idDocto = idDocto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tipoDocumCte1PhPK != null ? tipoDocumCte1PhPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoDocumCte1Ph)) {
            return false;
        }
        TipoDocumCte1Ph other = (TipoDocumCte1Ph) object;
        if ((this.tipoDocumCte1PhPK == null && other.tipoDocumCte1PhPK != null) || (this.tipoDocumCte1PhPK != null && !this.tipoDocumCte1PhPK.equals(other.tipoDocumCte1PhPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeamx.adeadms.pojos.TipoDocumCte1Ph[tipoDocumCte1PhPK=" + tipoDocumCte1PhPK + "]";
    }

}
