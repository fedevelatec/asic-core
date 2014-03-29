package com.fedevela.core.loreal.pojos;

/**
 * Created by fvelazquez on 28/03/14.
 */
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class LrlRechazoArchivoPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ID_ARCHIVO")
    private long idArchivo;
    @Basic(optional = false)
    @Column(name = "N_LINEA")
    private long nLinea;

    public LrlRechazoArchivoPK() {
    }

    public LrlRechazoArchivoPK(long idArchivo, long nLinea) {
        this.idArchivo = idArchivo;
        this.nLinea = nLinea;
    }

    public long getIdArchivo() {
        return idArchivo;
    }

    public void setIdArchivo(long idArchivo) {
        this.idArchivo = idArchivo;
    }

    public long getNLinea() {
        return nLinea;
    }

    public void setNLinea(long nLinea) {
        this.nLinea = nLinea;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idArchivo;
        hash += (int) nLinea;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LrlRechazoArchivoPK)) {
            return false;
        }
        LrlRechazoArchivoPK other = (LrlRechazoArchivoPK) object;
        if (this.idArchivo != other.idArchivo) {
            return false;
        }
        if (this.nLinea != other.nLinea) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeamx.adeadms.loreal.pojos.LrlRechazoArchivoPK[idArchivo=" + idArchivo + ", nLinea=" + nLinea + "]";
    }

}
