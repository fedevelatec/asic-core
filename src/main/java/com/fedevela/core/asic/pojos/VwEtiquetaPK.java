package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class VwEtiquetaPK implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "ETIQUETA")
    private Long etiqueta;
    @Basic(optional = false)
    @Column(name = "TIPO")
    private Character tipo;

    public VwEtiquetaPK() {
    }

    public VwEtiquetaPK(Long etiqueta, Character tipo) {
        this.etiqueta = etiqueta;
        this.tipo = tipo;
    }

    public Long getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(Long etiqueta) {
        this.etiqueta = etiqueta;
    }

    public Character getTipo() {
        return tipo;
    }

    public void setTipo(Character tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final VwEtiquetaPK other = (VwEtiquetaPK) obj;
        if (this.etiqueta != other.etiqueta && (this.etiqueta == null || !this.etiqueta.equals(other.etiqueta))) {
            return false;
        }
        if (this.tipo != other.tipo && (this.tipo == null || !this.tipo.equals(other.tipo))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (this.etiqueta != null ? this.etiqueta.hashCode() : 0);
        hash = 97 * hash + (this.tipo != null ? this.tipo.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "VwEtiquetaPK{" + "etiqueta=" + etiqueta + ", tipo=" + tipo + '}';
    }
}
