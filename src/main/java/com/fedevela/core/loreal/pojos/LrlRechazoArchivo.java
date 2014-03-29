package com.fedevela.core.loreal.pojos;

/**
 * Created by fvelazquez on 28/03/14.
 */
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "LRL_RECHAZO_ARCHIVO", catalog = "", schema = "PROD")
public class LrlRechazoArchivo implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LrlRechazoArchivoPK lrlRechazoArchivoPK;
    @Column(name = "CONTENIDO")
    private String contenido;
    @JoinColumn(name = "ID_ERROR", referencedColumnName = "ID_ERROR")
    @ManyToOne(optional = false)
    private LrlCatError idError;

    public LrlRechazoArchivo() {
    }

    public LrlRechazoArchivo(LrlRechazoArchivoPK lrlRechazoArchivoPK) {
        this.lrlRechazoArchivoPK = lrlRechazoArchivoPK;
    }

    public LrlRechazoArchivo(long idArchivo, long nLinea) {
        this.lrlRechazoArchivoPK = new LrlRechazoArchivoPK(idArchivo, nLinea);
    }

    public LrlRechazoArchivoPK getLrlRechazoArchivoPK() {
        return lrlRechazoArchivoPK;
    }

    public void setLrlRechazoArchivoPK(LrlRechazoArchivoPK lrlRechazoArchivoPK) {
        this.lrlRechazoArchivoPK = lrlRechazoArchivoPK;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public LrlCatError getIdError() {
        return idError;
    }

    public void setIdError(LrlCatError idError) {
        this.idError = idError;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrlRechazoArchivoPK != null ? lrlRechazoArchivoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LrlRechazoArchivo)) {
            return false;
        }
        LrlRechazoArchivo other = (LrlRechazoArchivo) object;
        if ((this.lrlRechazoArchivoPK == null && other.lrlRechazoArchivoPK != null) || (this.lrlRechazoArchivoPK != null && !this.lrlRechazoArchivoPK.equals(other.lrlRechazoArchivoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeamx.adeadms.loreal.pojos.LrlRechazoArchivo[lrlRechazoArchivoPK=" + lrlRechazoArchivoPK + "]";
    }

}
