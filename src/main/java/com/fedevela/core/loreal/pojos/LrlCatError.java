package com.fedevela.core.loreal.pojos;

/**
 * Created by fvelazquez on 28/03/14.
 */
import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "LRL_CAT_ERROR", catalog = "", schema = "PROD")
public class LrlCatError implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_ERROR")
    private Integer idError;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idError")
    private List<LrlRechazoArchivo> lrlRechazoArchivoList;

    public LrlCatError() {
    }

    public LrlCatError(Integer idError) {
        this.idError = idError;
    }

    public Integer getIdError() {
        return idError;
    }

    public void setIdError(Integer idError) {
        this.idError = idError;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<LrlRechazoArchivo> getLrlRechazoArchivoList() {
        return lrlRechazoArchivoList;
    }

    public void setLrlRechazoArchivoList(List<LrlRechazoArchivo> lrlRechazoArchivoList) {
        this.lrlRechazoArchivoList = lrlRechazoArchivoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idError != null ? idError.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LrlCatError)) {
            return false;
        }
        LrlCatError other = (LrlCatError) object;
        if ((this.idError == null && other.idError != null) || (this.idError != null && !this.idError.equals(other.idError))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeamx.adeadms.loreal.pojos.LrlCatError[idError=" + idError + "]";
    }

}
