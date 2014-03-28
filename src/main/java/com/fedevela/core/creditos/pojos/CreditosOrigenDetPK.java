package com.fedevela.core.creditos.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author egutierrez
 */
@Embeddable
public class CreditosOrigenDetPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ID_SOLICITUD")
    private String idSolicitud;
    @Basic(optional = false)
    @Column(name = "TIPO")
    private short tipo;
    @Column(name = "RUTA_DESTINO")
    private String rutaDestino;

    public CreditosOrigenDetPK() {
    }

    public CreditosOrigenDetPK(String idSolicitud, short tipo) {
        this.idSolicitud = idSolicitud;
        this.tipo = tipo;
    }

    public String getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(String idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public short getTipo() {
        return tipo;
    }

    public void setTipo(short tipo) {
        this.tipo = tipo;
    }

    public String getRutaDestino() {
        return rutaDestino;
    }

    public void setRutaDestino(String rutaDestino) {
        this.rutaDestino = rutaDestino;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += idSolicitud.hashCode();
        hash += (int) tipo;
        hash += rutaDestino.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CreditosOrigenDetPK)) {
            return false;
        }
        CreditosOrigenDetPK other = (CreditosOrigenDetPK) object;
        if (!this.idSolicitud.equals(other.idSolicitud)) {
            return false;
        }
        if (this.tipo != other.tipo) {
            return false;
        }
        if (!this.rutaDestino.equals(other.rutaDestino)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.creditos.formularios.CreditosOrigenDetPK[idSolicitud=" + idSolicitud + ", tipo=" + tipo + "]";
    }

}
