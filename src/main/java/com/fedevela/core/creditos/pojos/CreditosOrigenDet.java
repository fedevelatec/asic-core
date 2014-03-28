package com.fedevela.core.creditos.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "CREDITOS_ORIGEN_DET", schema="PROD")
public class CreditosOrigenDet implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CreditosOrigenDetPK creditosOrigenDetPK;
    @Basic(optional = false)
    @Column(name = "RUTA_ORIGEN")
    private String rutaOrigen;
    @Basic(optional = false)
    @JoinColumn(name = "ID_SOLICITUD", referencedColumnName = "ID_SOLICITUD", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private CreditosOrigenCab creditosOrigenCab;

    public CreditosOrigenDet() {
    }

    public CreditosOrigenDet(CreditosOrigenDetPK creditosOrigenDetPK) {
        this.creditosOrigenDetPK = creditosOrigenDetPK;
    }

    public CreditosOrigenDet(CreditosOrigenDetPK creditosOrigenDetPK, String rutaOrigen) { //, String rutaDestino) {
        this.creditosOrigenDetPK = creditosOrigenDetPK;
        this.rutaOrigen = rutaOrigen;
        //this.rutaDestino = rutaDestino;
    }

    public CreditosOrigenDet(String idSolicitud, short tipo) {
        this.creditosOrigenDetPK = new CreditosOrigenDetPK(idSolicitud, tipo);
    }

    public CreditosOrigenDetPK getCreditosOrigenDetPK() {
        return creditosOrigenDetPK;
    }

    public void setCreditosOrigenDetPK(CreditosOrigenDetPK creditosOrigenDetPK) {
        this.creditosOrigenDetPK = creditosOrigenDetPK;
    }

    public String getRutaOrigen() {
        return rutaOrigen;
    }

    public void setRutaOrigen(String rutaOrigen) {
        this.rutaOrigen = rutaOrigen;
    }


    public CreditosOrigenCab getCreditosOrigenCab() {
        return creditosOrigenCab;
    }

    public void setCreditosOrigenCab(CreditosOrigenCab creditosOrigenCab) {
        this.creditosOrigenCab = creditosOrigenCab;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (creditosOrigenDetPK != null ? creditosOrigenDetPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CreditosOrigenDet)) {
            return false;
        }
        CreditosOrigenDet other = (CreditosOrigenDet) object;
        if ((this.creditosOrigenDetPK == null && other.creditosOrigenDetPK != null) || (this.creditosOrigenDetPK != null && !this.creditosOrigenDetPK.equals(other.creditosOrigenDetPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.creditos.formularios.creditosOrigenDet[creditosOrigenDetPK=" + creditosOrigenDetPK + "]";
    }

}
