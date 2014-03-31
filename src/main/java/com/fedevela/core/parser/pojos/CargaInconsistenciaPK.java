package com.fedevela.core.parser.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CargaInconsistenciaPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @Basic(optional = false)
    @Column(name = "RENGLON")
    private int renglon;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "ERROR")
    private String error;

    public CargaInconsistenciaPK() {
    }

    public CargaInconsistenciaPK(String id, int renglon) {
        this.id = id;
        this.renglon = renglon;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setRenglon(int renglon) {
        this.renglon = renglon;
    }

    public int getRenglon() {
        return renglon;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id.hashCode();
        hash += renglon;
        hash += (int) nombre.hashCode();
        hash += (int) error.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CargaInconsistenciaPK)) {
            return false;
        }
        CargaInconsistenciaPK other = (CargaInconsistenciaPK) object;
        if (this.id.equals(other.id)) {
            return false;
        }
        if (this.renglon != other.renglon) {
            return false;
        }
        if (this.nombre.equals(other.renglon)) {
            return false;
        }
        if (this.error.equals(other.error)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.cldocumentos.pojos.VtmBdProveedoresInconsisPK[id=" + id + ", orden=" + renglon + ", nombre=" + nombre + ", error=" + error + "]";
    }

}
