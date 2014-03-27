package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "CAT_ENTIDAD_FED", catalog = "", schema = "PROD")
@NamedQueries({
        @NamedQuery(name = "CatEntidadFed.findAll", query = "SELECT c FROM CatEntidadFed c")})
public class CatEntidadFed implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_ENTIDAD_FED")
    private Short idEntidadFed;
    @Basic(optional = false)
    @Column(name = "NOMBRE_ENTIDAD")
    private String nombreEntidad;

    public CatEntidadFed() {
    }

    public CatEntidadFed(Short idEntidadFed) {
        this.idEntidadFed = idEntidadFed;
    }

    public CatEntidadFed(Short idEntidadFed, String nombreEntidad) {
        this.idEntidadFed = idEntidadFed;
        this.nombreEntidad = nombreEntidad;
    }

    public Short getIdEntidadFed() {
        return idEntidadFed;
    }

    public void setIdEntidadFed(Short idEntidadFed) {
        this.idEntidadFed = idEntidadFed;
    }

    public String getNombreEntidad() {
        return nombreEntidad;
    }

    public void setNombreEntidad(String nombreEntidad) {
        this.nombreEntidad = nombreEntidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEntidadFed != null ? idEntidadFed.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatEntidadFed)) {
            return false;
        }
        CatEntidadFed other = (CatEntidadFed) object;
        if ((this.idEntidadFed == null && other.idEntidadFed != null) || (this.idEntidadFed != null && !this.idEntidadFed.equals(other.idEntidadFed))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nombreEntidad;
    }

}
