package com.fedevela.core.hn.originacion.pojos;

/**
 * Created by fvelazquez on 28/03/14.
 */
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author avillalobos
 */
@Entity
@Table(name = "HN_TIPOS_VALORES", catalog = "", schema = "PROD")
@NamedQueries({
        @NamedQuery(name = "HnTiposValores.findAll", query = "SELECT h FROM HnTiposValores h"),
        @NamedQuery(name = "HnTiposValores.findByIdTipoValor", query = "SELECT h FROM HnTiposValores h WHERE h.idTipoValor = :idTipoValor"),
        @NamedQuery(name = "HnTiposValores.findByDescripcion", query = "SELECT h FROM HnTiposValores h WHERE h.descripcion = :descripcion")})
public class HnTiposValores implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_TIPO_VALOR")
    private BigDecimal idTipoValor;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoValor")
    private List<HnOriginacionCaptura> hnOriginacionCapturaList;

    public HnTiposValores() {
    }

    public HnTiposValores(BigDecimal idTipoValor) {
        this.idTipoValor = idTipoValor;
    }

    public BigDecimal getIdTipoValor() {
        return idTipoValor;
    }

    public void setIdTipoValor(BigDecimal idTipoValor) {
        this.idTipoValor = idTipoValor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<HnOriginacionCaptura> getHnOriginacionCapturaList() {
        return hnOriginacionCapturaList;
    }

    public void setHnOriginacionCapturaList(List<HnOriginacionCaptura> hnOriginacionCapturaList) {
        this.hnOriginacionCapturaList = hnOriginacionCapturaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoValor != null ? idTipoValor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HnTiposValores)) {
            return false;
        }
        HnTiposValores other = (HnTiposValores) object;
        if ((this.idTipoValor == null && other.idTipoValor != null) || (this.idTipoValor != null && !this.idTipoValor.equals(other.idTipoValor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeamx.adeadms.hn.pojos.HnTiposValores[idTipoValor=" + idTipoValor + "]";
    }

}
